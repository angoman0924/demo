package com.zacx.gateway.passenger.dto.user;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
* @desc    实名认证
* @version 1.0
* @author  Liang Jun
* @date    2018年10月04日 11:28:39
**/
@ApiModel(value = "RealNameEnter", description = "实名认证参数")
@Data
public class RealNameEnter {
    @ApiModelProperty(value = "用户ID", dataType = "int", required = true)
    private Integer userId;
    @ApiModelProperty(value = "证件类型: 1身份证 2驾驶证 3军官证 4护照 5其他", dataType = "string", required = true)
    private Integer cardType;
    @ApiModelProperty(value = "证件姓名", dataType = "string", required = true)
    private String cardName;
    @ApiModelProperty(value = "证件号码", dataType = "string", required = true)
    private String cardNo;
}