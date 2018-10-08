package com.zacx.serivce.line.api.dto;

import com.zacx.core.model.api.BaseDTO;
import lombok.Data;

/**
 * 排班历史查询条件
 * Created by song on 2018/10/5.
 */
@Data
public class QuerySchedulingHistoryConditionDTO extends BaseDTO {
    private static final long serialVersionUID = -760689973230776287L;

    /**
     * 查询id
     */
    private Integer queryId;

    /**
     * 查询类别 true 按driver查、false按car查
     */
    private boolean flag;
}
