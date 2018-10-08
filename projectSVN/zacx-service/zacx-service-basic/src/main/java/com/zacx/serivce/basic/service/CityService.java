package com.zacx.serivce.basic.service;


import com.github.pagehelper.PageInfo;
import com.zacx.serivce.dal.entity.BCity;
import com.zacx.serivce.dal.entity.SConfig;

import java.util.List;

/**
* @desc    城市
* @version 1.0
* @author  Liang Jun
* @date    2018年10月03日 19:38:14
**/
public interface CityService {
    PageInfo<BCity> getCityPageInfo(BCity record, int pageIndex, int pageSize, String orderCase);

    BCity getCityByCode(String adCode);
    PageInfo<BCity> getCityPageinfo2(BCity record, int pageIndex, int pageSize);

    //获取热门城市信息
    List<SConfig> getHotCityPageInfo(String configKey);

}