package com.zacx.serivce.user.service.impl;


import com.zacx.serivce.dal.entity.UUserDriver;
import com.zacx.serivce.dal.entity.UUserDriverExample;
import com.zacx.serivce.dal.mapper.UUserDriverMapper;
import com.zacx.serivce.user.api.dto.UserDriverDTO;
import com.zacx.serivce.user.service.UserDriverService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

/**
* @desc    司机用户
* @version 1.0
* @author  Liang Jun
* @date    2018年10月05日 15:21:30
**/
@Service
public class UserDriverServiceImpl implements UserDriverService {
    @Resource
    private UUserDriverMapper uUserDriverMapper;

    @Override
    public UUserDriver getUserDriverByUserId(int userId) {
        UserDriverDTO dto = new UserDriverDTO();
        dto.setUserId(userId);
        List<UUserDriver> list =  getUserDriverList(dto);
        return list.size()==0 ? null : list.get(0);
    }
    @Override
    public List<UUserDriver> getUserDriverList(UserDriverDTO dto) {
        return uUserDriverMapper.selectByExample(params2example(dto));
    }

    private UUserDriverExample params2example(UserDriverDTO dto){
        UUserDriverExample example = new UUserDriverExample();
        UUserDriverExample.Criteria criteria = example.createCriteria();

        if (null != dto.getId()) {
            criteria.andIdEqualTo(dto.getId());
        }
        if (null != dto.getUserId()) {
            criteria.andUserIdEqualTo(dto.getUserId());
        }
        if (StringUtils.hasText(dto.getSortCase())) {
            example.setOrderByClause(dto.getSortCase());
        }
        return example;
    }
}