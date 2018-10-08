/*
*
* OOrder2Insurance.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.entity;

import java.math.BigDecimal;

public class OOrder2Insurance {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private Integer orderId;

    /**
     * 
     */
    private Integer insuranceId;

    /**
     * 保险类型名称
     */
    private String insuranceName;

    /**
     * 保险份数
     */
    private Integer count;

    /**
     * 保费单价
     */
    private BigDecimal insurancePremium;

    /**
     * 总额
     */
    private BigDecimal money;

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
     * @return order_id 
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * 
     * @param orderId 
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * 
     * @return insurance_id 
     */
    public Integer getInsuranceId() {
        return insuranceId;
    }

    /**
     * 
     * @param insuranceId 
     */
    public void setInsuranceId(Integer insuranceId) {
        this.insuranceId = insuranceId;
    }

    /**
     * 保险类型名称
     * @return insurance_name 保险类型名称
     */
    public String getInsuranceName() {
        return insuranceName;
    }

    /**
     * 保险类型名称
     * @param insuranceName 保险类型名称
     */
    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    /**
     * 保险份数
     * @return count 保险份数
     */
    public Integer getCount() {
        return count;
    }

    /**
     * 保险份数
     * @param count 保险份数
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * 保费单价
     * @return insurance_premium 保费单价
     */
    public BigDecimal getInsurancePremium() {
        return insurancePremium;
    }

    /**
     * 保费单价
     * @param insurancePremium 保费单价
     */
    public void setInsurancePremium(BigDecimal insurancePremium) {
        this.insurancePremium = insurancePremium;
    }

    /**
     * 总额
     * @return money 总额
     */
    public BigDecimal getMoney() {
        return money;
    }

    /**
     * 总额
     * @param money 总额
     */
    public void setMoney(BigDecimal money) {
        this.money = money;
    }
}