package com.zacx.gateway.passenger.base;


import com.alibaba.fastjson.JSON;
import com.zacx.core.enums.Code;
import com.zacx.core.util.BaseAssert;
import com.zacx.gateway.base.base.ClientInfo;
import com.zacx.gateway.base.util.SpringUtils;
import org.springframework.stereotype.Component;
import redis.clients.jedis.JedisCluster;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
* @desc    session处理
* @version 1.0
* @author  Liang Jun
* @date    2018年10月06日 18:08:31
**/
@Component
public class SessionUtils {
    @Resource
    private JedisCluster jedisCluster;

    public SessionUser getLoginUser() {
        HttpServletRequest request =  SpringUtils.getHttpServletRequest();
        SessionUser sessionUser = null;

        if (request != null) {
            String token = request.getHeader(ClientInfo.TOKEN);
            BaseAssert.hasText(token, Code.ERROR_ARGUMENT,"请求头没有找到令牌(header_token)参数");

            String sessionJson  = jedisCluster.get(token);
            if(sessionJson != null){
                sessionUser = JSON.parseObject(sessionJson, SessionUser.class);
            }
        }
        return sessionUser;
    }
}