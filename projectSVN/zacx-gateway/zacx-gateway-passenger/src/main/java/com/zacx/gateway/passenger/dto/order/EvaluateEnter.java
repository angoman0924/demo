package com.zacx.gateway.passenger.dto.order;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @description: 评价信息
 * @author: kiting
 * @date: 2018年10月04日 21:25
 * @version: 1.0
 * @copyright: 上海拜米网络科技有限公司
 **/
@Data
@ApiModel(value = "EvaluateEnter", description = "评价信息")
public class EvaluateEnter {

    @ApiModelProperty(value = "评论订单ID", dataType = "Integer")
    private Integer orderId;

    @ApiModelProperty(value = "大类评分集合", dataType = "List")
    private List<EvaluateScoreInfo> catgList;

    @ApiModelProperty(value = "标检评价集合", dataType = "List")
    private List<String> labeLList;

    @ApiModelProperty(value = "评论内容", dataType = "String")
    private String description;

}
