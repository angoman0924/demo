package com.zacx.serivce.dal.enums;

/**
 * 用户类型
 * @author gulx
 * @version 1.0
 * @create 2018-09-26人群 11:16
 * @copyright 上海拜米网络科技有限公司
 **/
public enum UserTypeEnum {
    ORDINARY("普通用户"),
    INTERNAL("护照");
    private String name;
     UserTypeEnum(String group){
        this.name=group;
    }
}
