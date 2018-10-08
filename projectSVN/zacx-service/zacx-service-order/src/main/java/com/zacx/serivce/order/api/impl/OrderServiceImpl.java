package com.zacx.serivce.order.api.impl;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.zacx.serivce.order.api.OrderServiceApi;
import com.zacx.serivce.order.api.dto.*;
import com.zacx.serivce.order.service.OrderChangeLocService;
import com.zacx.serivce.order.service.OrderCreateLocService;
import com.zacx.serivce.order.service.OrderLocService;
import com.zacx.serivce.order.service.OrderQueryLocService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Slf4j
@Component
public class OrderServiceImpl implements OrderServiceApi {
    @Autowired
    OrderCreateLocService orderCreateLocService;
    @Autowired
    OrderQueryLocService orderQueryLocService;
    @Autowired
    OrderChangeLocService orderChangeLocService;
    @Autowired
    OrderLocService orderLocService;

    @Override
    public BigDecimal compPrice(CreateOrderDTO createOrderDTO) {
        log.info("====== 预算订单价格服务参数 ======：{}", JSON.toJSONString(createOrderDTO));
        BigDecimal price = orderCreateLocService.compPrice(createOrderDTO);
        log.info("====== 预算订单价格服务结果 ======：{}", price);
        return price;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public OrderMainDTO create(CreateOrderDTO createOrderDTO) {
        log.info("====== 订单创建服务参数 ======：{}", JSON.toJSONString(createOrderDTO));
        OrderMainDTO order = orderCreateLocService.create(createOrderDTO);
        log.info("====== 预算创建服务结果 ======：{}", JSON.toJSONString(order));
        return order;
    }

    @Override
    public PayPriceDTO payDetail(Integer orderId) {
        log.info("====== 订单支付明细服务参数 ======：{}", orderId);
        PayPriceDTO priceDetail = orderChangeLocService.payDetail(orderId);
        log.info("====== 订单支付明细服务结果 ======：{}", JSON.toJSONString(priceDetail));
        return priceDetail;
    }

    @Override
    public PayPriceDTO changeDetail(ChangeOrderDTO changeOrderDTO) {
        log.info("====== 修改订单服务参数 ======：{}", JSON.toJSONString(changeOrderDTO));
        PayPriceDTO priceDetail = orderChangeLocService.changeDetail(changeOrderDTO);
        log.info("====== 修改订单服务结果 ======：{}", JSON.toJSONString(priceDetail));
        return priceDetail;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public Boolean doPay(PayConfirmDTO payConfirmDTO) {
        log.info("====== 确认支付服务参数 ======：{}", JSON.toJSONString(payConfirmDTO));
        Boolean result = orderChangeLocService.doPay(payConfirmDTO);
        log.info("====== 确认支付服务结果 ======：{}", result);
        return result;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public Boolean doChange(ChangeOrderDTO changeOrderDTO) {
        log.info("====== 确认修改服务参数 ======：{}", JSON.toJSONString(changeOrderDTO));
        Boolean result = orderChangeLocService.doChange(changeOrderDTO);
        log.info("====== 确认修改服务结果 ======：{}", result);
        return result;
    }

    @Override
    public PageInfo<OrderMainDTO> queryOrderList(OrderQueryDTO orderQueryDTO) {
        log.info("====== 订单分页查询服务参数 ======：{}", JSON.toJSONString(orderQueryDTO));
        PageInfo<OrderMainDTO> orderPageList = orderQueryLocService.queryOrderList(orderQueryDTO);
        log.info("====== 订单分页查询服务结果 ======：{}", JSON.toJSONString(orderPageList));
        return orderPageList;
    }

    @Override
    public OrderDetailDTO queryOrderDetail(Integer orderId) {
        log.info("====== 订单明细查询服务参数 ======：{}", orderId);
        OrderDetailDTO orderDetail = orderQueryLocService.queryOrderDetail(orderId);
        log.info("====== 订单明细查询服务结果 ======：{}", JSON.toJSONString(orderDetail));
        return orderDetail;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public Boolean scanBoardingCode(BoardingValiDTO boardingValiDTO) {
        log.info("====== 扫码上车服务参数 ======：{}", JSON.toJSONString(boardingValiDTO));
        Boolean boardResult = orderLocService.scanBoardingCode(boardingValiDTO);
        log.info("====== 扫码上车服务结果 ======：{}", boardResult);
        return boardResult;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public String smsBoardingCode(BoardingSmsDTO boardingSmsDTO) {
        log.info("====== 生成登车短信码服务参数 ======：{}", JSON.toJSONString(boardingSmsDTO));
        String boardCode = orderLocService.smsBoardingCode(boardingSmsDTO);
        log.info("====== 生成登车短信码服务结果 ======：{}", boardCode);
        return boardCode;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public Boolean valiSmsBoardingCode(BoardingSmsValiDTO boardingSmsValiDTO) {
        log.info("====== 司机验票短信码服务参数 ======：{}", JSON.toJSONString(boardingSmsValiDTO));
        Boolean valiResult = orderLocService.valiSmsBoardingCode(boardingSmsValiDTO);
        log.info("====== 司机验票短信码服务结果 ======：{}", valiResult);
        return valiResult;
    }

    @Override
    public EvaluateCategoryDTO evaluateCategory() {
        log.info("====== 获取评论类型集合服务开始（无参数） ======");
        EvaluateCategoryDTO evaluateCategory = orderLocService.evaluateCategory();
        log.info("====== 获取评论类型集合服务结果 ======：{}", JSON.toJSONString(evaluateCategory));
        return evaluateCategory;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public Boolean doEvaluate(EvaluateInfoDTO evaluateInfoDTO) {
        log.info("====== 提交评价服务参数 ======：{}", JSON.toJSONString(evaluateInfoDTO));
        Boolean evaluateResult = orderLocService.doEvaluate(evaluateInfoDTO);
        log.info("====== 提交评价服务结果 ======：{}", evaluateResult);
        return evaluateResult;
    }

}
