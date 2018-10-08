package com.zacx.serivce.user.api;

import com.github.pagehelper.PageInfo;
import com.zacx.serivce.user.api.dto.BankAccountDTO;
import com.zacx.serivce.user.api.dto.UserBankWaterBillsDTO;
import com.zacx.serivce.user.api.dto.UserCashWithdrawApplyDTO;
import com.zacx.serivce.user.api.dto.UserWalletInfoDTO;

import java.util.List;

/**
 * 用户账户相关api 接口
 * Created by liusi on 2018/10/7.
 */
public interface UserBankServiceApi {

    //新增个人银行卡
    int insert(BankAccountDTO record);

    //查询用户银行卡信息
    List<BankAccountDTO> selectByExample(BankAccountDTO bankAccountDTO);

    //删除银行卡
    int deleteByPrimaryKey(Integer id);

    /**
     * 获取用户钱包信息
     * @param dto
     * @return
     */
    UserWalletInfoDTO getUserWalletInfo(UserWalletInfoDTO dto);
    /**
     * 增加提现申请
     * @param dto
     * @return
     */
    int addCashWithdraw(UserCashWithdrawApplyDTO dto);

    /**
     * 查询提现记录
     * @param dto
     * @return
     */
    List<UserCashWithdrawApplyDTO> getCashWithdrawList(UserCashWithdrawApplyDTO dto);

    /**
     * 查询充值记录
     * @param dto
     * @return
     */
    PageInfo<UserBankWaterBillsDTO> getChargeRecordPageInfo(UserBankWaterBillsDTO dto);
}
