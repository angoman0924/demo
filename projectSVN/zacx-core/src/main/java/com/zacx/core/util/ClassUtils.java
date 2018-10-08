package com.zacx.core.util;


import com.zacx.core.enums.Code;
import com.zacx.core.exceptions.BaseRTException;
import com.google.common.base.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
*@classDesc: 功能描述:(Class 帮助类)
*@author: 顾理想
*@createTime 2017年06月13日 16:35
*@version: v1.0
*@copyright:
*/
public class ClassUtils {
    public static final Logger LOGGER = LoggerFactory.getLogger(ClassUtils.class);
    private static final String java_util_Map = "java.util.Map";
    public static final Set<String> objectMethods = new HashSet<String>(7);
    static {
        objectMethods.add("wait");
        objectMethods.add("equals");
        objectMethods.add("toString");
        objectMethods.add("getClass");
        objectMethods.add("hashCode");
        objectMethods.add("notifyAll");
        objectMethods.add("notify");
    }
    private ClassUtils(){

    }
   

    /**
     *@methodDesc: 功能描述:(根据方法名获取方法)
     *@author: 顾理想
     *@param obj 对象
     *@param methodName 方法名
     *@createTime 2017年06月13日 16:34
     *@returnType java.lang.reflect.Method
     *@copyright:
     */
    public static Method getMethodByName(Object obj, String methodName){
        LOGGER.debug("参数：obj:{},methodName:{}",obj,methodName);
        Method[] methodArray  = obj.getClass().getMethods();
        for (Method method : methodArray) {
            if(method.getName().equals(methodName)){
               return method;
            }
        }
        LOGGER.error("没有找到方法："+methodName);
        throw new BaseRTException(Code.ERROR_SERVER_FAIL,"没有找到方法:"+methodName);
    }
    /**
     *@methodDesc: 功能描述:(判断一个对象上面的方法是否是Object方法)
     *@author: 顾理想
     *@param methodName
     *@createTime 2017年06月14日 15:20
     *@returnType boolean
     *@copyright:
     */
    public static boolean isObjectMethod(String methodName){
        return objectMethods.contains(methodName);
    }


