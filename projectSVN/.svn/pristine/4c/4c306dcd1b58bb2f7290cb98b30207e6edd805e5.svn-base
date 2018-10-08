package com.zacx.serivce.user.service.impl;


import com.zacx.serivce.dal.entity.UUserDetail;
import com.zacx.serivce.dal.entity.UUserDetailExample;
import com.zacx.serivce.dal.mapper.UUserDetailMapper;
import com.zacx.serivce.user.service.UserDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
* @desc    乘客用户
* @version 1.0
* @author  Liang Jun
* @date    2018年10月07日 16:00:42
**/
@Service
public class UserDetailServiceImpl implements UserDetailService {
    @Resource
    private UUserDetailMapper uUserDetailMapper;

    @Override
    public UUserDetail getUserDetailByUserId(int userId) {
        UUserDetailExample example = new UUserDetailExample();
        example.createCriteria().andUserIdEqualTo(userId);
        List<UUserDetail> uUserDetailList = uUserDetailMapper.selectByExample(example);
        return uUserDetailList.size() == 0 ? null : uUserDetailList.get(0);
    }

    @Override
    public int updateUserDetailById(UUserDetail uUserDetail) {
        return uUserDetailMapper.updateByPrimaryKeySelective(uUserDetail);
    }
}