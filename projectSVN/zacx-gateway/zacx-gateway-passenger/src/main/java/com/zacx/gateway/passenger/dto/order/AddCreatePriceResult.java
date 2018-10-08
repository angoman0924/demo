package com.zacx.gateway.passenger.dto.order;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @description: 预算订单价格结果
 *
 * @author: kiting
 * @date: 2018年10月3日 19:25
 * @version: 1.0
 * @copyright: 上海拜米网络科技有限公司
 **/
@Data
@ApiModel(value = "AddCreatePriceResult", description = "预算订单价格结果")
public class AddCreatePriceResult {

    @ApiModelProperty(value = "订单金额", dataType = "String")
    private String totalCost;

}
