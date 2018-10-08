package com.zacx.serivce.user.api.impl;


import com.zacx.core.util.ObjectUtils;
import com.zacx.serivce.dal.entity.UUserCoupon;
import com.zacx.serivce.user.api.CouponServiceApi;
import com.zacx.serivce.user.api.dto.UserCouponDTO;
import com.zacx.serivce.user.service.UserCouponService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
* @desc    优惠券相关服务
* @version 1.0
* @author  Liang Jun
* @date    2018年10月08日 10:49:57
**/
@Service
public class CouponServiceApiImpl implements CouponServiceApi {
    @Resource
    private UserCouponService userCouponService;

    @Override
    public List<UserCouponDTO> getCouponList(UserCouponDTO dto) {
        List<UUserCoupon> uUserCouponList = userCouponService.getUserCouponList(dto);
        return ObjectUtils.ListEntity2ListDTO(uUserCouponList, UserCouponDTO.class);
    }
}