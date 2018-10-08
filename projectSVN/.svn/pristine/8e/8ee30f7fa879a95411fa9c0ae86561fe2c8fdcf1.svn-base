package com.zacx.serivce.line.api.impl;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.zacx.core.enums.CityTypeEnum;
import com.zacx.core.util.ObjectUtils;
import com.zacx.core.util.StringUtils;
import com.zacx.serivce.dal.entity.LSite;
import com.zacx.serivce.dal.entity.LSiteExample;
import com.zacx.serivce.line.api.SiteServiceApi;
import com.zacx.serivce.line.api.dto.SiteDTO;
import com.zacx.serivce.line.api.dto.QuerySiteInfoByCityCodeConditionDTO;
import com.zacx.serivce.line.api.exceptions.LineServiceException;
import com.zacx.serivce.line.service.SiteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 站点服务api
 * Created by song on 2018/10/3.
 */
@Service
public class SiteServiceApiImpl implements SiteServiceApi {

    Logger logger=LoggerFactory.getLogger(SiteServiceApiImpl.class);
    @Autowired
    private SiteService siteService;

    @Override
    public int insert(SiteDTO dto) throws LineServiceException {
        logger.info("SiteServiceApi.insert,params:{}", JSON.toJSONString(dto));
        LSite record=new LSite();
        BeanUtils.copyProperties(dto,record);
        int r = siteService.insert(record);
        logger.info("r={}",r);
        return r;
    }

    @Override
    public int update(SiteDTO dto) throws LineServiceException {
        logger.info("SiteServiceApi.update,params:{}", JSON.toJSONString(dto));
        LSite record=new LSite();
        BeanUtils.copyProperties(dto,record);
        int r = siteService.update(record);
        logger.info("r={}",r);
        return r;
    }

    @Override
    public int removeListByIds(List<Integer> ids, String userCode) throws LineServiceException {
        logger.info("SiteServiceApi.removeListByIds,params:{}", JSON.toJSONString(ids));
        int r = siteService.removeListByIds(ids,userCode);
        logger.info("r={}",r);
        return r;
    }

    @Override
    public PageInfo<SiteDTO> getSitePageInfo(SiteDTO dto) {
        logger.info("SiteServiceApi.getSitePageInfo,params:{}",JSON.toJSONString(dto));

        PageInfo<LSite> pageInfo = siteService.getSitePageInfo(dto);
        logger.info("pageInfo_result:{}",JSON.toJSONString(pageInfo));

        PageInfo<SiteDTO> page=ObjectUtils.pageEntityConvert2PageDTO(pageInfo,SiteDTO.class);
        logger.info("page_result:{}",JSON.toJSONString(page));

        return page;
    }

    @Override
    public Map<String, List<SiteDTO>> getSiteInfosByCityCode(QuerySiteInfoByCityCodeConditionDTO cityCodes) {
        logger.info("SiteServiceApi.getSiteInfosByCityCode,params:{}",JSON.toJSONString(cityCodes));
        if(!ObjectUtils.isNull(cityCodes)&&
                !ObjectUtils.isNull(cityCodes.getCodeLeverMap())&&
                cityCodes.getCodeLeverMap().size()>0){

            Map<String, List<SiteDTO>> map=new HashMap<>();
            cityCodes.getCodeLeverMap().entrySet().forEach(s->{
                if(StringUtils.isNotBlank(s.getKey())&&!ObjectUtils.isNull(s.getValue())) {
                    LSiteExample example = new LSiteExample();
                    LSiteExample.Criteria criteria = example.createCriteria();
                    if(CityTypeEnum.PROVINCE.getValue()==s.getValue()) {
                        criteria.andPlaceCodeEqualTo(s.getKey());
                    }else if(CityTypeEnum.CITY.getValue()==s.getValue()){
                        criteria.andCityCodeEqualTo(s.getKey());
                    }else if(CityTypeEnum.COUNTY.getValue()==s.getValue()){
                        criteria.andCountyCodeEqualTo(s.getKey());
                    }else if(CityTypeEnum.PLACE.getValue()==s.getValue()){
                        criteria.andPlaceCodeEqualTo(s.getKey());
                    }

                    List<LSite> siteList = siteService.getSiteList(example);
                    if(null!=siteList&&!siteList.isEmpty()){
                        List<SiteDTO> list=new ArrayList<>();
                        siteList.forEach(i->{
                            SiteDTO dto=new SiteDTO();
                            BeanUtils.copyProperties(i,dto);
                            list.add(dto);
                        });
                        map.put(s.getKey(),list);
                    }
                }
            });

            logger.info("map_result:{}",JSON.toJSONString(map));
            if(!map.isEmpty()){
                return map;
            }
        }
        return null;
    }

    @Override
    public SiteDTO findLineById(int siteId) {
        logger.info("SiteServiceApi.findLineById,params:{}",siteId);
        LSite byPrimaryKey = siteService.findByPrimaryKey(siteId);
        if(byPrimaryKey!=null){
            SiteDTO dto=new SiteDTO();
            BeanUtils.copyProperties(byPrimaryKey,dto);
            logger.info("result:{}",dto);
            return dto;
        }
        return null;
    }

    @Override
    public List<SiteDTO> getSiteListByIds(List<Integer> ids) {
        logger.info("SiteServiceApi.getSiteListByIds,params:{}",ids);
        LSiteExample example =new LSiteExample();
        example.createCriteria().andIdIn(ids);
        List<LSite> siteList = siteService.getSiteList(example);

        List<SiteDTO> list=new ArrayList<>();
        if(null!=siteList&&!siteList.isEmpty()){
            list=ObjectUtils.ListEntity2ListDTO(siteList,SiteDTO.class);
        }
        logger.info("result:{}",list);
        return list;
    }
}
