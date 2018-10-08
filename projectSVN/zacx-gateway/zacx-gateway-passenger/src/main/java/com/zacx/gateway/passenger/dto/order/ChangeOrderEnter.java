package com.zacx.gateway.passenger.dto.order;

import com.zacx.serivce.order.api.enums.OrderOperateTypeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @description: 取消及更改订单
 *
 * @author: kiting
 * @date: 2018年10月3日 19:25
 * @version: 1.0
 * @copyright: 上海拜米网络科技有限公司
 **/
@Data
@ApiModel(value = "ChangeOrderEnter", description = "取消及更改订单信息")
public class ChangeOrderEnter{

    @ApiModelProperty(value = "订单ID", dataType = "Integer", required = true)
    private Integer orderId;

    @ApiModelProperty(value = "操作类型", dataType = "String", required = true)
    private OrderOperateTypeEnum operateType;

}
