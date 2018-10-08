/*
*
* UAlarm.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.entity;

import java.util.Date;

public class UAlarm {
    /**
     * 
     */
    private Integer id;

    /**
     * 流水号: 1801010000001(年<2位>月日+7位流水号)
     */
    private String code;

    /**
     * 
     */
    private Integer userId;

    /**
     * 用户类型: 1用户 2司机
     */
    private Integer userType;

    /**
     * 坐标（经度,纬度）
     */
    private String coordinate;

    /**
     * 报警时间
     */
    private Date time;

    /**
     * 报警内容
     */
    private String describe;

    /**
     * 处理结果
     */
    private String disposeResults;

    /**
     * 处理时间
     */
    private Date disposeTime;

    /**
     * 状态: 0未处理 1已处理 2撤消
     */
    private Integer status;

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
     * 流水号: 1801010000001(年<2位>月日+7位流水号)
     * @return code 流水号: 1801010000001(年<2位>月日+7位流水号)
     */
    public String getCode() {
        return code;
    }

    /**
     * 流水号: 1801010000001(年<2位>月日+7位流水号)
     * @param code 流水号: 1801010000001(年<2位>月日+7位流水号)
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
     * 用户类型: 1用户 2司机
     * @return user_type 用户类型: 1用户 2司机
     */
    public Integer getUserType() {
        return userType;
    }

    /**
     * 用户类型: 1用户 2司机
     * @param userType 用户类型: 1用户 2司机
     */
    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    /**
     * 坐标（经度,纬度）
     * @return coordinate 坐标（经度,纬度）
     */
    public String getCoordinate() {
        return coordinate;
    }

    /**
     * 坐标（经度,纬度）
     * @param coordinate 坐标（经度,纬度）
     */
    public void setCoordinate(String coordinate) {
        this.coordinate = coordinate;
    }

    /**
     * 报警时间
     * @return time 报警时间
     */
    public Date getTime() {
        return time;
    }

    /**
     * 报警时间
     * @param time 报警时间
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * 报警内容
     * @return describe 报警内容
     */
    public String getDescribe() {
        return describe;
    }

    /**
     * 报警内容
     * @param describe 报警内容
     */
    public void setDescribe(String describe) {
        this.describe = describe;
    }

    /**
     * 处理结果
     * @return dispose_results 处理结果
     */
    public String getDisposeResults() {
        return disposeResults;
    }

    /**
     * 处理结果
     * @param disposeResults 处理结果
     */
    public void setDisposeResults(String disposeResults) {
        this.disposeResults = disposeResults;
    }

    /**
     * 处理时间
     * @return dispose_time 处理时间
     */
    public Date getDisposeTime() {
        return disposeTime;
    }

    /**
     * 处理时间
     * @param disposeTime 处理时间
     */
    public void setDisposeTime(Date disposeTime) {
        this.disposeTime = disposeTime;
    }

    /**
     * 状态: 0未处理 1已处理 2撤消
     * @return status 状态: 0未处理 1已处理 2撤消
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 状态: 0未处理 1已处理 2撤消
     * @param status 状态: 0未处理 1已处理 2撤消
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}