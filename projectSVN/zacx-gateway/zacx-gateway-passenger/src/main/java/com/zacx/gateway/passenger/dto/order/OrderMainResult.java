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
@ApiModel(value = "OrderMainResult", description = "订单主要信息")
public class OrderMainResult extends OrderBaseResult {

    @ApiModelProperty(value = "车辆信息", dataType = "Object")
    private CarInfo carInfo;

    //*** 取司机电话困难（有效未完结订单，且有接送或包车服务才会有） ***
    @ApiModelProperty(value = "司机电话", dataType = "Object")
    private DriverInfo driverInfo;

    //通过入参决定是否取某些复查耗时的数据
    //车辆位置（签到后，未结束前）
    //扫码验票（签到后，未结束前）

}
