package com.zacx.serivce.order.api.enums;

import lombok.Getter;

import java.util.Optional;

/**
 * @description: 接车状态
 * @author: kiting
 * @date: 2018年10月05日 20:47
 * @version: 1.0
 * @copyright: 上海拜米网络科技有限公司
 **/
@Getter
public enum RelayTypeEnum {
    NON(0, "无接送"),
    TAKE(1, "接"),
    GIVE(2, "送"),
    BOTH(3, "接送");

    private Integer code;
    private String desc;

    RelayTypeEnum(Integer code, String desc){
        this.code=code;
        this.desc=desc;
    }

    public static Optional<RelayTypeEnum> get(Integer code){
        for(RelayTypeEnum p: RelayTypeEnum.values()){
            if(p.code.equals(code)){
                return Optional.of(p);
            }
        }
        return Optional.empty();
    }

}
