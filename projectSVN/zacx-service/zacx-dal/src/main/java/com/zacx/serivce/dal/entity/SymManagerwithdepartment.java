/*
*
* SymManagerwithdepartment.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.entity;

import java.util.Date;

public class SymManagerwithdepartment {
    /**
     * 
     */
    private String id;

    /**
     * 
     */
    private String deptid;

    /**
     * 
     */
    private String managerid;

    /**
     * 
     */
    private String createdby;

    /**
     * 
     */
    private Date createdon;

    /**
     * 
     * @return Id 
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return DeptId 
     */
    public String getDeptid() {
        return deptid;
    }

    /**
     * 
     * @param deptid 
     */
    public void setDeptid(String deptid) {
        this.deptid = deptid;
    }

    /**
     * 
     * @return ManagerId 
     */
    public String getManagerid() {
        return managerid;
    }

    /**
     * 
     * @param managerid 
     */
    public void setManagerid(String managerid) {
        this.managerid = managerid;
    }

    /**
     * 
     * @return CreatedBy 
     */
    public String getCreatedby() {
        return createdby;
    }

    /**
     * 
     * @param createdby 
     */
    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }

    /**
     * 
     * @return CreatedOn 
     */
    public Date getCreatedon() {
        return createdon;
    }

    /**
     * 
     * @param createdon 
     */
    public void setCreatedon(Date createdon) {
        this.createdon = createdon;
    }
}