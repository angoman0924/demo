package com.zacx.gateway.passenger.dto.basic;

import com.zacx.core.model.api.BaseDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(value = "CharteredCarModelQueryEnter", description = "包车品牌")
public class CharteredCarModelQueryEnter extends BaseDTO implements Serializable {

    @ApiModelProperty(value = "车类型", dataType = "Integer")
    private Integer carTypeId;

    @ApiModelProperty(value = "车辆名称", dataType = "String")
    private String name;

    @ApiModelProperty(value = "车辆品牌", dataType = "String")
    private String carBrand;

    //车辆类型: 1-7座商务  2-大巴
    @ApiModelProperty(value = "车辆类型", dataType = "String")
    private String carModel;

    //座位数（范围）
    @ApiModelProperty(value = "最小座位数", dataType = "Integer")
    private Integer seatNumberStart;
    @ApiModelProperty(value = "最大座位数", dataType = "Integer")
    private Integer seatNumberEnd;

}
