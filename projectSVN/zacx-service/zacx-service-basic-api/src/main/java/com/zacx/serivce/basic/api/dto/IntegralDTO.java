package com.zacx.serivce.basic.api.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 积分
 * Created by song on 2018/10/7.
 */
@Data
public class IntegralDTO implements Serializable {
    private static final long serialVersionUID = 4980752046497640930L;
    private Integer id;

    /**
     * 积分类型名称
     */
    private String name;

    /**
     * 积分点数
     */
    private Integer point;

    /**
     * 方向（加或减）: 0减 1加
     */
    private Integer direction;

    private String remark;
}
