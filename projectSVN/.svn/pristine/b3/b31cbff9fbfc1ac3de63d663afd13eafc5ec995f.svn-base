package com.zacx.serivce.order.api;

import com.zacx.serivce.order.api.dto.*;
import com.zacx.serivce.order.api.exceptions.OrderServiceException;

import java.util.List;

public interface OrderManagerServiceApi {

    /**
     * @description: 返回订单及乘客信息
     * @author: kiting
     * @date: 2018年10月05日 10:59
     *
     * @param schedulingId 1
     * @return: java.util.List
     * @throw:
    **/
    List<OrderTicketDTO> getOrderTicketBy(Integer schedulingId);


    /**
     * @description: 返回订单及乘客信息
     * @author: kiting
     * @date: 2018年10月05日 10:59
     *
     * @param schedulingId 1
     * @return: void
     * @throw:
     **/
    void finishScheduling(Integer schedulingId) throws OrderServiceException;

}
