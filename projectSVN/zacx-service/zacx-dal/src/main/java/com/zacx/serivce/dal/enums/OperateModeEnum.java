package com.zacx.serivce.dal.enums;
/**
* @author gulx
* @Description 运营模式
* @Date  2018/9/29 10:47
* @copyright 上海拜米网络科技有限公司
* @return 
**/
public enum OperateModeEnum {
    PROPRIETARY("自营班车（范围接送）"),
    CHARTERED_CAR("自营包车（无限范围接送）"),
    NON_PROPRIETARY("非自营班车（固定站点）");
    private String mode;
    OperateModeEnum(String mode){
        this.mode=mode;
    }

    public String getMode() {
        return mode;
    }
}
