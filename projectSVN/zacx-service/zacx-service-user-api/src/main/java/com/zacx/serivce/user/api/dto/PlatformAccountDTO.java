package com.zacx.serivce.user.api.dto;

import lombok.Data;

import java.util.Date;

@Data
public class PlatformAccountDTO {
    private Integer id;

    private String platform;

    private String status;

    private Long userId;

    private String roleIds;

    private Date createdat;

    private Date updatedat;
}