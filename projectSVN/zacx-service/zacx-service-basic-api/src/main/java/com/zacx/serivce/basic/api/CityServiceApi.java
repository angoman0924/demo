package com.zacx.serivce.basic.api;


import com.github.pagehelper.PageInfo;
import com.zacx.serivce.basic.api.dto.CityDTO;

import java.util.List;

/**
* @desc    城市相关Service
* @version 1.0
* @author  Liang Jun
* @date    2018年10月03日 15:00:35
**/
public interface CityServiceApi {
    //城市查询
    PageInfo<CityDTO> getCityPageInfo(CityDTO dto);
    //获取热门城市信息
    List<CityDTO> getHotCityPageInfo(String configKey);
}