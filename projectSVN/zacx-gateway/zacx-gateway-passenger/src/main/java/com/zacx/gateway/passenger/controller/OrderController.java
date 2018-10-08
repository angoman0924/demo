package com.zacx.gateway.passenger.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.zacx.core.enums.Code;
import com.zacx.core.util.DateUtils;
import com.zacx.core.util.MoneyUtils;
import com.zacx.core.util.StringUtils;
import com.zacx.gateway.base.base.ClientInfo;
import com.zacx.gateway.base.base.PageResult;
import com.zacx.gateway.base.base.Result;
import com.zacx.gateway.base.util.WebUtils;
import com.zacx.gateway.passenger.constants.OrderApiUrl;
import com.zacx.gateway.passenger.dto.order.*;
import com.zacx.serivce.order.api.OrderServiceApi;
import com.zacx.serivce.order.api.dto.*;
import com.zacx.serivce.order.api.enums.BusinessTypeEnum;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @author gulx
 * @Description 订单
 * @Date 2018/9/27 19:37
 * @Param
 * @copyright 上海拜米网络科技有限公司
 * @return
 **/
@Api(description = "订单模块")
@RestController
@RequestMapping(OrderApiUrl.V1_ORDER)
public class OrderController {
    @Autowired
    private OrderServiceApi orderServiceApi;

    @ApiOperation(value = "计算班次订单金额")
    @PostMapping(OrderApiUrl.COMP_PLAN_ORDER_PRICE)
    public Result<AddCreatePriceResult> compPlanOrderPrice(ClientInfo clientInfo, @RequestBody AddPlanOrderPriceEnter addPlanOrderPriceEnter) {
        CreateOrderDTO createOrderDTO = new CreateOrderDTO();
        BeanUtils.copyProperties(addPlanOrderPriceEnter, createOrderDTO);
        createOrderDTO.setUserId(clientInfo.getUserId());
        createOrderDTO.setSourceType(clientInfo.getSource());
        createOrderDTO.setBusinessTypeEnum(BusinessTypeEnum.PLAN);
        BigDecimal total = orderServiceApi.compPrice(createOrderDTO);
        AddCreatePriceResult result = new AddCreatePriceResult();
        result.setTotalCost(MoneyUtils.getStrMoney(total));
        return Result.success(result);
    }

    @ApiOperation(value = "计算包车订单金额")
    @PostMapping(OrderApiUrl.COMP_CHARTERED_ORDER_PRICE)
    public Result<AddCreatePriceResult> compCharteredOrderPrice(ClientInfo clientInfo, @RequestBody AddCharteredOrderPriceEnter addCharteredOrderPriceEnter) {
        CreateOrderDTO createOrderDTO = new CreateOrderDTO();
        BeanUtils.copyProperties(addCharteredOrderPriceEnter, createOrderDTO);
        createOrderDTO.setUserId(clientInfo.getUserId());
        createOrderDTO.setSourceType(clientInfo.getSource());
        createOrderDTO.setBusinessTypeEnum(BusinessTypeEnum.CHARTERED);
        BigDecimal total = orderServiceApi.compPrice(createOrderDTO);
        AddCreatePriceResult result = new AddCreatePriceResult();
        result.setTotalCost(MoneyUtils.getStrMoney(total));
        return Result.success(result);
    }

    @ApiOperation(value = "新增班次订单")
    @PostMapping(OrderApiUrl.ADD_PLAN_ORDER)
    public Result<AddOrderResult> addPlanOrder(ClientInfo clientInfo, @RequestBody AddPlanOrderEnter addPlanOrderEnter) {
        CreateOrderDTO createOrderDTO = new CreateOrderDTO();
        BeanUtils.copyProperties(addPlanOrderEnter, createOrderDTO);
        createOrderDTO.setUserId(clientInfo.getUserId());
        createOrderDTO.setSourceType(clientInfo.getSource());
        createOrderDTO.setBusinessTypeEnum(BusinessTypeEnum.PLAN);
        OrderMainDTO order = orderServiceApi.create(createOrderDTO);
        if (order != null) {
            AddOrderResult result = new AddOrderResult();
            result.setOrderId(order.getOrderId());
            result.setOrderCode(order.getOrderCode());
            return Result.success(result);
        }
        return Result.error(Code.ERROR_DB_OPERATE, "订单生成失败");
    }

    @ApiOperation(value = "新增包车订单")
    @PostMapping(OrderApiUrl.ADD_CHARTERED_ORDER)
    public Result<AddOrderResult> addCharteredOrder(ClientInfo clientInfo, @RequestBody AddCharteredOrderEnter addCharteredOrderEnter) {
        CreateOrderDTO createOrderDTO = new CreateOrderDTO();
        BeanUtils.copyProperties(addCharteredOrderEnter, createOrderDTO);
        createOrderDTO.setUserId(clientInfo.getUserId());
        createOrderDTO.setSourceType(clientInfo.getSource());
        createOrderDTO.setBusinessTypeEnum(BusinessTypeEnum.CHARTERED);
        OrderMainDTO order = orderServiceApi.create(createOrderDTO);
        if (order != null) {
            AddOrderResult result = new AddOrderResult();
            result.setOrderId(order.getOrderId());
            result.setOrderCode(order.getOrderCode());
            return Result.success(result);
        }
        return Result.error(Code.ERROR_DB_OPERATE, "订单生成失败");
    }

