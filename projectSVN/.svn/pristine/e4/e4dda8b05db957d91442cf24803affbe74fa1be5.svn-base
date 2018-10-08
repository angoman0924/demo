package com.zacx.core.util;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.zacx.core.enums.Code;
import com.zacx.core.exceptions.BaseRTException;
import org.springframework.beans.BeanUtils;
import org.springframework.cglib.beans.BeanMap;
import org.springframework.util.CollectionUtils;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.MessageFormat;
import java.util.*;

/**
 * @author Liang Jun
 * @version 1.0
 * @date 2018年05月18日 09:11:21
 **/
public class ObjectUtils {
    /**
     * @author Liang,Jun
     * 根据参数的对象值生成指定类型的值对象
     * @param source 参照对象
     * @param clazz 指定生成对象的类型
     * @return 生成的含值对象
     * @throws RuntimeException
     */
    public static <T> T valueOf(Object source, Class<T> clazz) {
        T instance = null;
        if (source == null) {
            return instance;
        }
        try {
            instance = clazz.newInstance();
            Field[] fields = source.getClass().getDeclaredFields();
            for (Field field : fields) {
                PropertyDescriptor pd = new PropertyDescriptor(field.getName(), source.getClass());
                Method getMethod = pd.getReadMethod();
                Method setMethod = pd.getWriteMethod();

                Object value = getMethod.invoke(source, null);
                if (value != null)
                    setMethod.invoke(instance, value);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return instance;
    }

    /**
     * @author Liang,Jun
     * 将实体对象转成指定类型的对象
     * @param obj pojo对象
     */
    public static <K, V> Map<K, V> objectToMap(Object obj, Map<K, V> map) {
        if (map == null)
            map = new HashMap<K, V>();
        if (obj == null)
            return map;

        Map bean = BeanMap.create(obj);
        Set<Map.Entry> set = bean.entrySet();

        for (Map.Entry entry : set) {
            map.put((K) entry.getKey(), (V) entry.getValue());
        }
        return map;
    }

    /**
     * @author Liang,Jun
     * 将实体对象转成<String, Object>类型的对象
     * @param obj pojo对象
     */
    public static Map<String, Object> objectToMap(Object obj) {
        return objectToMap(obj, new HashMap<String, Object>());
    }

    /**
     * @author Liang,Jun
     * 将实体对象List转成Map类型的对象
     * 分别以List元素的id属性和该元素作为map对象的名值
     */
    public static <T> Map<?, T> listToMap(List<T> list, String property) {
        Map<Object, T> map = new HashMap<Object, T>();

        try {
            if (!CollectionUtils.isEmpty(list)) {
                PropertyDescriptor pd = new PropertyDescriptor(property, list.get(0).getClass());
                Method getMethod = pd.getReadMethod();

                for (T item : list) {
                    Object key = getMethod.invoke(item);
                    map.put(key, item);
                }
            }
        } catch (IntrospectionException e) {
            String msg = MessageFormat.format("The {0} class NoSuch {1} field or the get/set Method", list.get(0).getClass().getSimpleName(), property);
            throw new RuntimeException(msg);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return map;
    }

    /**
     * 判断对象是否为空，如果为空，直接抛出异常
     *
     * @param object       需要检查的对象
     * @param errorMessage 异常信息
     * @return 非空的对象
     */
    public static Object requireNonNull(Object object, String errorMessage) {
        if (null == object) {
            throw new NullPointerException(errorMessage);
        }
        return object;
    }
    /**
     * 判断对象是否不为null
     *
     * @param object 需要判断的对象
     * @return 是否不为null
     */
    public static boolean nonNull(Object object) {
        return null != object;
    }
    /**
     * 判断对象是否为null
     *
     * @param object 需要判断的对象
     * @return 是否为null
     */
    public static boolean isNull(Object object) {
        return null == object;
    }

    /**
     * 复制Bean对象
     * @param source
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T> T copyBean(Object source, Class<T> clazz) {
        T temp;
        try {
            temp = clazz.newInstance();
            BeanUtils.copyProperties(source, temp);
        } catch (Exception e) {
            throw new BaseRTException(Code.ERROR_UNKNOWN, "Class解析错误");
        }
        return temp;
    }

    public static <T> List<T> ListEntity2ListDTO(List source, Class<T> clazz) {
        List<T> list = new ArrayList<>();
        if (source != null) {
            source.forEach(item -> {
               T temp = null;
               try {
                   temp = clazz.newInstance();
               } catch (Exception e) {
                   throw new BaseRTException(Code.ERROR_UNKNOWN, "Class解析错误");
               }
               org.springframework.beans.BeanUtils.copyProperties(item, temp);
               list.add(temp);
           });
        }
        return list;
    }

    /**
     * 服务层 entity分页信息转dto分页
     * @param pageInfoEntity
     * @param clazz
     * @param <D>
     * @param <T>
     * @return
     */
    public static <D,T> PageInfo<D> pageEntityConvert2PageDTO(PageInfo<T> pageInfoEntity, Class<D> clazz){
        PageInfo<D> pageInfo=new PageInfo<>();
        if(null!=pageInfoEntity&&null!=pageInfoEntity.getList()&&!pageInfoEntity.getList().isEmpty()){
            org.springframework.beans.BeanUtils.copyProperties(pageInfoEntity,pageInfo);
            List<D> list=new ArrayList<>();
            pageInfoEntity.getList().forEach(e->{
                try {
                    D temp=clazz.newInstance();
                    org.springframework.beans.BeanUtils.copyProperties(e,temp);
                    list.add(temp);
                } catch (InstantiationException e1) {
                    e1.printStackTrace();
                } catch (IllegalAccessException e1) {
                    e1.printStackTrace();
                }
            });
            pageInfo.setList(list);
        }
        return pageInfo;
    }

    /**
     * 服务层 entity集合信息转dto集合
     * @param listEntity
     * @param clazz
     * @param <D>
     * @param <T>
     * @return
     */
    public static <D,T> List<D> listEntityConvert2ListDTO(List<T> listEntity,Class<D> clazz){
        if(null!=listEntity&&!listEntity.isEmpty()){
            String s = JSON.toJSONString(listEntity);
            return JSON.parseArray(s, clazz);
        }
        return new ArrayList<>();
    }

    /**
     * 字符串转换为Integer集合
     * */
    public static List<Integer> string2IntegerList(String str){
        if (org.springframework.util.StringUtils.isEmpty(str))
            return null;
        List<String> ss =  Arrays.asList(str.split(","));
        List<Integer> is = new ArrayList<Integer>();
        try {
            for (int i = 0; i < ss.size(); i++) {
                is.add(Integer.parseInt(ss.get(i)));
            }
        } catch(Exception ex) {}
        return is;
    }

}
