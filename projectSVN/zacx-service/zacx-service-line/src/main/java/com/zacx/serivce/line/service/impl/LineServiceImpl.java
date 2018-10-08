package com.zacx.serivce.line.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zacx.core.util.StringUtils;
import com.zacx.serivce.dal.entity.LLine;
import com.zacx.serivce.dal.entity.LLineExample;
import com.zacx.serivce.dal.entity.LPlan;
import com.zacx.serivce.dal.mapper.LLineMapperExt;
import com.zacx.serivce.line.api.dto.LineDTO;
import com.zacx.serivce.line.api.exceptions.LineServiceException;
import com.zacx.serivce.line.service.LineService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 线路内部服务逻辑实现
 * Created by song on 2018/10/2.
 */
@Service
public class LineServiceImpl implements LineService {
    //和父Mapper不能同时使用，有多实例异常（required a single bean, but 2 were found）
    @Autowired
    private LLineMapperExt lineMapperExt;

    @Override
    public int insert(LLine record) throws LineServiceException {
        return lineMapperExt.insertSelective(record);
    }

    @Override
    public int update(LLine record) throws LineServiceException {
        return lineMapperExt.updateByPrimaryKeySelective(record);
    }

    @Override
    public int removeListByIds(List<Integer> ids) throws LineServiceException {
        LLineExample example=new LLineExample();
        example.createCriteria().andIdIn(ids);
        return lineMapperExt.deleteByExample(example);
    }

    @Override
    public LLine findByPrimaryKey(Integer id) {
        return lineMapperExt.selectByPrimaryKey(id);
    }

    @Override
    public PageInfo<LLine> getLinePageInfo(LineDTO dto) {
        PageHelper.startPage(dto.getPageIndex(),dto.getPageSize());
        List<LLine> lLines = lineMapperExt.selectByExample(this.params2example(dto));
        PageInfo<LLine> lLinePageInfo=new PageInfo<>(lLines);
        return lLinePageInfo;
    }

    @Override
    public PageInfo<LPlan> getPlanInfoByLine(LineDTO dto) {
        LLine line=new LLine();
        BeanUtils.copyProperties(dto,line);
        PageHelper.startPage(dto.getPageIndex(),dto.getPageSize());
        List<LPlan> planInfoByLine = lineMapperExt.getPlanInfoByLine(line);
        PageInfo<LPlan> page=new PageInfo<>(planInfoByLine);
        return page;
    }

    //region params2example 部分入参
    private LLineExample params2example(LineDTO dto){
        LLineExample example=new LLineExample();
        LLineExample.Criteria criteria = example.createCriteria();
        if(null!=dto.getId()){
            criteria.andIdEqualTo(dto.getId());
        }
        if(null!=dto.getDistance()){
            criteria.andDistanceEqualTo(dto.getDistance());
        }
        if(null!=dto.getName()&& StringUtils.isNotBlank(dto.getName().trim())){
            criteria.andNameLike("%"+dto.getName()+"%");
        }
        if(null!=dto.getSiteEndId()){
            criteria.andSiteEndIdEqualTo(dto.getSiteEndId());
        }
        if(null!=dto.getSiteStartId()){
            criteria.andSiteStartIdEqualTo(dto.getSiteStartId());
        }
        if(null!=dto.getStatus()){
            criteria.andStatusEqualTo(dto.getStatus());
        }

        if(StringUtils.isNotBlank(dto.getSortCase())) {
            example.setOrderByClause(dto.getSortCase());
        }

        return example;
    }
    //endregion
}
