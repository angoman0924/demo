package com.zacx.serivce.line.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zacx.core.util.ObjectUtils;
import com.zacx.core.util.StringUtils;
import com.zacx.serivce.dal.entity.LPlanTemplate;
import com.zacx.serivce.dal.entity.LPlanTemplateExample;
import com.zacx.serivce.dal.mapper.LPlanTemplateMapper;
import com.zacx.serivce.line.api.dto.PlanTemplateDTO;
import com.zacx.serivce.line.api.exceptions.LineServiceException;
import com.zacx.serivce.line.service.PlanTemplateSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 班次模版内部服务
 * Created by song on 2018/10/3.
 */
@Service
public class PlanTemplateSerivceImpl implements PlanTemplateSerivce {
    @Autowired
    private LPlanTemplateMapper planTemplateMapper;
    @Override
    public int insert(LPlanTemplate record) throws LineServiceException {
        return planTemplateMapper.insertSelective(record);
    }

    @Override
    public int update(LPlanTemplate record) throws LineServiceException {
        return planTemplateMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int removeListByIds(List<Integer> ids, String userCode) throws LineServiceException {
        LPlanTemplateExample example=new LPlanTemplateExample();
        example.createCriteria().andIdIn(ids);
        return planTemplateMapper.deleteByExample(example);
    }

    @Override
    public LPlanTemplate findByPrimaryKey(Integer id) {
        return planTemplateMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageInfo<LPlanTemplate> getPlanTemplatePageInfo(PlanTemplateDTO record) {
        PageHelper.startPage(record.getPageIndex(),record.getPageSize());
        List<LPlanTemplate> list = planTemplateMapper.selectByExample(this.params2example(record));
        PageInfo<LPlanTemplate> page=new PageInfo<>(list);
        return page;
    }

    //region params2example 部分入参
    private LPlanTemplateExample params2example(PlanTemplateDTO dto){
        LPlanTemplateExample example=new LPlanTemplateExample();
        LPlanTemplateExample.Criteria criteria = example.createCriteria();
        if(!ObjectUtils.isNull(dto.getCarType())){
            criteria.andCarTypeIdEqualTo(dto.getCarType());
        }
        if(!ObjectUtils.isNull(dto.getId())){
            criteria.andIdEqualTo(dto.getId());
        }
        if(!ObjectUtils.isNull(dto.getIsRelay())){
            criteria.andIsRelayEqualTo(dto.getIsRelay());
        }
        if(!ObjectUtils.isNull(dto.getLineId())){
            criteria.andLineIdEqualTo(dto.getLineId());
        }
        if(!ObjectUtils.isNull(dto.getName())&& StringUtils.isNotBlank(dto.getName().trim())){
            criteria.andNameLike("%"+dto.getName().trim()+"%");
        }

        if(StringUtils.isNotBlank(dto.getSortCase().trim())){
            example.setOrderByClause(dto.getSortCase());
        }
        return example;
    }
    //endregion
}
