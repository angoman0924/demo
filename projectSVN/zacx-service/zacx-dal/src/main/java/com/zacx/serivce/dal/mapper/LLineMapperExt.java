package com.zacx.serivce.dal.mapper;

import com.zacx.serivce.dal.entity.LLine;
import com.zacx.serivce.dal.entity.LPlan;

import java.util.List;

public interface LLineMapperExt extends LLineMapper {

    //根据线路信息获取响应班次信息
    List<LPlan> getPlanInfoByLine(LLine record);

}