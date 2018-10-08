package com.zacx.gateway.passenger.dto.user;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
* @desc    提现申请
* @version 1.0
* @author  Liang Jun
* @date    2018年10月06日 12:05:39
**/
@ApiModel(description = "申请提现")
@Data
public class ApplyCashWithdrawEnter {
    @ApiModelProperty(value = "用户ID", required = true)
    private Integer userId;
    @ApiModelProperty(value = "提现金额", required = true)
    private Double money;
    @ApiModelProperty(value = "目的账号ID", required = true)
    private Integer toAccountId;
}