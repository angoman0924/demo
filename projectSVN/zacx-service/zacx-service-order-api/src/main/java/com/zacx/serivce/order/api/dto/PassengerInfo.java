package com.zacx.serivce.order.api.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @description: 乘客信息
 * @author: kiting
 * @date: 2018年10月04日 17:30
 * @version: 1.0
 * @copyright: 上海拜米网络科技有限公司
 **/
@Data
public class PassengerInfo implements Serializable {

    //姓名
    private String name;

    //手机号
    private String phone;

    //证件号
    private String cardNo;

    //证件类型: 1身份证 2驾驶证 3军官证 4护照 5其他
    private String cardType;

}
