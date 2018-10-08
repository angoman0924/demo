package com.zacx.serivce.user.service;


import com.zacx.serivce.dal.entity.UUserCashWithdrawApply;
import com.zacx.serivce.dal.entity.ext.UUserCashWithdrawApplyExt;
import com.zacx.serivce.user.api.dto.UserCashWithdrawApplyDTO;

import java.util.List;

/**
* @desc    用户提现申请
* @version 1.0
* @author  Liang Jun
* @date    2018年10月06日 13:02:24
**/
public interface UserCashWithdrawApplyService {
    /**
     * 新增用户提现申请
     * @param entity
     * @return
     */
    int addUserCashWithdrawApply(UUserCashWithdrawApply entity);

    List<UUserCashWithdrawApply> getUserCashWithdrawApplyList(UserCashWithdrawApplyDTO dto);

    /**
     * 查询扩展列表
     * @param dto
     * @return
     */
    List<UUserCashWithdrawApplyExt> getUserCashWithdrawApplyExtList(UserCashWithdrawApplyDTO dto);
}