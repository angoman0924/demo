package com.zacx.gateway.passenger.dto.lines;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by song on 2018/10/6.
 */
@Data
@ApiModel(value = "QueryPlanBySiteCondition", description = "根据站点id查班次")
public class QueryPlanBySiteCondition {
    @ApiModelProperty(value = "站点id",required = true)
    private Integer siteId;
    @ApiModelProperty("页号")
    private int pageIndex;
    @ApiModelProperty("条数")
    private int pageSize;
}
