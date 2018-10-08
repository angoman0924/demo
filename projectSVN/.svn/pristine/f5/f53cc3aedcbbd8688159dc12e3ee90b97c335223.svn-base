package com.zacx.serivce.user.api.dto;


import com.zacx.core.model.api.BaseDTO;
import lombok.Data;

import java.util.Date;

/**
* @desc    用户账户流水
* @version 1.0
* @author  Liang Jun
* @date    2018年10月07日 11:59:20
**/
@Data
public class UserBankWaterBillsDTO extends BaseDTO {
    /**
     *
     */
    private Integer id;

    /**
     * 流水号: 1801010000001(年<2位>月日+5位流水号)
     */
    private String code;

    /**
     * 描述
     */
    private String describe;

    /**
     *
     */
    private Integer userId;

    /**
     * 本次流水的用户类型: 1用户 2车主
     */
    private Integer userType;

    /**
     * 银行账号Id
     */
    private Integer bankAccountId;

    /**
     * 银行账号
     */
    private String bankAccountCode;

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