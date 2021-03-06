/*
*
* LScheduling.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.entity;

import java.util.Date;

public class LScheduling {
    /**
     * 
     */
    private Integer id;

    /**
     * 流水号: LCC18010100001(L车次+年<2位>月日+5位流水号)
     */
    private String code;

    /**
     * 
     */
    private Date startTime;

    /**
     * 
     */
    private Date endTime;

    /**
     * 车辆班次Id
     */
    private Integer planId;

    /**
     * 车辆Id
     */
    private Integer carId;

    /**
     * 司机id
     */
    private Integer driverId;

    /**
     * 乘客数量
     */
    private Integer passengerNumber;

    /**
     * 签到时间
     */
    private Date signTime;

    /**
     * 行程结束时间
     */
    private Date tripEndTime;

    /**
     * 司机签到标记
     */
    private Boolean isSign;

    /**
     * 自营标记
     */
    private Boolean isSelf;

    /**
     * 加班标记
     */
    private Boolean isWorkOvertime;

    /**
     * 结算金额
     */
    private Long settleMoney;

    /**
     * 状态: 1待签到 2调班申请中 3已调班完成(完成后，此车次将会取消) 4已签到 5已结束行程 6已结算 7作废
     */
    private Integer status;

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
     * 流水号: LCC18010100001(L车次+年<2位>月日+5位流水号)
     * @return code 流水号: LCC18010100001(L车次+年<2位>月日+5位流水号)
     */
    public String getCode() {
        return code;
    }

    /**
     * 流水号: LCC18010100001(L车次+年<2位>月日+5位流水号)
     * @param code 流水号: LCC18010100001(L车次+年<2位>月日+5位流水号)
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 
     * @return start_time 
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 
     * @param startTime 
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 
     * @return end_time 
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 
     * @param endTime 
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 车辆班次Id
     * @return plan_id 车辆班次Id
     */
    public Integer getPlanId() {
        return planId;
    }

    /**
     * 车辆班次Id
     * @param planId 车辆班次Id
     */
    public void setPlanId(Integer planId) {
        this.planId = planId;
    }

    /**
     * 车辆Id
     * @return car_id 车辆Id
     */
    public Integer getCarId() {
        return carId;
    }

    /**
     * 车辆Id
     * @param carId 车辆Id
     */
    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    /**
     * 司机id
     * @return driver_id 司机id
     */
    public Integer getDriverId() {
        return driverId;
    }

    /**
     * 司机id
     * @param driverId 司机id
     */
    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }

    /**
     * 乘客数量
     * @return passenger_number 乘客数量
     */
    public Integer getPassengerNumber() {
        return passengerNumber;
    }

    /**
     * 乘客数量
     * @param passengerNumber 乘客数量
     */
    public void setPassengerNumber(Integer passengerNumber) {
        this.passengerNumber = passengerNumber;
    }

    /**
     * 签到时间
     * @return sign_time 签到时间
     */
    public Date getSignTime() {
        return signTime;
    }

    /**
     * 签到时间
     * @param signTime 签到时间
     */
    public void setSignTime(Date signTime) {
        this.signTime = signTime;
    }

    /**
     * 行程结束时间
     * @return trip_end_time 行程结束时间
     */
    public Date getTripEndTime() {
        return tripEndTime;
    }

    /**
     * 行程结束时间
     * @param tripEndTime 行程结束时间
     */
    public void setTripEndTime(Date tripEndTime) {
        this.tripEndTime = tripEndTime;
    }

    /**
     * 司机签到标记
     * @return is_sign 司机签到标记
     */
    public Boolean getIsSign() {
        return isSign;
    }

    /**
     * 司机签到标记
     * @param isSign 司机签到标记
     */
    public void setIsSign(Boolean isSign) {
        this.isSign = isSign;
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
     * 加班标记
     * @return is_work_overtime 加班标记
     */
    public Boolean getIsWorkOvertime() {
        return isWorkOvertime;
    }

    /**
     * 加班标记
     * @param isWorkOvertime 加班标记
     */
    public void setIsWorkOvertime(Boolean isWorkOvertime) {
        this.isWorkOvertime = isWorkOvertime;
    }

    /**
     * 结算金额
     * @return settle_money 结算金额
     */
    public Long getSettleMoney() {
        return settleMoney;
    }

    /**
     * 结算金额
     * @param settleMoney 结算金额
     */
    public void setSettleMoney(Long settleMoney) {
        this.settleMoney = settleMoney;
    }

    /**
     * 状态: 1待签到 2调班申请中 3已调班完成(完成后，此车次将会取消) 4已签到 5已结束行程 6已结算 7作废
     * @return status 状态: 1待签到 2调班申请中 3已调班完成(完成后，此车次将会取消) 4已签到 5已结束行程 6已结算 7作废
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 状态: 1待签到 2调班申请中 3已调班完成(完成后，此车次将会取消) 4已签到 5已结束行程 6已结算 7作废
     * @param status 状态: 1待签到 2调班申请中 3已调班完成(完成后，此车次将会取消) 4已签到 5已结束行程 6已结算 7作废
     */
    public void setStatus(Integer status) {
        this.status = status;
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