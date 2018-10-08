/*
*
* OOrderOperateLog.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.entity;

import java.math.BigDecimal;
import java.util.Date;

public class OOrderOperateLog {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private Integer orderId;

    /**
     * 日志内容
     */
    private String log;

    /**
     * 操作前的订单状态
     */
    private Integer orderStatusOld;

    /**
     * 操作后的订单状态
     */
    private Integer orderStatusNew;

    /**
     * 操作后的订单总额
     */
    private BigDecimal totalCost;

    /**
     * 扩展信息
     */
    private String extendInfo;

    /**
     * 操作平台: 1app 2运营
     */
    private Integer operatePlatform;

    /**
     * 操作用户id
     */
    private Integer operateUserId;

    /**
     * 
     */
    private String operateUseName;

    /**
     * 操作备注
     */
    private String operateRemark;

    /**
     * 
     */
    private Date createAt;

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
     * @return order_id 
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * 
     * @param orderId 
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * 日志内容
     * @return log 日志内容
     */
    public String getLog() {
        return log;
    }

    /**
     * 日志内容
     * @param log 日志内容
     */
    public void setLog(String log) {
        this.log = log;
    }

    /**
     * 操作前的订单状态
     * @return order_status_old 操作前的订单状态
     */
    public Integer getOrderStatusOld() {
        return orderStatusOld;
    }

    /**
     * 操作前的订单状态
     * @param orderStatusOld 操作前的订单状态
     */
    public void setOrderStatusOld(Integer orderStatusOld) {
        this.orderStatusOld = orderStatusOld;
    }

    /**
     * 操作后的订单状态
     * @return order_status_new 操作后的订单状态
     */
    public Integer getOrderStatusNew() {
        return orderStatusNew;
    }

    /**
     * 操作后的订单状态
     * @param orderStatusNew 操作后的订单状态
     */
    public void setOrderStatusNew(Integer orderStatusNew) {
        this.orderStatusNew = orderStatusNew;
    }

    /**
     * 操作后的订单总额
     * @return total_cost 操作后的订单总额
     */
    public BigDecimal getTotalCost() {
        return totalCost;
    }

    /**
     * 操作后的订单总额
     * @param totalCost 操作后的订单总额
     */
    public void setTotalCost(BigDecimal totalCost) {
        this.totalCost = totalCost;
    }

    /**
     * 扩展信息
     * @return extend_info 扩展信息
     */
    public String getExtendInfo() {
        return extendInfo;
    }

    /**
     * 扩展信息
     * @param extendInfo 扩展信息
     */
    public void setExtendInfo(String extendInfo) {
        this.extendInfo = extendInfo;
    }

    /**
     * 操作平台: 1app 2运营
     * @return operate_platform 操作平台: 1app 2运营
     */
    public Integer getOperatePlatform() {
        return operatePlatform;
    }

    /**
     * 操作平台: 1app 2运营
     * @param operatePlatform 操作平台: 1app 2运营
     */
    public void setOperatePlatform(Integer operatePlatform) {
        this.operatePlatform = operatePlatform;
    }

    /**
     * 操作用户id
     * @return operate_user_id 操作用户id
     */
    public Integer getOperateUserId() {
        return operateUserId;
    }

    /**
     * 操作用户id
     * @param operateUserId 操作用户id
     */
    public void setOperateUserId(Integer operateUserId) {
        this.operateUserId = operateUserId;
    }

    /**
     * 
     * @return operate_use_name 
     */
    public String getOperateUseName() {
        return operateUseName;
    }

    /**
     * 
     * @param operateUseName 
     */
    public void setOperateUseName(String operateUseName) {
        this.operateUseName = operateUseName;
    }

    /**
     * 操作备注
     * @return operate_remark 操作备注
     */
    public String getOperateRemark() {
        return operateRemark;
    }

    /**
     * 操作备注
     * @param operateRemark 操作备注
     */
    public void setOperateRemark(String operateRemark) {
        this.operateRemark = operateRemark;
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
}