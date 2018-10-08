package com.zacx.core.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 积分出入标志
 * Created by song on 2018/10/7.
 */
@Getter
@AllArgsConstructor
public enum PointExitEntryEnum {
    OUT(0,"出"),
    IN(1,"入");
	private int value;
	private String name;
}
