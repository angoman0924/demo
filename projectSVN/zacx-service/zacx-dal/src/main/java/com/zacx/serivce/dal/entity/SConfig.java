/*
*
* SConfig.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.entity;

public class SConfig {
    /**
     * 
     */
    private Integer id;

    /**
     * key组
     */
    private String group;

    /**
     * key组说明
     */
    private String groupName;

    /**
     * 
     */
    private String configKey;

    /**
     * 
     */
    private String configValue;

    /**
     * 扩展信息
     */
    private String extendInfo;

    /**
     * 描述
     */
    private String describe;

    /**
     * 状态：0无效 1有效
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
     * key组
     * @return group key组
     */
    public String getGroup() {
        return group;
    }

    /**
     * key组
     * @param group key组
     */
    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * key组说明
     * @return group_name key组说明
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * key组说明
     * @param groupName key组说明
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * 
     * @return config_key 
     */
    public String getConfigKey() {
        return configKey;
    }

    /**
     * 
     * @param configKey 
     */
    public void setConfigKey(String configKey) {
        this.configKey = configKey;
    }

    /**
     * 
     * @return config_value 
     */
    public String getConfigValue() {
        return configValue;
    }

    /**
     * 
     * @param configValue 
     */
    public void setConfigValue(String configValue) {
        this.configValue = configValue;
    }

    /**
     * 扩展信息
     * @return extend_info 扩展信息
     */
    public String getExtendInfo() {
        return extendInfo;
    }

    /**
     * 扩展信息
     * @param extendInfo 扩展信息
     */
    public void setExtendInfo(String extendInfo) {
        this.extendInfo = extendInfo;
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
     * 状态：0无效 1有效
     * @return status 状态：0无效 1有效
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 状态：0无效 1有效
     * @param status 状态：0无效 1有效
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}