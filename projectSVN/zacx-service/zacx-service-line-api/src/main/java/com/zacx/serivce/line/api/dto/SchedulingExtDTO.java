package com.zacx.serivce.line.api.dto;

import lombok.Data;


/**
 * 排班历史
 * Created by song on 2018/10/5.
 */
@Data
public class SchedulingExtDTO extends SchedulingDTO {
    private static final long serialVersionUID = 8388217691862984823L;

    private Double distance;//距离
    private String siteStartAddr;//起点地址
    private String siteStartName;//起点名称
    private String siteEndAddr;//终点地址
    private String siteEndName;//终点名称
    private Integer siteStartId;//起点
    private Integer siteEndId;//终点
}
