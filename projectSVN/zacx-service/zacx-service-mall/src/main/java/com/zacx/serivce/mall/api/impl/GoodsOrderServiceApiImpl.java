package com.zacx.serivce.mall.api.impl;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.zacx.core.enums.GoodsOrderStatusEnum;
import com.zacx.core.enums.GoodsStatusEnum;
import com.zacx.core.util.ObjectUtils;
import com.zacx.core.util.StringUtils;
import com.zacx.serivce.cache.key.enums.SerialCodeRuleEnum;
import com.zacx.serivce.dal.entity.MGoodOrder;
import com.zacx.serivce.dal.entity.MGoodOrderDetail;
import com.zacx.serivce.dal.entity.MGoodOrderOperateLog;
import com.zacx.serivce.dal.entity.MGoods;
import com.zacx.serivce.mall.api.GoodsOrderServiceApi;
import com.zacx.serivce.mall.api.dto.GoodsEntryDTO;
import com.zacx.serivce.mall.api.dto.GoodsOrderDTO;
import com.zacx.serivce.mall.api.dto.OrderEntryDTO;
import com.zacx.serivce.mall.api.exceptions.MallServiceException;
import com.zacx.serivce.mall.service.GoodsOrderOperateLogService;
import com.zacx.serivce.mall.service.GoodsOrderService;
import com.zacx.serivce.mall.service.GoodsSerivce;
import com.zacx.serivce.service.SerialService;
import com.zacx.serivce.user.api.UserIntegralSerivceApi;
import com.zacx.serivce.user.api.dto.UserIntegralDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by song on 2018/10/7.
 */
@Service
public class GoodsOrderServiceApiImpl implements GoodsOrderServiceApi {
    Logger logger= LoggerFactory.getLogger(GoodsSerivceApiImpl.class);

    @Autowired
    private GoodsOrderService goodsOrderService;
    @Autowired
    private GoodsOrderOperateLogService logService;
    @Autowired
    private SerialService serialService;
    @Autowired
    private UserIntegralSerivceApi userIntegralSerivceApi;
    @Autowired
    private GoodsSerivce goodsSerivce;
    @Override
    @Transactional(rollbackFor = Exception.class)
    public int createOrder(OrderEntryDTO orderEntryDTO) throws MallServiceException {
        logger.info("GoodsOrderServiceApi.createOrder,params:{}", JSON.toJSONString(orderEntryDTO));
        String code = serialService.generateCode(SerialCodeRuleEnum.MALL_ORDER);
        if (StringUtils.isBlank(code)) {
            throw new MallServiceException("编号获取失败");
        }

        //1.订单
        MGoodOrder order=new MGoodOrder();
        BeanUtils.copyProperties(orderEntryDTO,order);
        order.setCode(code);
        order.setStatus(GoodsOrderStatusEnum.WAIT.getValue());
        order.setCreateAt(new Date());
        if(null==orderEntryDTO.getGoodsList()||orderEntryDTO.getGoodsList().isEmpty()){
            throw new MallServiceException("没有订单详情");
        }
        long s=orderEntryDTO.getGoodsList().stream().mapToLong(m->m.getPriceIntegral()).sum();
        //判断积分是否充足
        UserIntegralDTO userIntegralDTO=new UserIntegralDTO();
        userIntegralDTO.setUserId(orderEntryDTO.getUserId());
        long l = userIntegralSerivceApi.totalPoint(userIntegralDTO);
        if(l<s){
            throw new MallServiceException("您的积分不足");
        }
        order.setTotalIntegral((int)s);

        Integer insert = goodsOrderService.insert(order);
        if(insert==null){
            throw new MallServiceException("订单创建失败");
        }
        //2.详情
        for(GoodsEntryDTO item:orderEntryDTO.getGoodsList()){
            //判断商品数量是否充足
            MGoods byPrimaryKey = goodsSerivce.findByPrimaryKey(item.getId());
            if(null!=byPrimaryKey&&byPrimaryKey.getStatus()== GoodsStatusEnum.UP.getValue()){
                int su=byPrimaryKey.getNumber()-byPrimaryKey.getSaleNumber();
                if(su>item.getNumber()){
                    throw new MallServiceException(byPrimaryKey.getName()+",库存不足");
                }

                MGoodOrderDetail detail=new MGoodOrderDetail();
                detail.setGoodId(item.getId());
                detail.setNumber(item.getNumber());
                detail.setOrderId(insert);
                detail.setPriceIntegral(item.getPriceIntegral());

                goodsOrderService.insertDetail(detail);

                //更新商品数量
                MGoods up=new MGoods();
                up.setId(item.getId());
                up.setSaleNumber(su-item.getNumber());
                goodsSerivce.update(up);

            }else{
                throw new MallServiceException("商品不存在或已下架");
            }
        }

        //3.日志
        MGoodOrderOperateLog log=new MGoodOrderOperateLog();
        log.setCreateAt(new Date());
        log.setOrderId(insert);
        log.setOrderStatusNew(GoodsOrderStatusEnum.WAIT.getValue());
        log.setTotalIntegral(new BigDecimal(s));
        log.setOperateUserId(orderEntryDTO.getUserId());
        log.setOperatePlatform(orderEntryDTO.getPlatForm());
        logService.insert(log);
        return 1;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int updateOrderDetail(GoodsEntryDTO detail) throws MallServiceException {
        logger.info("GoodsOrderServiceApi.updateOrderDetail,params:{}", JSON.toJSONString(detail));
        //TODO 订单详情更新未实现...(暂无需求)
        return 1;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int removeListByIds(List<Integer> ids) throws MallServiceException {
        logger.info("GoodsOrderServiceApi.removeListByIds,params:{}", JSON.toJSONString(ids));
        goodsOrderService.removeByIds(ids);
        goodsOrderService.removeDetailByIds(ids);
        return 1;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int removeDetailListByIds(List<Integer> ids) throws MallServiceException {
        return goodsOrderService.removeDetailByDetailIds(ids);
    }

    @Override
    public PageInfo<GoodsOrderDTO> getMGoodOrderPageInfo(GoodsOrderDTO dto) {
        logger.info("GoodsOrderServiceApi.getMGoodOrderPageInfo,params:{}", JSON.toJSONString(dto));
        PageInfo<MGoodOrder> pageInfo = goodsOrderService.getMGoodOrderPageInfo(dto);
        logger.info("SiteServiceApi.getSitePageInfo,params:{}",JSON.toJSONString(dto));

        PageInfo<GoodsOrderDTO> page= ObjectUtils.pageEntityConvert2PageDTO(pageInfo,GoodsOrderDTO.class);
        logger.info("page_result:{}",JSON.toJSONString(page));

        return page;
    }
}
