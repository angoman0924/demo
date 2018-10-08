package com.zacx.serivce.order.api.enums;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Optional;

/**
 * @description: 状态:
 *      10-待付款
 *      20-已付款 21-待补款 22-退票中(针对包车业务，暂时不使用)
 *      60-已完成 61-已过期(行程结束但用户未乘坐，不能评论)
 *      90-已取消（用户触发） 91-已作废(到时未付款)
 * @author: kiting
 * @date: 2018年10月05日 20:47
 * @version: 1.0
 * @copyright: 上海拜米网络科技有限公司
 **/
@Getter
public enum OrderStatusEnum {
    NEW(10, "待付款"),
    PAID(20, "已付款"),
    SETTLEMENT(21, "待补款"),
    REFUND(22, "退票中"),
    FINISH(60, "已完成"),
    OVERDUE(61, "已过期"),
    CANCEL(90, "已取消"),
    VOID(91, "已作废");

    private Integer code;
    private String desc;

    OrderStatusEnum(Integer code, String desc){
        this.code=code;
        this.desc=desc;
    }

    public static Optional<OrderStatusEnum> get(Integer code){
        for(OrderStatusEnum p: OrderStatusEnum.values()){
            if(p.code.equals(code)){
                return Optional.of(p);
            }
        }
        return Optional.empty();
    }

}
