package com.zacx.serivce.user.service;

import com.github.pagehelper.PageInfo;
import com.zacx.serivce.dal.entity.UIntegralWaterBills;
import com.zacx.serivce.user.api.dto.UserIntegralDTO;
import com.zacx.serivce.user.api.exceptions.UserServiceException;

import java.util.List;

/**
 * 用户积分内部服务
 * Created by song on 2018/10/7.
 */
public interface UserIntegralSerivce {

    Integer insert(UIntegralWaterBills record) throws UserServiceException;

    int removeByIds(List<Integer> ids) throws UserServiceException;

    UIntegralWaterBills findByPrimaryKey(Integer id);

    UIntegralWaterBills findByCode(String code);

    //积分流水列表
    PageInfo<UIntegralWaterBills> getIntegeralPageInfo(UserIntegralDTO dto);

    //总积分
    long totalPoint(UserIntegralDTO dto);
}
