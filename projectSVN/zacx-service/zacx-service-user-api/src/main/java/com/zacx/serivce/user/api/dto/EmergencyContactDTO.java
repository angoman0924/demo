package com.zacx.serivce.user.api.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class EmergencyContactDTO  implements Serializable {

    private static final long serialVersionUID = -664111371666559386L;

    private Integer id;

    private Integer userId;
    /**
     * 1用户 2司机
     */
    private Integer userType;

    private String name;

    private String phone;

    private String address;

    private String remark;

}
