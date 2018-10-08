package com.zacx.serivce.user.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zacx.core.enums.PointExitEntryEnum;
import com.zacx.core.util.ObjectUtils;
import com.zacx.core.util.StringUtils;
import com.zacx.serivce.dal.entity.UIntegralWaterBills;
import com.zacx.serivce.dal.entity.UIntegralWaterBillsExample;
import com.zacx.serivce.dal.mapper.UIntegralWaterBillsMapper;
import com.zacx.serivce.user.api.dto.UserIntegralDTO;
import com.zacx.serivce.user.api.exceptions.UserServiceException;
import com.zacx.serivce.user.service.UserIntegralSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by song on 2018/10/7.
 */
@Service
public class UserIntegralSerivceImpl implements UserIntegralSerivce {

    @Autowired
    private UIntegralWaterBillsMapper integralMapper;
    @Override
    public Integer insert(UIntegralWaterBills record) throws UserServiceException {
        int r=integralMapper.insertSelective(record);
        return record.getId();
    }

    @Override
    public int removeByIds(List<Integer> ids) throws UserServiceException {
        UIntegralWaterBillsExample example=new UIntegralWaterBillsExample();
        example.createCriteria().andIdIn(ids);
        return integralMapper.deleteByExample(example);
    }

    @Override
    public UIntegralWaterBills findByPrimaryKey(Integer id) {
        return integralMapper.selectByPrimaryKey(id);
    }

    @Override
    public UIntegralWaterBills findByCode(String code) {
        UIntegralWaterBillsExample example=new UIntegralWaterBillsExample();
        example.createCriteria().andCodeEqualTo(code);
        List<UIntegralWaterBills> uIntegralWaterBills = integralMapper.selectByExample(example);
        if(null!=uIntegralWaterBills&&!uIntegralWaterBills.isEmpty()){
            return uIntegralWaterBills.get(0);
        }
        return null;
    }

    @Override
    public PageInfo<UIntegralWaterBills> getIntegeralPageInfo(UserIntegralDTO dto) {
        PageHelper.startPage(dto.getPageIndex(),dto.getPageSize());
        List<UIntegralWaterBills> uIntegralWaterBills = integralMapper.selectByExample(this.params2Example(dto));
        PageInfo<UIntegralWaterBills> pageInfo=new PageInfo<>(uIntegralWaterBills);
        return pageInfo;
    }

    @Override
    public long totalPoint(UserIntegralDTO dto) {
        long ps=0;
        if(!ObjectUtils.isNull(dto.getExitEntryType())){//如果有出入标志
            List<UIntegralWaterBills> list = integralMapper.selectByExample(this.params2Example(dto));
            ps = list.stream().mapToLong(p -> p.getNumber()).sum();
        }else{//没有出入标志，分别给子取出、入的积分，然后汇总差，
            dto.setExitEntryType(PointExitEntryEnum.IN.getValue());
            List<UIntegralWaterBills> list1 = integralMapper.selectByExample(this.params2Example(dto));
            long ps1 = list1.stream().mapToLong(p -> p.getNumber()).sum();

            dto.setExitEntryType(PointExitEntryEnum.OUT.getValue());
            List<UIntegralWaterBills> list2 = integralMapper.selectByExample(this.params2Example(dto));
            long ps2 = list2.stream().mapToLong(p -> p.getNumber()).sum();

            if(ps1-ps2>0){//剩余积分
                ps=ps1-ps2;
            }
        }

        return ps;
    }

    private UIntegralWaterBillsExample params2Example(UserIntegralDTO dto){
        UIntegralWaterBillsExample example =new UIntegralWaterBillsExample();
        UIntegralWaterBillsExample.Criteria criteria = example.createCriteria();
        if(!ObjectUtils.isNull(dto.getBusType())){
            criteria.andBusTypeEqualTo(dto.getBusType());
        }
        if(!ObjectUtils.isNull(dto.getCode())&& StringUtils.isNotBlank(dto.getCode().trim())){
            criteria.andCodeEqualTo(dto.getCode());
        }
        if(!ObjectUtils.isNull(dto.getExitEntryType())){
            criteria.andExitEntryTypeEqualTo(dto.getExitEntryType());
        }
        if(!ObjectUtils.isNull(dto.getRelationId())){
            criteria.andRelationIdEqualTo(dto.getRelationId());
        }
        if(!ObjectUtils.isNull(dto.getUserType())){
            criteria.andUserTypeEqualTo(dto.getUserType());
        }
        if(!ObjectUtils.isNull(dto.getUserId())){
            criteria.andUserIdEqualTo(dto.getUserId());
        }

        if(StringUtils.isNotBlank(dto.getSortCase())){
            example.setOrderByClause(dto.getSortCase());
        }else{
            example.setOrderByClause(" id desc ");
        }

        return example;
    }
}
