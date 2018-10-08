package com.zacx.serivce.dal.mapper;

import com.zacx.serivce.dal.entity.BCity;

import java.util.List;

public interface BCityMapperExt extends BCityMapper {

    //获取城市列表
    List<BCity> selectByKey(BCity bCity);

}