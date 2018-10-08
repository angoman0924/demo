package com.zacx.serivce.user.api.dto;


import com.zacx.core.enums.PlatformEnum;
import com.zacx.core.model.api.BaseDTO;
import lombok.Data;

import java.util.Date;

/**
* @desc    报警
* @version 1.0
* @author  Liang Jun
* @date    2018年10月05日 19:39:17
**/
@Data
public class AlarmDTO extends BaseDTO {
    private Integer id;

    private String code;

    private Integer userId;

    private Integer userType;

    private String coordinate;

    private Date time;

    private String describe;

    private String disposeResults;

    private Date disposeTime;
    //状态
    private Integer status;
    //平台类型
    private PlatformEnum platform;
}