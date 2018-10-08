package com.zacx.gateway.passenger.dto.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * 个人银行卡返回结果
 * Created by liusi on 2018/10/7.
 */
@Data
@ApiModel(value = "BankAccountResult",description = "个人银行卡返回结果")
public class BankAccountResult {
    /**
     *个人银行卡编号
     */
    @ApiModelProperty("个人银行卡编号")
    private Integer id;

    /**
     *用户编号
     */
    @ApiModelProperty("用户编号")
    private Integer userId;

    /**
     * 账号类型：1银行卡 2支付宝 3微信 4用户钱包
     */
    @ApiModelProperty("账号类型：1银行卡 2支付宝 3微信 4用户钱包")
    private Integer type;

    /**
     * 账号号码
     */
    @ApiModelProperty("账号号码")
    private String code;

    /**
     *所属银行卡编号
     */
    @ApiModelProperty("所属银行卡编号")
    private Integer bankId;

    /**
     * 银行名称
     */
    @ApiModelProperty("银行名称")
    private String bankName;

    /**
     * 持卡人姓名
     */
    @ApiModelProperty("持卡人姓名")
    private String userName;

    /**
     * 账号绑定手机号
     */
    @ApiModelProperty("账号绑定手机号")
    private String userPhone;

    /**
     * 身份证
     */
    @ApiModelProperty("身份证")
    private String userCardNo;

    /**
     * 最大提现额度
     */
    @ApiModelProperty("最大提现额度")
    private Integer withdrawCashMax;

    /**
     *创建时间
     */
    @ApiModelProperty("创建时间")
    private Date createAt;
}
