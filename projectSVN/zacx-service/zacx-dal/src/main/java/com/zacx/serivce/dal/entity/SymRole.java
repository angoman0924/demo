/*
*
* SymRole.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.entity;

import java.util.Date;

public class SymRole {
    /**
     * 
     */
    private String roleid;

    /**
     * 角色key
     */
    private String rolekey;

    /**
     * 角色名称
     */
    private String rolename;

    /**
     * 备注
     */
    private String roleremark;

    /**
     * 
     */
    private Date createdon;

    /**
     * 
     */
    private String createdby;

    /**
     * 删除标记
     */
    private Byte isdeleted;

    /**
     * 
     * @return RoleId 
     */
    public String getRoleid() {
        return roleid;
    }

    /**
     * 
     * @param roleid 
     */
    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }

    /**
     * 角色key
     * @return RoleKey 角色key
     */
    public String getRolekey() {
        return rolekey;
    }

    /**
     * 角色key
     * @param rolekey 角色key
     */
    public void setRolekey(String rolekey) {
        this.rolekey = rolekey;
    }

    /**
     * 角色名称
     * @return RoleName 角色名称
     */
    public String getRolename() {
        return rolename;
    }

    /**
     * 角色名称
     * @param rolename 角色名称
     */
    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    /**
     * 备注
     * @return RoleRemark 备注
     */
    public String getRoleremark() {
        return roleremark;
    }

    /**
     * 备注
     * @param roleremark 备注
     */
    public void setRoleremark(String roleremark) {
        this.roleremark = roleremark;
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
     * 删除标记
     * @return IsDeleted 删除标记
     */
    public Byte getIsdeleted() {
        return isdeleted;
    }

    /**
     * 删除标记
     * @param isdeleted 删除标记
     */
    public void setIsdeleted(Byte isdeleted) {
        this.isdeleted = isdeleted;
    }
}