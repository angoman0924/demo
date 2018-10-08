package com.zacx.gateway.driver.dto.lines;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * Created by song on 2018/10/5.
 */
@Data
@ApiModel(value = "SchedulingResult", description = "班次调度响应类")
public class SchedulingResult {

    @ApiModelProperty("班次ID")
    private Integer id;

    @ApiModelProperty("预计发车时间")
    private Date startTime;

    @ApiModelProperty("预计到站时间")
    private Date endTime;

    @ApiModelProperty("班次")
    private Integer planId;

    @ApiModelProperty("车辆ID")
    private Integer carId;

    @ApiModelProperty("司机ID")
    private Integer driverId;

    @ApiModelProperty("人数")
    private Integer passengerNumber;

    @ApiModelProperty("签到状态")
    private Boolean isSign;

    @ApiModelProperty("签到时间")
    private Date signTime;

    @ApiModelProperty("加班标记")
    private Boolean isWorkOvertime;

    @ApiModelProperty("状态: 1待签到 2调班申请中 3已调班完成(完成后，此车次将会取消) 4已签到 5已结束行程 6已结算 7作废")
    private Integer status;
}
