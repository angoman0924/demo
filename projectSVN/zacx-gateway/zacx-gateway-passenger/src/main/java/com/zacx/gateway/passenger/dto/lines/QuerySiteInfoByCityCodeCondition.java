package com.zacx.gateway.passenger.dto.lines;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 *根据城市查询站点实体类
 * Created by song on 2018/10/4.
 */
@Data
@ApiModel(value = "SiteInfoByCityCodeQueryCondition", description = "站点信息查询条件")
public class QuerySiteInfoByCityCodeCondition {
    @ApiModelProperty(value = "城市code",required = true)
    private String  cityCode;
    @ApiModelProperty(value = "城市级别",required = true)
    private Integer level;
}
