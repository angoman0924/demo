package com.zacx.serivce.order.api.impl;

import com.alibaba.fastjson.JSON;
import com.zacx.serivce.order.api.OrderManagerServiceApi;
import com.zacx.serivce.order.api.dto.OrderTicketDTO;
import com.zacx.serivce.order.api.exceptions.OrderServiceException;
import com.zacx.serivce.order.service.OrderChangeLocService;
import com.zacx.serivce.order.service.OrderQueryLocService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description: 后台管理对接服务
 * @author: kiting
 * @date: 2018年10月07日 18:06
 * @version: 1.0
 * @copyright: 上海拜米网络科技有限公司
 **/
@Slf4j
@Service
public class OrderManagerServiceApiImpl implements OrderManagerServiceApi {
    @Autowired
    OrderQueryLocService orderQueryLocService;
    @Autowired
    OrderChangeLocService orderChangeLocService;

    @Override
    public List<OrderTicketDTO> getOrderTicketBy(Integer schedulingId) {
        log.info("====== 通过调度ID获取有效订单服务参数 ======：{}", schedulingId);
        List<OrderTicketDTO> otList = orderQueryLocService.getOrderTicketBy(schedulingId);
        log.info("====== 通过调度ID获取有效订单服务结果 ======：{}", otList.size());
        return otList;
    }

    @Override
    public void finishScheduling(Integer schedulingId) throws OrderServiceException {
        log.info("====== 通过调度ID获取有效订单服务参数 ======：{}", schedulingId);
        List<OrderTicketDTO> otList = orderQueryLocService.getOrderTicketBy(schedulingId);
        log.info("====== 通过调度ID获取有效订单服务结束 ======");
    }

}
