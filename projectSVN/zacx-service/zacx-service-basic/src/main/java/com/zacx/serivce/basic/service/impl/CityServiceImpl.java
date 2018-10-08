package com.zacx.serivce.basic.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zacx.serivce.basic.service.CityService;
import com.zacx.serivce.dal.entity.BCity;
import com.zacx.serivce.dal.entity.BCityExample;
import com.zacx.serivce.dal.entity.SConfig;
import com.zacx.serivce.dal.entity.SConfigExample;
import com.zacx.serivce.dal.mapper.BCityMapperExt;
import com.zacx.serivce.dal.mapper.SConfigMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @desc    城市
 * @version 1.0
 * @author  Liang Jun
 * @date    2018年10月03日 19:38:43
 **/
@Service
public class CityServiceImpl implements CityService {
    //和父Mapper不能同时使用，有多实例异常（required a single bean, but 2 were found）
    @Resource
    private BCityMapperExt bCityMapperExt;

    @Resource
    private SConfigMapper sConfigMapper;

    @Override
    public PageInfo<BCity> getCityPageInfo(BCity record,int pageIndex,int pageSize,String orderCase) {
        PageHelper.startPage(pageIndex,pageSize);
        List<BCity> bCities = bCityMapperExt.selectByExample(this.params2example(record,orderCase));
        PageInfo<BCity> bCityPageInfo = new PageInfo<>(bCities);
        System.out.println(bCityPageInfo.getList().size());
        return bCityPageInfo;
    }

    @Override
    public BCity getCityByCode(String adCode) {
        return null;
    }

    /**
     * 获取城市列表 模糊查询
     * @param record
     * @param pageIndex
     * @param pageSize
     * @return
     */
    @Override
    public PageInfo<BCity> getCityPageinfo2(BCity record,int pageIndex,int pageSize){
        PageHelper.startPage(pageIndex,pageSize);
        List<BCity> bCities = bCityMapperExt.selectByKey(record);
        PageInfo<BCity> bCityPageInfo = new PageInfo<>(bCities);
        System.out.println("共有数据============"+bCityPageInfo.getList().size());
        return bCityPageInfo;
    }

    /**
     * 获取热门城市列表
     * @param configKey
     * @return
     */
    @Override
    public List<SConfig> getHotCityPageInfo(String configKey) {
        SConfigExample sConfigExample = new SConfigExample();
        sConfigExample.createCriteria().andGroupEqualTo(configKey);
        sConfigExample.createCriteria().andConfigKeyEqualTo(configKey);
        return sConfigMapper.selectByExample(sConfigExample);
    }

    private BCityExample params2example(BCity record, String orderCase){
        BCityExample example = new BCityExample();
        BCityExample.Criteria criteria = example.createCriteria();
        if(null != record.getId()){
            criteria.andIdEqualTo(record.getId());
        }
        example.setOrderByClause(orderCase);
        return example;
    }
}