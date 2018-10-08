package com.zacx.gateway.passenger.dto.basic;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 省市县区 都可以用这个
 *
 * @author gulx
 * @version 1.0
 * @create 2018-09-27 20:11
 * @copyright 上海拜米网络科技有限公司
 **/
@Data
@ApiModel(value = "CityResult", description = "城市实体类")
public class CityResult {
    @ApiModelProperty("省/市/县的ID")
    private Integer id;
    @ApiModelProperty("城市名称")
    private String name;
    @ApiModelProperty("父ID")
    private String parentCode;
}
