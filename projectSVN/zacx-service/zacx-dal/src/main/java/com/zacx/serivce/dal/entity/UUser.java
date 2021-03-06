/*
*
* UUser.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.entity;

import java.util.Date;

public class UUser {
    /**
     * 
     */
    private Integer id;

    /**
     * 帐户
     */
    private String account;

    /**
     * 真实姓名
     */
    private String name;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 性别: 1男 2女 3其他
     */
    private Integer sex;

    /**
     * 出生日期
     */
    private Date birthday;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 证件类型: 1身份证 2驾驶证 3军官证 4护照 5其他
     */
    private Integer cardType;

    /**
     * 证件号
     */
    private String cardNo;

    /**
     * 登录密码
     */
    private String pwd;

    /**
     * 用户类型: 1用户 2司机 3用户和司机
     */
    private Integer userType;

    /**
     * 个人的邀请码
     */
    private String inviteId;

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
     * 帐户
     * @return account 帐户
     */
    public String getAccount() {
        return account;
    }

    /**
     * 帐户
     * @param account 帐户
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * 真实姓名
     * @return name 真实姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 真实姓名
     * @param name 真实姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 手机号码
     * @return phone 手机号码
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 手机号码
     * @param phone 手机号码
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 性别: 1男 2女 3其他
     * @return sex 性别: 1男 2女 3其他
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * 性别: 1男 2女 3其他
     * @param sex 性别: 1男 2女 3其他
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * 出生日期
     * @return birthday 出生日期
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 出生日期
     * @param birthday 出生日期
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 邮箱
     * @return email 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 邮箱
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 证件类型: 1身份证 2驾驶证 3军官证 4护照 5其他
     * @return card_type 证件类型: 1身份证 2驾驶证 3军官证 4护照 5其他
     */
    public Integer getCardType() {
        return cardType;
    }

    /**
     * 证件类型: 1身份证 2驾驶证 3军官证 4护照 5其他
     * @param cardType 证件类型: 1身份证 2驾驶证 3军官证 4护照 5其他
     */
    public void setCardType(Integer cardType) {
        this.cardType = cardType;
    }

    /**
     * 证件号
     * @return card_no 证件号
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * 证件号
     * @param cardNo 证件号
     */
    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    /**
     * 登录密码
     * @return pwd 登录密码
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * 登录密码
     * @param pwd 登录密码
     */
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    /**
     * 用户类型: 1用户 2司机 3用户和司机
     * @return user_type 用户类型: 1用户 2司机 3用户和司机
     */
    public Integer getUserType() {
        return userType;
    }

    /**
     * 用户类型: 1用户 2司机 3用户和司机
     * @param userType 用户类型: 1用户 2司机 3用户和司机
     */
    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    /**
     * 个人的邀请码
     * @return invite_id 个人的邀请码
     */
    public String getInviteId() {
        return inviteId;
    }

    /**
     * 个人的邀请码
     * @param inviteId 个人的邀请码
     */
    public void setInviteId(String inviteId) {
        this.inviteId = inviteId;
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