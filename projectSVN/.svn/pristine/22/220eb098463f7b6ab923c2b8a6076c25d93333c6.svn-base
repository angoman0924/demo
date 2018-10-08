package com.zacx.serivce.order.api;

import com.github.pagehelper.PageInfo;
import com.zacx.serivce.order.api.dto.*;

import java.math.BigDecimal;

public interface OrderServiceApi {

    /**
     * @description: 返回总金额
     * @author: kiting
     * @date: 2018年10月05日 10:59
     *
     * @param createOrderDTO 1
     * @return: java.math.BigDecimal
     * @throw:
    **/
    BigDecimal compPrice(CreateOrderDTO createOrderDTO);

    /**
     * @description: 返回订单
     * @author: kiting
     * @date: 2018年10月05日 11:02
     *
     * @param createOrderDTO 1
     * @return: com.zacx.serivce.order.api.dto.OrderMainDTO
     * @throw:
    **/
    OrderMainDTO create(CreateOrderDTO createOrderDTO);

    /**
     * @description: 订单支付金额详细
     * @author: kiting
     * @date: 2018年10月05日 11:17
     *
     * @param orderId 1
     * @return: com.zacx.serivce.order.api.dto.PayPriceDTO
     * @throw:
    **/
    PayPriceDTO payDetail(Integer orderId);

    /**
     * @description: 支付订单
     * @author: kiting
     * @date: 2018年10月05日 11:19
     *
     * @param payConfirmDTO 1
     * @return: java.lang.Boolean
     * @throw:
    **/
    Boolean doPay(PayConfirmDTO payConfirmDTO);

    /**
     * @description: 取消或更改订单金额
     * @author: kiting
     * @date: 2018年10月05日 11:24
     *
     * @param changeOrderDTO 1
     * @return: com.zacx.serivce.order.api.dto.PayPriceDTO
     * @throw:
    **/
    PayPriceDTO changeDetail(ChangeOrderDTO changeOrderDTO);

    /**
     * @description: 取消或更改订单
     * @author: kiting
     * @date: 2018年10月05日 11:24
     *
     * @param changeOrderDTO 1
     * @return: java.lang.Boolean
     * @throw:
    **/
    Boolean doChange(ChangeOrderDTO changeOrderDTO);

    /**
     * @description: 订单列表
     * @author: kiting
     * @date: 2018年10月05日 11:31
     *
     * @param orderQueryDTO 1
     * @return: com.github.pagehelper.PageInfo<com.zacx.serivce.order.api.dto.OrderMainDTO>
     * @throw:
    **/
    PageInfo<OrderMainDTO> queryOrderList(OrderQueryDTO orderQueryDTO);

    /**
     * @description: 订单详情
     * @author: kiting
     * @date: 2018年10月05日 11:31
     *
     * @param orderId 1
     * @return: com.zacx.serivce.order.api.dto.OrderDetailDTO
     * @throw:
    **/
    OrderDetailDTO queryOrderDetail(Integer orderId);

    /**
     * @description: 扫码上车
     * @author: kiting
     * @date: 2018年10月05日 11:08
     *
     * @param boardingValiDTO 1
     * @return: java.lang.Boolean
     * @throw:
    **/
    Boolean scanBoardingCode(BoardingValiDTO boardingValiDTO);

    /**
     * @description: 生成登车短信码
     * @author: kiting
     * @date: 2018年10月05日 11:08
     *
     * @param boardingSmsDTO 1
     * @return: java.lang.String
     * @throw:
    **/
    String smsBoardingCode(BoardingSmsDTO boardingSmsDTO);

    /**
     * @description: 司机验票短信码
     * @author: kiting
     * @date: 2018年10月07日 21:00
     *
     * @param boardingSmsValiDTO 1
     * @return: java.lang.Boolean
     * @throw:
    **/
    Boolean valiSmsBoardingCode(BoardingSmsValiDTO boardingSmsValiDTO);

    /**
     * @description: 获取评论类型集合
     * @author: kiting
     * @date: 2018年10月05日 11:33
     *
     * @param
     * @return: com.zacx.serivce.order.api.dto.EvaluateCategoryDTO
     * @throw:
    **/
    EvaluateCategoryDTO evaluateCategory();

    /**
     * @description: 提交评价信息
     * @author: kiting
     * @date: 2018年10月05日 11:35
     *
     * @param evaluateInfoDTO 1
     * @return: java.lang.Boolean
     * @throw:
    **/
    public Boolean doEvaluate(EvaluateInfoDTO evaluateInfoDTO);

}
