package com.zacx.serivce.order.service;

import com.github.pagehelper.PageInfo;
import com.zacx.serivce.order.api.dto.OrderDetailDTO;
import com.zacx.serivce.order.api.dto.OrderMainDTO;
import com.zacx.serivce.order.api.dto.OrderQueryDTO;
import com.zacx.serivce.order.api.dto.OrderTicketDTO;

import java.util.List;

public interface OrderQueryLocService {

    PageInfo<OrderMainDTO> queryOrderList(OrderQueryDTO orderQueryDTO);

    OrderDetailDTO queryOrderDetail(Integer orderId);

    List<OrderTicketDTO> getOrderTicketBy(Integer schedulingId);

}
