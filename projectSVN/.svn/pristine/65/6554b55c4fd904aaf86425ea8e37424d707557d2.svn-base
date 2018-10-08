package com.zacx.serivce.order.api.dto;

import com.zacx.core.model.api.BaseDTO;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @description: 订单信息（列表，简单）
 * @author: kiting
 * @date: 2018年10月04日 17:30
 * @version: 1.0
 * @copyright: 上海拜米网络科技有限公司
 **/
@Data
public class OrderQueryDTO extends BaseDTO implements Serializable {

    //用户ID
    private Integer userId;

    //映射成状态类别列表对接服务：
    //所有：ALL（默认），准备：READY，运行：RUNNING，完成：FINISH，取消：CANCEL
    //状态组
    private String statusGroup;

    //下单时间-开始
    private Date startCreateAt;
    //下单时间-开始
    private Date endCreateAt;

    //出行时间-开始
    private Date startTravelAt;
    //出行时间-开始
    private Date endTravelAt;


    //标记：获取车辆信息
    private Integer forCar;

    //标记：获取司机信息
    private Integer forDriver;

    //标记：获取车辆GPS信息
    private Integer forGps;

}
