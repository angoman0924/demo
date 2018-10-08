package com.zacx.serivce.order.api.dto;


import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @description: 订单金额相关操作的基础结果数据
 * @author: kiting
 * @date: 2018年10月04日 13:47
 * @version: 1.0
 * @copyright: 上海拜米网络科技有限公司
 **/
@Data
public class PayPriceDTO implements Serializable {

    //订单编号
    private String orderCode;

    //排班ID（包车没有此信息）
    private Integer planId;

    //班车使用排版地点；包车使用接送地点
    //开始地点
    private String startPlace;
    //结束地点
    private String endPlace;
    //车辆信息
    private OrderCarDTO carInfo;
    //司机信息
    private String driverDesc;

    //出发时间
    private Date startTime;

    //创建时间
    private Date createAt;
    //最后支付到期时间 ，待支付状态的订单需要
    private Date expiryTime;


    //订单金额
    private BigDecimal totalCost;

    //待支付金额
    private BigDecimal unpaidCost;

    //公式：paidCost = totalCost - unpaidCost
    //已付金额
    private BigDecimal paidCost;

    //服务手续费用：接和送总费用
    private BigDecimal serviceCost;

    //保险费用
    private BigDecimal insuranceCost;

    //积分点数
    private Integer giveIntegralPoint;


    //退还场景：
    //退还金额
    private BigDecimal returnCost;

    //违约费用
    private BigDecimal breakCost;


    //支付场景：
    //钱包余额
    private BigDecimal myWallet;

    //积分余额
    private Integer myIntegral;

}
