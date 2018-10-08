package com.zacx.serivce.mall.service;

import com.github.pagehelper.PageInfo;
import com.zacx.serivce.dal.entity.MGoodOrder;
import com.zacx.serivce.dal.entity.MGoodOrderDetail;
import com.zacx.serivce.dal.entity.MGoodOrderExample;
import com.zacx.serivce.dal.entity.ext.MGoodOrderDetailExt;
import com.zacx.serivce.mall.api.dto.GoodsOrderDTO;
import com.zacx.serivce.mall.api.dto.QueryGoodsOrderConditionDTO;
import com.zacx.serivce.mall.api.exceptions.MallServiceException;

import java.util.List;

/**
 * 商品订单内部服务
 * Created by song on 2018/10/7.
 */
public interface GoodsOrderService {

    Integer insert(MGoodOrder record) throws MallServiceException;
    int insertDetail(MGoodOrderDetail record) throws MallServiceException;

    int update(MGoodOrder record) throws MallServiceException;
    int updateDetail(MGoodOrderDetail record) throws MallServiceException;
    //批量更新
    int updateByIds(List<Integer> ids, MGoodOrder record) throws MallServiceException;

    int removeByIds(List<Integer> ids) throws MallServiceException;
    int removeDetailByIds(List<Integer> ids) throws MallServiceException;
    int removeDetailByDetailIds(List<Integer> ids) throws MallServiceException;

    MGoodOrder findByPrimaryKey(Integer id);
    MGoodOrderDetail findDtailByPrimaryKey(Integer id);

    MGoodOrder findByCode(String code);

    PageInfo<MGoodOrder> getMGoodOrderPageInfo(GoodsOrderDTO dto);

    List<MGoodOrderDetailExt> getMGoodOrderDetailList(QueryGoodsOrderConditionDTO dto);

    MGoodOrderExample params2example(GoodsOrderDTO dto);
}
