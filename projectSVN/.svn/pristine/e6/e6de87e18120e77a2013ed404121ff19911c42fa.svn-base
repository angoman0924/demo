package com.zacx.serivce.mall.api.dto;

import com.zacx.core.model.api.BaseDTO;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 商品dto
 * Created by song on 2018/10/6.
 */
@Data
public class GoodsDTO extends BaseDTO {
    private static final long serialVersionUID = -8720727369254657746L;
    /**
     * 积分商品表
     */
    private Integer id;

    /**
     * 商品编码 g 年月日 0001
     */
    private String code;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 价格(只是显示给客户看的,不是真实价格)
     */
    private BigDecimal priceMoney;

    /**
     * 积分价格
     */
    private Integer priceIntegral;

    /**
     * 1抵扣券，2商品  （后期商品可以细化）
     */
    private Integer category;

    /**
     * 最大限购数量
     */
    private Integer limitNumber;

    /**
     * 描述
     */
    private String description;

    /**
     *
     */
    private String image1;

    /**
     *
     */
    private String image2;

    /**
     * 商品内容，全部用图片
     */
    private String bodyImages;

    /**
     * 商品总数量
     */
    private Integer number;

    /**
     * 已兑换数量
     */
    private Integer saleNumber;

    /**
     * 1 上架，2下架
     */
    private Integer status;

    /**
     *
     */
    private Date createAt;

    /**
     *
     */
    private String createBy;
}
