/*
*
* SymFunctionitem.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.entity;

public class SymFunctionitem {
    /**
     * 
     */
    private String functionitemid;

    /**
     * 功能id
     */
    private String functionid;

    /**
     * 功能按钮id
     */
    private String functionpointid;

    /**
     * 
     * @return FunctionItemId 
     */
    public String getFunctionitemid() {
        return functionitemid;
    }

    /**
     * 
     * @param functionitemid 
     */
    public void setFunctionitemid(String functionitemid) {
        this.functionitemid = functionitemid;
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

    /**
     * 功能按钮id
     * @return FunctionPointId 功能按钮id
     */
    public String getFunctionpointid() {
        return functionpointid;
    }

    /**
     * 功能按钮id
     * @param functionpointid 功能按钮id
     */
    public void setFunctionpointid(String functionpointid) {
        this.functionpointid = functionpointid;
    }
}