/*
*
* SymFunctionpoint.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.entity;

public class SymFunctionpoint {
    /**
     * 
     */
    private String functionpointid;

    /**
     * 
     */
    private String name;

    /**
     * 功能key值(系统开发人员确定)
     */
    private String functionkey;

    /**
     * 平台菜单Id
     */
    private Integer sitemapid;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 
     * @return FunctionPointId 
     */
    public String getFunctionpointid() {
        return functionpointid;
    }

    /**
     * 
     * @param functionpointid 
     */
    public void setFunctionpointid(String functionpointid) {
        this.functionpointid = functionpointid;
    }

    /**
     * 
     * @return Name 
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 功能key值(系统开发人员确定)
     * @return FunctionKey 功能key值(系统开发人员确定)
     */
    public String getFunctionkey() {
        return functionkey;
    }

    /**
     * 功能key值(系统开发人员确定)
     * @param functionkey 功能key值(系统开发人员确定)
     */
    public void setFunctionkey(String functionkey) {
        this.functionkey = functionkey;
    }

    /**
     * 平台菜单Id
     * @return SiteMapId 平台菜单Id
     */
    public Integer getSitemapid() {
        return sitemapid;
    }

    /**
     * 平台菜单Id
     * @param sitemapid 平台菜单Id
     */
    public void setSitemapid(Integer sitemapid) {
        this.sitemapid = sitemapid;
    }

    /**
     * 排序
     * @return Sort 排序
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 排序
     * @param sort 排序
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }
}