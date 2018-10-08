package com.zacx.gateway.driver.dto.user;


import com.zacx.core.enums.SourceEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
* @desc    用户登陆
* @version 1.0
* @author  Liang Jun
* @date    2018年10月05日 10:50:42
**/
@Data
@ApiModel(value = "LoginInfo", description = "登陆请求类")
public class LoginEnter {
    @ApiModelProperty("手机号码")
    private String mobile;
    @ApiModelProperty(value = "验证码",example = "9090")
    private String verificationCode;
    @ApiModelProperty(value = "来源",example = "PC")
    private SourceEnum source;
    @ApiModelProperty(value = "手机纬度",example = "31.20759")
    private Double lat;
    @ApiModelProperty(value = "手机经度",example = "121.29186")
    private Double lng;
}