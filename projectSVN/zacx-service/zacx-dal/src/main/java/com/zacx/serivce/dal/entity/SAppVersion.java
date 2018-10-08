/*
*
* SAppVersion.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.entity;

import java.util.Date;

public class SAppVersion {
    /**
     * 
     */
    private Integer id;

    /**
     * 平台类型: 1乘客端 2司机端
     */
    private Integer platformType;

    /**
     * 版本号
     */
    private String appVersion;

    /**
     * 系统类型: 1android 2ios
     */
    private Integer appType;

    /**
     * app更新地址
     */
    private String appUrl;

    /**
     * 强制更新标记
     */
    private String isForce;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 更新内容描述
     */
    private String content;

    /**
     * 
     */
    private Date createAt;

    /**
     * 
     */
    private Date updateAt;

    /**
     * 
     */
    private String createBy;

    /**
     * 
     */
    private String updateBy;

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
     * 平台类型: 1乘客端 2司机端
     * @return platform_type 平台类型: 1乘客端 2司机端
     */
    public Integer getPlatformType() {
        return platformType;
    }

    /**
     * 平台类型: 1乘客端 2司机端
     * @param platformType 平台类型: 1乘客端 2司机端
     */
    public void setPlatformType(Integer platformType) {
        this.platformType = platformType;
    }

    /**
     * 版本号
     * @return app_version 版本号
     */
    public String getAppVersion() {
        return appVersion;
    }

    /**
     * 版本号
     * @param appVersion 版本号
     */
    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    /**
     * 系统类型: 1android 2ios
     * @return app_type 系统类型: 1android 2ios
     */
    public Integer getAppType() {
        return appType;
    }

    /**
     * 系统类型: 1android 2ios
     * @param appType 系统类型: 1android 2ios
     */
    public void setAppType(Integer appType) {
        this.appType = appType;
    }

    /**
     * app更新地址
     * @return app_url app更新地址
     */
    public String getAppUrl() {
        return appUrl;
    }

    /**
     * app更新地址
     * @param appUrl app更新地址
     */
    public void setAppUrl(String appUrl) {
        this.appUrl = appUrl;
    }

    /**
     * 强制更新标记
     * @return is_force 强制更新标记
     */
    public String getIsForce() {
        return isForce;
    }

    /**
     * 强制更新标记
     * @param isForce 强制更新标记
     */
    public void setIsForce(String isForce) {
        this.isForce = isForce;
    }

    /**
     * 状态
     * @return status 状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 状态
     * @param status 状态
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 更新内容描述
     * @return content 更新内容描述
     */
    public String getContent() {
        return content;
    }

    /**
     * 更新内容描述
     * @param content 更新内容描述
     */
    public void setContent(String content) {
        this.content = content;
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
     * @return update_at 
     */
    public Date getUpdateAt() {
        return updateAt;
    }

    /**
     * 
     * @param updateAt 
     */
    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
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
     * @return update_by 
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * 
     * @param updateBy 
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }
}