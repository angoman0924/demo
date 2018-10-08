package com.zacx.core.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 省市县类型
 * Created by song on 2018/10/4.
 */
@Getter
@AllArgsConstructor
public enum CityTypeEnum {
    PROVINCE(1,"省"),
    CITY(2,"市"),
    COUNTY(3,"县/区"),
    PLACE(4,"乡镇");
	private int value;
	private String name;
}
