/*
*
* UInvoiceApplyDetail.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-08
*/
package com.zacx.serivce.dal.entity;

import java.math.BigDecimal;

public class UInvoiceApplyDetail {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private Integer invoiceApplyId;

    /**
     * 
     */
    private Integer orderId;

    /**
     * 发票商品名称
     */
    private String name;

    /**
     * 单价
     */
    private BigDecimal unitPrice;

    /**
     * 数量
     */
    private Integer number;

    /**
     * 税率(一张发票中商品，税率可以不同)
     */
    private BigDecimal taxRate;

    /**
     * 开票金额
     */
    private BigDecimal money;

    /**
     * 发票号码
     */
    private String invoiceNumber;

    /**
     * 
     */
    private Boolean isDelete;

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
     * @return invoice_apply_id 
     */
    public Integer getInvoiceApplyId() {
        return invoiceApplyId;
    }

    /**
     * 
     * @param invoiceApplyId 
     */
    public void setInvoiceApplyId(Integer invoiceApplyId) {
        this.invoiceApplyId = invoiceApplyId;
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
     * 发票商品名称
     * @return name 发票商品名称
     */
    public String getName() {
        return name;
    }

    /**
     * 发票商品名称
     * @param name 发票商品名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 单价
     * @return unit_price 单价
     */
    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    /**
     * 单价
     * @param unitPrice 单价
     */
    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * 数量
     * @return number 数量
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * 数量
     * @param number 数量
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * 税率(一张发票中商品，税率可以不同)
     * @return tax_rate 税率(一张发票中商品，税率可以不同)
     */
    public BigDecimal getTaxRate() {
        return taxRate;
    }

    /**
     * 税率(一张发票中商品，税率可以不同)
     * @param taxRate 税率(一张发票中商品，税率可以不同)
     */
    public void setTaxRate(BigDecimal taxRate) {
        this.taxRate = taxRate;
    }

    /**
     * 开票金额
     * @return money 开票金额
     */
    public BigDecimal getMoney() {
        return money;
    }

    /**
     * 开票金额
     * @param money 开票金额
     */
    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    /**
     * 发票号码
     * @return Invoice_number 发票号码
     */
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * 发票号码
     * @param invoiceNumber 发票号码
     */
    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    /**
     * 
     * @return is_delete 
     */
    public Boolean getIsDelete() {
        return isDelete;
    }

    /**
     * 
     * @param isDelete 
     */
    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }
}