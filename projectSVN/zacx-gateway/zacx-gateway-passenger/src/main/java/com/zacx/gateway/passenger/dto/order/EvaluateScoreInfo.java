package com.zacx.gateway.passenger.dto.order;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @description: 类型评分信息
 * @author: kiting
 * @date: 2018年10月04日 21:25
 * @version: 1.0
 * @copyright: 上海拜米网络科技有限公司
 **/
@Data
@ApiModel(value = "EvaluateScoreDTO", description = "类型评分信息")
public class EvaluateScoreInfo {

    @ApiModelProperty(value = "类型名称", dataType = "String")
    private String typeName;

    @ApiModelProperty(value = "类型评分", dataType = "Integer")
    private Integer typeScore;

}
