package com.zacx.serivce.user.api.dto;


import com.zacx.core.model.api.BaseDTO;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
* @desc    用户优惠券
* @version 1.0
* @author  Liang Jun
* @date    2018年10月05日 09:49:02
**/
@Data
public class UserCouponDTO extends BaseDTO {
    //主键ID
    private Integer id;
    //用户ID
    private Integer userId;
    //优惠券ID
    private Integer couponId;
    //优惠券名称
    private String couponName;
    //优惠券金额
    private BigDecimal couponMoney;
    //开始时间
    private Date getTime;
    //过期时间
    private Date expiryTime;
    //使用订单ID
    private Integer useOrderId;
    //状态：0失效 1未使用 2已使用
    private Integer status;
}