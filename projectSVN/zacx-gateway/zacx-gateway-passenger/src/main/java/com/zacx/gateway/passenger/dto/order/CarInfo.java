package com.zacx.gateway.passenger.dto.order;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @description: 车辆信息（brand+model+/color+/licensePlate（如：别克GLB/灰色/沪123456））
 * @author: kiting
 * @date: 2018年10月04日 17:30
 * @version: 1.0
 * @copyright: 上海拜米网络科技有限公司
 **/
@Data
@ApiModel(value = "CarInfo", description = "车辆信息")
public class CarInfo {

    @ApiModelProperty(value = "车辆ID", dataType = "Integer")
    private Integer carId;

    @ApiModelProperty(value = "车牌", dataType = "String")
    private String licensePlate;

    @ApiModelProperty(value = "品牌", dataType = "String")
    private String brand;

    @ApiModelProperty(value = "型号", dataType = "String")
    private String model;

    @ApiModelProperty(value = "颜色", dataType = "String")
    private String color;

    @ApiModelProperty(value = "座位", dataType = "Integer")
    private Integer seatNumber;

    //运营类型: 1自营 2加盟
    @ApiModelProperty(value = "运营类型", dataType = "Integer")
    private Integer operationType;

}
