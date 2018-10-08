package com.zacx.gateway.passenger.dto.order;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @description: 包车下单：包车排班是支付后自动生成，没有线路数据lineID关联；schedulingId调度是排班后统一更新
 *
 * @author: kiting
 * @date: 2018年10月3日 19:25
 * @version: 1.0
 * @copyright: 上海拜米网络科技有限公司
 **/
@Data
@ApiModel(value = "AddCharteredOrderEnter", description = "包车下单")
public class AddCharteredOrderEnter extends AddCharteredOrderPriceEnter {

}
