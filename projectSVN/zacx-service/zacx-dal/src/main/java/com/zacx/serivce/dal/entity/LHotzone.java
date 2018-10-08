/*
*
* LHotzone.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.entity;

import java.math.BigDecimal;
import java.util.Date;

public class LHotzone {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private Integer lineId;

    /**
     * 
     */
    private Integer siteId;

    /**
     * 
     */
    private Integer groupId;

    /**
     * 热点所在地址
     */
    private String address;

    /**
     * 纬度
     */
    private BigDecimal latitude;

    /**
     * 经度
     */
    private BigDecimal longitude;

    /**
     * 一级半径（单位：米）
     */
    private Integer radiusOne;

    /**
     * 一级半径接送单价
     */
    private Long priceOne;

    /**
     * 二级半径（单位：米）
     */
    private Integer radiusTwo;

    /**
     * 二级半径接送单价
     */
    private Long priceTwo;

    /**
     * 三级半径（单位：米）
     */
    private Integer radiusThree;

    /**
     * 三级半径接送单价
     */
    private Long priceThree;

    /**
     * 模板标记: 创建热区组时，选择热区，用此标记过滤
     */
    private Boolean isTemplate;

    /**
     * 状态：0未启用 1启用
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
     * 
     */
    private Date modifyAt;

    /**
     * 
     */
    private String modifyBy;

    /**
     * 
     * @return id 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return line_id 
     */
    public Integer getLineId() {
        return lineId;
    }

    /**
     * 
     * @param lineId 
     */
    public void setLineId(Integer lineId) {
        this.lineId = lineId;
    }

    /**
     * 
     * @return site_id 
     */
    public Integer getSiteId() {
        return siteId;
    }

    /**
     * 
     * @param siteId 
     */
    public void setSiteId(Integer siteId) {
        this.siteId = siteId;
    }

    /**
     * 
     * @return group_id 
     */
    public Integer getGroupId() {
        return groupId;
    }

    /**
     * 
     * @param groupId 
     */
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    /**
     * 热点所在地址
     * @return address 热点所在地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 热点所在地址
     * @param address 热点所在地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 纬度
     * @return latitude 纬度
     */
    public BigDecimal getLatitude() {
        return latitude;
    }

    /**
     * 纬度
     * @param latitude 纬度
     */
    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    /**
     * 经度
     * @return longitude 经度
     */
    public BigDecimal getLongitude() {
        return longitude;
    }

    /**
     * 经度
     * @param longitude 经度
     */
    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    /**
     * 一级半径（单位：米）
     * @return radius_one 一级半径（单位：米）
     */
    public Integer getRadiusOne() {
        return radiusOne;
    }

    /**
     * 一级半径（单位：米）
     * @param radiusOne 一级半径（单位：米）
     */
    public void setRadiusOne(Integer radiusOne) {
        this.radiusOne = radiusOne;
    }

    /**
     * 一级半径接送单价
     * @return price_one 一级半径接送单价
     */
    public Long getPriceOne() {
        return priceOne;
    }

    /**
     * 一级半径接送单价
     * @param priceOne 一级半径接送单价
     */
    public void setPriceOne(Long priceOne) {
        this.priceOne = priceOne;
    }

    /**
     * 二级半径（单位：米）
     * @return radius_two 二级半径（单位：米）
     */
    public Integer getRadiusTwo() {
        return radiusTwo;
    }

    /**
     * 二级半径（单位：米）
     * @param radiusTwo 二级半径（单位：米）
     */
    public void setRadiusTwo(Integer radiusTwo) {
        this.radiusTwo = radiusTwo;
    }

    /**
     * 二级半径接送单价
     * @return price_two 二级半径接送单价
     */
    public Long getPriceTwo() {
        return priceTwo;
    }

    /**
     * 二级半径接送单价
     * @param priceTwo 二级半径接送单价
     */
    public void setPriceTwo(Long priceTwo) {
        this.priceTwo = priceTwo;
    }

    /**
     * 三级半径（单位：米）
     * @return radius_three 三级半径（单位：米）
     */
    public Integer getRadiusThree() {
        return radiusThree;
    }

    /**
     * 三级半径（单位：米）
     * @param radiusThree 三级半径（单位：米）
     */
    public void setRadiusThree(Integer radiusThree) {
        this.radiusThree = radiusThree;
    }

    /**
     * 三级半径接送单价
     * @return price_three 三级半径接送单价
     */
    public Long getPriceThree() {
        return priceThree;
    }

    /**
     * 三级半径接送单价
     * @param priceThree 三级半径接送单价
     */
    public void setPriceThree(Long priceThree) {
        this.priceThree = priceThree;
    }

    /**
     * 模板标记: 创建热区组时，选择热区，用此标记过滤
     * @return is_template 模板标记: 创建热区组时，选择热区，用此标记过滤
     */
    public Boolean getIsTemplate() {
        return isTemplate;
    }

    /**
     * 模板标记: 创建热区组时，选择热区，用此标记过滤
     * @param isTemplate 模板标记: 创建热区组时，选择热区，用此标记过滤
     */
    public void setIsTemplate(Boolean isTemplate) {
        this.isTemplate = isTemplate;
    }

    /**
     * 状态：0未启用 1启用
     * @return status 状态：0未启用 1启用
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 状态：0未启用 1启用
     * @param status 状态：0未启用 1启用
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

    /**
     * 
     * @return modify_at 
     */
    public Date getModifyAt() {
        return modifyAt;
    }

    /**
     * 
     * @param modifyAt 
     */
    public void setModifyAt(Date modifyAt) {
        this.modifyAt = modifyAt;
    }

    /**
     * 
     * @return modify_by 
     */
    public String getModifyBy() {
        return modifyBy;
    }

    /**
     * 
     * @param modifyBy 
     */
    public void setModifyBy(String modifyBy) {
        this.modifyBy = modifyBy;
    }
}