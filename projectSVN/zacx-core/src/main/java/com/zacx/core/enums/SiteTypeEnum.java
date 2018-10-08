package com.zacx.core.enums;

public enum SiteTypeEnum {
    NORMAL("普通站点");
    private String name;

    SiteTypeEnum(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }
}
