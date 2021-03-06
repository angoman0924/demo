/*
*
* BInsurance.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.entity;

import java.math.BigDecimal;

public class BInsurance {
    /**
     * 
     */
    private Integer id;

    /**
     * 保险名称
     */
    private String name;

    /**
     * 保险公司（从s_config表中取）
     */
    private String insuranceCompany;

    /**
     * 保费
     */
    private BigDecimal premium;

    /**
     * 保险类型
     */
    private Integer type;

    /**
     * 
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
     * 保险名称
     * @return name 保险名称
     */
    public String getName() {
        return name;
    }

    /**
     * 保险名称
     * @param name 保险名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 保险公司（从s_config表中取）
     * @return Insurance_company 保险公司（从s_config表中取）
     */
    public String getInsuranceCompany() {
        return insuranceCompany;
    }

    /**
     * 保险公司（从s_config表中取）
     * @param insuranceCompany 保险公司（从s_config表中取）
     */
    public void setInsuranceCompany(String insuranceCompany) {
        this.insuranceCompany = insuranceCompany;
    }

    /**
     * 保费
     * @return premium 保费
     */
    public BigDecimal getPremium() {
        return premium;
    }

    /**
     * 保费
     * @param premium 保费
     */
    public void setPremium(BigDecimal premium) {
        this.premium = premium;
    }

    /**
     * 保险类型
     * @return type 保险类型
     */
    public Integer getType() {
        return type;
    }

    /**
     * 保险类型
     * @param type 保险类型
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 
     * @return describe 
     */
    public String getDescribe() {
        return describe;
    }

    /**
     * 
     * @param describe 
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