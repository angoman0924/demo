package com.zacx.gateway.driver.dto.lines;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * 司机端 查询我的排班 ，查询条件
 * Created by song on 2018/10/5.
 */
@Data
@ApiModel(value = "QuerySchedulingByDriverIdCondition", description = "司机端 查询我的排班查询条件")
public class QuerySchedulingByDriverIdCondition {

    @ApiModelProperty(value="司机id", required = true)
    private Integer driverId;
    @ApiModelProperty("发车时间开始")
    private Date startTime;
    @ApiModelProperty("发车时间结束")
    private Date endTime;
    @ApiModelProperty("排班状态")
    private Integer status;

    @ApiModelProperty("页号")
    private int pageIndex;
    @ApiModelProperty("条数")
    private int pageSize;
}
