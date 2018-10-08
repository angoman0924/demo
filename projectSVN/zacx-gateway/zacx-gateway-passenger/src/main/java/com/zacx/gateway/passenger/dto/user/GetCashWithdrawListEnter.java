package com.zacx.gateway.passenger.dto.user;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
* @desc    查询提现记录
* @version 1.0
* @author  Liang Jun
* @date    2018年10月06日 14:31:25
**/
@ApiModel(description = "查询提现申请记录")
@Data
public class GetCashWithdrawListEnter {
    @ApiModelProperty(value = "用户ID", required = true)
    private Integer userId;
}