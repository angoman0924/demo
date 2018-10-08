package com.zacx.core.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 调整班次申请状态
 * Created by song on 2018/10/5.
 */
@Getter
@AllArgsConstructor
public enum UserTypeEnum {
    USER(1,"用户"),
    DRIVER(2,"司机");

	private int value;
	private String name;
}
