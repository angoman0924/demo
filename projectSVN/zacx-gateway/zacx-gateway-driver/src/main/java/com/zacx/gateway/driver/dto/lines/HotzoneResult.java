package com.zacx.gateway.driver.dto.lines;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Created by song on 2018/10/5.
 */
@Data
@ApiModel(value = "HotzoneResult", description = "热区响应类")
public class HotzoneResult {

    @ApiModelProperty("热区ID")
    private Integer id;

    @ApiModelProperty("线路点ID")
    private Integer lineId;

    @ApiModelProperty("站点ID")
    private Integer siteId;

    @ApiModelProperty("纬度")
    private BigDecimal latitude;

    @ApiModelProperty("经度")
    private BigDecimal longitude;

    @ApiModelProperty("一级半径（单位：米）")
    private Integer radiusOne;

    @ApiModelProperty("一级半径接送单价")
    private Long priceOne;

    @ApiModelProperty("二级半径（单位：米）")
    private Integer radiusTwo;

    @ApiModelProperty("二级半径接送单价")
    private Long priceTwo;

    @ApiModelProperty("三级半径（单位：米）")
    private Integer radiusThree;

    @ApiModelProperty("三级半径接送单价")
    private Long priceThree;

    @ApiModelProperty("status")
    private Integer status;
}
