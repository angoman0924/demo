/*
*
* UUserBankAccount.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.entity;

import java.util.Date;

public class UUserBankAccount {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private Integer userId;

    /**
     * 账号类型：1银行卡 2支付宝 3微信 4用户钱包
     */
    private Integer type;

    /**
     * 账号号码
     */
    private String code;

    /**
     * 
     */
    private Integer bankId;

    /**
     * 银行名称
     */
    private String bankName;

    /**
     * 持卡人姓名
     */
    private String userName;

    /**
     * 账号绑定手机号
     */
    private String userPhone;

    /**
     * 身份证
     */
    private String userCardNo;

    /**
     * 最大提现额度
     */
    private Integer withdrawCashMax;

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
     * 账号类型：1银行卡 2支付宝 3微信 4用户钱包
     * @return type 账号类型：1银行卡 2支付宝 3微信 4用户钱包
     */
    public Integer getType() {
        return type;
    }

    /**
     * 账号类型：1银行卡 2支付宝 3微信 4用户钱包
     * @param type 账号类型：1银行卡 2支付宝 3微信 4用户钱包
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 账号号码
     * @return code 账号号码
     */
    public String getCode() {
        return code;
    }

    /**
     * 账号号码
     * @param code 账号号码
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 
     * @return bank_id 
     */
    public Integer getBankId() {
        return bankId;
    }

    /**
     * 
     * @param bankId 
     */
    public void setBankId(Integer bankId) {
        this.bankId = bankId;
    }

    /**
     * 银行名称
     * @return bank_name 银行名称
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * 银行名称
     * @param bankName 银行名称
     */
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    /**
     * 持卡人姓名
     * @return user_name 持卡人姓名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 持卡人姓名
     * @param userName 持卡人姓名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 账号绑定手机号
     * @return user_phone 账号绑定手机号
     */
    public String getUserPhone() {
        return userPhone;
    }

    /**
     * 账号绑定手机号
     * @param userPhone 账号绑定手机号
     */
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    /**
     * 身份证
     * @return user_card_no 身份证
     */
    public String getUserCardNo() {
        return userCardNo;
    }

    /**
     * 身份证
     * @param userCardNo 身份证
     */
    public void setUserCardNo(String userCardNo) {
        this.userCardNo = userCardNo;
    }

    /**
     * 最大提现额度
     * @return withdraw_cash_max 最大提现额度
     */
    public Integer getWithdrawCashMax() {
        return withdrawCashMax;
    }

    /**
     * 最大提现额度
     * @param withdrawCashMax 最大提现额度
     */
    public void setWithdrawCashMax(Integer withdrawCashMax) {
        this.withdrawCashMax = withdrawCashMax;
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