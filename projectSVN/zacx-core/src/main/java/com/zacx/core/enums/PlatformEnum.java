package com.zacx.core.enums;

import java.util.Optional;

/**
* @author gulx
* @Description 系统类型
* @Date  2018/9/26 11:05
* @Param
* @copyright 上海拜米网络科技有限公司
* @return
**/
public enum PlatformEnum {
    PASSENGER,//乘客端
    DRIVER,//司机端
    OPERATOR;//运营端

    public static Optional<PlatformEnum> get(String platform){
        for(PlatformEnum p: PlatformEnum.values()){
            if(p.toString().equals(platform)){
                return Optional.of(p);
            }
        }
        return Optional.empty();
    }
}
