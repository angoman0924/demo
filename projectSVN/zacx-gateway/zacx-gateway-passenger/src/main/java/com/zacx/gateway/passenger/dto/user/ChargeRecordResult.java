package com.zacx.gateway.passenger.dto.user;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
* @desc    充值记录
* @version 1.0
* @author  Liang Jun
* @date    2018年10月07日 11:18:31
**/
@ApiModel
@Data
public class ChargeRecordResult {
    @ApiModelProperty(value = "主键")
    private Integer id;
    @ApiModelProperty(value = "单号")
    private String code;
    @ApiModelProperty(value = "账号名称")
    private String bankAccountName;

    /**
     * 发生金额
     */
    private Long money;

    /**
     * 账号余额: 只针对用户钱包账号
     */
    private Long accountBalance;

    /**
     * 出入类型：0出1入
     */
    private Integer exitEntryType;

    /**
     * 业务类型：10充值 11平台充值 12退款 20提现 21消费
     */
    private Integer businessType;

    /**
     * 关联Id（business_type=退款/消费 时关联order_id, business_type=平台充值，关联scheduling_id）
     */
    private Integer relationId;

    /**
     * 状态：0无效 1有效
     */
    private Integer status;

    /**
     *
     */
    private String remark;

    /**
     *
     */
    private Date createAt;

    /**
     *
     */
    private String createBy;

    /**
     *
     */
    private Date modifyAt;

    /**
     *
     */
    private String modifyBy;
}