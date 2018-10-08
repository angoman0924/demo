package com.zacx.serivce.basic.api.dto;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class CharteredCarModelDTO implements Serializable {
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

}
