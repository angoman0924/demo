package com.zacx.serivce.basic.api.dto;

import com.zacx.core.model.api.BaseDTO;
import lombok.Data;

/**
 * Created by song on 2018/10/7.
 */
@Data
public class QueryIntegralConditionDTO extends BaseDTO {
    private static final long serialVersionUID = 7867453176574794464L;
    //积分类型名称
    private String name;
    //方向（加或减）: 0减 1加
    private Integer direction;
}
