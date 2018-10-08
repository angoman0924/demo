package com.zacx.serivce.order.api.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @description: 评价信息
 * @author: kiting
 * @date: 2018年10月04日 21:25
 * @version: 1.0
 * @copyright: 上海拜米网络科技有限公司
 **/
@Data
public class EvaluateInfoDTO implements Serializable {

    //用户ID
    private Integer userId;

    //评论订单ID
    private Integer orderId;

    //大类评分集合
    private List<EvaluateScoreDTO> catgList;

    //标检评价集合
    private List<String> labeLList;

    //评论内容
    private String description;

}
