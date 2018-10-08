/*
*
* MGoodOrder.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.entity;

import java.util.Date;

public class MGoodOrder {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String code;

    /**
     * 
     */
    private Integer userId;

    /**
     * 
     */
    private Integer totalIntegral;

    /**
     * 10-待付款；20-已付款  22-退单中(针对包车业务，暂时不使用)，23发货中；60-已完成 90-已取消（用户触发） 91-已作废(到时未付款)
     */
    private Integer status;

    /**
     * 
     */
    private Date createAt;

    /**
     * 
     */
    private String cityCode;

    /**
     * 收件地址
     */
    private String address;

    /**
     * 
     */
    private String expressCode;

    /**
     * 
     */
    private String userRemark;

    /**
     * 
     */
    private String remark;

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
     * @return code 
     */
    public String getCode() {
        return code;
    }

    /**
     * 
     * @param code 
     */
    public void setCode(String code) {
        this.code = code;
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
     * @return total_integral 
     */
    public Integer getTotalIntegral() {
        return totalIntegral;
    }

    /**
     * 
     * @param totalIntegral 
     */
    public void setTotalIntegral(Integer totalIntegral) {
        this.totalIntegral = totalIntegral;
    }

    /**
     * 10-待付款；20-已付款  22-退单中(针对包车业务，暂时不使用)，23发货中；60-已完成 90-已取消（用户触发） 91-已作废(到时未付款)
     * @return status 10-待付款；20-已付款  22-退单中(针对包车业务，暂时不使用)，23发货中；60-已完成 90-已取消（用户触发） 91-已作废(到时未付款)
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 10-待付款；20-已付款  22-退单中(针对包车业务，暂时不使用)，23发货中；60-已完成 90-已取消（用户触发） 91-已作废(到时未付款)
     * @param status 10-待付款；20-已付款  22-退单中(针对包车业务，暂时不使用)，23发货中；60-已完成 90-已取消（用户触发） 91-已作废(到时未付款)
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
     * 收件地址
     * @return address 收件地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 收件地址
     * @param address 收件地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 
     * @return express_code 
     */
    public String getExpressCode() {
        return expressCode;
    }

    /**
     * 
     * @param expressCode 
     */
    public void setExpressCode(String expressCode) {
        this.expressCode = expressCode;
    }

    /**
     * 
     * @return user_remark 
     */
    public String getUserRemark() {
        return userRemark;
    }

    /**
     * 
     * @param userRemark 
     */
    public void setUserRemark(String userRemark) {
        this.userRemark = userRemark;
    }

    /**
     * 
     * @return remark 
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 
     * @param remark 
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}