package com.zacx.serivce.dal.model;

import lombok.Data;

/**
 * Created by song on 2018/10/7.
 */
@Data
public class QueryGoodsOrderCondition {
    private String goodsName;
    private String code;
    private Integer userId;
    private Integer orderId;
}
