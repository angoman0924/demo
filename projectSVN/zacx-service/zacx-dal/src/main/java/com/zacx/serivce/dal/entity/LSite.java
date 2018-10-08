/*
*
* LSite.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.entity;

import java.math.BigDecimal;
import java.util.Date;

public class LSite {
    /**
     * 
     */
    private Integer id;

    /**
     * 站点名称
     */
    private String name;

    /**
     * 省
     */
    private String provinceCode;

    /**
     * 市
     */
    private String cityCode;

    /**
     * 县、区
     */
    private String countyCode;

    /**
     * 乡镇
     */
    private String placeCode;

    /**
     * 纬度
     */
    private BigDecimal latitude;

    /**
     * 经度
     */
    private BigDecimal longitude;

    /**
     * 详细地址
     */
    private String address;

    /**
     * 删除标记
     */
    private Boolean isDelete;

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
     * 站点名称
     * @return name 站点名称
     */
    public String getName() {
        return name;
    }

    /**
     * 站点名称
     * @param name 站点名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 省
     * @return province_code 省
     */
    public String getProvinceCode() {
        return provinceCode;
    }

    /**
     * 省
     * @param provinceCode 省
     */
    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    /**
     * 市
     * @return city_code 市
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * 市
     * @param cityCode 市
     */
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    /**
     * 县、区
     * @return county_code 县、区
     */
    public String getCountyCode() {
        return countyCode;
    }

    /**
     * 县、区
     * @param countyCode 县、区
     */
    public void setCountyCode(String countyCode) {
        this.countyCode = countyCode;
    }

    /**
     * 乡镇
     * @return place_code 乡镇
     */
    public String getPlaceCode() {
        return placeCode;
    }

    /**
     * 乡镇
     * @param placeCode 乡镇
     */
    public void setPlaceCode(String placeCode) {
        this.placeCode = placeCode;
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
     * 详细地址
     * @return address 详细地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 详细地址
     * @param address 详细地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 删除标记
     * @return is_delete 删除标记
     */
    public Boolean getIsDelete() {
        return isDelete;
    }

    /**
     * 删除标记
     * @param isDelete 删除标记
     */
    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
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