    @ApiOperation(value = "订单支付金额详细")
    @PostMapping(OrderApiUrl.PAY_DETAIL)
    public Result<PayPriceBaseResult> payDetail(ClientInfo clientInfo, @RequestBody PayPriceApplyEnter orderPaymentEnter) {
        PayPriceDTO priceDetail = orderServiceApi.payDetail(orderPaymentEnter.getOrderId());
        if (priceDetail != null) {
            //金额格式化
            PayPriceDetailResult result = JSON.parseObject(JSON.toJSONString(priceDetail), PayPriceDetailResult.class);
            result.setTotalCost(MoneyUtils.getStrMoney(priceDetail.getTotalCost()));
            result.setUnpaidCost(MoneyUtils.getStrMoney(priceDetail.getUnpaidCost()));
            result.setPaidCost(MoneyUtils.getStrMoney(priceDetail.getPaidCost()));
            result.setInsuranceCost(MoneyUtils.getStrMoney(priceDetail.getInsuranceCost()));
            result.setServiceCost(MoneyUtils.getStrMoney(priceDetail.getServiceCost()));
            result.setMyWallet(MoneyUtils.getStrMoney(priceDetail.getMyWallet()));
            //时间格式处理
            result.setStartTime(DateUtils.getFormatStrDate(priceDetail.getStartTime()));
            result.setCreateAt(DateUtils.getFormatStrDate(priceDetail.getCreateAt()));
            result.setExpiryTime(DateUtils.getFormatStrDate(priceDetail.getExpiryTime()));
            return Result.success(result);
        }
        return Result.error(Code.ERROR_DATA_NOT_FOUND, "支付信息获取失败");
    }

    @ApiOperation(value = "支付订单")
    @PostMapping(OrderApiUrl.DO_PAY)
    public Result<PayConfirmResult> doPay(ClientInfo clientInfo, @RequestBody PayConfirmEnter payConfirmEnter) {
        PayConfirmDTO payConfirmDTO = new PayConfirmDTO();
        BeanUtils.copyProperties(payConfirmEnter, payConfirmDTO);
        payConfirmDTO.setUserId(clientInfo.getUserId());
        Boolean flag = orderServiceApi.doPay(payConfirmDTO);
        if (flag) {
            return Result.success(new PayConfirmResult());
        }
        return Result.error(Code.ERROR_DB_OPERATE, "支付失败");
    }

    @ApiOperation(value = "取消或更改订单金额")
    @PostMapping(OrderApiUrl.CHANGE_DETAIL)
    public Result<PayPriceBaseResult> changePrice(ClientInfo clientInfo, @RequestBody ChangeOrderEnter changeOrderEnter) {
        ChangeOrderDTO changeOrderDTO = new ChangeOrderDTO();
        BeanUtils.copyProperties(changeOrderEnter, changeOrderDTO);
        changeOrderDTO.setUserId(clientInfo.getUserId());
        PayPriceDTO priceDetail = orderServiceApi.changeDetail(changeOrderDTO);
        if (priceDetail != null) {
            //金额格式化
            PayPriceReturnResult result = JSON.parseObject(JSON.toJSONString(priceDetail), PayPriceReturnResult.class);
            result.setTotalCost(MoneyUtils.getStrMoney(priceDetail.getTotalCost()));
            result.setUnpaidCost(MoneyUtils.getStrMoney(priceDetail.getUnpaidCost()));
            result.setPaidCost(MoneyUtils.getStrMoney(priceDetail.getPaidCost()));
            result.setInsuranceCost(MoneyUtils.getStrMoney(priceDetail.getInsuranceCost()));
            result.setServiceCost(MoneyUtils.getStrMoney(priceDetail.getServiceCost()));
            result.setBreakCost(MoneyUtils.getStrMoney(priceDetail.getBreakCost()));
            result.setReturnCost(MoneyUtils.getStrMoney(priceDetail.getBreakCost()));
            return Result.success(result);
        }
        return Result.error(Code.ERROR_DATA_NOT_FOUND, "金额信息获取失败");
    }

    @ApiOperation(value = "取消或更改订单")
    @PostMapping(OrderApiUrl.DO_CHANGE)
    public Result<ChangeOrderResult> doChange(ClientInfo clientInfo, @RequestBody ChangeOrderEnter changeOrderEnter) {
        ChangeOrderDTO changeOrderDTO = new ChangeOrderDTO();
        BeanUtils.copyProperties(changeOrderEnter, changeOrderDTO);
        changeOrderDTO.setUserId(clientInfo.getUserId());
        Boolean flag = orderServiceApi.doChange(changeOrderDTO);
        if (flag) {
            return Result.success(new ChangeOrderResult());
        }
        return Result.error(Code.ERROR_DB_OPERATE, "订单操作失败");
    }

