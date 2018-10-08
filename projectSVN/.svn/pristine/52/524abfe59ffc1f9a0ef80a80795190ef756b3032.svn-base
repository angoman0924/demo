package com.zacx.core.model.api;

import com.zacx.core.enums.PlatformEnum;

import java.io.Serializable;

/**
 * 登陆成功后的实体类
 *
 * @author gulx
 * @version 1.0
 * @create 2018-09-26 13:29
 * @copyright 上海拜米网络科技有限公司
 **/
public class TokenInfo implements Serializable {
    //存JWT使用
    public static final String PLATFORM_KEY="platform";
    //存JWT使用
    public static final String ROLES_KEY="roles";

    private Integer userId;

    //平台的拥有的角色列表,已逗号分隔
    private String roles;

    //登陆的系统平台
    private PlatformEnum platform;

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public PlatformEnum getPlatform() {
        return platform;
    }

    public void setPlatform(PlatformEnum platform) {
        this.platform = platform;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "TokenInfo{" +
                "userId=" + userId +
                ", roles='" + roles + '\'' +
                ", platform=" + platform +
                '}';
    }


}
