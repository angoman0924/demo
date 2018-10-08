package com.zacx.serivce.user.service;

import com.zacx.serivce.user.api.dto.BankAccountDTO;

import java.util.List;

/**
 * 用户银行卡Servie接口
 * Created by liusi on 2018/10/7.
 */
public interface BankAccountService {

    //新增个人银行卡
    int insert(BankAccountDTO bankAccountDTO);

    //查询用户银行卡信息 UUserBankAccountExample
    List<BankAccountDTO> selectByExample(BankAccountDTO bankAccountDTO);

    //删除银行卡
    int deleteByPrimaryKey(Integer id);

    //通过银行卡号查询所在银行名称
    String queryBankNameByCardNumber(String cardNumber);
}
