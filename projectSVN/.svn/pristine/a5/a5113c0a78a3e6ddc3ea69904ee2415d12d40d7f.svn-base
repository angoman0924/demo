/*
*
* OOrder.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.entity;

import java.math.BigDecimal;
import java.util.Date;

public class OOrder {
    /**
     * 
     */
    private Integer id;

    /**
     * 流水号: LDD1801010000001(L订单+年<2位>月日+7位流水号)
     */
    private String code;

    /**
     * 
     */
    private Integer userId;

    /**
     * 包车业务无此表关联
     */
    private Integer planId;

    /**
     * 
     */
    private Integer lineId;

    /**
     * 
     */
    private String siteStartName;

    /**
     * 
     */
    private String siteEndName;

    /**
     * 调度：车次Id
     */
    private Integer schedulingId;

    /**
     * 调度：车辆id
     */
    private Integer carId;

    /**
     * 预计开车时间
     */
    private Date startTime;

    /**
     * 车票数量
     */
    private Integer ticketNumber;

    /**
     * 单张票价
     */
    private BigDecimal ticketCost;

    /**
     * 保险费总额
     */
    private BigDecimal insuranceCost;

    /**
     * 优惠券总金额
     */
    private BigDecimal couponCost;

    /**
     * 接车总费用
     */
    private BigDecimal takeCost;

    /**
     * 接车坐标
     */
    private String takeCoordinate;

    /**
     * 接车详细地址
     */
    private String takeAddress;

    /**
     * 送人总费用
     */
    private BigDecimal giveCost;

    /**
     * 送人坐标
     */
    private String giveCoordinate;

    /**
     * 送人详细地址
     */
    private String giveAddress;

    /**
     * 订单总金额
     */
    private BigDecimal totalCost;

    /**
     * 未付款金额
     */
    private BigDecimal unpaidCost;

    /**
     * 付款方式：1钱包 2支付宝 3微信 4钱包+支付宝 5钱包+微信
     */
    private Integer payType;

    /**
     * 
     */
    private String userPhone;

    /**
     * 行程时长（单位：分钟）
     */
    private Integer travelTime;

    /**
     * 行程距离
     */
    private Long travelDistance;

    /**
     * 状态: 10-待付款；20-已付款 21-待补款 22-退票中(针对包车业务，暂时不使用)；60-已完成 61-已过期(行程结束但用户未乘坐，不能评论)；90-已取消（用户触发） 91-已作废(到时未付款)
     */
    private Integer status;

    /**
     * 接送类型 0无接送 1接 2送 3接送
     */
    private Integer relayType;

    /**
     * 自营标记
     */
    private Boolean isSelf;

    /**
     * 改签标记（改签后，可能会限制一些业务）
     */
    private Boolean isChanged;

    /**
     * 评价标记
     */
    private Boolean isEvaluated;

    /**
     * b_car_type表关联id
     */
    private Integer carTypeId;

    /**
     * 包车类型，b_chartered_car_model表id
     */
    private Integer charteredCarModelId;

    /**
     * 包车车品牌
     */
    private Integer charteredCarBrand;

    /**
     * 车辆类型
     */
    private String charteredCarModel;

    /**
     * 业务类型：1班线 2包车
     */
    private Integer businessType;

    /**
     * 第三方平台班次编码
     */
    private String otherPlatformPlanCode;

    /**
     * 第三方平台Id，对应b_other_platform表
     */
    private Integer otherPlatformId;

    /**
     * 
     */
    private String remark;

    /**
     * 是否开票: 0无 1申请中 2已开票
     */
    private Integer isInvoice;

    /**
     * 税务凭证
     */
    private String taxVoucher;

    /**
     * 开票时间
     */
    private Date taxTime;

    /**
     * 订单来源: 0-其它平台 1-IOS 2-安卓 3-小程序 4-PC
     */
    private Integer sourceType;

    /**
     * 
     */
    private Date createAt;

    /**
     * 
     */
    private String createBy;

    /**
     * 
     */
    private Date modifyAt;

    /**
     * 
     */
    private String modifyBy;

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
     * 流水号: LDD1801010000001(L订单+年<2位>月日+7位流水号)
     * @return code 流水号: LDD1801010000001(L订单+年<2位>月日+7位流水号)
     */
    public String getCode() {
        return code;
    }

    /**
     * 流水号: LDD1801010000001(L订单+年<2位>月日+7位流水号)
     * @param code 流水号: LDD1801010000001(L订单+年<2位>月日+7位流水号)
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
     * 包车业务无此表关联
     * @return plan_id 包车业务无此表关联
     */
    public Integer getPlanId() {
        return planId;
    }

    /**
     * 包车业务无此表关联
     * @param planId 包车业务无此表关联
     */
    public void setPlanId(Integer planId) {
        this.planId = planId;
    }

    /**
     * 
     * @return line_id 
     */
    public Integer getLineId() {
        return lineId;
    }

    /**
     * 
     * @param lineId 
     */
    public void setLineId(Integer lineId) {
        this.lineId = lineId;
    }

    /**
     * 
     * @return site_start_name 
     */
    public String getSiteStartName() {
        return siteStartName;
    }

    /**
     * 
     * @param siteStartName 
     */
    public void setSiteStartName(String siteStartName) {
        this.siteStartName = siteStartName;
    }

    /**
     * 
     * @return site_end_name 
     */
    public String getSiteEndName() {
        return siteEndName;
    }

    /**
     * 
     * @param siteEndName 
     */
    public void setSiteEndName(String siteEndName) {
        this.siteEndName = siteEndName;
    }

    /**
     * 调度：车次Id
     * @return scheduling_id 调度：车次Id
     */
    public Integer getSchedulingId() {
        return schedulingId;
    }

    /**
     * 调度：车次Id
     * @param schedulingId 调度：车次Id
     */
    public void setSchedulingId(Integer schedulingId) {
        this.schedulingId = schedulingId;
    }

    /**
     * 调度：车辆id
     * @return car_id 调度：车辆id
     */
    public Integer getCarId() {
        return carId;
    }

    /**
     * 调度：车辆id
     * @param carId 调度：车辆id
     */
    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    /**
     * 预计开车时间
     * @return start_time 预计开车时间
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 预计开车时间
     * @param startTime 预计开车时间
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 车票数量
     * @return ticket_number 车票数量
     */
    public Integer getTicketNumber() {
        return ticketNumber;
    }

    /**
     * 车票数量
     * @param ticketNumber 车票数量
     */
    public void setTicketNumber(Integer ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    /**
     * 单张票价
     * @return ticket_cost 单张票价
     */
    public BigDecimal getTicketCost() {
        return ticketCost;
    }

    /**
     * 单张票价
     * @param ticketCost 单张票价
     */
    public void setTicketCost(BigDecimal ticketCost) {
        this.ticketCost = ticketCost;
    }

    /**
     * 保险费总额
     * @return insurance_cost 保险费总额
     */
    public BigDecimal getInsuranceCost() {
        return insuranceCost;
    }

    /**
     * 保险费总额
     * @param insuranceCost 保险费总额
     */
    public void setInsuranceCost(BigDecimal insuranceCost) {
        this.insuranceCost = insuranceCost;
    }

    /**
     * 优惠券总金额
     * @return coupon_cost 优惠券总金额
     */
    public BigDecimal getCouponCost() {
        return couponCost;
    }

    /**
     * 优惠券总金额
     * @param couponCost 优惠券总金额
     */
    public void setCouponCost(BigDecimal couponCost) {
        this.couponCost = couponCost;
    }

    /**
     * 接车总费用
     * @return take_cost 接车总费用
     */
    public BigDecimal getTakeCost() {
        return takeCost;
    }

    /**
     * 接车总费用
     * @param takeCost 接车总费用
     */
    public void setTakeCost(BigDecimal takeCost) {
        this.takeCost = takeCost;
    }

    /**
     * 接车坐标
     * @return take_coordinate 接车坐标
     */
    public String getTakeCoordinate() {
        return takeCoordinate;
    }

    /**
     * 接车坐标
     * @param takeCoordinate 接车坐标
     */
    public void setTakeCoordinate(String takeCoordinate) {
        this.takeCoordinate = takeCoordinate;
    }

    /**
     * 接车详细地址
     * @return take_address 接车详细地址
     */
    public String getTakeAddress() {
        return takeAddress;
    }

    /**
     * 接车详细地址
     * @param takeAddress 接车详细地址
     */
    public void setTakeAddress(String takeAddress) {
        this.takeAddress = takeAddress;
    }

    /**
     * 送人总费用
     * @return give_cost 送人总费用
     */
    public BigDecimal getGiveCost() {
        return giveCost;
    }

    /**
     * 送人总费用
     * @param giveCost 送人总费用
     */
    public void setGiveCost(BigDecimal giveCost) {
        this.giveCost = giveCost;
    }

    /**
     * 送人坐标
     * @return give_coordinate 送人坐标
     */
    public String getGiveCoordinate() {
        return giveCoordinate;
    }

    /**
     * 送人坐标
     * @param giveCoordinate 送人坐标
     */
    public void setGiveCoordinate(String giveCoordinate) {
        this.giveCoordinate = giveCoordinate;
    }

    /**
     * 送人详细地址
     * @return give_address 送人详细地址
     */
    public String getGiveAddress() {
        return giveAddress;
    }

    /**
     * 送人详细地址
     * @param giveAddress 送人详细地址
     */
    public void setGiveAddress(String giveAddress) {
        this.giveAddress = giveAddress;
    }

    /**
     * 订单总金额
     * @return total_cost 订单总金额
     */
    public BigDecimal getTotalCost() {
        return totalCost;
    }

    /**
     * 订单总金额
     * @param totalCost 订单总金额
     */
    public void setTotalCost(BigDecimal totalCost) {
        this.totalCost = totalCost;
    }

    /**
     * 未付款金额
     * @return unpaid_cost 未付款金额
     */
    public BigDecimal getUnpaidCost() {
        return unpaidCost;
    }

    /**
     * 未付款金额
     * @param unpaidCost 未付款金额
     */
    public void setUnpaidCost(BigDecimal unpaidCost) {
        this.unpaidCost = unpaidCost;
    }

    /**
     * 付款方式：1钱包 2支付宝 3微信 4钱包+支付宝 5钱包+微信
     * @return pay_type 付款方式：1钱包 2支付宝 3微信 4钱包+支付宝 5钱包+微信
     */
    public Integer getPayType() {
        return payType;
    }

    /**
     * 付款方式：1钱包 2支付宝 3微信 4钱包+支付宝 5钱包+微信
     * @param payType 付款方式：1钱包 2支付宝 3微信 4钱包+支付宝 5钱包+微信
     */
    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    /**
     * 
     * @return user_phone 
     */
    public String getUserPhone() {
        return userPhone;
    }

    /**
     * 
     * @param userPhone 
     */
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    /**
     * 行程时长（单位：分钟）
     * @return travel_time 行程时长（单位：分钟）
     */
    public Integer getTravelTime() {
        return travelTime;
    }

    /**
     * 行程时长（单位：分钟）
     * @param travelTime 行程时长（单位：分钟）
     */
    public void setTravelTime(Integer travelTime) {
        this.travelTime = travelTime;
    }

    /**
     * 行程距离
     * @return travel_distance 行程距离
     */
    public Long getTravelDistance() {
        return travelDistance;
    }

    /**
     * 行程距离
     * @param travelDistance 行程距离
     */
    public void setTravelDistance(Long travelDistance) {
        this.travelDistance = travelDistance;
    }

    /**
     * 状态: 10-待付款；20-已付款 21-待补款 22-退票中(针对包车业务，暂时不使用)；60-已完成 61-已过期(行程结束但用户未乘坐，不能评论)；90-已取消（用户触发） 91-已作废(到时未付款)
     * @return status 状态: 10-待付款；20-已付款 21-待补款 22-退票中(针对包车业务，暂时不使用)；60-已完成 61-已过期(行程结束但用户未乘坐，不能评论)；90-已取消（用户触发） 91-已作废(到时未付款)
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 状态: 10-待付款；20-已付款 21-待补款 22-退票中(针对包车业务，暂时不使用)；60-已完成 61-已过期(行程结束但用户未乘坐，不能评论)；90-已取消（用户触发） 91-已作废(到时未付款)
     * @param status 状态: 10-待付款；20-已付款 21-待补款 22-退票中(针对包车业务，暂时不使用)；60-已完成 61-已过期(行程结束但用户未乘坐，不能评论)；90-已取消（用户触发） 91-已作废(到时未付款)
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 接送类型 0无接送 1接 2送 3接送
     * @return relay_type 接送类型 0无接送 1接 2送 3接送
     */
    public Integer getRelayType() {
        return relayType;
    }

    /**
     * 接送类型 0无接送 1接 2送 3接送
     * @param relayType 接送类型 0无接送 1接 2送 3接送
     */
    public void setRelayType(Integer relayType) {
        this.relayType = relayType;
    }

    /**
     * 自营标记
     * @return is_self 自营标记
     */
    public Boolean getIsSelf() {
        return isSelf;
    }

    /**
     * 自营标记
     * @param isSelf 自营标记
     */
    public void setIsSelf(Boolean isSelf) {
        this.isSelf = isSelf;
    }

    /**
     * 改签标记（改签后，可能会限制一些业务）
     * @return is_changed 改签标记（改签后，可能会限制一些业务）
     */
    public Boolean getIsChanged() {
        return isChanged;
    }

    /**
     * 改签标记（改签后，可能会限制一些业务）
     * @param isChanged 改签标记（改签后，可能会限制一些业务）
     */
    public void setIsChanged(Boolean isChanged) {
        this.isChanged = isChanged;
    }

    /**
     * 评价标记
     * @return is_evaluated 评价标记
     */
    public Boolean getIsEvaluated() {
        return isEvaluated;
    }

    /**
     * 评价标记
     * @param isEvaluated 评价标记
     */
    public void setIsEvaluated(Boolean isEvaluated) {
        this.isEvaluated = isEvaluated;
    }

    /**
     * b_car_type表关联id
     * @return car_type_id b_car_type表关联id
     */
    public Integer getCarTypeId() {
        return carTypeId;
    }

    /**
     * b_car_type表关联id
     * @param carTypeId b_car_type表关联id
     */
    public void setCarTypeId(Integer carTypeId) {
        this.carTypeId = carTypeId;
    }

    /**
     * 包车类型，b_chartered_car_model表id
     * @return chartered_car_model_id 包车类型，b_chartered_car_model表id
     */
    public Integer getCharteredCarModelId() {
        return charteredCarModelId;
    }

    /**
     * 包车类型，b_chartered_car_model表id
     * @param charteredCarModelId 包车类型，b_chartered_car_model表id
     */
    public void setCharteredCarModelId(Integer charteredCarModelId) {
        this.charteredCarModelId = charteredCarModelId;
    }

    /**
     * 包车车品牌
     * @return chartered_car_brand 包车车品牌
     */
    public Integer getCharteredCarBrand() {
        return charteredCarBrand;
    }

    /**
     * 包车车品牌
     * @param charteredCarBrand 包车车品牌
     */
    public void setCharteredCarBrand(Integer charteredCarBrand) {
        this.charteredCarBrand = charteredCarBrand;
    }

    /**
     * 车辆类型
     * @return chartered_car_model 车辆类型
     */
    public String getCharteredCarModel() {
        return charteredCarModel;
    }

    /**
     * 车辆类型
     * @param charteredCarModel 车辆类型
     */
    public void setCharteredCarModel(String charteredCarModel) {
        this.charteredCarModel = charteredCarModel;
    }

    /**
     * 业务类型：1班线 2包车
     * @return business_type 业务类型：1班线 2包车
     */
    public Integer getBusinessType() {
        return businessType;
    }

    /**
     * 业务类型：1班线 2包车
     * @param businessType 业务类型：1班线 2包车
     */
    public void setBusinessType(Integer businessType) {
        this.businessType = businessType;
    }

    /**
     * 第三方平台班次编码
     * @return other_platform_plan_code 第三方平台班次编码
     */
    public String getOtherPlatformPlanCode() {
        return otherPlatformPlanCode;
    }

    /**
     * 第三方平台班次编码
     * @param otherPlatformPlanCode 第三方平台班次编码
     */
    public void setOtherPlatformPlanCode(String otherPlatformPlanCode) {
        this.otherPlatformPlanCode = otherPlatformPlanCode;
    }

    /**
     * 第三方平台Id，对应b_other_platform表
     * @return other_platform_id 第三方平台Id，对应b_other_platform表
     */
    public Integer getOtherPlatformId() {
        return otherPlatformId;
    }

    /**
     * 第三方平台Id，对应b_other_platform表
     * @param otherPlatformId 第三方平台Id，对应b_other_platform表
     */
    public void setOtherPlatformId(Integer otherPlatformId) {
        this.otherPlatformId = otherPlatformId;
    }

    /**
     * 
     * @return remark 
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 
     * @param remark 
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 是否开票: 0无 1申请中 2已开票
     * @return is_invoice 是否开票: 0无 1申请中 2已开票
     */
    public Integer getIsInvoice() {
        return isInvoice;
    }

    /**
     * 是否开票: 0无 1申请中 2已开票
     * @param isInvoice 是否开票: 0无 1申请中 2已开票
     */
    public void setIsInvoice(Integer isInvoice) {
        this.isInvoice = isInvoice;
    }

    /**
     * 税务凭证
     * @return tax_voucher 税务凭证
     */
    public String getTaxVoucher() {
        return taxVoucher;
    }

    /**
     * 税务凭证
     * @param taxVoucher 税务凭证
     */
    public void setTaxVoucher(String taxVoucher) {
        this.taxVoucher = taxVoucher;
    }

    /**
     * 开票时间
     * @return tax_time 开票时间
     */
    public Date getTaxTime() {
        return taxTime;
    }

    /**
     * 开票时间
     * @param taxTime 开票时间
     */
    public void setTaxTime(Date taxTime) {
        this.taxTime = taxTime;
    }

    /**
     * 订单来源: 0-其它平台 1-IOS 2-安卓 3-小程序 4-PC
     * @return source_type 订单来源: 0-其它平台 1-IOS 2-安卓 3-小程序 4-PC
     */
    public Integer getSourceType() {
        return sourceType;
    }

    /**
     * 订单来源: 0-其它平台 1-IOS 2-安卓 3-小程序 4-PC
     * @param sourceType 订单来源: 0-其它平台 1-IOS 2-安卓 3-小程序 4-PC
     */
    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
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
     * @return create_by 
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * 
     * @param createBy 
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
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

    /**
     * 
     * @return modify_by 
     */
    public String getModifyBy() {
        return modifyBy;
    }

    /**
     * 
     * @param modifyBy 
     */
    public void setModifyBy(String modifyBy) {
        this.modifyBy = modifyBy;
    }
}