package com.zacx.gateway.passenger.dto.order;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @description: 登车验证
 * @author: kiting
 * @date: 2018年10月04日 20:54
 * @version: 1.0
 * @copyright: 上海拜米网络科技有限公司
 **/
@Data
@ApiModel(value = "BoardingValiEnter", description = "登车验证")
public class BoardingValiEnter {

    @ApiModelProperty(value = "订单ID", dataType = "Integer", required = true)
    private Integer orderId;

    @ApiModelProperty(value = "车票ID", dataType = "Integer", required = true)
    private Integer ticketId;

    @ApiModelProperty(value = "车ID", dataType = "Integer", required = true)
    private Integer carId;

}
