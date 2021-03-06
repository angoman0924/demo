package com.zacx.serivce.user.api.dto;

import lombok.Data;

@Data
public class PassengerDTO {

    //乘客编号
    private Integer id;
    //关联用户编号
    private Integer userId;
    //乘客性名
    private String name;
    //证件类型
    private Integer cardType;
    //证件号码
    private String cardNo;
    //乘客类型
    private Integer personGroup;
    //联系方式
    private String phone;

    //状态 1可用 0不可用
    private Integer status;


}
