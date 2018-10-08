package com.zacx.serivce.user.api.dto;

import com.zacx.core.enums.PlatformEnum;
import com.zacx.core.enums.SourceEnum;
import lombok.Data;

/**
 * 登陆请求类
 *
 * @author gulx
 * @version 1.0
 * @create 2018-09-27 14:51
 * @copyright 上海拜米网络科技有限公司
 **/
@Data
public class LoginInfoDTO {
    private String mobile;
    private String verificationCode;
    private SourceEnum source;
    private Double lat;
    private Double lng;
    private PlatformEnum platform;
    private String version;
}