    @ApiOperation(value = "订单列表")
    @PostMapping(OrderApiUrl.ORDER_LIST)
    public Result<PageResult<OrderMainResult>> queryOrderList(ClientInfo clientInfo, @RequestBody OrderQueryEnter orderQueryEnter) {
        OrderQueryDTO orderQueryDTO = new OrderQueryDTO();
        BeanUtils.copyProperties(orderQueryEnter, orderQueryDTO);
        orderQueryDTO.setUserId(clientInfo.getUserId());
        PageInfo<OrderMainDTO> pageList = orderServiceApi.queryOrderList(orderQueryDTO);

        return WebUtils.pageDTOConvert2PageResult(pageList, OrderMainResult.class);
    }

    @ApiOperation(value = "订单详情")
    @PostMapping(OrderApiUrl.ORDER_DETAIL)
    public Result<OrderDetailResult> queryOrderDetail(ClientInfo clientInfo, @RequestBody OrderDetailEnter orderDetailEnter) {
        OrderDetailDTO orderDetail = orderServiceApi.queryOrderDetail(orderDetailEnter.getOrderId());
        if (orderDetail != null) {
            OrderDetailResult result = JSON.parseObject(JSON.toJSONString(orderDetail), OrderDetailResult.class);
            return Result.success(result);
        }
        return Result.error(Code.ERROR_DATA_NOT_FOUND, "订单详情获取失败");
    }

    @ApiOperation(value = "扫码上车")
    @PostMapping(OrderApiUrl.SCAN_BOARDING_CODE)
    public Result<BoardingValiResult> scanBoardingCode(ClientInfo clientInfo, @RequestBody BoardingValiEnter boardingValiEnter) {
        BoardingValiDTO boardingValiDTO = new BoardingValiDTO();
        BeanUtils.copyProperties(boardingValiEnter, boardingValiDTO);
        boardingValiDTO.setUserId(clientInfo.getUserId());
        Boolean flag = orderServiceApi.scanBoardingCode(boardingValiDTO);
        if (flag) {
            return Result.success(new BoardingValiResult());
        }
        return Result.error(Code.ERROR_DB_OPERATE, "扫码验车失败");
    }

    @ApiOperation(value = "生成登车短信码")
    @PostMapping(OrderApiUrl.SMS_BOARDING_CODE)
    public Result<BoardingCodeResult> smsBoardingCode(ClientInfo clientInfo, @RequestBody BoardingSmsEnter boardingSmsEnter) {
        BoardingSmsDTO boardingSmsDTO = new BoardingSmsDTO();
        BeanUtils.copyProperties(boardingSmsEnter, boardingSmsDTO);
        boardingSmsDTO.setUserId(clientInfo.getUserId());
        String smsCode = orderServiceApi.smsBoardingCode(boardingSmsDTO);
        if (!StringUtils.isBlank(smsCode)) {
            BoardingCodeResult result = new BoardingCodeResult();
            result.setMessage("等车短信码已发送至您的手机，请注意保管！测试用：" + smsCode);
            return Result.success(result);
        }
        return Result.error(Code.ERROR_DB_OPERATE, "获取登车短信码失败");
    }

    @ApiOperation(value = "获取评论类型集合")
    @PostMapping(OrderApiUrl.EVALUATE_CATEGORIES)
    public Result<EvaluateCategoryResult> evaluateCategory(ClientInfo clientInfo) {
        EvaluateCategoryDTO evaluateCategory = orderServiceApi.evaluateCategory();
        if (evaluateCategory != null) {
            EvaluateCategoryResult result = JSON.parseObject(JSON.toJSONString(evaluateCategory), EvaluateCategoryResult.class);
            return Result.success(result);
        }
        return Result.error(Code.ERROR_DATA_NOT_FOUND, "获取评论类型集合失败");
    }

    @ApiOperation(value = "提交评价信息")
    @PostMapping(OrderApiUrl.DO_EVALUATE)
    public Result<EvaluateResult> doEvaluate(ClientInfo clientInfo, @RequestBody EvaluateEnter evaluateEnter) {
        //catgList的类型不一样，不能使用BeanUtils.copyProperties
        EvaluateInfoDTO evaluateInfoDTO = JSON.parseObject(JSON.toJSONString(evaluateEnter), EvaluateInfoDTO.class);
        evaluateInfoDTO.setUserId(clientInfo.getUserId());
        Boolean flag = orderServiceApi.doEvaluate(evaluateInfoDTO);
        if (flag) {
            return Result.success(new EvaluateResult());
        }
        return Result.error(Code.ERROR_DB_OPERATE, "提交评价失败");
    }

}
