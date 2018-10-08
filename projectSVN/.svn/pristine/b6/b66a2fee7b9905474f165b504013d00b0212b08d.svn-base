package com.zacx.gateway.passenger.dto.order;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @description: 包车预算：包车排班是支付后自动生成，没有线路数据lineID关联；schedulingId调度是排班后统一更新
 *
 * @author: kiting
 * @date: 2018年10月3日 19:25
 * @version: 1.0
 * @copyright: 上海拜米网络科技有限公司
 **/
@Data
@ApiModel(value = "AddCharteredOrderPriceEnter", description = "预算包车订单价格")
public class AddCharteredOrderPriceEnter {

    @ApiModelProperty(value = "接车时间", dataType = "Date")
    private Date startTime;

    @ApiModelProperty(value = "乘坐人数", dataType = "Integer")
    private Integer ticketNumber;

    //定义计价规则
    @ApiModelProperty(value = "车的品牌", dataType = "Integer", required = true)
    private Integer charteredCarBrand;

    @ApiModelProperty(value = "行程距离（米）", dataType = "BigDecimal",example = "2000", required = true)
    private BigDecimal travelDistance;
    //接送信息，接送类型可定义为3，计算距离（价格相关）；数据库存经纬度（经度,纬度）
    @ApiModelProperty(value = "接车坐标经度", dataType = "BigDecimal",example = "121.29186", required = true)
    private BigDecimal takeLng;
    @ApiModelProperty(value = "接车坐标纬度", dataType = "BigDecimal",example = "31.20759", required = true)
    private BigDecimal takeLat;
    @ApiModelProperty(value = "接车详细地址", dataType = "String")
    private String takeAddress;
    @ApiModelProperty(value = "送人坐标经度", dataType = "BigDecimal",example = "121.29186", required = true)
    private BigDecimal giveLng;
    @ApiModelProperty(value = "送人坐标纬度", dataType = "BigDecimal",example = "31.20759", required = true)
    private BigDecimal giveLat;
    @ApiModelProperty(value = "'送人详细地址", dataType = "String")
    private String giveAddress;

}
