/*
*
* LHotzoneGroupDetail.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.entity;

public class LHotzoneGroupDetail {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private Integer groupId;

    /**
     * 
     */
    private Integer hotzoneId;

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
     * @return group_id 
     */
    public Integer getGroupId() {
        return groupId;
    }

    /**
     * 
     * @param groupId 
     */
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    /**
     * 
     * @return hotzone_id 
     */
    public Integer getHotzoneId() {
        return hotzoneId;
    }

    /**
     * 
     * @param hotzoneId 
     */
    public void setHotzoneId(Integer hotzoneId) {
        this.hotzoneId = hotzoneId;
    }
}