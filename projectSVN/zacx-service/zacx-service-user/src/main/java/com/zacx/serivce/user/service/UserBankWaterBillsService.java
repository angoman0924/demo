package com.zacx.serivce.user.service;


import com.github.pagehelper.PageInfo;
import com.zacx.serivce.dal.entity.UUserBankWaterBills;
import com.zacx.serivce.user.api.dto.UserBankWaterBillsDTO;

import java.util.List;

/**
* @desc    用户账户流水
* @version 1.0
* @author  Liang Jun
* @date    2018年10月07日 12:14:48
**/
public interface UserBankWaterBillsService {
    PageInfo<UUserBankWaterBills> getUserBankWaterBillsPageInfo(UserBankWaterBillsDTO dto);
    List<UUserBankWaterBills> getUserBankWaterBillsList(UserBankWaterBillsDTO dto);
}