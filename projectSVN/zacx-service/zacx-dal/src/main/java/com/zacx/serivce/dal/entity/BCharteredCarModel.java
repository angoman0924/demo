/*
*
* BCharteredCarModel.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.entity;

import java.math.BigDecimal;

public class BCharteredCarModel {
    /**
     * 
     */
    private Integer id;

    /**
     * 车辆类型id
     */
    private Integer carTypeId;

    /**
     * 流水号: BBC00001(B包车+5位流水号)
     */
    private String code;

    /**
     * 
     */
    private String name;

    /**
     * 车辆品牌
     */
    private String carBrand;

    /**
     * 车辆类型: 1-7座商务  2-大巴
     */
    private String carModel;

    /**
     * 座位数
     */
    private Integer seatNumber;

    /**
     * 单价（每公里）
     */
    private BigDecimal unitPrice;

    /**
     * 
     */
    private String remark;

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
     * 车辆类型id
     * @return car_type_id 车辆类型id
     */
    public Integer getCarTypeId() {
        return carTypeId;
    }

    /**
     * 车辆类型id
     * @param carTypeId 车辆类型id
     */
    public void setCarTypeId(Integer carTypeId) {
        this.carTypeId = carTypeId;
    }

    /**
     * 流水号: BBC00001(B包车+5位流水号)
     * @return code 流水号: BBC00001(B包车+5位流水号)
     */
    public String getCode() {
        return code;
    }

    /**
     * 流水号: BBC00001(B包车+5位流水号)
     * @param code 流水号: BBC00001(B包车+5位流水号)
     */
    public void setCode(String code) {
        this.code = code;
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
     * 车辆品牌
     * @return car_brand 车辆品牌
     */
    public String getCarBrand() {
        return carBrand;
    }

    /**
     * 车辆品牌
     * @param carBrand 车辆品牌
     */
    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    /**
     * 车辆类型: 1-7座商务  2-大巴
     * @return car_model 车辆类型: 1-7座商务  2-大巴
     */
    public String getCarModel() {
        return carModel;
    }

    /**
     * 车辆类型: 1-7座商务  2-大巴
     * @param carModel 车辆类型: 1-7座商务  2-大巴
     */
    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    /**
     * 座位数
     * @return seat_number 座位数
     */
    public Integer getSeatNumber() {
        return seatNumber;
    }

    /**
     * 座位数
     * @param seatNumber 座位数
     */
    public void setSeatNumber(Integer seatNumber) {
        this.seatNumber = seatNumber;
    }

    /**
     * 单价（每公里）
     * @return unit_price 单价（每公里）
     */
    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    /**
     * 单价（每公里）
     * @param unitPrice 单价（每公里）
     */
    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
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
}