package com.zacx.serivce.basic.api.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by song on 2018/10/6.
 */
@Data
public class SConfigDTO implements Serializable {
    private static final long serialVersionUID = 654706581953801549L;
    /**
     *
     */
    private Integer id;

    /**
     * key组
     */
    private String group;

    /**
     * key组说明
     */
    private String groupName;

    /**
     *
     */
    private String configKey;

    /**
     *
     */
    private String configValue;

    /**
     * 扩展信息
     */
    private String extendInfo;

    /**
     * 描述
     */
    private String describe;

    /**
     * 状态：0无效 1有效
     */
    private Integer status;
}
