package com.zacx.gateway.passenger.dto.order;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @description: 订单信息（列表，简单）
 * @author: kiting
 * @date: 2018年10月04日 17:30
 * @version: 1.0
 * @copyright: 上海拜米网络科技有限公司
 **/
@Data
@ApiModel(value = "OrderBaseResult", description = "订单基础信息")
public class OrderBaseResult {

    @ApiModelProperty(value = "订单ID", dataType = "Integer")
    private Integer orderId;

    @ApiModelProperty(value = "订单编号", dataType = "String")
    private String orderCode;

    @ApiModelProperty(value = "开始地点", dataType = "String")
    private String startPlace;

    @ApiModelProperty(value = "结束地点", dataType = "String")
    private String endPlace;

    @ApiModelProperty(value = "出发时间", dataType = "String")
    private String startTime;

    @ApiModelProperty(value = "创建时间", dataType = "String")
    private String createAt;

    @ApiModelProperty(value = "订单金额", dataType = "String")
    private String totalCost;

    //业务类型：1班线 2包车
    @ApiModelProperty(value = "业务类型", dataType = "Integer")
    private Integer businessType;

    //自营包车，上门接送
    @ApiModelProperty(value = "服务描述", dataType = "String")
    private String serviceDesc;

    //是否评价
    @ApiModelProperty(value = "是否评价", dataType = "Boolean")
    private Boolean isEvaluated;

}
