package com.zacx.core.annotation;



import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @classDesc: 功能描述:(可以跳过拦截器，也可以设置函数钩子)
 * @author: 顾理想
 * @createTime: 2017年12月29日 10:02
 * @version: v1.0
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MethodFlag {

    /**
    *@methodDesc: 功能描述:(是否跳过过滤器，拦截器不会拦截此方法)
     * 如果你的方法不想被签名，想返回任意数据类型，想参数是任意类型，那么把这个属性设置为true
    *@author: 顾理想
    *@createTime 2017年12月29日 18:15
    *@returnType
    */
    boolean jumpFilter() default  true;

}
