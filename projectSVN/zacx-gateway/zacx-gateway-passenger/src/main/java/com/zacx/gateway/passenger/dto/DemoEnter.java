package com.zacx.gateway.passenger.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author gulx
 * @version 1.0
 * @create 2018-09-18 13:56
 * @copyright 上海拜米网络科技有限公司
 * 入参实体类
 **/
@Data
@ApiModel(value = "DemoEnter", description = "演示请求类")
public class DemoEnter {
    @ApiModelProperty("唯一标识ID")
    private Integer id;
}
