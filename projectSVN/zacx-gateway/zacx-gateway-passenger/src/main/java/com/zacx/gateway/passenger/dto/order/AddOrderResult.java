package com.zacx.gateway.passenger.dto.order;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @description: 新增订单结果
 *
 * @author: kiting
 * @date: 2018年10月3日 19:25
 * @version: 1.0
 * @copyright: 上海拜米网络科技有限公司
 **/
@Data
@ApiModel(value = "AddOrderResult", description = "新增订单结果")
public class AddOrderResult {

    @ApiModelProperty(value = "订单ID", dataType = "Integer")
    private Integer orderId;

    @ApiModelProperty(value = "订单编号", dataType = "String")
    private String orderCode;

}
