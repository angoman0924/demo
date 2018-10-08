package com.zacx.gateway.driver.dto.lines;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * Created by song on 2018/10/5.
 */
@Data
@ApiModel(value = "SchedulingMoveApplyEnter", description = "班次调整申请实体类")
public class SchedulingMoveApplyEnter {

    @ApiModelProperty(value="申请人id",required = true)
    private Integer userId;

    @ApiModelProperty(value="申请人",required = true)
    private String userName;
    @ApiModelProperty(value="班次ID",required = true)
    private Integer schedulingId;

    @ApiModelProperty(value="类型: 1事件 2病假 3其它",required = true)
    private Integer type;

    @ApiModelProperty("事由")
    private String describe;

}
