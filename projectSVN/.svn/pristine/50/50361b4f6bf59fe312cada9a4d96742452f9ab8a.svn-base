package com.zacx.serivce.basic.api.impl;



import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.github.pagehelper.PageInfo;
import com.zacx.serivce.basic.api.CityServiceApi;
import com.zacx.serivce.basic.api.dto.CityDTO;
import com.zacx.serivce.basic.service.CityService;
import com.zacx.serivce.dal.entity.BCity;
import com.zacx.serivce.dal.entity.SConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
* @desc    城市
* @version 1.0
* @author  Liang Jun
* @date    2018年10月03日 19:55:18
**/
@Slf4j
@Service
public class CityServiceApiImpl implements CityServiceApi {
    @Resource
    private CityService cityService;

    /**
     * 获取城市列表 模糊查询
     * @param dto 为空  获取所有
     * @return
     */
    @Override
    public PageInfo<CityDTO> getCityPageInfo(CityDTO dto) {
        log.info("CityServiceApi.getCityPageInfo,params:{}", JSON.toJSONString(dto));
        BCity record = new BCity();
        BeanUtils.copyProperties(dto,record);
        PageInfo<BCity> cityPageInfo = cityService.getCityPageinfo2(record, dto.getPageIndex(), dto.getPageSize());

        log.info("linePageInfo_result:{}", JSON.toJSONString(cityPageInfo));
        PageInfo<CityDTO> page = new PageInfo<>();
        if (null != cityPageInfo && null != cityPageInfo.getList() && !cityPageInfo.getList().isEmpty()) {
            BeanUtils.copyProperties(cityPageInfo, page);
            List<CityDTO> list = new ArrayList<>();
            cityPageInfo.getList().forEach(e -> {
                CityDTO temp = new CityDTO();
                BeanUtils.copyProperties(e, temp);
                list.add(temp);
            });
            page.setList(list);
        }

        log.info("page_result:{}",JSON.toJSONString(page));
        return page;
    }

    /**
     * 获取热门成城市
     * @param configKey
     * @return
     */
    @Override
    public List<CityDTO> getHotCityPageInfo(String configKey) {
        //查询数据库热门城市
        List<SConfig> list = cityService.getHotCityPageInfo(configKey);
        //转DTO
        List<CityDTO> cityDTOList = new ArrayList<>();
        for (SConfig s: list){
            //CityDTO
            System.out.println(s.getConfigValue());
            //将JSON转对象
            List<CityDTO> list1 = JSONArray.parseArray(s.getConfigValue(),CityDTO.class);
            for (CityDTO c: list1){
                System.out.println(c.getName()+c.getCode()+c.getRelationCity().get(0).getName()+c.getRelationCity().get(0).getCode());
                cityDTOList.add(c);
            }
        }
        return cityDTOList;
    }


}