package com.zacx.serivce.dal.entity.ext;


import com.zacx.serivce.dal.entity.UUserCashWithdrawApply;
import lombok.Data;

/**
* @desc    
* @version 1.0
* @author  Liang Jun
* @date    2018年10月06日 15:23:01
**/
@Data
public class UUserCashWithdrawApplyExt extends UUserCashWithdrawApply {
    //目的账户编码
    private String toBankAccountCode;
    //目的账户名称
    private String toBankAccountName;
    //目的账户描述
    private String toBankAccountDesc;
}