package com.zacx.serivce.dal.config;


import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * @author Liang Jun
 * @version 1.0
 * @desc Redis单台配置
 * @date 2018年10月02日 21:28:18
 **/
//@Configuration
public class RedisSingleConfig {
    @Value("${redis.single.ip}")
    private String host;
    @Value("${redis.single.port}")
    private int port;
    @Value("${redis.single.timeout}")
    private int timeout;

    @Bean
    public JedisConnectionFactory getJedisConnectionFactory() {
        System.out.println("############################################################");
        System.out.println("################Redis host : " + host);
        System.out.println("################Redis port : " + port);
        System.out.println("################Redis timeout : " + timeout);
        System.out.println("############################################################");
        JedisConnectionFactory jedisConnectionFactory = new JedisConnectionFactory();
        jedisConnectionFactory.setHostName(host);
        jedisConnectionFactory.setPort(port);
        jedisConnectionFactory.setTimeout(timeout);
        return jedisConnectionFactory;
    }

    @Bean
    public RedisTemplate<String, Object> getRedisTemplate(JedisConnectionFactory jedisConnectionFactory) {
//        RedisTemplate<String,Object>  redisTemplate = new RedisTemplate();
//        redisTemplate.setConnectionFactory(jedisConnectionFactory);
//        redisTemplate.setEnableTransactionSupport(true);
//        return redisTemplate;
        RedisTemplate<String,Object> template = new RedisTemplate<String,Object>();
        template.setConnectionFactory(jedisConnectionFactory);
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
}