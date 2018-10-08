package com.zacx.serivce.order.api.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @description: 登车验证
 * @author: kiting
 * @date: 2018年10月04日 20:54
 * @version: 1.0
 * @copyright: 上海拜米网络科技有限公司
 **/
@Data
public class BoardingSmsDTO implements Serializable {

    //用户ID
    private Integer userId;
    private String userCode;

    //订单ID
    private Integer orderId;

    //车票ID
    private Integer ticketId;

}
