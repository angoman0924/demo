/*
*
* LPlanTemplate.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.entity;

import java.util.Date;

public class LPlanTemplate {
    /**
     * 
     */
    private Integer id;

    /**
     * 模板名称
     */
    private String name;

    /**
     * 预计发车时间
     */
    private Date startTime;

    /**
     * 预计到站时间
     */
    private Date endTime;

    /**
     * 线路Id
     */
    private Integer lineId;

    /**
     * 是否支持接送：1支持 0不支持
     */
    private Boolean isRelay;

    /**
     * 票价
     */
    private Long ticketPrice;

    /**
     * 班次类型：1正常 2加班
     */
    private Integer shiftType;

    /**
     * 车辆类型Id
     */
    private Integer carTypeId;

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
     * 模板名称
     * @return name 模板名称
     */
    public String getName() {
        return name;
    }

    /**
     * 模板名称
     * @param name 模板名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 预计发车时间
     * @return start_time 预计发车时间
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 预计发车时间
     * @param startTime 预计发车时间
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 预计到站时间
     * @return end_time 预计到站时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 预计到站时间
     * @param endTime 预计到站时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 线路Id
     * @return line_id 线路Id
     */
    public Integer getLineId() {
        return lineId;
    }

    /**
     * 线路Id
     * @param lineId 线路Id
     */
    public void setLineId(Integer lineId) {
        this.lineId = lineId;
    }

    /**
     * 是否支持接送：1支持 0不支持
     * @return is_relay 是否支持接送：1支持 0不支持
     */
    public Boolean getIsRelay() {
        return isRelay;
    }

    /**
     * 是否支持接送：1支持 0不支持
     * @param isRelay 是否支持接送：1支持 0不支持
     */
    public void setIsRelay(Boolean isRelay) {
        this.isRelay = isRelay;
    }

    /**
     * 票价
     * @return ticket_price 票价
     */
    public Long getTicketPrice() {
        return ticketPrice;
    }

    /**
     * 票价
     * @param ticketPrice 票价
     */
    public void setTicketPrice(Long ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    /**
     * 班次类型：1正常 2加班
     * @return shift_type 班次类型：1正常 2加班
     */
    public Integer getShiftType() {
        return shiftType;
    }

    /**
     * 班次类型：1正常 2加班
     * @param shiftType 班次类型：1正常 2加班
     */
    public void setShiftType(Integer shiftType) {
        this.shiftType = shiftType;
    }

    /**
     * 车辆类型Id
     * @return car_type_id 车辆类型Id
     */
    public Integer getCarTypeId() {
        return carTypeId;
    }

    /**
     * 车辆类型Id
     * @param carTypeId 车辆类型Id
     */
    public void setCarTypeId(Integer carTypeId) {
        this.carTypeId = carTypeId;
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