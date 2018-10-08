package com.zacx.gateway.passenger.dto.order;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @description: 获取订单退款详情（金额用字符串最多保留2位小数）
 *
 * @author: kiting
 * @date: 2018年10月3日 19:25
 * @version: 1.0
 * @copyright: 上海拜米网络科技有限公司
 **/
@Data
@ApiModel(value = "PayPriceReturnResult", description = "获取订单退款详情")
public class PayPriceReturnResult extends PayPriceBaseResult {

    @ApiModelProperty(value = "退还金额", dataType = "String")
    private String returnCost;

    @ApiModelProperty(value = "违约费用", dataType = "String")
    private String breakCost;

}
