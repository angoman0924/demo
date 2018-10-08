package com.zacx.gateway.passenger.dto.mall;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by song on 2018/10/6.
 */
@Data
@ApiModel(value = "QueryGoodsCondition", description = "商品查询条件")
public class QueryGoodsCondition {
    @ApiModelProperty("页号")
    private int pageIndex;
    @ApiModelProperty("条数")
    private int pageSize;
}
