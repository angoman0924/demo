package com.zacx.serivce.user.api.dto;


import lombok.Data;

import java.math.BigDecimal;

/**
* @desc    缓存登录信息
* @version 1.0
* @author  Liang Jun
* @date    2018年10月06日 20:16:17
**/
@Data
public class SessionUser {
    //用户ID
    private Integer id;
    //用户角色ID
    private String roleIds;
    /** 用户昵称*/
    private String nickName;
    /** 注册城市*/
    private Integer cityId;
    /** 注册坐标*/
    private String coordinate;
    /** 我的钱包: 默认0，元为单位 */
    private BigDecimal wallet;
    /** 积分 */
    private Integer integral;
    /** 头像 */
    private String headPortrait;
    /** 邀请人id */
    private String inviteUserId;
    /** 详细地址*/
    private String address;
    /** 状态: 1正常 0锁定 */
    private Integer status;
    /** 备注 */
    private String remark;
    /** 前端TOKEN */
    private String token;
}