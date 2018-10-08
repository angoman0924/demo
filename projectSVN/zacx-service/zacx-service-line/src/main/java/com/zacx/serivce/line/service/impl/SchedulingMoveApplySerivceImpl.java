package com.zacx.serivce.line.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zacx.core.util.ObjectUtils;
import com.zacx.core.util.StringUtils;
import com.zacx.serivce.dal.entity.LSchedulingMoveApply;
import com.zacx.serivce.dal.entity.LSchedulingMoveApplyExample;
import com.zacx.serivce.dal.mapper.LSchedulingMoveApplyMapper;
import com.zacx.serivce.line.api.dto.SchedulingMoveApplyDTO;
import com.zacx.serivce.line.api.exceptions.LineServiceException;
import com.zacx.serivce.line.service.SchedulingMoveApplySerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by song on 2018/10/5.
 */
@Service
public class SchedulingMoveApplySerivceImpl implements SchedulingMoveApplySerivce {
    @Autowired
    private LSchedulingMoveApplyMapper schedulingMoveApplyMapper;
    @Override
    public int insert(LSchedulingMoveApply record) throws LineServiceException {
        return schedulingMoveApplyMapper.insertSelective(record);
    }

    @Override
    public int update(LSchedulingMoveApply record) throws LineServiceException {
        return schedulingMoveApplyMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int removeListByIds(List<Integer> ids, String userCode) throws LineServiceException {
        LSchedulingMoveApplyExample example=new LSchedulingMoveApplyExample();
        example.createCriteria().andIdIn(ids);
        return schedulingMoveApplyMapper.deleteByExample(example);
    }

    @Override
    public LSchedulingMoveApply findByPrimaryKey(Integer id) {
        return schedulingMoveApplyMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageInfo<LSchedulingMoveApply> getSchedulingPageInfo(SchedulingMoveApplyDTO dto) {
        PageHelper.startPage(dto.getPageIndex(),dto.getPageSize());
        List<LSchedulingMoveApply> list = schedulingMoveApplyMapper.selectByExample(this.params2example(dto));
        PageInfo<LSchedulingMoveApply> page=new PageInfo<>(list);
        return page;
    }

    @Override
    public LSchedulingMoveApplyExample params2example(SchedulingMoveApplyDTO dto) {
        LSchedulingMoveApplyExample example=new LSchedulingMoveApplyExample();
        LSchedulingMoveApplyExample.Criteria criteria = example.createCriteria();
        if(!ObjectUtils.isNull(dto)){
            if(!ObjectUtils.isNull(dto.getApproverBy())&&StringUtils.isNotBlank(dto.getApproverBy().trim())){
                criteria.andApproverByLike("%"+dto.getApproverBy().trim()+"%");
            }
            if(!ObjectUtils.isNull(dto.getCode())&&StringUtils.isNotBlank((dto.getCode().trim()))){
                criteria.andCodeLike("%"+dto.getCode().trim()+"%");
            }
            if(!ObjectUtils.isNull(dto.getCreateBy())&&StringUtils.isNotBlank(dto.getCreateBy().trim())){
                criteria.andCreateByLike("%"+dto.getCreateBy().trim()+"%");
            }
            if(!ObjectUtils.isNull(dto.getModifyBy())&&StringUtils.isNotBlank(dto.getModifyBy().trim())){
                criteria.andModifyByLike("%"+dto.getModifyBy().trim()+"%");
            }
            if(!ObjectUtils.isNull(dto.getDriverId())){
                criteria.andDriverIdEqualTo(dto.getDriverId());
            }
            if(!ObjectUtils.isNull(dto.getUserId())){
                criteria.andUserIdEqualTo(dto.getUserId());
            }
            if(!ObjectUtils.isNull(dto.getId())){
                criteria.andIdEqualTo(dto.getId());
            }
            if(!ObjectUtils.isNull(dto.getSchedulingId())){
                criteria.andSchedulingIdEqualTo(dto.getSchedulingId());
            }
            if(!ObjectUtils.isNull(dto.getStatus())){
                criteria.andStatusEqualTo(dto.getStatus());
            }
            if(!ObjectUtils.isNull(dto.getType())){
                criteria.andTypeEqualTo(dto.getType());
            }


            if(StringUtils.isNotBlank(dto.getSortCase())){
                example.setOrderByClause(dto.getSortCase());
            }
        }
        return example;
    }
}
