package com.zacx.serivce.cache.service.impl;


import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Optional;
import com.zacx.serivce.cache.config.CacheConfig;
import com.zacx.serivce.cache.key.IKey;
import com.zacx.serivce.cache.service.ICacheService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @classDesc: 功能描述:(公共的Redis实现类)
 * @author: 顾理想
 * @createTime: 2017年11月03日 16:51
 * @version: v1.0
 */
@Slf4j
//@Service
public class CRedisServiceImpl<K extends IKey,V> implements ICacheService<K,V> {
    @Autowired
    private CacheConfig cacheConfig;
    @Bean
    public RedisTemplate<Object,Object> redisTemplate(RedisConnectionFactory redisConnectionFactory){
        RedisTemplate<Object,Object> template = new RedisTemplate<Object,Object>();
        template.setConnectionFactory(redisConnectionFactory);
        Jackson2JsonRedisSerializer jackson2JsonRedisSerializer=new Jackson2JsonRedisSerializer(Object.class);
        ObjectMapper om = new ObjectMapper();
        om.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
        om.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
        jackson2JsonRedisSerializer.setObjectMapper(om);
        template.setValueSerializer(jackson2JsonRedisSerializer);
        template.setKeySerializer(new StringRedisSerializer());
        template.afterPropertiesSet();
        return template;
    }

//    @Resource(name="redisTemplate")
    private ValueOperations<Object,Object> template;

    @Override
    public  void set(K key, V value) {
        if(cacheConfig.isEnable()){
            template.set(key.getKey(),value);
        }else{
            log.warn("没有启用缓存");
        }
    }

    @Override
    public void set(K key, V value, long seconds) {
        set(key,value,TimeUnit.SECONDS,seconds);
    }

    @Override
    public void set(K key, V value, TimeUnit timeUnit, long duration) {
        if(cacheConfig.isEnable()){
            template.set(key.getKey(),value,duration, timeUnit);
        }else{
            log.warn("没有启用缓存");
        }
    }


    @Override
    public Optional<V> get(K key) {
        if (cacheConfig.isEnable()){
            V obj = (V)template.get(key.getKey());
            return Optional.fromNullable(obj);
        }
        log.warn("没有启用缓存");
       return Optional.absent();

    }

    @Override
    public void delete(K key) {
        template.getOperations().delete(key.getKey());
    }

    @Override
    public RedisOperations<Object, Object> getOperations() {
        return  template.getOperations();
    }


}
