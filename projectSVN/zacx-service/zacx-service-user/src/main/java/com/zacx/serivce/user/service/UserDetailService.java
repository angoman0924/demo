package com.zacx.serivce.user.service;


import com.zacx.serivce.dal.entity.UUserDetail;

/**
* @desc    乘客用户
* @version 1.0
* @author  Liang Jun
* @date    2018年10月05日 15:20:26
**/
public interface UserDetailService {
    UUserDetail getUserDetailByUserId(int userId);
    int updateUserDetailById(UUserDetail uUserDetail);
}