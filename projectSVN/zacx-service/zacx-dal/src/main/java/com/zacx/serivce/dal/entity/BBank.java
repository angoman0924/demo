/*
*
* BBank.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.entity;

public class BBank {
    /**
     * 
     */
    private Integer id;

    /**
     * 银行名称
     */
    private String name;

    /**
     * 银行logo图标
     */
    private String logo;

    /**
     * 最大提现额度
     */
    private Integer withdrawCashMax;

    /**
     * 是否对接此银行
     */
    private Boolean isEnable;

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
     * 银行名称
     * @return name 银行名称
     */
    public String getName() {
        return name;
    }

    /**
     * 银行名称
     * @param name 银行名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 银行logo图标
     * @return logo 银行logo图标
     */
    public String getLogo() {
        return logo;
    }

    /**
     * 银行logo图标
     * @param logo 银行logo图标
     */
    public void setLogo(String logo) {
        this.logo = logo;
    }

    /**
     * 最大提现额度
     * @return withdraw_cash_max 最大提现额度
     */
    public Integer getWithdrawCashMax() {
        return withdrawCashMax;
    }

    /**
     * 最大提现额度
     * @param withdrawCashMax 最大提现额度
     */
    public void setWithdrawCashMax(Integer withdrawCashMax) {
        this.withdrawCashMax = withdrawCashMax;
    }

    /**
     * 是否对接此银行
     * @return is_enable 是否对接此银行
     */
    public Boolean getIsEnable() {
        return isEnable;
    }

    /**
     * 是否对接此银行
     * @param isEnable 是否对接此银行
     */
    public void setIsEnable(Boolean isEnable) {
        this.isEnable = isEnable;
    }
}