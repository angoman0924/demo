package com.zacx.core.util;

import java.beans.PropertyDescriptor;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/**
*@classDesc: 功能描述:(bean缓存用于防止多次反射造成的性能问题)
*@author: 顾理想
*@createTime 2017年10月26日 16:13
*@version: v1.0
*@copyright:
*/
public class BeanCacheUtils {
	private Map<Class<?>, Map<String, PropertyDescriptor>> pdCache = Collections.synchronizedMap(new WeakHashMap<Class<?>, Map<String, PropertyDescriptor>>());

	private BeanCacheUtils(){}
	/** 单例 */
	public static BeanCacheUtils INSTANCE = new BeanCacheUtils();
	
	/**
	 * 获得属性名和{@link PropertyDescriptor}Map映射
	 * @param beanClass Bean的类
	 * @return 属性名和{@link PropertyDescriptor}Map映射
	 */
	public Map<String, PropertyDescriptor> getPropertyDescriptorMap(Class<?> beanClass){
		return  pdCache.get(beanClass);
	}
	
	/**
	 * 加入缓存
	 * @param beanClass Bean的类
	 * @param fieldNamePropertyDescriptorMap 属性名和{@link PropertyDescriptor}Map映射
	 */
	public void putPropertyDescriptorMap(Class<?> beanClass, Map<String, PropertyDescriptor> fieldNamePropertyDescriptorMap){
	 	pdCache.put(beanClass, fieldNamePropertyDescriptorMap);
	}
}
