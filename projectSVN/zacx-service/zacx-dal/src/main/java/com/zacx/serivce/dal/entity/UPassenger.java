/*
*
* UPassenger.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.entity;

public class UPassenger {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private Integer userId;

    /**
     * 乘客真实姓名
     */
    private String name;

    /**
     * 证件类型: 1身份证 2驾驶证 3军官证 4护照 5其他
     */
    private Integer cardType;

    /**
     * 证件号
     */
    private String cardNo;

    /**
     * 1(ADULT)成人 2(CHILD)儿童
     */
    private Integer personGroup;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 1 可用, 0不可用
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
     * 乘客真实姓名
     * @return name 乘客真实姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 乘客真实姓名
     * @param name 乘客真实姓名
     */
    public void setName(String name) {
        this.name = name;
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
     * 1(ADULT)成人 2(CHILD)儿童
     * @return person_group 1(ADULT)成人 2(CHILD)儿童
     */
    public Integer getPersonGroup() {
        return personGroup;
    }

    /**
     * 1(ADULT)成人 2(CHILD)儿童
     * @param personGroup 1(ADULT)成人 2(CHILD)儿童
     */
    public void setPersonGroup(Integer personGroup) {
        this.personGroup = personGroup;
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
     * 1 可用, 0不可用
     * @return status 1 可用, 0不可用
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 1 可用, 0不可用
     * @param status 1 可用, 0不可用
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}