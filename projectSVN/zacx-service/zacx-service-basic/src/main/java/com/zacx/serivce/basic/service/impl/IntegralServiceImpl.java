package com.zacx.serivce.basic.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zacx.core.util.ObjectUtils;
import com.zacx.core.util.StringUtils;
import com.zacx.serivce.basic.api.dto.IntegralDTO;
import com.zacx.serivce.basic.api.dto.QueryIntegralConditionDTO;
import com.zacx.serivce.basic.api.exceptions.BasicServiceException;
import com.zacx.serivce.basic.service.IntegralService;
import com.zacx.serivce.dal.entity.BIntegral;
import com.zacx.serivce.dal.entity.BIntegralExample;
import com.zacx.serivce.dal.mapper.BIntegralMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by song on 2018/10/7.
 */
@Service
public class IntegralServiceImpl implements IntegralService {

    @Autowired
    private BIntegralMapper integralMapper;
    @Override
    public int insert(BIntegral record) throws BasicServiceException {
        return integralMapper.insertSelective(record);
    }

    @Override
    public int update(BIntegral record) throws BasicServiceException {
        return integralMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int removeListByIds(List<Integer> ids, String userCode) throws BasicServiceException {
        BIntegralExample example=new BIntegralExample();
        example.createCriteria().andIdIn(ids);
        return integralMapper.deleteByExample(example);
    }

    @Override
    public BIntegral findByPrimaryKey(Integer id) {
        return integralMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<BIntegral> getIntegralList(QueryIntegralConditionDTO dto) {
        return integralMapper.selectByExample(this.params2Example(dto));
    }

    @Override
    public PageInfo<BIntegral> getIntegralPageInfo(QueryIntegralConditionDTO dto) {
        PageHelper.startPage(dto.getPageIndex(),dto.getPageIndex());
        List<BIntegral> list = integralMapper.selectByExample(this.params2Example(dto));
        PageInfo<BIntegral> page=new PageInfo<>(list);
        return page;
    }

    private BIntegralExample params2Example(QueryIntegralConditionDTO dto){
        BIntegralExample example=new BIntegralExample();
        BIntegralExample.Criteria criteria = example.createCriteria();
        if(!ObjectUtils.isNull(dto.getDirection())){
            criteria.andDirectionEqualTo(dto.getDirection());
        }
        if(!ObjectUtils.isNull(dto.getName())|| StringUtils.isNotBlank(dto.getName().trim())){
            criteria.andNameLike("%"+dto.getName().trim()+"%");
        }

        if(!ObjectUtils.isNull(dto.getSortCase())|| StringUtils.isNotBlank(dto.getSortCase())){
            example.setOrderByClause(dto.getSortCase());
        }

        return example;
    }
}
