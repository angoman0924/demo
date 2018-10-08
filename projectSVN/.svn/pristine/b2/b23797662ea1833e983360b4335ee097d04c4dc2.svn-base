package com.zacx.serivce.order.service;

import com.zacx.serivce.order.api.dto.*;
import com.zacx.serivce.order.api.exceptions.OrderServiceException;

public interface OrderChangeLocService {

    PayPriceDTO payDetail(Integer orderId);

    PayPriceDTO changeDetail(ChangeOrderDTO changeOrderDTO);

    Boolean doPay(PayConfirmDTO payConfirmDTO);

    Boolean doChange(ChangeOrderDTO changeOrderDTO);

    void finishScheduling(Integer schedulingId) throws OrderServiceException;

}