    /**
     *@methodDesc: 功能描述:(获取方法指定参数的实例对象)
     *@author: 顾理想
     *@param method 方法
     * @param index 参数下标
     *@createTime 2017年06月13日 16:32
     *@returnType
     *@copyright:
     */
    public static <T> T getMethodParameterInstance(Method method,int index){
        LOGGER.debug("参数：method:{},index:{}",method,index);
        Class<?>[] types = method.getParameterTypes();
        return newInstance(types[index].getName());
    }
    /**
    *@methodDesc: 功能描述:(获取方法第一个参数的实例对象)
    *@author: 顾理想
    *@param method
    *@createTime 2017年06月13日 16:32
    *@returnType
    *@copyright:
    */
    public static <T> T getMethodParameterInstance(Method method){
       return getMethodParameterInstance(method,0);
    }
    /**
    *@methodDesc: 功能描述:(通过完成类名实例化对象)
    *@author: 顾理想
    *@param clazz 完整的类名 例如:com.ls.User
    *@createTime 2017年06月13日 16:31
    *@returnType
    *@copyright:
    */
    public static <T> T newInstance(String clazz) {
        LOGGER.debug("参数：clazz:{}",clazz);
        try {
            if(java_util_Map.equals(clazz)){
                clazz = "java.util.HashMap";
            }
            return (T) Class.forName(clazz).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        throw new BaseRTException(Code.ERROR_SERVER_FAIL,"实例化对象错误:"+clazz);


    }
    /**
     *@methodDesc: 功能描述:(反射调用方法)
     *@author: 顾理想
     *@param obj 对象
     *@param methodName 方法名称
     *@param args 参数
     *@createTime 2017年06月13日 16:30
     *@returnType java.lang.Object
     *@copyright:
     */
    public static Object invokeMethod(Object obj, String methodName, Object... args)throws InvocationTargetException, IllegalArgumentException {
            LOGGER.debug("参数：obj:{},methodName:{},args:{}",obj,methodName,args);
            Method method = getMethodByName(obj,methodName);
            Object parameter = getMethodParameterInstance(method);
            if(parameter==null){
                Object result =  invoke(obj,method,null);
                LOGGER.info("{}返回结果 {}",methodName,result);
            }
            Object result =  invoke(obj,method,parameter);
            LOGGER.info("{}返回结果 {}",methodName,result);
            return result;
    }

    /**
    *@methodDesc: 功能描述:(反射调用一个对象的方法)
    *@author: 顾理想
    *@param obj 被调用的对象
     *@param methodName 方法名
     * @param args 参数
    *@createTime 2017年06月29日 16:00
    *@returnType
    *@copyright:
    */
    public static Object invoke(Object obj, String methodName, Object... args) throws InvocationTargetException {
        Method method = getMethodByName(obj,methodName);
        if(method==null){
            throw new BaseRTException(Code.ERROR_SERVER_FAIL,"未定义的方法:"+methodName);
        }
        return invoke(obj,method,args);
    }

    @SuppressWarnings("unchecked")
    public static Object invoke(Object obj, Method method, Object... args) throws InvocationTargetException, IllegalArgumentException {
        if (false == method.isAccessible()) {
            method.setAccessible(true);
        }
        try {
            return  method.invoke(isStatic(method) ? null : obj, args);
        } catch (IllegalAccessException e) {
             e.printStackTrace();
             LOGGER.error(e.getMessage());
        }
        return null;
    }


    /**
    *@methodDesc: 功能描述:(判断方法是否为静态方法)
    *@author: 顾理想
    *@param method 方法对象
    *@createTime 2017年06月13日 16:36
    *@returnType
    *@copyright:
    */
    public static boolean isStatic(Method method) {
        return Modifier.isStatic(method.getModifiers());
    }

    /**
     *@methodDesc: 功能描述:(获取一个对象的属性，不管是私有还是公有的)
     *@author: 顾理想
     *@param propertyName 属性名称
     *@param object 属性所在的对象
     *@createTime 2017年10月17日 10:25
     *@returnType com.google.constants.base.Optional<java.lang.Object>
     *@copyright:
     */
    public static Optional<Object> getObjectValue(Object object,String propertyName){
        Optional<Field> fieldOptional =  getFieldByName(object,propertyName);
        if(fieldOptional.isPresent()){
            Field bodyField = fieldOptional.get();
            bodyField.setAccessible(true);
            try {
                return Optional.fromNullable(bodyField.get(object));
            } catch (IllegalAccessException e) {
                LOGGER.error("获取对象属性失败");
                e.printStackTrace();
            }
        }
        return Optional.absent();
    }
    /**
     *@methodDesc: 功能描述:(根据对象的属性名获取属性的Field对象)
     *@author: 顾理想
     *@param object
     *@param propertyName
     *@createTime 2017年11月14日 11:00
     *@returnType com.google.common.base.Optional<java.lang.reflect.Field>
     *@copyright:
     */
    public static Optional<Field> getFieldByName(Object object,String propertyName){
        Field bodyField = null;
        Class tmpClass = object.getClass();
        while (tmpClass!=null){
            try {
                bodyField=tmpClass.getDeclaredField(propertyName);
                break;
            } catch (NoSuchFieldException e1) {
                tmpClass=tmpClass.getSuperclass();
            }
        }

        if(bodyField==null){
            LOGGER.error("没有获取到属性：{}",propertyName);
        }
       return Optional.fromNullable(bodyField);
    }

    /**
     *@methodDesc: 功能描述:(设置一个对象的属性值，不管是公有还是私有)
     *@author: 顾理想
     *@param object 要设置的对象
     *@param propertyName 要设置的属性名称
     *@param objectValue 要设置的值
     *@createTime 2017年10月17日 10:37
     *@returnType void
     *@copyright:
     */
    public static void setObjectValue(Object object,String propertyName,Object objectValue){
        Optional<Field> fieldOptional =  getFieldByName(object,propertyName);
        if(fieldOptional.isPresent()){
            Field bodyField = fieldOptional.get();
            bodyField.setAccessible(true);
            try {
                bodyField.set(object,objectValue);
            } catch (IllegalAccessException e) {
                LOGGER.error("设置属性值发生异常：{}",propertyName);
                e.printStackTrace();
            }
        }
    }




    /**
    *@methodDesc: 功能描述:(获得字段名和字段描述Map，获得的结果会缓存在 {@link BeanCacheUtils}中)
    *@author: 顾理想
    *@param clazz Bean类
    *@createTime 2017年10月26日 16:39
    *@returnType   字段名和字段描述Map
    *@copyright:
    */
    public static Map<String, PropertyDescriptor> getPropertyDescriptorMap(Class<?> clazz) throws IntrospectionException{
        Map<String, PropertyDescriptor> map = BeanCacheUtils.INSTANCE.getPropertyDescriptorMap(clazz);
        if(null == map){
            map = internalGetPropertyDescriptorMap(clazz);
            BeanCacheUtils.INSTANCE.putPropertyDescriptorMap(clazz, map);
        }
        return map;
    }


    /**
    *@methodDesc: 功能描述:(获得字段名和字段描述Map。内部使用，直接获取Bean类的PropertyDescriptor)
    *@author: 顾理想
    *@param clazz Bean类
    *@createTime 2017年10月26日 16:39
    *@returnType 字段名和字段描述Map
    *@copyright:
    */
    private static Map<String, PropertyDescriptor> internalGetPropertyDescriptorMap(Class<?> clazz) throws IntrospectionException{
        final PropertyDescriptor[] propertyDescriptors = getPropertyDescriptors(clazz);
        final Map<String, PropertyDescriptor> map =  new HashMap<String, PropertyDescriptor>((int) (propertyDescriptors.length), 1);

        for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {
            map.put(propertyDescriptor.getName(), propertyDescriptor);
        }
        return map;
    }


    /**
    *@methodDesc: 功能描述:(获得Bean字段描述数组)
    *@author: 顾理想
    *@param clazz Bean类
    *@createTime 2017年10月26日 16:40
    *@returnType
    *@copyright:
    */
    public static PropertyDescriptor[] getPropertyDescriptors(Class<?> clazz) throws IntrospectionException {
        return Introspector.getBeanInfo(clazz).getPropertyDescriptors();
    }

    /**
     * 对象转Map
     *
     * @param <T> Bean类型
     * @param bean bean对象
     * @param ignoreNullValue 是否忽略值为空的字段
     * @return Map
     */
    /**
    *@methodDesc: 功能描述:(把对象转换成map)
    *@author: 顾理想
    *@param <T> Bean类型
     *@param ignoreNullValue 是否忽略值为空的字段
    *@createTime 2017年10月26日 17:19
    *@returnType
    *@copyright:
    */
    public static <T> Map<String, Object> beanToMap(T bean, boolean ignoreNullValue) {
        Map<String, Object> map = new HashMap<String, Object>();
        if (bean == null) {
            LOGGER.error("bean 对象不能为null");
            return map;
        }
        try {
            final PropertyDescriptor[] propertyDescriptors = getPropertyDescriptors(bean.getClass());
            for (PropertyDescriptor property : propertyDescriptors) {
                String key = property.getName();
                // 过滤class属性
                if (false == key.equals("class") && false == key.equals("declaringClass")) {
                    // 得到property对应的getter方法
                    Method getter = property.getReadMethod();
                    if(getter!=null){
                        Object value = getter.invoke(bean);
                        if (false == ignoreNullValue || (null != value && false == value.equals(bean))) {
                            map.put(key, value);
                        }
                    }

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.error("beanToMap 发生异常:{}",e);
        }
        return map;
    }

}
