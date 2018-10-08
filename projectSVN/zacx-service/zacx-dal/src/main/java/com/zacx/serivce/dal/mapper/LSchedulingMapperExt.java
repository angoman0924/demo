package com.zacx.serivce.dal.mapper;

import com.zacx.serivce.dal.entity.ext.LSchedulingExt;
import com.zacx.serivce.dal.model.QuerySchedulingByDriverCondition;
import com.zacx.serivce.dal.model.QuerySchedulingHistoryCondition;

import java.util.List;

public interface LSchedulingMapperExt extends LSchedulingMapper {

    //查看车辆或人员的历史排班
    List<LSchedulingExt> getSchedulingHistory(QuerySchedulingHistoryCondition condition);

    //安排给我的排班
    List<LSchedulingExt> getSchedulingPageInfoByDriver(QuerySchedulingByDriverCondition condition);
}
