package com.zacx.gateway.passenger.dto.user;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
* @desc    查询提现申请记录
* @version 1.0
* @author  Liang Jun
* @date    2018年10月06日 14:32:48
**/
@Data
@ApiModel
public class GetCashWithdrawListResult {
    @ApiModelProperty(value = "金额")
    private Double money;
    @ApiModelProperty(value = "申请时间")
    private Date applyTime;
    @ApiModelProperty(value = "提现至账户ID")
    private Integer toBankAccountId;
    @ApiModelProperty(value = "提现至账户描述")
    private Integer toBankAccountDesc;
    @ApiModelProperty(value = "状态：0申请中 1已完成 2失败 3驳回 4作废")
    private Integer status;
}