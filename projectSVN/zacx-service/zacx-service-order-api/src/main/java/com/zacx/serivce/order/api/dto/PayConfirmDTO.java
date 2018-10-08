package com.zacx.serivce.order.api.dto;

import com.zacx.core.enums.PayTypeEnum;


import com.zacx.serivce.order.api.enums.OrderPaySceneEnum;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @description: 支付订单信息
 *
 * @author: kiting
 * @date: 2018年10月3日 19:25
 * @version: 1.0
 * @copyright: 上海拜米网络科技有限公司
 **/
@Data
public class PayConfirmDTO implements Serializable {

    //用户ID
    Integer userId;

    //订单ID
    private Integer orderId;

    //支付场景
    OrderPaySceneEnum orderPayScene;

    //支持混合支付
    //支付类型
    private PayTypeEnum payType;

    //支付金额
    private BigDecimal couponCost;

}
