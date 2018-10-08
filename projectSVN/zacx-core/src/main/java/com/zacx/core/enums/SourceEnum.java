package com.zacx.core.enums;

import lombok.Getter;

import java.util.Optional;

/**
* @author gulx
* @Description 数据来源
* @Date  2018/9/26 11:55
* @Param 
* @copyright 上海拜米网络科技有限公司
* @return 
**/
@Getter
public enum SourceEnum {
    OTHER(0, "其它"),
    IOS(1, "IOS"),
    ANDROID(2, "Android"),
    WX_XCX(3, "微信小程序"),
    PC(4, "PC"),
    H5(5, "H5");

    private Integer code;
    private String desc;

    SourceEnum(Integer code, String desc){
        this.code=code;
        this.desc=desc;
    }

    public static Optional<SourceEnum> get(Integer code){
        for(SourceEnum p:SourceEnum.values()){
            if(p.getCode().equals(code)){
                return Optional.of(p);
            }
        }
        return Optional.empty();
    }

    public static Optional<SourceEnum> getByName(String name){
        for(SourceEnum p:SourceEnum.values()){
            if(p.toString().equals(name)){
                return Optional.of(p);
            }
        }
        return Optional.empty();
    }

}
