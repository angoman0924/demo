package com.zacx.core.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 排班班次状态
 * Created by song on 2018/10/7.
 */
@Getter
@AllArgsConstructor
public enum PlanSchedulingStatusEnum {
    NO(0,"未排班"),
    PARTTEN(1,"部分排班"),
    ALREADY(2,"已排班");
	private int value;
	private String name;
}
