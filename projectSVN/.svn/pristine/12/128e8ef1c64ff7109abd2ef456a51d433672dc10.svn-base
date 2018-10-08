package com.zacx.serivce.line.service;

import com.github.pagehelper.PageInfo;
import com.zacx.serivce.dal.entity.LScheduling;
import com.zacx.serivce.dal.entity.LSchedulingExample;
import com.zacx.serivce.dal.entity.ext.LSchedulingExt;
import com.zacx.serivce.line.api.dto.QuerySchedulingByDriverConditionDTO;
import com.zacx.serivce.line.api.dto.SchedulingDTO;
import com.zacx.serivce.line.api.dto.QuerySchedulingHistoryConditionDTO;
import com.zacx.serivce.line.api.exceptions.LineServiceException;

import java.util.List;

/**
 * 班次调度内部服务
 * Created by song on 2018/10/3.
 */
public interface SchedulingService {
    //写表
    Integer insert(LScheduling record) throws LineServiceException;
    //更新
    int update(LScheduling record) throws LineServiceException;
    //根据主键查找
    LScheduling  findByPrimaryKey(Integer id);
    //删除
    int removeListByIds(List<Integer> ids, String userCode) throws LineServiceException;

    //普通查询
    List<LScheduling> getSchedulingListByExample(LSchedulingExample example);
    //分页查询
    PageInfo<LScheduling> getSchedulingPageInfo(SchedulingDTO dto);
    PageInfo<LScheduling> getSchedulingPageInfo(LSchedulingExample example,int pageIndex,int pageSize);

    //查看车辆或人员的历史排班
    PageInfo<LSchedulingExt> getSchedulingHistory(QuerySchedulingHistoryConditionDTO dto);
    //安排给我的排班
    PageInfo<LSchedulingExt> getSchedulingPageInfoByDriver(QuerySchedulingByDriverConditionDTO condition);

    LSchedulingExample params2example(SchedulingDTO record);

}
