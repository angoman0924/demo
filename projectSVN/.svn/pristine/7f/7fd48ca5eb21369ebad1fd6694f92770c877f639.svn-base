package com.zacx.serivce.order.api.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @description: 订单信息（列表，简单）
 * @author: kiting
 * @date: 2018年10月04日 17:30
 * @version: 1.0
 * @copyright: 上海拜米网络科技有限公司
 **/
@Data
public class OrderMainDTO extends OrderBaseDTO implements Serializable {

    //车辆信息
    private OrderCarDTO carInfo;

    //*** 取司机电话困难（有效未完结订单，且有接送或包车服务才会有） ***
    //司机电话
    private DriverDTO driverInfo;

    //通过入参决定是否取某些复查耗时的数据
    //车辆位置（签到后，未结束前）
    //扫码验票（签到后，未结束前）

}
