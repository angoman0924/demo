package com.zacx.serivce.basic.service;

import com.github.pagehelper.PageInfo;
import com.zacx.serivce.basic.api.dto.QueryIntegralConditionDTO;
import com.zacx.serivce.basic.api.exceptions.BasicServiceException;
import com.zacx.serivce.dal.entity.BIntegral;

import java.util.List;

/**
 * 积分内部服务
 * Created by song on 2018/10/7.
 */
public interface IntegralService {
    //写表
    int insert(BIntegral record) throws BasicServiceException;
    //更新
    int update(BIntegral record) throws BasicServiceException;
    //删除
    int removeListByIds(List<Integer> ids, String userCode) throws BasicServiceException;
    //根据主键查找
    BIntegral  findByPrimaryKey(Integer id);

    //普通查询
    List<BIntegral> getIntegralList(QueryIntegralConditionDTO dto);
    //分页查询
    PageInfo<BIntegral> getIntegralPageInfo(QueryIntegralConditionDTO dto);
}
