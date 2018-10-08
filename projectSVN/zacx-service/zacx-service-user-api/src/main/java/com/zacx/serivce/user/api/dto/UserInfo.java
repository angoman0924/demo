package com.zacx.serivce.user.api.dto;

import com.zacx.core.enums.PlatformEnum;
import com.zacx.core.enums.SourceEnum;
import com.zacx.core.model.api.ClientInfo;
import lombok.Data;

/**
 * 用户详情表
 * @author gulx
 * @version 1.0
 * @create 2018-09-27 14:28
 * @copyright 上海拜米网络科技有限公司
 **/
@Data
public class UserInfo {
    //令牌
    private String token;
    //邮箱
    private String email;
    //手机号码
    private String mobile;
    //验证码
    private String verificationCode;
    //平台账号
    private PlatformEnum platform;
    //通用参数
    private ClientInfo clientInfo;
    //手机纬度
    private Double lat;
    //手机经度
    private Double lng;
    //请求来源
    private SourceEnum source;
    //APP的版本号
    private String version;

}
