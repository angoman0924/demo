/*
*
* SymManagerinfo.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.entity;

import java.util.Date;

public class SymManagerinfo {
    /**
     * 用户Id
     */
    private String managerid;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 性别: 1男 2女 3其他
     */
    private Byte sex;

    /**
     * 邮件
     */
    private String mail;

    /**
     * 电话号码
     */
    private String phone;

    /**
     * 身份证号码
     */
    private String cardcode;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 备注
     */
    private String remark;

    /**
     * 用户Id
     * @return ManagerId 用户Id
     */
    public String getManagerid() {
        return managerid;
    }

    /**
     * 用户Id
     * @param managerid 用户Id
     */
    public void setManagerid(String managerid) {
        this.managerid = managerid;
    }

    /**
     * 昵称
     * @return NickName 昵称
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 昵称
     * @param nickname 昵称
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * 性别: 1男 2女 3其他
     * @return Sex 性别: 1男 2女 3其他
     */
    public Byte getSex() {
        return sex;
    }

    /**
     * 性别: 1男 2女 3其他
     * @param sex 性别: 1男 2女 3其他
     */
    public void setSex(Byte sex) {
        this.sex = sex;
    }

    /**
     * 邮件
     * @return Mail 邮件
     */
    public String getMail() {
        return mail;
    }

    /**
     * 邮件
     * @param mail 邮件
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * 电话号码
     * @return Phone 电话号码
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 电话号码
     * @param phone 电话号码
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 身份证号码
     * @return CardCode 身份证号码
     */
    public String getCardcode() {
        return cardcode;
    }

    /**
     * 身份证号码
     * @param cardcode 身份证号码
     */
    public void setCardcode(String cardcode) {
        this.cardcode = cardcode;
    }

    /**
     * 生日
     * @return Birthday 生日
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 生日
     * @param birthday 生日
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 备注
     * @return Remark 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}