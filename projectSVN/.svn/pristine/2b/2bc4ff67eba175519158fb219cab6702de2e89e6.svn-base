package com.zacx.gateway.passenger.dto.user;

import com.zacx.core.enums.PlatformEnum;
import com.zacx.gateway.base.base.ClientInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by liusi on 2018/9/29.
 */
@Data
@ApiModel(value = "UserRegisterInfo", description = "注册请求类")
public class UserRegisterEnter {

    //版本 来源 经纬度
    @ApiModelProperty("手机号码通用请求参数")
    ClientInfo clientInfo;

    @ApiModelProperty("手机号码")
    private String mobile;

    @ApiModelProperty(value = "验证码",example = "9090")
    private String verificationCode;

    @ApiModelProperty("手机平台")
    private PlatformEnum platform;

    //用于获取用户基本信息
//    @ApiModelProperty("用户详情")
//    private UserDetailEntity userDetailEntity;

}
