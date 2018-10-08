package com.zacx.serivce.user.service.impl;


import com.github.pagehelper.PageHelper;
import com.zacx.serivce.dal.entity.UUserCoupon;
import com.zacx.serivce.dal.entity.UUserCouponExample;
import com.zacx.serivce.dal.mapper.UUserCouponMapper;
import com.zacx.serivce.user.api.dto.UserCouponDTO;
import com.zacx.serivce.user.service.UserCouponService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

/**
* @desc     用户优惠券
* @version 1.0
* @author  Liang Jun
* @date    2018年10月05日 10:16:07
**/
@Service
public class UserCouponServiceImpl implements UserCouponService {
    @Resource
    private UUserCouponMapper uUserCouponMapper;

    @Override
    public List<UUserCoupon> getUserCouponList(UserCouponDTO dto) {
        PageHelper.startPage(dto.getPageIndex(),dto. getPageSize());
        List<UUserCoupon> uUserCouponList = uUserCouponMapper.selectByExample(this.params2example(dto));
        return uUserCouponList;
    }

    private UUserCouponExample params2example(UserCouponDTO dto){
        UUserCouponExample example = new UUserCouponExample();
        UUserCouponExample.Criteria criteria = example.createCriteria();

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