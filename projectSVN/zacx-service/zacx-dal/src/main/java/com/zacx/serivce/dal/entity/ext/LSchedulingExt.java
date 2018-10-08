package com.zacx.serivce.dal.entity.ext;

import com.zacx.serivce.dal.entity.LScheduling;
import lombok.Data;

/**
 * Created by song on 2018/10/5.
 */
@Data
public class LSchedulingExt extends LScheduling {
    private Double distance;//距离
    private String siteStartAddr;//起点地址
    private String siteStartName;//起点名称
    private String siteEndAddr;//终点地址
    private String siteEndName;//终点名称
    private Integer siteStartId;//起点
    private Integer siteEndId;//终点
}
