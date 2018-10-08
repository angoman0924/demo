package com.zacx.serivce.user.api.dto;


import lombok.Data;

import java.math.BigDecimal;

/**
* @desc    用户钱包信息
* @version 1.0
* @author  Liang Jun
* @date    2018年10月07日 15:32:49
**/
@Data
public class UserWalletInfoDTO {
    //用户ID
    private Integer userId;
    //用户类型(1:用户;2:司机)
    private Integer userType;
    //余额
    private BigDecimal balance;
    //本月收益
    private BigDecimal lastIncome;
    //累计收益
    private BigDecimal totalIncome;
}