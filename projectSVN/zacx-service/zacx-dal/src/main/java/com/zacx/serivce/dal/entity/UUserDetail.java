/*
*
* UUserDetail.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.entity;

import java.math.BigDecimal;

public class UUserDetail {
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
    private String roleIds;

    /**
     * 用户昵称
     */
    private String nickName;

    /**
     * 登记/注册城市
     */
    private Integer cityId;

    /**
     * 登记/注册位置
     */
    private String coordinate;

    /**
     * 我的钱包: 默认0，元为单位
     */
    private BigDecimal wallet;

    /**
     * 积分
     */
    private Integer integral;

    /**
     * 支付密码
     */
    private String payPwd;

    /**
     * 头像
     */
    private String headPortrait;

    /**
     * 邀请人id
     */
    private String inviteUserId;

    /**
     * 详细地址，可以作为送货地址
     */
    private String address;

    /**
     * 状态: 1正常 0锁定
     */
    private Integer status;

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
     * @return role_ids 
     */
    public String getRoleIds() {
        return roleIds;
    }

    /**
     * 
     * @param roleIds 
     */
    public void setRoleIds(String roleIds) {
        this.roleIds = roleIds;
    }

    /**
     * 用户昵称
     * @return nick_name 用户昵称
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 用户昵称
     * @param nickName 用户昵称
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * 登记/注册城市
     * @return city_id 登记/注册城市
     */
    public Integer getCityId() {
        return cityId;
    }

    /**
     * 登记/注册城市
     * @param cityId 登记/注册城市
     */
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    /**
     * 登记/注册位置
     * @return coordinate 登记/注册位置
     */
    public String getCoordinate() {
        return coordinate;
    }

    /**
     * 登记/注册位置
     * @param coordinate 登记/注册位置
     */
    public void setCoordinate(String coordinate) {
        this.coordinate = coordinate;
    }

    /**
     * 我的钱包: 默认0，元为单位
     * @return wallet 我的钱包: 默认0，元为单位
     */
    public BigDecimal getWallet() {
        return wallet;
    }

    /**
     * 我的钱包: 默认0，元为单位
     * @param wallet 我的钱包: 默认0，元为单位
     */
    public void setWallet(BigDecimal wallet) {
        this.wallet = wallet;
    }

    /**
     * 积分
     * @return integral 积分
     */
    public Integer getIntegral() {
        return integral;
    }

    /**
     * 积分
     * @param integral 积分
     */
    public void setIntegral(Integer integral) {
        this.integral = integral;
    }

    /**
     * 支付密码
     * @return pay_pwd 支付密码
     */
    public String getPayPwd() {
        return payPwd;
    }

    /**
     * 支付密码
     * @param payPwd 支付密码
     */
    public void setPayPwd(String payPwd) {
        this.payPwd = payPwd;
    }

    /**
     * 头像
     * @return head_portrait 头像
     */
    public String getHeadPortrait() {
        return headPortrait;
    }

    /**
     * 头像
     * @param headPortrait 头像
     */
    public void setHeadPortrait(String headPortrait) {
        this.headPortrait = headPortrait;
    }

    /**
     * 邀请人id
     * @return invite_user_id 邀请人id
     */
    public String getInviteUserId() {
        return inviteUserId;
    }

    /**
     * 邀请人id
     * @param inviteUserId 邀请人id
     */
    public void setInviteUserId(String inviteUserId) {
        this.inviteUserId = inviteUserId;
    }

    /**
     * 详细地址，可以作为送货地址
     * @return address 详细地址，可以作为送货地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 详细地址，可以作为送货地址
     * @param address 详细地址，可以作为送货地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 状态: 1正常 0锁定
     * @return status 状态: 1正常 0锁定
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 状态: 1正常 0锁定
     * @param status 状态: 1正常 0锁定
     */
    public void setStatus(Integer status) {
        this.status = status;
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