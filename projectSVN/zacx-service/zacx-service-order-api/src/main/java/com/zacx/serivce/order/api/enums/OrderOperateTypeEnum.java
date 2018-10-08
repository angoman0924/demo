package com.zacx.serivce.order.api.enums;

public enum OrderOperateTypeEnum {
    CANCEL("取消"),
    REFUND("退款");

    private String desc;

    OrderOperateTypeEnum(String desc){
        this.desc=desc;
    }

}
