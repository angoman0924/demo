package com.zacx.serivce.line.api.dto;

import com.zacx.core.model.api.BaseDTO;
import lombok.Data;

import java.util.Date;

/**
 * 班次调整申请
 * Created by song on 2018/10/5.
 */
@Data
public class SchedulingMoveApplyDTO extends BaseDTO {

    private static final long serialVersionUID = -1416644110083892071L;
    private Integer id;

    private String code;

    private Integer userId;

    private Integer driverId;

    private Integer schedulingId;

    private Integer type;

    private String describe;

    private String approverBy;

    private Date approverTime;

    private String approverResult;

    private Integer status;

    private String remark;

    private Date createAt;

    private String createBy;

    private Date modifyAt;

    private String modifyBy;
}
