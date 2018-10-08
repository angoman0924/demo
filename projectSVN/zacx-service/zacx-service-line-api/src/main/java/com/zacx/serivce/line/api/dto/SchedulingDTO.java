package com.zacx.serivce.line.api.dto;

import com.zacx.core.model.api.BaseDTO;
import lombok.Data;

import java.util.Date;

/**
 * 班次调度实体DTO
 * Created by song on 2018/10/3.
 */
@Data
public class SchedulingDTO extends BaseDTO {

    private static final long serialVersionUID = 6861509809464146593L;

    private Integer id;

    private Date startTime;

    private Date endTime;

    private Integer planId;

    private Integer carId;

    private Integer driverId;

    private Integer passengerNumber;

    private Boolean isSign;

    private Date signTime;

    private Boolean isWorkOvertime;

    private Integer status;

    private Date createAt;

    private String createBy;

    private Date modifyAt;

    private String modifyBy;

    private Date startTimeStart;//查询时间开始
    private Date startTimeEnd;//查询时间结束

    private Double distance;//距离
    private String siteStartAddr;//起点地址
    private String siteStartName;//起点名称
    private String siteEndAddr;//终点地址
    private String siteEndName;//终点名称
}
