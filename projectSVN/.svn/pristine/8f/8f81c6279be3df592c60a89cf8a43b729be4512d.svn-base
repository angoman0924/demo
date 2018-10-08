package com.zacx.serivce.mall.service;

import com.github.pagehelper.PageInfo;
import com.zacx.serivce.dal.entity.MGoods;
import com.zacx.serivce.dal.entity.MGoodsExample;
import com.zacx.serivce.mall.api.dto.GoodsDTO;
import com.zacx.serivce.mall.api.exceptions.MallServiceException;

import java.util.List;

/**
 * 商品内部服务
 * Created by song on 2018/10/6.
 */
public interface GoodsSerivce {

    int insert(MGoods record) throws MallServiceException;

    int update(MGoods record) throws MallServiceException;
    //批量更新
    int updateByIds(List<Integer> ids,MGoods record) throws MallServiceException;

    int removeByIds(List<Integer> ids) throws MallServiceException;

    MGoods findByPrimaryKey(Integer id);

    PageInfo<MGoods> getMGoodsPageInfo(GoodsDTO dto);

    MGoodsExample params2example(GoodsDTO dto);
}
