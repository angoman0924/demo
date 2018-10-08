package com.zacx.gateway.passenger.dto.order;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @description: 订单信息（列表，简单）
 * @author: kiting
 * @date: 2018年10月04日 17:30
 * @version: 1.0
 * @copyright: 上海拜米网络科技有限公司
 **/
@Data
@ApiModel(value = "OrderQueryEnter", description = "订单主要信息")
public class OrderQueryEnter {

    //映射成状态类别列表对接服务：
    //所有：ALL（默认），准备：READY，运行：RUNNING，完成：FINISH
    @ApiModelProperty(value = "状态组", dataType = "String")
    private String statusGroup;

    //格式（yyyy-MM-dd HH:mm:ss）
    @ApiModelProperty(value = "下单时间-开始", dataType = "Date")
    private Date startCreateAt;
    @ApiModelProperty(value = "下单时间-开始", dataType = "Date")
    private Date endCreateAt;

    //格式（yyyy-MM-dd HH:mm:ss）
    @ApiModelProperty(value = "出行时间-开始", dataType = "String")
    private Date startTravelAt;
    @ApiModelProperty(value = "出行时间-开始", dataType = "String")
    private Date endTravelAt;

    @ApiModelProperty(value = "获取车辆信息", dataType = "Integer")
    private Integer forCar;

    @ApiModelProperty(value = "获取司机信息", dataType = "Integer")
    private Integer forDriver;

    @ApiModelProperty(value = "获取车辆GPS信息", dataType = "Integer")
    private Integer forGps;

}
