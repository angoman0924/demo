package com.zacx.serivce.order.api.dto;

import com.zacx.serivce.order.api.enums.OrderOperateTypeEnum;

import lombok.Data;

import java.io.Serializable;

/**
 * @description: 取消及更改订单
 *
 * @author: kiting
 * @date: 2018年10月3日 19:25
 * @version: 1.0
 * @copyright: 上海拜米网络科技有限公司
 **/
@Data
public class ChangeOrderDTO implements Serializable {

    //用户ID
    Integer userId;

    //订单ID
    private Integer orderId;

    //操作类型
    private OrderOperateTypeEnum operateType;

}
