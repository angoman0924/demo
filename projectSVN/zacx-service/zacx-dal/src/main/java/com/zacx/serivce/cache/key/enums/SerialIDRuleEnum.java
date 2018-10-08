package com.zacx.serivce.cache.key.enums;

import lombok.Getter;

@Getter
public enum SerialIDRuleEnum {
    SCHEDULING("排班ID"),
    SCHEDULING_MOVE_APPLY("排班调班申请ID"),
    USER_ALARM("用户报警ID"),
    ORDER("订单ID");

    private String desc;

    SerialIDRuleEnum(String desc){
        this.desc = desc;
    }

}
