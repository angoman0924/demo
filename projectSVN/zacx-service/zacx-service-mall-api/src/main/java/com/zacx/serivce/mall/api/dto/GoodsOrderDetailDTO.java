package com.zacx.serivce.mall.api.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by song on 2018/10/7.
 */
@Data
public class GoodsOrderDetailDTO implements Serializable {
    private static final long serialVersionUID = -5840689976391659310L;
    /**
     * 积分商品表
     */
    private Integer goodsId;
    /**
     * 商品名称
     */
    private String name;

    /**
     * 1抵扣券，2商品  （后期商品可以细化）
     */
    private Integer category;

    private String description;
    private String image1;

    private String image2;

    /**
     * 商品内容，全部用图片
     */
    private String bodyImages;
    private Integer orderNumber;
    private Integer priceIntegral;
    private Integer orderId;
    private Integer orderDetailId;
}
