package com.zacx.core.enums;
/**
* @author gulx
* @Description 布尔类型的枚举(启用禁用，删除未删除等)
* @Date  2018/9/26 11:55
* @Param 
* @copyright 上海拜米网络科技有限公司
* @return 
**/
public enum BooleanEnum {
    TRUE(1),FALSE(0);

    private Integer value;
    BooleanEnum(Integer value){

        this.value=value;
    }
    public Integer getValue() {
        return value;
    }

}
