/*
*
* UHotCity.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.entity;

import java.util.Date;

public class UHotCity {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private Integer userId;

    /**
     * 
     */
    private String cityName;

    /**
     * 
     */
    private String cityCode;

    /**
     * 最近一次使用时间
     */
    private Date useTime;

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
     * @return user_id 
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 
     * @param userId 
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 
     * @return city_name 
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * 
     * @param cityName 
     */
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    /**
     * 
     * @return city_code 
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * 
     * @param cityCode 
     */
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    /**
     * 最近一次使用时间
     * @return use_time 最近一次使用时间
     */
    public Date getUseTime() {
        return useTime;
    }

    /**
     * 最近一次使用时间
     * @param useTime 最近一次使用时间
     */
    public void setUseTime(Date useTime) {
        this.useTime = useTime;
    }
}