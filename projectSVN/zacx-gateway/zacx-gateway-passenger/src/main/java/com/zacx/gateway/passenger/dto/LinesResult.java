package com.zacx.gateway.passenger.dto;

import com.zacx.serivce.dal.enums.CarTypeEnum;
import com.zacx.serivce.dal.enums.OperateModeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * 路线信息
 *
 * @author gulx
 * @version 1.0
 * @create 2018-09-27 14:28
 * @copyright 上海拜米网络科技有限公司
 **/
@Data
@Deprecated
@ApiModel(value = "LinesResult", description = "路线信息")
public class LinesResult  {

    @ApiModelProperty("路线班次的ID")
    private Integer lineScheduleId=0;

    @ApiModelProperty("起始站点名称")
    private String startSiteName;

    @ApiModelProperty("起始城市")
    private String startCityName;

    @ApiModelProperty("结束站点名称")
    private String endSiteName;

    @ApiModelProperty("结束城市名称")
    private String endCityName;

    @ApiModelProperty("出发时间")
    private Date departureTime;

    @ApiModelProperty("车型")
    private CarTypeEnum carType;

    @ApiModelProperty("运营模式")
    private OperateModeEnum operateMode;


    @ApiModelProperty("剩余票的数量")
    private Integer ticketAmount=0;

    @ApiModelProperty("票价单位（分）")
    private Integer price=0;

}
