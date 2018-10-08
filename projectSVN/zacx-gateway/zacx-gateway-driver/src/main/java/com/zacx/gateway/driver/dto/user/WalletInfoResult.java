package com.zacx.gateway.driver.dto.user;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
* @desc    用户钱包信息
* @version 1.0
* @author  Liang Jun
* @date    2018年10月07日 18:07:55
**/
@ApiModel
@Data
public class WalletInfoResult {
    @ApiModelProperty(value = "用户ID")
    private Integer userId;
    @ApiModelProperty(value = "余额")
    private BigDecimal balance;
    @ApiModelProperty(value = "本月收益")
    private BigDecimal lastIncome;
    @ApiModelProperty(value = "累计收益")
    private BigDecimal totalIncome;
}