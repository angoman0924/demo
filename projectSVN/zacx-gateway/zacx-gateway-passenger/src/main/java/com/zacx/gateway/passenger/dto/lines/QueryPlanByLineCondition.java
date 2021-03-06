package com.zacx.gateway.passenger.dto.lines;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by song on 2018/10/6.
 */
@Data
@ApiModel(value = "QueryPlanByLineCondition", description = "根据线路id查班次")
public class QueryPlanByLineCondition {
    @ApiModelProperty(value = "线路id",required = true)
    private Integer lineId;
    @ApiModelProperty("页号")
    private int pageIndex;
    @ApiModelProperty("条数")
    private int pageSize;
}
