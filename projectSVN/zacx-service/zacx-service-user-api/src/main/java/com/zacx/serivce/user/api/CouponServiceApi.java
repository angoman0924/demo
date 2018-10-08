package com.zacx.serivce.user.api;


import com.zacx.serivce.user.api.dto.UserCouponDTO;

import java.util.List;

/**
* @desc    优惠券相关服务
* @version 1.0
* @author  Liang Jun
* @date    2018年10月08日 10:48:43
**/
public interface CouponServiceApi {
    /**
     * 获取优惠券列表
     * @param dto
     * @return
     */
    List<UserCouponDTO> getCouponList(UserCouponDTO dto);
}