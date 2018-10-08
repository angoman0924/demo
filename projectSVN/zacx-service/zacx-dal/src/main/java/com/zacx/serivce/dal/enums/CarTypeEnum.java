package com.zacx.serivce.dal.enums;
/**
* @author gulx
* @Description 汽车类型
* @Date  2018/9/29 10:47
* @copyright 上海拜米网络科技有限公司
* @return 
**/
public enum CarTypeEnum {
    SEDAN("小轿车"),
    MPV("商务车"),
    SUV("SUV");
    private String type;
    CarTypeEnum(String type){
        this.type =type;
    }

    public String getType() {
        return type;
    }
}
