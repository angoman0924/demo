/*
*
* MGoods.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.entity;

import java.math.BigDecimal;
import java.util.Date;

public class MGoods {
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

    /**
     * 积分商品表
     * @return id 积分商品表
     */
    public Integer getId() {
        return id;
    }

    /**
     * 积分商品表
     * @param id 积分商品表
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 商品编码 g 年月日 0001
     * @return code 商品编码 g 年月日 0001
     */
    public String getCode() {
        return code;
    }

    /**
     * 商品编码 g 年月日 0001
     * @param code 商品编码 g 年月日 0001
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 商品名称
     * @return name 商品名称
     */
    public String getName() {
        return name;
    }

    /**
     * 商品名称
     * @param name 商品名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 价格(只是显示给客户看的,不是真实价格)
     * @return price_money 价格(只是显示给客户看的,不是真实价格)
     */
    public BigDecimal getPriceMoney() {
        return priceMoney;
    }

    /**
     * 价格(只是显示给客户看的,不是真实价格)
     * @param priceMoney 价格(只是显示给客户看的,不是真实价格)
     */
    public void setPriceMoney(BigDecimal priceMoney) {
        this.priceMoney = priceMoney;
    }

    /**
     * 积分价格
     * @return price_integral 积分价格
     */
    public Integer getPriceIntegral() {
        return priceIntegral;
    }

    /**
     * 积分价格
     * @param priceIntegral 积分价格
     */
    public void setPriceIntegral(Integer priceIntegral) {
        this.priceIntegral = priceIntegral;
    }

    /**
     * 1抵扣券，2商品  （后期商品可以细化）
     * @return category 1抵扣券，2商品  （后期商品可以细化）
     */
    public Integer getCategory() {
        return category;
    }

    /**
     * 1抵扣券，2商品  （后期商品可以细化）
     * @param category 1抵扣券，2商品  （后期商品可以细化）
     */
    public void setCategory(Integer category) {
        this.category = category;
    }

    /**
     * 最大限购数量
     * @return limit_number 最大限购数量
     */
    public Integer getLimitNumber() {
        return limitNumber;
    }

    /**
     * 最大限购数量
     * @param limitNumber 最大限购数量
     */
    public void setLimitNumber(Integer limitNumber) {
        this.limitNumber = limitNumber;
    }

    /**
     * 描述
     * @return description 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 描述
     * @param description 描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     * @return image1 
     */
    public String getImage1() {
        return image1;
    }

    /**
     * 
     * @param image1 
     */
    public void setImage1(String image1) {
        this.image1 = image1;
    }

    /**
     * 
     * @return image2 
     */
    public String getImage2() {
        return image2;
    }

    /**
     * 
     * @param image2 
     */
    public void setImage2(String image2) {
        this.image2 = image2;
    }

    /**
     * 商品内容，全部用图片
     * @return body_images 商品内容，全部用图片
     */
    public String getBodyImages() {
        return bodyImages;
    }

    /**
     * 商品内容，全部用图片
     * @param bodyImages 商品内容，全部用图片
     */
    public void setBodyImages(String bodyImages) {
        this.bodyImages = bodyImages;
    }

    /**
     * 商品总数量
     * @return number 商品总数量
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * 商品总数量
     * @param number 商品总数量
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * 已兑换数量
     * @return sale_number 已兑换数量
     */
    public Integer getSaleNumber() {
        return saleNumber;
    }

    /**
     * 已兑换数量
     * @param saleNumber 已兑换数量
     */
    public void setSaleNumber(Integer saleNumber) {
        this.saleNumber = saleNumber;
    }

    /**
     * 1 上架，2下架
     * @return status 1 上架，2下架
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 1 上架，2下架
     * @param status 1 上架，2下架
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 
     * @return create_at 
     */
    public Date getCreateAt() {
        return createAt;
    }

    /**
     * 
     * @param createAt 
     */
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    /**
     * 
     * @return create_by 
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * 
     * @param createBy 
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }
}