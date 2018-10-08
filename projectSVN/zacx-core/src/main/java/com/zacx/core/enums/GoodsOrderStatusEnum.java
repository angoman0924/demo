package com.zacx.core.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 商品订单状态
 * Created by song on 2018/10/6.
 */
@Getter
@AllArgsConstructor
public enum GoodsOrderStatusEnum {
    WAIT(10,"待付款"),
    PAYED(20,"已付款"),
    BACKING(22,"退单中"),
    SENDING(23,"发货中"),
    COMPLETE(60,"已完成"),
    CANCEL(90,"已取消"),
    RUBBISH(91,"已作废");
	private int value;
	private String name;
}
