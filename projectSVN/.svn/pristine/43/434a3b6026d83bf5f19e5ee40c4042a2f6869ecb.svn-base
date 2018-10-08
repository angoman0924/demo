package com.zacx.serivce.line.service;

import com.github.pagehelper.PageInfo;
import com.zacx.serivce.dal.entity.LSchedulingMoveApply;
import com.zacx.serivce.dal.entity.LSchedulingMoveApplyExample;
import com.zacx.serivce.line.api.dto.SchedulingMoveApplyDTO;
import com.zacx.serivce.line.api.exceptions.LineServiceException;

import java.util.List;

/**
 * 班次调整申请内部服务
 * Created by song on 2018/10/5.
 */
public interface SchedulingMoveApplySerivce {
    //写表
    int insert(LSchedulingMoveApply record) throws LineServiceException;
    //更新
    int update(LSchedulingMoveApply record) throws LineServiceException;
    //删除
    int removeListByIds(List<Integer> ids, String userCode) throws LineServiceException;
    //根据主键查找
    LSchedulingMoveApply  findByPrimaryKey(Integer id);
    //分页查询
    PageInfo<LSchedulingMoveApply> getSchedulingPageInfo(SchedulingMoveApplyDTO dto);

    LSchedulingMoveApplyExample params2example(SchedulingMoveApplyDTO record);
}
