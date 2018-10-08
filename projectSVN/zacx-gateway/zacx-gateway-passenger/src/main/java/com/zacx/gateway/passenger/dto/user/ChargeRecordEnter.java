package com.zacx.gateway.passenger.dto.user;


import com.zacx.gateway.base.base.Page;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
* @desc    充值记录
* @version 1.0
* @author  Liang Jun
* @date    2018年10月07日 10:29:23
**/
@ApiModel
@Data
public class ChargeRecordEnter extends Page {
    @ApiModelProperty(value = "用户ID", required = true)
    private Integer userId;
}