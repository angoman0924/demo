/*
*
* SymRolewithfunction.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.entity;

public class SymRolewithfunction {
    /**
     * 
     */
    private String relationid;

    /**
     * 角色id
     */
    private String roleid;

    /**
     * 功能id
     */
    private String functionid;

    /**
     * 
     * @return RelationId 
     */
    public String getRelationid() {
        return relationid;
    }

    /**
     * 
     * @param relationid 
     */
    public void setRelationid(String relationid) {
        this.relationid = relationid;
    }

    /**
     * 角色id
     * @return RoleId 角色id
     */
    public String getRoleid() {
        return roleid;
    }

    /**
     * 角色id
     * @param roleid 角色id
     */
    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }

    /**
     * 功能id
     * @return FunctionId 功能id
     */
    public String getFunctionid() {
        return functionid;
    }

    /**
     * 功能id
     * @param functionid 功能id
     */
    public void setFunctionid(String functionid) {
        this.functionid = functionid;
    }
}