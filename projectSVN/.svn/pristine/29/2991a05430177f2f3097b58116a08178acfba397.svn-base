package com.zacx.serivce.order.api.enums;

import lombok.Getter;

import java.util.Optional;

/**
 * @description: 状态: 1-待验票 2-已验票 3-改签 4-退票 5-已过期（待司机结束行程时，未验票的车票状态，会被系统设置为过期）
 * @author: kiting
 * @date: 2018年10月05日 20:47
 * @version: 1.0
 * @copyright: 上海拜米网络科技有限公司
 **/
@Getter
public enum TicketStatusEnum {
    NON(0, "未生效"),
    NEW(1, "待验票"),
    VERIFIED(2, "已验票"),
    CHANGE(3, "改签"),
    REFUND(4, "退票"),
    OVERDUE(5, "已过期"),
    VOID(6, "作废");

    private Integer code;
    private String desc;

    TicketStatusEnum(Integer code, String desc){
        this.code=code;
        this.desc=desc;
    }

    public static Optional<TicketStatusEnum> get(Integer code){
        for(TicketStatusEnum p: TicketStatusEnum.values()){
            if(p.code.equals(code)){
                return Optional.of(p);
            }
        }
        return Optional.empty();
    }

}
