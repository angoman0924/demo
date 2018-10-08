package com.zacx.gateway.driver.dto.lines;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by song on 2018/10/6.
 */
@Data
@ApiModel(value = "TicketInfoResult", description = "乘客信息")
public class TicketInfoResult {
    @ApiModelProperty("票ID")
    private Integer id;
    @ApiModelProperty("票编号")
    private String code;
    @ApiModelProperty("票价")
    private BigDecimal ticketPrice;
    @ApiModelProperty("保险金额")
    private BigDecimal insurancePrice;
    @ApiModelProperty("签到时间")
    private Date signDate;
    @ApiModelProperty("乘客性名")
    private String passengerName;
    @ApiModelProperty("证件类型")
    private Integer cardType;
    @ApiModelProperty("证件号码")
    private String passengerCardno;
    @ApiModelProperty("联系电话")
    private String passengerPhone;
    @ApiModelProperty("票状态")
    private Integer status;
    @ApiModelProperty("座位号")
    private String seatNumber;
}
