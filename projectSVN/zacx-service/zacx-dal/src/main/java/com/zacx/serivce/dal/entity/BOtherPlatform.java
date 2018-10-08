/*
*
* BOtherPlatform.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.entity;

public class BOtherPlatform {
    /**
     * 
     */
    private Integer id;

    /**
     * 平台名称
     */
    private String name;

    /**
     * 联系人
     */
    private String contactPerson;

    /**
     * 联系电话
     */
    private String contactPhone;

    /**
     * 状态: 0无效 1有效
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
     * 平台名称
     * @return name 平台名称
     */
    public String getName() {
        return name;
    }

    /**
     * 平台名称
     * @param name 平台名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 联系人
     * @return contact_person 联系人
     */
    public String getContactPerson() {
        return contactPerson;
    }

    /**
     * 联系人
     * @param contactPerson 联系人
     */
    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    /**
     * 联系电话
     * @return contact_phone 联系电话
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /**
     * 联系电话
     * @param contactPhone 联系电话
     */
    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    /**
     * 状态: 0无效 1有效
     * @return status 状态: 0无效 1有效
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 状态: 0无效 1有效
     * @param status 状态: 0无效 1有效
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