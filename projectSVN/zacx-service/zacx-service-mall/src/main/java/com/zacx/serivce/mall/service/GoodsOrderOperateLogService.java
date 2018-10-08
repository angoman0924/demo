package com.zacx.serivce.mall.service;

import com.github.pagehelper.PageInfo;
import com.zacx.serivce.dal.entity.MGoodOrderOperateLog;
import com.zacx.serivce.mall.api.dto.GoodOrderOperateLogDTO;
import com.zacx.serivce.mall.api.exceptions.MallServiceException;

import java.util.List;

/**
 * 日志
 * Created by song on 2018/10/7.
 */
public interface GoodsOrderOperateLogService {

    int insert(MGoodOrderOperateLog record) throws MallServiceException;

    int removeByIds(List<Integer> ids) throws MallServiceException;

    MGoodOrderOperateLog findByPrimaryKey(Integer id);

    PageInfo<MGoodOrderOperateLog> getMGoodsPageInfo(GoodOrderOperateLogDTO dto);
}
