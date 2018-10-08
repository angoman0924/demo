package com.zacx.serivce.line.api.dto;

import com.zacx.core.model.api.BaseDTO;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 班次DTO
 * Created by song on 2018/10/3.
 */
@Data
public class PlanDTO extends BaseDTO {
    private static final long serialVersionUID = -685651324943942775L;

    private Integer id;

    /**
     * 流水号: LBC18010100001(L班次+年<2位>月日+5位流水号)
     */
    private String code;

    /**
     * 预计发车时间
     */
    private Date startTime;

    /**
     * 预计到站时间
     */
    private Date endTime;

    /**
     * 线路Id
     */
    private Integer lineId;

    /**
     * 是否支持接送：1支持 0不支持
     */
    private Boolean isRelay;

    /**
     * 票价
     */
    private BigDecimal ticketPrice;

    /**
     * 已售票数
     */
    private Integer saleNumber;

    /**
     * 班次类型：1正常 2加班
     */
    private Integer shiftType;

    /**
     * 车辆类型，b_car_type表Id: 1-7座商务  2-大巴
     */
    private Integer carTypeId;

    /**
     * 包车类型，b_chartered_car_model表id
     */
    private Integer charteredCarModelId;

    /**
     * 业务类型：1班线 2包车
     */
    private Integer businessType;

    /**
     * 排班状态：0未排班 1部分排班 2已排班
     */
    private Integer schedulingStatus;

    /**
     * 销售状态
     */
    private Integer saleStatus;

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


    private LineDTO lineDTO;
}
