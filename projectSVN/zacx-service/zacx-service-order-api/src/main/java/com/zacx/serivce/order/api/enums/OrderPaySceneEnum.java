package com.zacx.serivce.order.api.enums;

public enum OrderPaySceneEnum {
    ORDER("订单首次付款"),
    REFUND("改签待补款"),
    SETTLE("二次结算补款");

    private String desc;

    OrderPaySceneEnum(String desc){
        this.desc=desc;
    }

}
