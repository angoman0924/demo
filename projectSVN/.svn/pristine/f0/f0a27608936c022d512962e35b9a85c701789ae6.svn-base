package com.zacx.serivce.cache.service;


import com.google.common.base.Optional;
import com.zacx.serivce.cache.key.IKey;
import org.springframework.data.redis.core.RedisOperations;

import java.util.concurrent.TimeUnit;

/**
 * @classDesc: 功能描述:(缓存接口)
 * @author: 顾理想
 * @createTime: 2017年11月03日 16:11
 * @version: v1.0
 */
public interface ICacheService<K extends IKey, V> {
    /**
     * 数据存储
     * @param key 推荐使用公共的Key实现类  CKey
     * @param value
     */
     void set(K key, V value);

    /**
     * 数据存储
     * @param key 推荐使用公共的Key实现类  CKey
     * @param value
     * @param seconds 在缓存里存放多少秒
     */
    void set(K key, V value, long seconds);
    /**
     * 数据存储，支持设置时间单位
     * @param key 推荐使用公共的Key实现类  CKey
     * @param value 具体存放的值
     * @param timeUnit 存放时间单位
     * @param duration 持续时间
     */
    void set(K key, V value, TimeUnit timeUnit, long duration);



    /**
     * 根据key查询缓存
     * @param key 推荐使用公共的Key实现类  CKey
     * @return V
     */
     Optional<V> get(K key);

    /**
     * 根据key删除缓存
     * @param key 查询key
     * @return
     */
    void delete(K key);
    /**
     * 获取 Redis 高级操作对象
     * @return RedisOperations
     */
    RedisOperations<Object, Object> getOperations();


}
