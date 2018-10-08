package com.zacx.serivce.user.api.dto;


import com.zacx.core.model.api.BaseDTO;
import lombok.Data;

import java.math.BigDecimal;

/**
* @desc    司机用户
* @version 1.0
* @author  Liang Jun
* @date    2018年10月05日 15:24:29
**/
@Data
public class UserDriverDTO extends BaseDTO {
    private Integer id;

    private Integer userId;

    private String roleIds;

    private String headPortrait;

    private String accountName;

    private String address;

    private Integer integral;

    private BigDecimal wallet;

    private String payPwd;

    private Integer status;

    private String remark;
}