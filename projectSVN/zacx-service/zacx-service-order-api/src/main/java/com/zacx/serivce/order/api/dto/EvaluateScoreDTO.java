package com.zacx.serivce.order.api.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @description: 类型评分信息
 * @author: kiting
 * @date: 2018年10月04日 21:25
 * @version: 1.0
 * @copyright: 上海拜米网络科技有限公司
 **/
@Data
public class EvaluateScoreDTO implements Serializable {

    //类型名称
    private String typeName;

    //类型评分
    private Integer typeScore;

}
