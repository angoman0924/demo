/*
*
* CActivity.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.entity;

import java.util.Date;

public class CActivity {
    /**
     * 
     */
    private Integer id;

    /**
     * 活动标题
     */
    private String title;

    /**
     * 活动描述
     */
    private String desc;

    /**
     * 二维码信息
     */
    private String qrCode;

    /**
     * 
     */
    private Integer sort;

    /**
     * 
     */
    private Integer typeId;

    /**
     * 开始时间
     */
    private Date dateStart;

    /**
     * 结束时间
     */
    private Date dateEnd;

    /**
     * 活动状态: 1正常 2停用
     */
    private Integer status;

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
     * 活动标题
     * @return title 活动标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 活动标题
     * @param title 活动标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 活动描述
     * @return desc 活动描述
     */
    public String getDesc() {
        return desc;
    }

    /**
     * 活动描述
     * @param desc 活动描述
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * 二维码信息
     * @return qr_code 二维码信息
     */
    public String getQrCode() {
        return qrCode;
    }

    /**
     * 二维码信息
     * @param qrCode 二维码信息
     */
    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    /**
     * 
     * @return sort 
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 
     * @param sort 
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 
     * @return type_id 
     */
    public Integer getTypeId() {
        return typeId;
    }

    /**
     * 
     * @param typeId 
     */
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    /**
     * 开始时间
     * @return date_start 开始时间
     */
    public Date getDateStart() {
        return dateStart;
    }

    /**
     * 开始时间
     * @param dateStart 开始时间
     */
    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    /**
     * 结束时间
     * @return date_end 结束时间
     */
    public Date getDateEnd() {
        return dateEnd;
    }

    /**
     * 结束时间
     * @param dateEnd 结束时间
     */
    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    /**
     * 活动状态: 1正常 2停用
     * @return status 活动状态: 1正常 2停用
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 活动状态: 1正常 2停用
     * @param status 活动状态: 1正常 2停用
     */
    public void setStatus(Integer status) {
        this.status = status;
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
}