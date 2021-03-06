/*
*
* BCity.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.entity;

public class BCity {
    /**
     * 
     */
    private Integer id;

    /**
     * 1省 2市 3县/区
     */
    private Integer level;

    /**
     * 
     */
    private String name;

    /**
     * 拼音码
     */
    private String pinyinCode;

    /**
     * 
     */
    private String code;

    /**
     * 
     */
    private String parentCode;

    /**
     * 层级: 为了区分县和区
     */
    private Integer type;

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
     * 1省 2市 3县/区
     * @return level 1省 2市 3县/区
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 1省 2市 3县/区
     * @param level 1省 2市 3县/区
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * 
     * @return name 
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
     * 拼音码
     * @return pinyin_code 拼音码
     */
    public String getPinyinCode() {
        return pinyinCode;
    }

    /**
     * 拼音码
     * @param pinyinCode 拼音码
     */
    public void setPinyinCode(String pinyinCode) {
        this.pinyinCode = pinyinCode;
    }

    /**
     * 
     * @return code 
     */
    public String getCode() {
        return code;
    }

    /**
     * 
     * @param code 
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 
     * @return parent_code 
     */
    public String getParentCode() {
        return parentCode;
    }

    /**
     * 
     * @param parentCode 
     */
    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    /**
     * 层级: 为了区分县和区
     * @return type 层级: 为了区分县和区
     */
    public Integer getType() {
        return type;
    }

    /**
     * 层级: 为了区分县和区
     * @param type 层级: 为了区分县和区
     */
    public void setType(Integer type) {
        this.type = type;
    }
}