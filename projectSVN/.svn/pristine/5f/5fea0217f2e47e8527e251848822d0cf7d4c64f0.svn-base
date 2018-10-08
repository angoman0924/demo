package com.zacx.gateway.passenger.dto.order;

import com.zacx.core.enums.PayTypeEnum;
import com.zacx.serivce.order.api.enums.OrderPaySceneEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @description: 获取订单支付申请信息
 *
 * @author: kiting
 * @date: 2018年10月3日 19:25
 * @version: 1.0
 * @copyright: 上海拜米网络科技有限公司
 **/
@Data
@ApiModel(value = "PayPriceApplyEnter", description = "获取订单支付申请信息")
public class PayPriceApplyEnter {

    @ApiModelProperty(value = "订单ID", dataType = "Integer", required = true)
    private Integer orderId;

    @ApiModelProperty(value = "支付场景", dataType = "String")
    OrderPaySceneEnum orderPayScene;

}
