package com.zacx.serivce.order.api.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @description: 获取评论类型列表
 * @author: kiting
 * @date: 2018年10月04日 21:25
 * @version: 1.0
 * @copyright: 上海拜米网络科技有限公司
 **/
@Data
public class EvaluateCategoryDTO implements Serializable {

    //评论大类名称
    private List<String> catgList;

    //评论标签名称
    private List<String> labeLList;

}
