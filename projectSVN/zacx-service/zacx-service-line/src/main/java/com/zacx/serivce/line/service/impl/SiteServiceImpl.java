package com.zacx.serivce.line.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zacx.serivce.dal.entity.LSite;
import com.zacx.serivce.dal.entity.LSiteExample;
import com.zacx.serivce.dal.mapper.LSiteMapper;
import com.zacx.serivce.line.api.dto.SiteDTO;
import com.zacx.serivce.line.api.exceptions.LineServiceException;
import com.zacx.serivce.line.service.SiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * 站点内部服务
 * Created by song on 2018/10/3.
 */
@Service
public class SiteServiceImpl implements SiteService {
    @Autowired
    private LSiteMapper siteMapper;
    @Override
    public int insert(LSite record) throws LineServiceException {
        return siteMapper.insertSelective(record);
    }

    @Override
    public int update(LSite record) throws LineServiceException {
        return siteMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int removeListByIds(List<Integer> ids,String userCode) throws LineServiceException {
        LSiteExample example=new LSiteExample();
        example.createCriteria().andIdIn(ids);
        LSite record =new LSite();
        record.setIsDelete(true);
        record.setModifyBy(userCode);
        record.setModifyAt(new Date());
        return siteMapper.updateByExampleSelective(record,example);
    }

    @Override
    public LSite findByPrimaryKey(Integer id) {
        return siteMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageInfo<LSite> getSitePageInfo(SiteDTO dto) {
        PageHelper.startPage(dto.getPageIndex(),dto.getPageSize());
        List<LSite> lSites = siteMapper.selectByExample(this.params2example(dto));
        PageInfo<LSite> page=new PageInfo<>(lSites);
        return page;
    }

    @Override
    public List<LSite> getSiteList(LSiteExample example) {
        return siteMapper.selectByExample(example);
    }

    //region params2example 部分入参
    @Override
    public LSiteExample params2example(SiteDTO dto){
        LSiteExample example=new LSiteExample();
        LSiteExample.Criteria criteria = example.createCriteria();
        if(null!=dto.getId()){
            criteria.andIdEqualTo(dto.getId());
        }
        if(null!=dto.getAddress()&&!"".equals(dto.getAddress().trim())){
            criteria.andAddressLike("%"+dto.getAddress().trim()+"%");
        }
        if(null!=dto.getCityCode()&&!"".equals(dto.getCityCode().trim())){
            criteria.andCityCodeEqualTo(dto.getCityCode().trim());
        }
        if(null!=dto.getCreateBy()&&!"".equals(dto.getCreateBy().trim())){
            criteria.andCreateByEqualTo(dto.getCreateBy().trim());
        }
        if(null!=dto.getCountyCode()&&!"".equals(dto.getCountyCode().trim())){
            criteria.andCountyCodeEqualTo(dto.getCountyCode().trim());
        }
        if(null!=dto.getIsDelete()){
            criteria.andIsDeleteEqualTo(dto.getIsDelete());
        }
        if(null!=dto.getName()&&!"".equals(dto.getName().trim())){
            criteria.andNameLike("%"+dto.getName().trim()+"%");
        }
        if(null!=dto.getPlaceCode()&&!"".equals(dto.getPlaceCode().trim())){
            criteria.andPlaceCodeEqualTo(dto.getPlaceCode().trim());
        }
        if(null!=dto.getProvinceCode()&&!"".equals(dto.getProvinceCode().trim())){
            criteria.andProvinceCodeEqualTo(dto.getProvinceCode().trim());
        }
        if(null!=dto.getModifyBy()&&!"".equals(dto.getModifyBy().trim())){
            criteria.andModifyByEqualTo(dto.getModifyBy());
        }

        if(!"".equals(dto.getSortCase())){
            example.setOrderByClause(dto.getSortCase());
        }
        return example;
    }
    //endregion
}
