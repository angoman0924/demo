package com.zacx.serivce.mall.api;

import com.github.pagehelper.PageInfo;
import com.zacx.serivce.mall.api.dto.GoodsDTO;
import com.zacx.serivce.mall.api.exceptions.MallServiceException;

import java.util.List;

/**
 * 商品服务api
 * Created by song on 2018/10/6.
 */
public interface GoodsSerivceApi {
    /**
     * 新增
     * @param dto
     * @return
     * @throws MallServiceException
     */
    int insert(GoodsDTO dto) throws MallServiceException;

    /**
     * 修改
     * @param dto
     * @return
     * @throws MallServiceException
     */
    int update(GoodsDTO dto) throws MallServiceException;

    /**
     * 删除
     * @param ids
     * @return
     * @throws MallServiceException
     */
    int removeListByIds(List<Integer> ids) throws MallServiceException;

    /**
     * 产品上下架
     * @param ids
     * @param status
     * @return
     * @throws MallServiceException
     */
    int changeStatusByIds(List<Integer> ids, Integer status) throws MallServiceException;

    /**
     * 商品信息分页查询
     * @param dto
     * @return
     */
    PageInfo<GoodsDTO> getGoodsPageInfo(GoodsDTO dto);

    /**
     * 加载单体
     * @param id
     * @return
     */
    GoodsDTO findByPrimaryKey(Integer id);
}
