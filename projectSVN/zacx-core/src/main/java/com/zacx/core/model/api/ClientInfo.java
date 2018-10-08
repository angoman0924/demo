package com.zacx.core.model.api;

import com.zacx.core.enums.SourceEnum;
import lombok.Data;

/**
 * 手机请求通用参数
 *
 * @author gulx
 * @version 1.0
 * @create 2018-09-26 17:06
 * @copyright 上海拜米网络科技有限公司
 **/
@Data
public class ClientInfo {
    //手机纬度
    private Double lat;
    //手机经度
    private Double lng;
    //请求来源
    private SourceEnum source;
    //APP的版本号
    private String version;
    //用户ID
    private Integer userId;
}
