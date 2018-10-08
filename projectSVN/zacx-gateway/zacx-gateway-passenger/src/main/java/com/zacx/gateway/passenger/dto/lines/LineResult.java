package com.zacx.gateway.passenger.dto.lines;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by song on 2018/10/4.
 */
@Data
@ApiModel(value = "LineResult", description = "线路响应类")
public class LineResult {

    @ApiModelProperty("线路id")
    private Integer id;

    /**
     * 站点名称
     */
    @ApiModelProperty("站点名称")
    private String name;

    /**
     * 起始站点
     */
    @ApiModelProperty("起始站点")
    private Integer siteStartId;

    /**
     * 结束站点
     */
    @ApiModelProperty("结束站点")
    private Integer siteEndId;

    /**
     * 状态
     */
    @ApiModelProperty("状态")
    private Integer status;

    /**
     * 两个站点间的距离（单位：千米）
     */
    @ApiModelProperty("两个站点间的距离（单位：千米")
    private Double distance;
}
