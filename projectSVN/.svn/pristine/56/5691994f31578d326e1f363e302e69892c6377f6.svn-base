package com.zacx.serivce.mall.api.dto;

import com.zacx.core.model.api.BaseDTO;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by song on 2018/10/7.
 */
@Data
public class GoodOrderOperateLogDTO extends BaseDTO {
    private static final long serialVersionUID = 8614889736361938567L;
    private Integer id;

    /**
     *
     */
    private Integer orderId;

    /**
     * 日志内容
     */
    private String log;

    /**
     * 操作前的订单状态
     */
    private Integer orderStatusOld;

    /**
     * 操作后的订单状态
     */
    private Integer orderStatusNew;

    /**
     * 操作后的订单总额
     */
    private BigDecimal totalIntegral;

    /**
     * 扩展信息
     */
    private String extendInfo;

    /**
     * 操作平台: 1app 2运营
     */
    private Integer operatePlatform;

    /**
     * 操作用户id
     */
    private Integer operateUserId;

    /**
     *
     */
    private String operateUseName;

    /**
     * 操作备注
     */
    private String operateRemark;

    /**
     *
     */
    private Date createAt;
}
