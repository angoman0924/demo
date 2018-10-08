/*
*
* UPermission.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.entity;

import java.util.Date;

public class UPermission {
    /**
     * 
     */
    private Integer id;

    /**
     * 操作
     */
    private String code;

    /**
     * 权限名称
     */
    private String name;

    /**
     * 平台 乘客端，司机端，运营端
     */
    private String platform;

    /**
     * 类型：1 MENU(菜单), 2 BUTTON(按钮)
     */
    private Integer type;

    /**
     * 父ID
     */
    private Integer parentId;

    /**
     * 顺序
     */
    private Integer orderValue;

    /**
     * 请求地址
     */
    private String url;

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
     * 操作
     * @return code 操作
     */
    public String getCode() {
        return code;
    }

    /**
     * 操作
     * @param code 操作
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 权限名称
     * @return name 权限名称
     */
    public String getName() {
        return name;
    }

    /**
     * 权限名称
     * @param name 权限名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 平台 乘客端，司机端，运营端
     * @return platform 平台 乘客端，司机端，运营端
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * 平台 乘客端，司机端，运营端
     * @param platform 平台 乘客端，司机端，运营端
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * 类型：1 MENU(菜单), 2 BUTTON(按钮)
     * @return type 类型：1 MENU(菜单), 2 BUTTON(按钮)
     */
    public Integer getType() {
        return type;
    }

    /**
     * 类型：1 MENU(菜单), 2 BUTTON(按钮)
     * @param type 类型：1 MENU(菜单), 2 BUTTON(按钮)
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 父ID
     * @return parent_id 父ID
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * 父ID
     * @param parentId 父ID
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * 顺序
     * @return order_value 顺序
     */
    public Integer getOrderValue() {
        return orderValue;
    }

    /**
     * 顺序
     * @param orderValue 顺序
     */
    public void setOrderValue(Integer orderValue) {
        this.orderValue = orderValue;
    }

    /**
     * 请求地址
     * @return url 请求地址
     */
    public String getUrl() {
        return url;
    }

    /**
     * 请求地址
     * @param url 请求地址
     */
    public void setUrl(String url) {
        this.url = url;
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