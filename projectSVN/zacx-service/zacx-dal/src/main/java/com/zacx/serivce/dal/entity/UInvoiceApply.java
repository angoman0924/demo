/*
*
* UInvoiceApply.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-08
*/
package com.zacx.serivce.dal.entity;

import java.math.BigDecimal;
import java.util.Date;

public class UInvoiceApply {
    /**
     * 
     */
    private Integer id;

    /**
     * 流水号: UKPSQ1801010000001(U开票申请+年<2位>月日+7位流水号)
     */
    private String code;

    /**
     * 
     */
    private Integer userId;

    /**
     * 
     */
    private Integer invoiceCompanyId;

    /**
     * 发票金额
     */
    private BigDecimal invoiceMoney;

    /**
     * 税额
     */
    private Long taxMoney;

    /**
     * 申请时间
     */
    private Date applyTime;

    /**
     * 开票时间
     */
    private Date invoiceTime;

    /**
     * 状态：1申请中 2已开票 3拒绝 4作废
     */
    private Integer status;

    /**
     * 发票号码
     */
    private String invoiceNumber;

    /**
     * 
     */
    private Date createAt;

    /**
     * 
     */
    private Date modifyAt;

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
     * 流水号: UKPSQ1801010000001(U开票申请+年<2位>月日+7位流水号)
     * @return code 流水号: UKPSQ1801010000001(U开票申请+年<2位>月日+7位流水号)
     */
    public String getCode() {
        return code;
    }

    /**
     * 流水号: UKPSQ1801010000001(U开票申请+年<2位>月日+7位流水号)
     * @param code 流水号: UKPSQ1801010000001(U开票申请+年<2位>月日+7位流水号)
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 
     * @return user_id 
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 
     * @param userId 
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 
     * @return invoice_company_id 
     */
    public Integer getInvoiceCompanyId() {
        return invoiceCompanyId;
    }

    /**
     * 
     * @param invoiceCompanyId 
     */
    public void setInvoiceCompanyId(Integer invoiceCompanyId) {
        this.invoiceCompanyId = invoiceCompanyId;
    }

    /**
     * 发票金额
     * @return invoice_money 发票金额
     */
    public BigDecimal getInvoiceMoney() {
        return invoiceMoney;
    }

    /**
     * 发票金额
     * @param invoiceMoney 发票金额
     */
    public void setInvoiceMoney(BigDecimal invoiceMoney) {
        this.invoiceMoney = invoiceMoney;
    }

    /**
     * 税额
     * @return tax_money 税额
     */
    public Long getTaxMoney() {
        return taxMoney;
    }

    /**
     * 税额
     * @param taxMoney 税额
     */
    public void setTaxMoney(Long taxMoney) {
        this.taxMoney = taxMoney;
    }

    /**
     * 申请时间
     * @return apply_time 申请时间
     */
    public Date getApplyTime() {
        return applyTime;
    }

    /**
     * 申请时间
     * @param applyTime 申请时间
     */
    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    /**
     * 开票时间
     * @return invoice_time 开票时间
     */
    public Date getInvoiceTime() {
        return invoiceTime;
    }

    /**
     * 开票时间
     * @param invoiceTime 开票时间
     */
    public void setInvoiceTime(Date invoiceTime) {
        this.invoiceTime = invoiceTime;
    }

    /**
     * 状态：1申请中 2已开票 3拒绝 4作废
     * @return status 状态：1申请中 2已开票 3拒绝 4作废
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 状态：1申请中 2已开票 3拒绝 4作废
     * @param status 状态：1申请中 2已开票 3拒绝 4作废
     */
    public void setStatus(Integer status) {
        this.status = status;
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
     * @return create_at 
     */
    public Date getCreateAt() {
        return createAt;
    }

    /**
     * 
     * @param createAt 
     */
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    /**
     * 
     * @return modify_at 
     */
    public Date getModifyAt() {
        return modifyAt;
    }

    /**
     * 
     * @param modifyAt 
     */
    public void setModifyAt(Date modifyAt) {
        this.modifyAt = modifyAt;
    }
}