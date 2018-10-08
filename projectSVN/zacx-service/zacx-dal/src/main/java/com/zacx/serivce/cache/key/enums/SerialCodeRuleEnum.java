package com.zacx.serivce.cache.key.enums;

import lombok.Getter;

@Getter
public enum SerialCodeRuleEnum {
    PLAN("LBC", 5, "班次编号"),
    SCHEDULING("LCC", 5, "排班编号"),
    SCHEDULING_MOVE_APPLY("LTB", 5, "排班调班申请编号"),
    MALL_ORDER("MDD", 7, "商城订单编号"),
    USER_ALARM("UAL", 7, "用户报警编号"),
    USER_WITHDRAW("UWI", 5, "提现申请"),
    USER_FEEDBACK("LFK", 7, "意见反馈"),
    ORDER("LDD", 7, "订单号"),
    TICKET("LCP", 7, "车票号");

    private String prefix;
    private Integer seqlen;
    private String desc;

    SerialCodeRuleEnum(String prefix, Integer seqlen, String desc){
        this.prefix = prefix;
        this.seqlen = seqlen;
        this.desc = desc;
    }

}
