package com.zacx.serivce.dal.mapper;

import com.zacx.serivce.dal.entity.ext.MGoodOrderDetailExt;
import com.zacx.serivce.dal.model.QueryGoodsOrderCondition;

import java.util.List;

/**
 * Created by song on 2018/10/7.
 */
public interface MGoodOrderMapperExt extends MGoodOrderMapper {
    //查询订单详情
    List<MGoodOrderDetailExt> getMGoodOrderDetailExtList(QueryGoodsOrderCondition condition);
}
