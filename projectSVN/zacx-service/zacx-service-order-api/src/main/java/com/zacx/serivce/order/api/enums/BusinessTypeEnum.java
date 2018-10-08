package com.zacx.serivce.order.api.enums;

import lombok.Getter;

import java.util.Optional;

/**
 * @description: 业务类型（1班线 2包车）
 * @author: kiting
 * @date: 2018年10月05日 20:47
 * @version: 1.0
 * @copyright: 上海拜米网络科技有限公司
 **/
@Getter
public enum BusinessTypeEnum {
    PLAN(1, "班车业务"),
    CHARTERED(2, "包车业务");

    private Integer code;
    private String desc;

    BusinessTypeEnum(Integer code, String desc){
        this.code=code;
        this.desc=desc;
    }

    public static Optional<BusinessTypeEnum> get(Integer code){
        for(BusinessTypeEnum p: BusinessTypeEnum.values()){
            if(p.code.equals(code)){
                return Optional.of(p);
            }
        }
        return Optional.empty();
    }

}
