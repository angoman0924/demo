package com.zacx.gateway.passenger.dto.basic;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@ApiModel(value = "CharteredCarModelQueryEnter", description = "包车品牌")
public class CharteredCarModelResult implements Serializable {
    @ApiModelProperty(value = "包车品牌ID", dataType = "Integer")
    private Integer id;

    @ApiModelProperty(value = "车辆类型id", dataType = "Integer")
    private Integer carTypeId;

    @ApiModelProperty(value = "包车品牌编号", dataType = "Integer")
    private String code;

    @ApiModelProperty(value = "车辆名称", dataType = "String")
    private String name;

    @ApiModelProperty(value = "车辆品牌", dataType = "String")
    private String carBrand;

    //车辆类型: 1-7座商务  2-大巴
    @ApiModelProperty(value = "车辆类型", dataType = "String")
    private String carModel;

    //座位数（范围）
    @ApiModelProperty(value = "最小座位数", dataType = "Integer")
    private Integer seatNumber;

    @ApiModelProperty(value = "单价（每公里）", dataType = "Integer")
    private BigDecimal unitPrice;

    @ApiModelProperty(value = "备注", dataType = "String")
    private String remark;

}
