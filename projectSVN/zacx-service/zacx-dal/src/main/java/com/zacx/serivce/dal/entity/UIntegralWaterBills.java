/*
*
* UIntegralWaterBills.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.entity;

import java.util.Date;

public class UIntegralWaterBills {
    /**
     * 
     */
    private Integer id;

    /**
     * 流水号: 1801010000001(年<2位>月日+5位流水号)
     */
    private String code;

    /**
     * 描述
     */
    private String describe;

    /**
     * 
     */
    private Integer userId;

    /**
     * 本次流水的用户类型: 1用户 2车主
     */
    private Integer userType;

    /**
     * 发生积分
     */
    private Long number;

    /**
     * 积分余额
     */
    private Long accountBalance;

    /**
     * 出入类型：0出 1入
     */
    private Integer exitEntryType;

    /**
     * 业务类型：10系统充值 11运营充值 12退还 20扣除 21消费
     */
    private Integer busType;

    /**
     * 关联Id（business_type=退款/消费 时关联order_id, business_type=平台充值，关联scheduling_id）
     */
    private Integer relationId;

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
     * 流水号: 1801010000001(年<2位>月日+5位流水号)
     * @return code 流水号: 1801010000001(年<2位>月日+5位流水号)
     */
    public String getCode() {
        return code;
    }

    /**
     * 流水号: 1801010000001(年<2位>月日+5位流水号)
     * @param code 流水号: 1801010000001(年<2位>月日+5位流水号)
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 描述
     * @return describe 描述
     */
    public String getDescribe() {
        return describe;
    }

    /**
     * 描述
     * @param describe 描述
     */
    public void setDescribe(String describe) {
        this.describe = describe;
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
     * 本次流水的用户类型: 1用户 2车主
     * @return user_type 本次流水的用户类型: 1用户 2车主
     */
    public Integer getUserType() {
        return userType;
    }

    /**
     * 本次流水的用户类型: 1用户 2车主
     * @param userType 本次流水的用户类型: 1用户 2车主
     */
    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    /**
     * 发生积分
     * @return number 发生积分
     */
    public Long getNumber() {
        return number;
    }

    /**
     * 发生积分
     * @param number 发生积分
     */
    public void setNumber(Long number) {
        this.number = number;
    }

    /**
     * 积分余额
     * @return account_balance 积分余额
     */
    public Long getAccountBalance() {
        return accountBalance;
    }

    /**
     * 积分余额
     * @param accountBalance 积分余额
     */
    public void setAccountBalance(Long accountBalance) {
        this.accountBalance = accountBalance;
    }

    /**
     * 出入类型：0出 1入
     * @return exit_entry_type 出入类型：0出 1入
     */
    public Integer getExitEntryType() {
        return exitEntryType;
    }

    /**
     * 出入类型：0出 1入
     * @param exitEntryType 出入类型：0出 1入
     */
    public void setExitEntryType(Integer exitEntryType) {
        this.exitEntryType = exitEntryType;
    }

    /**
     * 业务类型：10系统充值 11运营充值 12退还 20扣除 21消费
     * @return bus_type 业务类型：10系统充值 11运营充值 12退还 20扣除 21消费
     */
    public Integer getBusType() {
        return busType;
    }

    /**
     * 业务类型：10系统充值 11运营充值 12退还 20扣除 21消费
     * @param busType 业务类型：10系统充值 11运营充值 12退还 20扣除 21消费
     */
    public void setBusType(Integer busType) {
        this.busType = busType;
    }

    /**
     * 关联Id（business_type=退款/消费 时关联order_id, business_type=平台充值，关联scheduling_id）
     * @return relation_id 关联Id（business_type=退款/消费 时关联order_id, business_type=平台充值，关联scheduling_id）
     */
    public Integer getRelationId() {
        return relationId;
    }

    /**
     * 关联Id（business_type=退款/消费 时关联order_id, business_type=平台充值，关联scheduling_id）
     * @param relationId 关联Id（business_type=退款/消费 时关联order_id, business_type=平台充值，关联scheduling_id）
     */
    public void setRelationId(Integer relationId) {
        this.relationId = relationId;
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