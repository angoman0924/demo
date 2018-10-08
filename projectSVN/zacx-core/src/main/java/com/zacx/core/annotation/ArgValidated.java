package com.zacx.core.annotation;

import java.lang.annotation.*;

/**
 * @classDesc: 功能描述:(用于验证的注解)
 * @author: 顾理想
 * @createTime: 2017年05月19日 16:33
 * @version: v1.0
 * @copyright:善林科技
 */
@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ArgValidated {
    /**
     * 验证分组
     * @return
     */
    Class<?>[] value() default {};

    /**
    *@methodDesc: 功能描述:(当参数是null的时候，给用户的错误提示信息)
    *@author: 顾理想
    *@createTime 2017年05月19日 17:35
    *@returnType
    *@copyright:善林科技
    */
    String ifNullTips()default "参数不能为空";
}
