package com.zacx.serivce.order.service.impl;

import com.zacx.core.enums.Code;
import com.zacx.core.enums.SourceEnum;
import com.zacx.serivce.basic.api.CharteredCarModelServiceApi;
import com.zacx.serivce.basic.api.InsuranceServiceApi;
import com.zacx.serivce.basic.api.dto.CharteredCarModelDTO;
import com.zacx.serivce.basic.api.dto.InsuranceDTO;
import com.zacx.serivce.cache.key.enums.SerialCodeRuleEnum;
import com.zacx.serivce.dal.entity.OOrder;
import com.zacx.serivce.dal.entity.OOrder2Insurance;
import com.zacx.serivce.dal.entity.OTicket;
import com.zacx.serivce.dal.mapper.OOrder2InsuranceMapper;
import com.zacx.serivce.dal.mapper.OOrderMapper;
import com.zacx.serivce.dal.mapper.OTicketMapper;
import com.zacx.serivce.line.api.LineServiceApi;
import com.zacx.serivce.line.api.PlanServiceApi;
import com.zacx.serivce.line.api.SiteServiceApi;
import com.zacx.serivce.line.api.dto.LineDTO;
import com.zacx.serivce.line.api.dto.PlanDTO;
import com.zacx.serivce.line.api.dto.SiteDTO;
import com.zacx.serivce.order.api.dto.CreateOrderDTO;
import com.zacx.serivce.order.api.dto.OrderMainDTO;
import com.zacx.serivce.order.api.enums.BusinessTypeEnum;
import com.zacx.serivce.order.api.enums.OrderStatusEnum;
import com.zacx.serivce.order.api.enums.RelayTypeEnum;
import com.zacx.serivce.order.api.enums.TicketStatusEnum;
import com.zacx.serivce.order.api.exceptions.OrderServiceException;
import com.zacx.serivce.order.service.OrderCreateLocService;
import com.zacx.serivce.service.SerialService;
import com.zacx.serivce.user.api.PassengerServiceApi;
import com.zacx.serivce.user.api.UserServiceApi;
import com.zacx.serivce.user.api.dto.PassengerDTO;
import com.zacx.serivce.user.api.dto.UserDTO;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class OrderCreateLocServiceImpl extends BaseOrderLocServiceImpl implements OrderCreateLocService {
    @Autowired
    private UserServiceApi userServiceApi;
    @Autowired
    private PassengerServiceApi passengerServiceApi;
    @Autowired
    private PlanServiceApi planServiceApi;
    @Autowired
    private LineServiceApi lineServiceApi;
    @Autowired
    private SiteServiceApi siteServiceApi;
    @Autowired
    private InsuranceServiceApi insuranceServiceApi;
    @Autowired
    private CharteredCarModelServiceApi charteredCarModelServiceApi;
    @Autowired
    private SerialService serialService;

    @Autowired
    private OOrderMapper oOrderMapper;
    @Autowired
    private OOrder2InsuranceMapper oOrder2InsuranceMapper;
    @Autowired
    private OTicketMapper oTicketMapper;

    /**
     * @param createOrderDTO 1
     * @description: 实时计算订单金额
     * @author: kiting
     * @date: 2018年10月06日 19:39
     * @return: java.math.BigDecimal
     * @throw:
     **/
    @Override
    public BigDecimal compPrice(CreateOrderDTO createOrderDTO) {
        BigDecimal priceTotal = BigDecimal.ZERO;
        if (BusinessTypeEnum.PLAN.equals(createOrderDTO.getBusinessTypeEnum())) {
            //验证参数
            PlanOrderPrepareData prepareData = valiPlanOrderDTO(createOrderDTO);
            //计算价格
            compPlanPriceDetail(createOrderDTO, prepareData);
            priceTotal = prepareData.getPriceDetail().getTotalCost();
        } else if (BusinessTypeEnum.CHARTERED.equals(createOrderDTO.getBusinessTypeEnum())) {
            //验证参数
            CharteredOrderPrepareData prepareData = valiCharteredOrderDTO(createOrderDTO);
            //计算价格
            compCharteredPriceDetail(createOrderDTO, prepareData);
            priceTotal = prepareData.getPriceDetail().getTotalCost();
        }
        return priceTotal;
    }

    /**
     * @param createOrderDTO 1
     * @description: 生成订单业务统一入口
     * @author: kiting
     * @date: 2018年10月06日 19:39
     * @return: com.zacx.serivce.order.api.dto.OrderMainDTO
     * @throw:
     **/
    @Override
    public OrderMainDTO create(CreateOrderDTO createOrderDTO) {
        OrderMainDTO orderResult = null;
        OOrder orderEntity = null;
        if (BusinessTypeEnum.PLAN.equals(createOrderDTO.getBusinessTypeEnum())) {
            orderEntity = createPlanOrder(createOrderDTO);
        } else if (BusinessTypeEnum.CHARTERED.equals(createOrderDTO.getBusinessTypeEnum())) {
            orderEntity = createCharteredOrder(createOrderDTO);
        }
        if (orderEntity != null) {
            orderResult = new OrderMainDTO();
            orderEntityToBaseDTO(orderEntity, orderResult);
        }
        return orderResult;
    }

    //**************************************************************************************************
    // 私有 分步 方法
    //**************************************************************************************************

    /**
     * 班车业务主逻辑
     *
     * @param createOrderDTO
     * @return
     */
    private OOrder createPlanOrder(CreateOrderDTO createOrderDTO) {
        //验证参数
        PlanOrderPrepareData prepareData = valiPlanOrderDTO(createOrderDTO);
        //计算价格
        compPlanPriceDetail(createOrderDTO, prepareData);
        //生成订单
        OOrder orderEntity = setupPlanOrder(createOrderDTO, prepareData);
        oOrderMapper.insert(orderEntity);
        //保存保险信息
        saveInsurances(orderEntity, prepareData);
        //保存票信息
        saveTicket(orderEntity, prepareData.getPlanInfo(), prepareData.getPriceDetail(), prepareData.getPassengerList());
        //保存操作日志
        userOperateOrderLog(orderEntity, null, "班线下单", "");

        return orderEntity;
    }


    /**
     * 包车业务主逻辑
     *
     * @param createOrderDTO
     * @return
     */
    private OOrder createCharteredOrder(CreateOrderDTO createOrderDTO) {
        //验证参数
        CharteredOrderPrepareData prepareData = valiCharteredOrderDTO(createOrderDTO);
        //计算价格
        compCharteredPriceDetail(createOrderDTO, prepareData);
        //生成订单
        OOrder orderEntity = setupCharteredOrder(createOrderDTO, prepareData);
        oOrderMapper.insert(orderEntity);
        //保存票信息
        saveTicket(orderEntity, null, prepareData.getPriceDetail(), prepareData.getPassengerList());
        //保存操作日志
        userOperateOrderLog(orderEntity, null, "包车下单", "");

        return orderEntity;
    }


    /**
     * 班车下单数据验证及收集
     *
     * @param createOrderDTO
     * @return
     */
    private PlanOrderPrepareData valiPlanOrderDTO(CreateOrderDTO createOrderDTO) {
        PlanOrderPrepareData prepareData = new PlanOrderPrepareData();
        if (createOrderDTO == null) {
            throw new OrderServiceException(Code.ERROR_ARGUMENT, "单据数据丢失异常");
        }
        if (createOrderDTO.getSourceType() == null) {
            createOrderDTO.setSourceType(SourceEnum.OTHER);
        }
        if (createOrderDTO.getBusinessTypeEnum() == null) {
            throw new OrderServiceException(Code.ERROR_ARGUMENT, "不支持业务异常");
        }
        //创建订单验证用户
        if (createOrderDTO.getUserId() == null || createOrderDTO.getUserId() <= 0) {
            throw new OrderServiceException(Code.ERROR_ARGUMENT, "未识别用户信息");
        }
        UserDTO userInfo = userServiceApi.selectUserById(createOrderDTO.getUserId());
        if (userInfo == null) {
            throw new OrderServiceException(Code.ERROR_ARGUMENT, "用户身份验证失败");
        }
        prepareData.setUserInfo(userInfo);
        //-------------------- 班次加载及验证 --------------------
        if (createOrderDTO.getPlanId() == null || createOrderDTO.getPlanId() <= 0) {
            throw new OrderServiceException(Code.ERROR_ARGUMENT, "未选择班线");
        }
        PlanDTO planInfo = planServiceApi.findPlanWithLineByPrimaryKey(createOrderDTO.getPlanId());
        if (planInfo == null || planInfo.getLineDTO() == null || planInfo.getTicketPrice() == null || planInfo.getTicketPrice().compareTo(BigDecimal.ZERO) <= 0) {
            throw new OrderServiceException(Code.ERROR_ARGUMENT, "班线信息未找到或配置错误");
        }
        prepareData.setPlanInfo(planInfo);
        //-------------------- 线路加载及验证 --------------------
        LineDTO lineInfo = lineServiceApi.findLineById(planInfo.getLineId());
        if (lineInfo == null
                || lineInfo.getSiteStartId() == null || lineInfo.getSiteStartId() <= 0
                || lineInfo.getSiteEndId() == null || lineInfo.getSiteEndId() <= 0) {
            throw new OrderServiceException(Code.ERROR_ARGUMENT, "班线信息未找到或配置错误");
        }
        prepareData.setLineInfo(lineInfo);
        //-------------------- 站点加载及验证 --------------------
        List<SiteDTO> siteList = siteServiceApi.getSiteListByIds(Arrays.asList(lineInfo.getSiteStartId(), lineInfo.getSiteEndId()));
        if (siteList != null && siteList.size() == 2) {
            for (SiteDTO site : siteList) {
                if (site.getId().equals(lineInfo.getSiteStartId())) {
                    prepareData.setStartSiteInfo(site);
                } else if (site.getId().equals(lineInfo.getSiteEndId())) {
                    prepareData.setEndSiteInfo(site);
                }
            }
        }
        if (prepareData.getStartSiteInfo() == null || prepareData.getEndSiteInfo() == null) {
            throw new OrderServiceException(Code.ERROR_ARGUMENT, "线路配置站点未找到");
        }
        //-------------------- 乘客信息认证 --------------------
        if (createOrderDTO.getPassengerIds() == null || createOrderDTO.getPassengerIds().isEmpty()) {
            throw new OrderServiceException(Code.ERROR_ARGUMENT, "未选择乘客");
        }
        List<PassengerDTO> passengerList = passengerServiceApi.selectListByIds(createOrderDTO.getPassengerIds());
        if (passengerList == null || passengerList.isEmpty()
                || passengerList.size() != createOrderDTO.getPassengerIds().size()) {
            throw new OrderServiceException(Code.ERROR_ARGUMENT, "未找到乘客信息");
        }
        prepareData.setPassengerList(passengerList);
        createOrderDTO.setTicketNumber(passengerList.size());
        //-------------------- 保险信息加载（非必选） --------------------
        List<InsuranceDTO> insuranceList = new ArrayList<InsuranceDTO>();
        Integer insuranceCount = 0;
        if (createOrderDTO.getInsuranceIds() != null && !createOrderDTO.getInsuranceIds().isEmpty()) {
            insuranceList = insuranceServiceApi.getListByIds(createOrderDTO.getInsuranceIds());
            if (insuranceList == null || insuranceList.isEmpty()
                    || insuranceList.size() != createOrderDTO.getInsuranceIds().size()) {
                throw new OrderServiceException(Code.ERROR_ARGUMENT, "未找到保险信息");
            }
            if (createOrderDTO.getInsuranceCount() == null || createOrderDTO.getInsuranceCount() <= 0) {
                insuranceCount = 1;
            }
        }
        prepareData.setInsuranceList(insuranceList);
        prepareData.setInsuranceCount(insuranceCount);
        return prepareData;
    }

    /**
     * 包车下单参数验证及收集
     *
     * @param createOrderDTO
     * @return
     */
    private CharteredOrderPrepareData valiCharteredOrderDTO(CreateOrderDTO createOrderDTO) {
        CharteredOrderPrepareData prepareData = new CharteredOrderPrepareData();
        if (createOrderDTO == null) {
            throw new OrderServiceException(Code.ERROR_ARGUMENT, "单据数据丢失异常");
        }
        if (createOrderDTO.getBusinessTypeEnum() == null) {
            throw new OrderServiceException(Code.ERROR_ARGUMENT, "不支持业务异常");
        }
        if (createOrderDTO.getTakeLng() == null || createOrderDTO.getTakeLat() == null) {
            throw new OrderServiceException(Code.ERROR_ARGUMENT, "请提供接车位置");
        }
        if (createOrderDTO.getGiveLng() == null || createOrderDTO.getGiveLat() == null) {
            throw new OrderServiceException(Code.ERROR_ARGUMENT, "请提供目的地位置");
        }
        if (createOrderDTO.getTravelDistance() == null || createOrderDTO.getTravelDistance().compareTo(BigDecimal.ZERO) <= 0) {
            throw new OrderServiceException(Code.ERROR_ARGUMENT, "请提供预计行程距离");
        }
        //创建订单验证用户
        if (createOrderDTO.getUserId() == null || createOrderDTO.getUserId() <= 0) {
            throw new OrderServiceException(Code.ERROR_ARGUMENT, "未识别用户信息");
        }
        UserDTO userInfo = userServiceApi.selectUserById(createOrderDTO.getUserId());
        if (userInfo == null) {
            throw new OrderServiceException(Code.ERROR_ARGUMENT, "用户身份验证失败");
        }
        prepareData.setUserInfo(userInfo);
        //-------------------- 包车基本信息设置默认（非必填） --------------------
        if (createOrderDTO.getStartTime() == null) {
            createOrderDTO.setStartTime(new Date());
        }
        if (createOrderDTO.getTicketNumber() == null || createOrderDTO.getTicketNumber() <= 0) {
            createOrderDTO.setTicketNumber(1);
        }
        //-------------------- 包车品牌信息加载（价格相关） --------------------
        if (createOrderDTO.getCharteredCarBrand() == null || createOrderDTO.getCharteredCarBrand() <= 0) {
            throw new OrderServiceException(Code.ERROR_ARGUMENT, "包车品牌未选择");
        }
        CharteredCarModelDTO chartCarModel = charteredCarModelServiceApi.findByKey(createOrderDTO.getCharteredCarBrand());
        if (chartCarModel == null || chartCarModel.getUnitPrice() == null) {
            throw new OrderServiceException(Code.ERROR_ARGUMENT, "包车品牌已下线");
        }
        if (chartCarModel.getSeatNumber() == null && chartCarModel.getSeatNumber().intValue() < createOrderDTO.getTicketNumber()) {
            throw new OrderServiceException(Code.ERROR_ARGUMENT, String.format("所选车型最多供%s人乘坐", chartCarModel.getSeatNumber()));
        }
        prepareData.setChartCarModel(chartCarModel);
        //-------------------- 乘客信息认证 --------------------
        //TODO 第一条是自己（按照ID排序）
        List<PassengerDTO> passengerListAll = passengerServiceApi.selectByUserId(createOrderDTO.getUserId());
        if (passengerListAll == null || passengerListAll.isEmpty()) {
            throw new OrderServiceException(Code.ERROR_ARGUMENT, "乘客信息匹配失败");
        }
        List<PassengerDTO> passengerSortList = passengerListAll.stream().sorted(Comparator.comparing(PassengerDTO::getId)).collect(Collectors.toList());
        prepareData.setPassengerList(Arrays.asList(passengerSortList.get(0)));
        return prepareData;
    }


    /**
     * 计算班次订单价格
     *
     * @param createOrderDTO
     * @return
     */
    private OrderPriceDetail compPlanPriceDetail(CreateOrderDTO createOrderDTO, PlanOrderPrepareData prepareData) {
        //原始票价总额（车票数量 * 票价）
        BigDecimal ticketPrice = new BigDecimal(prepareData.getPlanInfo().getTicketPrice() + "");
        BigDecimal ticketCost = ticketPrice.multiply(new BigDecimal(createOrderDTO.getTicketNumber()));

        //TODO ... 接送费用
        BigDecimal takePrice = BigDecimal.ZERO;
        BigDecimal givePrice = BigDecimal.ZERO;
        if (createOrderDTO.getTakeLng() != null && BigDecimal.ZERO.compareTo(createOrderDTO.getTakeLng()) < 0
                && createOrderDTO.getTakeLat() != null && BigDecimal.ZERO.compareTo(createOrderDTO.getTakeLat()) < 0) {
            takePrice = BigDecimal.ZERO;
        }
        if (createOrderDTO.getGiveLng() != null && BigDecimal.ZERO.compareTo(createOrderDTO.getGiveLng()) < 0
                && createOrderDTO.getGiveLat() != null && BigDecimal.ZERO.compareTo(createOrderDTO.getGiveLat()) < 0) {
            givePrice = BigDecimal.ZERO;
        }

        //保险组合单价
        BigDecimal insurancesPrice = compInsurancesCost(prepareData);
        //TODO ... 优惠券
        BigDecimal couponCost = BigDecimal.ZERO;

        BigDecimal passengerNum = new BigDecimal(prepareData.getPassengerList().size());
        OrderPriceDetail priceDetail = new OrderPriceDetail();
        priceDetail.setTicketPrice(ticketPrice);
        priceDetail.setTicketCost(ticketCost);
        priceDetail.setTakePrice(takePrice);
        priceDetail.setTakeCost(takePrice.multiply(passengerNum));
        priceDetail.setGivePrice(givePrice);
        priceDetail.setGiveCost(givePrice.multiply(passengerNum));
        priceDetail.setInsurancePrice(insurancesPrice);
        priceDetail.setInsuranceCost(insurancesPrice.multiply(passengerNum));
        priceDetail.setCouponCost(couponCost);

        //下单时的总金额 = 车票数量 * 票价 + 保险费 + 接车费用 + 送人费用 - 优惠券金额
        BigDecimal totalCost = ticketCost.add(priceDetail.getTakeCost()).add(priceDetail.getGiveCost()).add(priceDetail.getInsuranceCost()).subtract(priceDetail.getCouponCost());
        priceDetail.setTotalCost(totalCost);

        prepareData.setPriceDetail(priceDetail);
        return priceDetail;
    }

    /**
     * 计算包车订单价格
     *
     * @param createOrderDTO
     * @return
     */
    private OrderPriceDetail compCharteredPriceDetail(CreateOrderDTO createOrderDTO, CharteredOrderPrepareData prepareData) {
        //TODO ... 先使用前台计算值，后期做校验比较；原始票价总额（和人数没有关系）
        BigDecimal ticketCost = createOrderDTO.getTravelDistance().multiply(prepareData.chartCarModel.getUnitPrice());

        OrderPriceDetail priceDetail = new OrderPriceDetail();
        //票费用
        priceDetail.setTicketPrice(BigDecimal.ZERO);
        priceDetail.setTicketCost(ticketCost);
        //接费用
        priceDetail.setTakePrice(BigDecimal.ZERO);
        priceDetail.setTakeCost(BigDecimal.ZERO);
        //送费用
        priceDetail.setGivePrice(BigDecimal.ZERO);
        priceDetail.setGiveCost(BigDecimal.ZERO);
        //保险费用
        priceDetail.setInsurancePrice(BigDecimal.ZERO);
        priceDetail.setInsuranceCost(BigDecimal.ZERO);
        //优惠券
        priceDetail.setCouponCost(BigDecimal.ZERO);

        //下单时的总金额 = 总票价（和人数没有关系） + 保险费 + 接车费用 + 送人费用 - 优惠券金额
        BigDecimal totalCost = ticketCost.add(priceDetail.getTakeCost()).add(priceDetail.getGiveCost()).add(priceDetail.getInsuranceCost()).subtract(priceDetail.getCouponCost());
        priceDetail.setTotalCost(totalCost);

        prepareData.setPriceDetail(priceDetail);
        return priceDetail;
    }


    /**
     * 班车下单数据处理
     *
     * @param createOrderDTO
     * @param prepareData
     * @return
     */
    private OOrder setupPlanOrder(CreateOrderDTO createOrderDTO, PlanOrderPrepareData prepareData) {
        OOrder orderEntity = initDefaultOrder();
        orderEntity.setUserId(createOrderDTO.getUserId());
        orderEntity.setPlanId(createOrderDTO.getPlanId());
        orderEntity.setLineId(prepareData.getPlanInfo().getLineId());
        orderEntity.setSiteStartName(prepareData.getStartSiteInfo().getName());
        orderEntity.setSiteEndName(prepareData.getEndSiteInfo().getName());
        orderEntity.setStartTime(prepareData.getPlanInfo().getStartTime());
        orderEntity.setTicketNumber(prepareData.getPassengerList().size());

        orderEntity.setTicketCost(prepareData.getPriceDetail().getTicketCost());
        orderEntity.setTakeCost(prepareData.getPriceDetail().getTakeCost());
        orderEntity.setGiveCost(prepareData.getPriceDetail().getGiveCost());
        orderEntity.setInsuranceCost(prepareData.getPriceDetail().getInsuranceCost());
        orderEntity.setCouponCost(prepareData.getPriceDetail().getCouponCost());
        orderEntity.setTotalCost(prepareData.getPriceDetail().getTotalCost());
        orderEntity.setUnpaidCost(orderEntity.getTotalCost());

        if (createOrderDTO.getTakeLng() != null && BigDecimal.ZERO.compareTo(createOrderDTO.getTakeLng()) < 0
                && createOrderDTO.getTakeLat() != null && BigDecimal.ZERO.compareTo(createOrderDTO.getTakeLat()) < 0) {
            orderEntity.setTakeCoordinate(createOrderDTO.getTakeLng() + "," + createOrderDTO.getTakeLat());
            orderEntity.setRelayType(RelayTypeEnum.TAKE.getCode());
        }
        orderEntity.setTakeAddress(createOrderDTO.getTakeAddress());
        if (createOrderDTO.getGiveLng() != null && BigDecimal.ZERO.compareTo(createOrderDTO.getGiveLng()) < 0
                && createOrderDTO.getGiveLat() != null && BigDecimal.ZERO.compareTo(createOrderDTO.getGiveLat()) < 0) {
            orderEntity.setGiveCoordinate(createOrderDTO.getGiveLng() + "," + createOrderDTO.getGiveLat());
            if (RelayTypeEnum.NON.equals(orderEntity.getRelayType())) {
                orderEntity.setRelayType(RelayTypeEnum.GIVE.getCode());
            } else {
                orderEntity.setRelayType(RelayTypeEnum.BOTH.getCode());
            }
        }
        orderEntity.setGiveAddress(createOrderDTO.getGiveAddress());

        orderEntity.setUserPhone(prepareData.getUserInfo().getPhone());
        orderEntity.setStatus(OrderStatusEnum.NEW.getCode());
        orderEntity.setBusinessType(BusinessTypeEnum.PLAN.getCode());
        orderEntity.setSourceType(createOrderDTO.getSourceType().getCode());
        orderEntity.setCreateBy(prepareData.getUserInfo().getPhone());
        orderEntity.setModifyBy(prepareData.getUserInfo().getPhone());
        return orderEntity;
    }

    /**
     * 包车下单数据处理
     *
     * @param createOrderDTO
     * @param prepareData
     * @return
     */
    private OOrder setupCharteredOrder(CreateOrderDTO createOrderDTO, CharteredOrderPrepareData prepareData) {
        OOrder orderEntity = initDefaultOrder();
        orderEntity.setUserId(createOrderDTO.getUserId());
        orderEntity.setUserPhone(prepareData.getUserInfo().getPhone());

        //付款后添加排班申请
        orderEntity.setPlanId(0);
        orderEntity.setSiteStartName(createOrderDTO.getTakeAddress());
        orderEntity.setSiteEndName(createOrderDTO.getGiveAddress());
        orderEntity.setStartTime(createOrderDTO.getStartTime());
        orderEntity.setTicketNumber(createOrderDTO.getTicketNumber());

        orderEntity.setTicketCost(prepareData.getPriceDetail().getTicketCost());
        orderEntity.setTakeCost(prepareData.getPriceDetail().getTakeCost());
        orderEntity.setGiveCost(prepareData.getPriceDetail().getGiveCost());
        orderEntity.setInsuranceCost(prepareData.getPriceDetail().getInsuranceCost());
        orderEntity.setCouponCost(prepareData.getPriceDetail().getCouponCost());
        orderEntity.setTotalCost(prepareData.getPriceDetail().getTotalCost());
        orderEntity.setUnpaidCost(orderEntity.getTotalCost());

        orderEntity.setTakeCoordinate(createOrderDTO.getTakeLng() + "," + createOrderDTO.getTakeLat());
        orderEntity.setTakeAddress(createOrderDTO.getTakeAddress());
        orderEntity.setGiveCoordinate(createOrderDTO.getGiveLng() + "," + createOrderDTO.getGiveLat());
        orderEntity.setGiveAddress(createOrderDTO.getGiveAddress());
        orderEntity.setRelayType(RelayTypeEnum.BOTH.getCode());

        orderEntity.setCharteredCarBrand(createOrderDTO.getCharteredCarBrand());
        orderEntity.setCharteredCarModel(prepareData.getChartCarModel().getCarModel());
        orderEntity.setBusinessType(BusinessTypeEnum.CHARTERED.getCode());
        orderEntity.setSourceType(createOrderDTO.getSourceType().getCode());
        orderEntity.setCreateBy(prepareData.getUserInfo().getPhone());
        orderEntity.setModifyBy(prepareData.getUserInfo().getPhone());
        return orderEntity;
    }


    /**
     * 保存订单保险信息
     *
     * @param rderEntity
     * @param prepareData
     * @return
     */
    private void saveInsurances(OOrder rderEntity, PlanOrderPrepareData prepareData) {
        for (InsuranceDTO insurance : prepareData.getInsuranceList()) {
            OOrder2Insurance order2Insurance = new OOrder2Insurance();
            order2Insurance.setOrderId(rderEntity.getId());
            order2Insurance.setInsuranceId(insurance.getId());
            order2Insurance.setInsuranceName(insurance.getName());
            order2Insurance.setInsurancePremium(insurance.getPremium());
            order2Insurance.setCount(prepareData.getInsuranceCount());
            order2Insurance.setMoney(insurance.getPremium().multiply(new BigDecimal(order2Insurance.getCount())));
            oOrder2InsuranceMapper.insert(order2Insurance);
        }
    }

    /**
     * 计算保险总单价 * 每人
     *
     * @param prepareData
     * @return
     */
    private BigDecimal compInsurancesCost(PlanOrderPrepareData prepareData) {
        BigDecimal insurancePrice = BigDecimal.ZERO;
        for (InsuranceDTO insurance : prepareData.getInsuranceList()) {
            insurancePrice = insurancePrice.add(insurance.getPremium().multiply(new BigDecimal(prepareData.getInsuranceCount())));
        }
        return insurancePrice;
    }

    /**
     * 保存包车订单的票信息
     *
     * @param rderEntity
     * @param planInfo
     * @param priceDetail
     * @param passengerList
     */
    private void saveTicket(OOrder rderEntity, PlanDTO planInfo, OrderPriceDetail priceDetail, List<PassengerDTO> passengerList) {
        for (PassengerDTO passenger : passengerList) {
            OTicket ticketEntity = new OTicket();
            ticketEntity.setCode(serialService.generateCode(SerialCodeRuleEnum.TICKET));
            ticketEntity.setUserId(rderEntity.getUserId());
            ticketEntity.setOrderId(rderEntity.getId());
            ticketEntity.setSchedulingId(0);
            ticketEntity.setTicketPrice(new BigDecimal(planInfo.getTicketPrice() + ""));
            ticketEntity.setSignDate(null);
            ticketEntity.setVerificationCode("");
            //TODO 保险和接车费用每人都计算（订单上记录总的费用；包车的都为0）
            ticketEntity.setInsurancePrice(priceDetail.getInsurancePrice());
            ticketEntity.setTakeCost(priceDetail.getTakePrice());
            ticketEntity.setGiveCost(priceDetail.getGivePrice());
            //排班以后才能确定
            ticketEntity.setCarModel("");
            ticketEntity.setPlateNumber("");
            ticketEntity.setSeatNumber("");
            ticketEntity.setIsPickUp(false);
            ticketEntity.setPassengerName(passenger.getName());
            ticketEntity.setCardType(passenger.getCardType());
            ticketEntity.setPassengerCardno(passenger.getCardNo());
            ticketEntity.setPassengerPhone(passenger.getPhone());
            //保险公司对接
            ticketEntity.setInsuranceCode("");
            ticketEntity.setStatus(TicketStatusEnum.NON.getCode());
            ticketEntity.setCreateAt(new Date());
            ticketEntity.setCreateBy(rderEntity.getCreateBy());
            ticketEntity.setModifyAt(new Date());
            ticketEntity.setModifyBy(rderEntity.getModifyBy());

            oTicketMapper.insert(ticketEntity);
        }
    }

    /**
     * 订单数据默认设置
     *
     * @return
     */
    private OOrder initDefaultOrder() {
        OOrder orderEntity = new OOrder();
        //自增ID
        orderEntity.setId(null);
        orderEntity.setCode(serialService.generateCode(SerialCodeRuleEnum.ORDER));
        orderEntity.setUserId(null);
        //包车无线路（初始null）
        orderEntity.setPlanId(null);
        orderEntity.setLineId(0);
        orderEntity.setCarId(0);
        orderEntity.setSiteStartName("");
        orderEntity.setSiteEndName("");
        orderEntity.setSchedulingId(0);
        orderEntity.setStartTime(new Date());
        orderEntity.setTicketNumber(1);
        orderEntity.setTicketCost(BigDecimal.ZERO);
        orderEntity.setInsuranceCost(BigDecimal.ZERO);
        orderEntity.setCouponCost(BigDecimal.ZERO);
        orderEntity.setTakeCost(BigDecimal.ZERO);
        orderEntity.setTakeCoordinate("");
        orderEntity.setTakeAddress("");
        orderEntity.setGiveCost(BigDecimal.ZERO);
        orderEntity.setGiveCoordinate("");
        orderEntity.setGiveAddress("");
        orderEntity.setTotalCost(BigDecimal.ZERO);
        orderEntity.setUnpaidCost(BigDecimal.ZERO);
        orderEntity.setPayType(0);
        orderEntity.setUserPhone("");
        //行程时长（接收行程时写入）
        orderEntity.setTravelTime(0);
        orderEntity.setTravelDistance(0L);
        orderEntity.setStatus(OrderStatusEnum.NEW.getCode());
        orderEntity.setRelayType(RelayTypeEnum.NON.getCode());
        //自营
        orderEntity.setIsSelf(true);
        //改签标记（改签后，可能会限制一些业务）
        orderEntity.setIsChanged(false);
        orderEntity.setIsEvaluated(false);
        orderEntity.setCharteredCarBrand(0);
        orderEntity.setCharteredCarModel("");
        orderEntity.setBusinessType(BusinessTypeEnum.PLAN.getCode());
        //第三方平台班次编码
        orderEntity.setOtherPlatformPlanCode("");
        //第三方平台Id，对应b_other_platform表
        orderEntity.setOtherPlatformId(0);
        orderEntity.setRemark("");
        //开票标记
        orderEntity.setIsInvoice(0);
        orderEntity.setTaxVoucher("");
        orderEntity.setTaxTime(null);
        orderEntity.setSourceType(SourceEnum.ANDROID.getCode());
        orderEntity.setCreateAt(new Date());
        orderEntity.setCreateBy("");
        orderEntity.setModifyAt(new Date());
        orderEntity.setModifyBy("");
        return orderEntity;
    }

    /**
     * 班次下单数据转化辅助类
     */
    @Data
    private static class PlanOrderPrepareData {
        //-------------------- 参数转化数据 --------------------
        //用户信息
        private UserDTO userInfo;
        //排班信息
        private PlanDTO planInfo;
        //线路信息
        private LineDTO lineInfo;
        //出发站点信息
        private SiteDTO startSiteInfo;
        //结束站点信息
        private SiteDTO endSiteInfo;
        //乘客信息
        private List<PassengerDTO> passengerList;
        //保险列表及份数信息
        private Integer insuranceCount;
        private List<InsuranceDTO> insuranceList;


        //-------------------- 中间计算数据 --------------------
        //订单价格组成详细
        private OrderPriceDetail priceDetail;
    }

    /**
     * 包车下单数据转化辅助类
     */
    @Data
    private static class CharteredOrderPrepareData {
        //-------------------- 参数转化数据 --------------------
        //用户信息
        private UserDTO userInfo;
        //包车品牌
        private CharteredCarModelDTO chartCarModel;


        //-------------------- 中间计算数据 --------------------
        //乘客信息（购票人）
        private List<PassengerDTO> passengerList;
        //订单价格组成详细
        private OrderPriceDetail priceDetail;
    }

    /**
     * 包车下单数据转化辅助类
     */
    @Data
    private static class OrderPriceDetail {

        //票单价 * 人数
        private BigDecimal ticketPrice;
        private BigDecimal ticketCost;
        //接车单价 * 人数
        private BigDecimal takePrice;
        private BigDecimal takeCost;
        //送人单价 * 人数
        private BigDecimal givePrice;
        private BigDecimal giveCost;
        //保险费单价 * 人数
        private BigDecimal insurancePrice;
        private BigDecimal insuranceCost;
        //优惠券总金额
        private BigDecimal couponCost;

        //订单总金额
        private BigDecimal totalCost;

    }

}
