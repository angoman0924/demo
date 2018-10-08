package com.zacx.core.util;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @classDesc: 功能描述:(类型判断工具类)
 * @author: 顾理想
 * @createTime: 2017年06月05日 13:46
 * @version: v1.0
 * @copyright:
 */
public enum BasicTypeUtils {
    BYTE, SHORT, INT, INTEGER, LONG, DOUBLE, FLOAT, BOOLEAN, CHAR, CHARACTER, STRING;

    /** 原始类型为Key，包装类型为Value，例如： int.class =》 Integer.class. */
    public static final Map<Class<?>, Class<?>> wrapperPrimitiveMap = new HashMap<Class<?>, Class<?>>(8);
    /** 包装类型为Key，原始类型为Value，例如： Integer.class =》 int.class. */
    public static final Map<Class<?>, Class<?>> primitiveWrapperMap = new HashMap<Class<?>, Class<?>>(8);

    static {
        wrapperPrimitiveMap.put(Boolean.class, boolean.class);
        wrapperPrimitiveMap.put(Byte.class, byte.class);
        wrapperPrimitiveMap.put(Character.class, char.class);
        wrapperPrimitiveMap.put(Double.class, double.class);
        wrapperPrimitiveMap.put(Float.class, float.class);
        wrapperPrimitiveMap.put(Integer.class, int.class);
        wrapperPrimitiveMap.put(Long.class, long.class);
        wrapperPrimitiveMap.put(Short.class, short.class);

        for (Map.Entry<Class<?>, Class<?>> entry : wrapperPrimitiveMap.entrySet()) {
            primitiveWrapperMap.put(entry.getValue(), entry.getKey());
        }
    }

    /**
     * 原始类转为包装类，非原始类返回原类
     * @param clazz 原始类
     * @return 包装类
     */
    public static Class<?> wrap(Class<?> clazz){
        if(null == clazz || false == clazz.isPrimitive()){
            return clazz;
        }
        Class<?> result = primitiveWrapperMap.get(clazz);
        return (null == result) ? clazz : result;
    }

    /**
    *@methodDesc: 功能描述:(包装类转为原始类，非包装类返回原类)
    *@author: 顾理想
    *@param clazz
    *@createTime 2017年06月05日 13:50
    *@returnType 原始类型
    *@copyright:
    */
    public static Class<?> unWrap(Class<?> clazz){
        if(null == clazz || clazz.isPrimitive()){
            return clazz;
        }
        Class<?> result = wrapperPrimitiveMap.get(clazz);
        return (null == result) ? clazz : result;
    }

    /**
    *@methodDesc: 功能描述:(是否为包装类型)
    *@author: 顾理想
    *@createTime 2017年06月05日 13:50
    *@returnType
    *@copyright:
    */
    public static boolean isPrimitiveWrapper(Class<?> clazz) {
        if (null == clazz) {
            return false;
        }
        return BasicTypeUtils.wrapperPrimitiveMap.containsKey(clazz);
    }
    /**
    *@methodDesc: 功能描述:(是否为基本类型（包括包装类和原始类）)
    *@author: 顾理想
    *@param clazz
    *@createTime 2017年06月05日 13:49
    *@returnType
    *@copyright:
    */
    public static boolean isBasicType(Class<?> clazz) {
        if (null == clazz) {
            return false;
        }
        return (clazz.isPrimitive() || isPrimitiveWrapper(clazz));
    }

    /**
    *@methodDesc: 功能描述:(判断对象是否是POJO对象)
    *@author: 顾理想
    *@param object java对象
    *@createTime 2017年06月05日 13:48
    *@returnType  如果是基础类型返回false,否则返回true
    *@copyright:
    */
    public static boolean isPOJO(Object object){
        if(null==object){
            return false;
        }
        if(isBasicType(object.getClass())){
            return false;
        }
        if(object.getClass().isEnum()){
            return false;
        }
        if(String.class == object.getClass()){
            return false;
        }
        if(object instanceof Collection){
            return false;
        }


        return true;
    }

    /**
     *@methodDesc: 功能描述:(判断对象是否是POJO对象)
     *@author: 顾理想
     *@param clazz java对象
     *@createTime 2017年06月05日 13:48
     *@returnType  如果是基础类型返回false,否则返回true
     *@copyright:
     */
    public static boolean isPOJO(Class clazz){
        if(null==clazz){
            return false;
        }
        if(isBasicType(clazz)){
            return false;
        }
        if(String.class == clazz){
            return false;
        }
        return true;
    }
}
