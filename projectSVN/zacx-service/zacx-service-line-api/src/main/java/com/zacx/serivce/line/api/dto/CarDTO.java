package com.zacx.serivce.line.api.dto;

import com.zacx.core.model.api.BaseDTO;
import lombok.Data;

import java.util.Date;

/**
 * 车辆DTO
 * Created by song on 2018/10/5.
 */
@Data
public class CarDTO extends BaseDTO {
    private static final long serialVersionUID = 7494922655435546847L;
    private Integer id;

    private Integer userId;

    private String licensePlate;

    private String brand;

    private String model;

    private String color;

    private Integer seatNumber;

    private Integer operationType;

    private Date creationDate;

    private Date joinDate;

    private Date createAt;

    private String createBy;

    private Date modifyAt;

    private String modifyBy;
}
