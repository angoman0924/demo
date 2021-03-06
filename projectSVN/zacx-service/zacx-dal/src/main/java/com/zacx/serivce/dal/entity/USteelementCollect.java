/*
*
* USteelementCollect.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.entity;

import java.util.Date;

public class USteelementCollect {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private Integer userId;

    /**
     * 结算类型: 1充值 2提现 3消费 4收益
     */
    private Integer type;

    /**
     * 结算时间区间类型: 1按月 2按季度 3按年
     */
    private Integer dateIntervalType;

    /**
     * 结算的时间区间值（eg: 1月份 2月份 1季度 2季度 2018年...）
     */
    private String dateValue;

    /**
     * 
     */
    private Long money;

    /**
     * 结算时间
     */
    private Date settlementTime;

    /**
     * 
     */
    private String remark;

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
     * 结算类型: 1充值 2提现 3消费 4收益
     * @return type 结算类型: 1充值 2提现 3消费 4收益
     */
    public Integer getType() {
        return type;
    }

    /**
     * 结算类型: 1充值 2提现 3消费 4收益
     * @param type 结算类型: 1充值 2提现 3消费 4收益
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 结算时间区间类型: 1按月 2按季度 3按年
     * @return date_interval_type 结算时间区间类型: 1按月 2按季度 3按年
     */
    public Integer getDateIntervalType() {
        return dateIntervalType;
    }

    /**
     * 结算时间区间类型: 1按月 2按季度 3按年
     * @param dateIntervalType 结算时间区间类型: 1按月 2按季度 3按年
     */
    public void setDateIntervalType(Integer dateIntervalType) {
        this.dateIntervalType = dateIntervalType;
    }

    /**
     * 结算的时间区间值（eg: 1月份 2月份 1季度 2季度 2018年...）
     * @return date_value 结算的时间区间值（eg: 1月份 2月份 1季度 2季度 2018年...）
     */
    public String getDateValue() {
        return dateValue;
    }

    /**
     * 结算的时间区间值（eg: 1月份 2月份 1季度 2季度 2018年...）
     * @param dateValue 结算的时间区间值（eg: 1月份 2月份 1季度 2季度 2018年...）
     */
    public void setDateValue(String dateValue) {
        this.dateValue = dateValue;
    }

    /**
     * 
     * @return money 
     */
    public Long getMoney() {
        return money;
    }

    /**
     * 
     * @param money 
     */
    public void setMoney(Long money) {
        this.money = money;
    }

    /**
     * 结算时间
     * @return settlement_time 结算时间
     */
    public Date getSettlementTime() {
        return settlementTime;
    }

    /**
     * 结算时间
     * @param settlementTime 结算时间
     */
    public void setSettlementTime(Date settlementTime) {
        this.settlementTime = settlementTime;
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