package com.zacx.serivce.basic.api.dto;


import lombok.Data;

import java.util.Date;

/**
* @desc    坐标信息
* @version 1.0
* @author  Liang Jun
* @date    2018年10月06日 10:51:15
**/
@Data
public class CoordinateDTO {
    //类型=1:车辆;2:手机
    private int type;
    //查询编号(车牌号或手机号)
    private String code;
    //经度
    private String longitude;
    //纬度
    private String latitude;
    //速度
    private String speed;
    //更新时间
    private Date updateAt;
}