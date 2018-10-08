package com.zacx.serivce.dal.enums;

import com.zacx.core.enums.SourceEnum;
import lombok.Getter;

import java.util.Optional;

/**
 * 证件类型: 1身份证 2驾驶证 3军官证 4护照 5其他
 *
 * @author gulx
 * @version 1.0
 * @create 2018-09-26人群 11:16
 * @copyright 上海拜米网络科技有限公司
 **/
@Getter
public enum CardTypeEnum {
    ID(1, "身份证"),
    DRIVER(2, "驾驶证"),
    OFFICER(3, "军官证"),
    PASSPORT(4, "护照"),
    OTHER(5, "其他");

    private Integer code;
    private String name;

    CardTypeEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public static Optional<CardTypeEnum> get(Integer code){
        for(CardTypeEnum p:CardTypeEnum.values()){
            if(p.toString().equals(code)){
                return Optional.of(p);
            }
        }
        return Optional.empty();
    }

}
