package com.zacx.serivce.dal.config;


import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
* @desc    Redis集群配置
* @version 1.0
* @author  Liang Jun
* @date    2018年10月04日 09:45:36
**/
@Configuration
public class RedisClusterConfig {
    @Autowired
    private RedisProperties redisProperties;

    @Bean
    public JedisCluster getJedisCluster() {
        List<String> serverList = redisProperties.getCluster().getNodes();
        Set<HostAndPort> nodes = new HashSet<>();

        System.out.println("############################################################");
        for (String ipPort : serverList) {
            System.out.println("################Redis host : " + ipPort);
            String[] ipPortPair = ipPort.split(":");
            nodes.add(new HostAndPort(ipPortPair[0].trim(), Integer.valueOf(ipPortPair[1].trim())));
        }
        System.out.println("############################################################");

        return new JedisCluster(nodes,redisProperties.getTimeout(), 5,  new GenericObjectPoolConfig());//需要密码连接的创建对象方式
    }
}