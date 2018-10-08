package com.zacx.serivce.user.api.dto;

import com.zacx.core.model.api.BaseDTO;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户积分DTO
 * Created by song on 2018/10/7.
 */
@Data
public class UserIntegralDTO extends BaseDTO {
    private static final long serialVersionUID = 3961566433589926519L;
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
     * 发生积分
     */
    private Long number;

    /**
     * 积分余额
     */
    private Long accountBalance;

    /**
     * 出入类型：0出 1入
     */
    private Integer exitEntryType;

    /**
     * 业务类型：10系统充值 11运营充值 12退还 20扣除 21消费
     */
    private Integer busType;

    /**
     * 关联Id（business_type=退款/消费 时关联order_id, business_type=平台充值，关联scheduling_id）
     */
    private Integer relationId;

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
