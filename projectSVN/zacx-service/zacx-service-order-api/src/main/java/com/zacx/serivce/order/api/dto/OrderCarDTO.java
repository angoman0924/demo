package com.zacx.serivce.order.api.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @description: 车辆信息（brand+model+/color+/licensePlate（如：别克GLB/灰色/沪123456））
 * @author: kiting
 * @date: 2018年10月04日 17:30
 * @version: 1.0
 * @copyright: 上海拜米网络科技有限公司
 **/
@Data
public class OrderCarDTO implements Serializable {

    //车辆ID
    private Integer carId;

    //车牌
    private String licensePlate;

    //品牌
    private String brand;

    //型号
    private String model;

    //颜色
    private String color;

    //座位
    private Integer seatNumber;

    //运营类型: 1自营 2加盟
    //运营类型
    private Integer operationType;

}
