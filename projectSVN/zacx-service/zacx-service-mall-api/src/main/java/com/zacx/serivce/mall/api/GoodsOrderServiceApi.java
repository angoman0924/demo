package com.zacx.serivce.mall.api;

import com.github.pagehelper.PageInfo;
import com.zacx.serivce.mall.api.dto.GoodsEntryDTO;
import com.zacx.serivce.mall.api.dto.GoodsOrderDTO;
import com.zacx.serivce.mall.api.dto.OrderEntryDTO;
import com.zacx.serivce.mall.api.exceptions.MallServiceException;

import java.util.List;

/**
 * 商品订单服务api
 * Created by song on 2018/10/7.
 */
public interface GoodsOrderServiceApi {

    /**
     * 创建订单
     * @param order
     * @return
     * @throws MallServiceException
     */
    int createOrder(OrderEntryDTO order) throws MallServiceException;

    /**
     * 订单调整
     * @param detail
     * @return
     * @throws MallServiceException
     */
    int updateOrderDetail(GoodsEntryDTO detail) throws MallServiceException;

    /**
     * 删除订单
     * @param ids
     * @return
     * @throws MallServiceException
     */
    int removeListByIds(List<Integer> ids)throws MallServiceException;

    /**
     * 删除订单详情
     * @param ids
     * @return
     * @throws MallServiceException
     */
    int removeDetailListByIds(List<Integer> ids)throws MallServiceException;

    /**
     * 分页查询
     * @param dto
     * @return
     */
    PageInfo<GoodsOrderDTO> getMGoodOrderPageInfo(GoodsOrderDTO dto);
}
