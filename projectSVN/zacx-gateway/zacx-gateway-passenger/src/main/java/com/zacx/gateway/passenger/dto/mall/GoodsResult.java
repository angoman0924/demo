package com.zacx.gateway.passenger.dto.mall;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Created by song on 2018/10/6.
 */
@Data
@ApiModel(value = "GoodsResult", description = "商品响应类")
public class GoodsResult {
    @ApiModelProperty("商品id")
    private Integer id;

    @ApiModelProperty("商品编码")
    private String code;

    @ApiModelProperty("商品名称")
    private String name;

    @ApiModelProperty("价格(只是显示给客户看的,不是真实价格)")
    private BigDecimal priceMoney;

    @ApiModelProperty("积分价格")
    private Integer priceIntegral;

    @ApiModelProperty("1抵扣券，2商品")
    private Integer category;

    @ApiModelProperty("最大限购数量")
    private Integer limitNumber;

    @ApiModelProperty("描述")
    private String description;

    @ApiModelProperty("图片1")
    private String image1;

    @ApiModelProperty("图片1")
    private String image2;

    @ApiModelProperty("商品内容，全部用图片")
    private String bodyImages;

    @ApiModelProperty("商品总数量")
    private Integer number;

    @ApiModelProperty("已兑换数量")
    private Integer saleNumber;
}
