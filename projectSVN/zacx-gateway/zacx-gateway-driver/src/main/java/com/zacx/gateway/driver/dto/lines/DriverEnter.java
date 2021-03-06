package com.zacx.gateway.driver.dto.lines;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by song on 2018/10/5.
 */
@Data
@ApiModel(value = "DriverEnter", description = "司机实体类")
public class DriverEnter {

    @ApiModelProperty(value="申请人id",required = true)
    private Integer userId;

    @ApiModelProperty(value="申请人",required = true)
    private String userName;
    @ApiModelProperty(value="班次ID",required = true)
    private Integer schedulingId;
}
