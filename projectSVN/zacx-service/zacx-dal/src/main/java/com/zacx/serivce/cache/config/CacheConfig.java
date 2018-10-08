package com.zacx.serivce.cache.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;


/**
 * @classDesc: 功能描述:(缓存配置信息)
 * @author: 顾理想
 * @createTime: 2017年11月06日 15:53
 * @version: v1.0
 * @copyright:善林（上海）金融服务信息有限公司
 */
@Configuration
public class CacheConfig {
    @Autowired
    private Environment environment;//common包下面不能用 @Value注解注入配置文件，很多项目不一定有这个配置熟悉

    private Boolean enable;//是否启用缓存

    public boolean isEnable() {
        if(enable==null){
            String enableStr = environment.getProperty("spring.redis.enable");
            if(enableStr==null||"true".equalsIgnoreCase(enableStr.trim())){
                return true;//使用缓存
            }
            if("false".equalsIgnoreCase(enableStr.trim())){
                enable=false;//禁用缓存
            }else {
                enable=true;
            }
        }
        return enable;

    }
}
