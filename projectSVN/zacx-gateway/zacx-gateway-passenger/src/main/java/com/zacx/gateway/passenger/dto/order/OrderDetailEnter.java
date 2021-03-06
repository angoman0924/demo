package com.zacx.gateway.passenger.dto.order;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @description: 订单明细查询信息
 * @author: kiting
 * @date: 2018年10月04日 17:30
 * @version: 1.0
 * @copyright: 上海拜米网络科技有限公司
 **/
@Data
@ApiModel(value = "OrderDetailEnter", description = "订单明细查询信息")
public class OrderDetailEnter {

    @ApiModelProperty(value = "订单ID", dataType = "Integer", required = true)
    private Integer orderId;

}
