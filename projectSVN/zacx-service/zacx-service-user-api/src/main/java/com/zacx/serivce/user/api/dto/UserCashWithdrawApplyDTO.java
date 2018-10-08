package com.zacx.serivce.user.api.dto;


import com.zacx.core.model.api.BaseDTO;
import lombok.Data;

import java.util.Date;

/**
* @desc    提现
* @version 1.0
* @author  Liang Jun
* @date    2018年10月06日 12:17:00
**/
@Data
public class UserCashWithdrawApplyDTO extends BaseDTO {
    private Integer id;

    private String code;

    private Integer userId;

    private Integer userType;

    private Integer bankAccountId;

    private Double money;

    private Integer toBankAccountId;

    private String toBankAccountCode;

    private String toBankAccountName;

    private String toBankAccountDesc;

    private Date applyTime;

    private Integer status;

    private String remark;

    private Date createAt;
}