package com.zacx.gateway.passenger.dto.order;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @description: 获取订单支付详情（金额用字符串最多保留2位小数）
 *
 * @author: kiting
 * @date: 2018年10月3日 19:25
 * @version: 1.0
 * @copyright: 上海拜米网络科技有限公司
 **/
@Data
@ApiModel(value = "PayPriceDetailResult", description = "获取订单支付详情")
public class PayPriceDetailResult extends PayPriceBaseResult {

    //最后支付到期时间 ，待支付状态的订单需要
    @ApiModelProperty(value = "支付到期时间", dataType = "String")
    private String expiryTime;


    @ApiModelProperty(value = "钱包余额", dataType = "String")
    private String myWallet;

    @ApiModelProperty(value = "积分余额", dataType = "Integer")
    private Integer myIntegral;

}
