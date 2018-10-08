package com.zacx.gateway.passenger.dto.user;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
* @desc    登录结果
* @version 1.0
* @author  Liang Jun
* @date    2018年10月06日 22:14:19
**/
@ApiModel
@Data
public class LoginResult {
    @ApiModelProperty(value = "用户ID")
    private Integer id;
    @ApiModelProperty(value = "用户角色IDs")
    private String roleIds;
    @ApiModelProperty(value = "用户昵称")
    private String nickName;
    @ApiModelProperty(value = "注册城市")
    private Integer cityId;
    @ApiModelProperty(value = "注册坐标")
    private String coordinate;
    @ApiModelProperty(value = "我的钱包")
    private BigDecimal wallet;
    @ApiModelProperty(value = "积分")
    private Integer integral;
    @ApiModelProperty(value = "头像")
    private String headPortrait;
    @ApiModelProperty(value = "邀请人ID")
    private String inviteUserId;
    @ApiModelProperty(value = "详细地址")
    private String address;
    @ApiModelProperty(value = "状态: 1正常 0锁定")
    private Integer status;
    @ApiModelProperty(value = "备注")
    private String remark;
    @ApiModelProperty(value = "前端TOKEN")
    private String token;
}