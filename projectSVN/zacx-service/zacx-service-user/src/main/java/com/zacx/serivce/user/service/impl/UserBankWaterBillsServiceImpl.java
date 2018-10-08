package com.zacx.serivce.user.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zacx.serivce.dal.entity.UUserBankWaterBills;
import com.zacx.serivce.dal.entity.UUserBankWaterBillsExample;
import com.zacx.serivce.dal.mapper.UUserBankWaterBillsMapper;
import com.zacx.serivce.user.api.dto.UserBankWaterBillsDTO;
import com.zacx.serivce.user.service.UserBankWaterBillsService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

/**
* @desc    用户账户流水
* @version 1.0
* @author  Liang Jun
* @date    2018年10月07日 12:19:00
**/
@Service
public class UserBankWaterBillsServiceImpl implements UserBankWaterBillsService {
    @Resource
    private UUserBankWaterBillsMapper uUserBankWaterBillsMapper;

    @Override
    public PageInfo<UUserBankWaterBills> getUserBankWaterBillsPageInfo(UserBankWaterBillsDTO dto) {
        PageHelper.startPage(dto.getPageIndex(), dto.getPageSize());
        List<UUserBankWaterBills> list = uUserBankWaterBillsMapper.selectByExample(params2example(dto));
        return new PageInfo<>(list);
    }

    @Override
    public List<UUserBankWaterBills> getUserBankWaterBillsList(UserBankWaterBillsDTO dto) {
        PageHelper.startPage(dto.getPageIndex(), dto.getPageSize());
        return uUserBankWaterBillsMapper.selectByExample(params2example(dto));
    }

    private UUserBankWaterBillsExample params2example(UserBankWaterBillsDTO dto){
        UUserBankWaterBillsExample example = new UUserBankWaterBillsExample();
        UUserBankWaterBillsExample.Criteria criteria = example.createCriteria();

        if (null != dto.getId()) {
            criteria.andIdEqualTo(dto.getId());
        }
        if (dto.getUserId() != null) {
            criteria.andUserIdEqualTo(dto.getUserId());
        }
        if (StringUtils.hasText(dto.getSortCase())) {
            example.setOrderByClause(dto.getSortCase());
        }
        return example;
    }
}