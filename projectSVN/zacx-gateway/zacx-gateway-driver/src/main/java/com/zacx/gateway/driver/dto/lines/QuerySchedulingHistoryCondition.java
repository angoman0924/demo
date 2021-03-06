package com.zacx.gateway.driver.dto.lines;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * Created by song on 2018/10/5.
 */
@Data
@ApiModel(value = "QuerySchedulingHistoryCondition", description = "排班历史查询条件类")
public class QuerySchedulingHistoryCondition {
    @ApiModelProperty(value="司机id", required = true)
    private Integer driverId;
    @ApiModelProperty(value="请求类型 我驾驶的班次1,我的车辆班次2", required = true)
    private Integer flag;

    @ApiModelProperty("页号")
    private int pageIndex;
    @ApiModelProperty("条数")
    private int pageSize;
}
