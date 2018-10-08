package com.zacx.serivce.basic.api.impl;


import com.google.common.base.Strings;
import com.zacx.serivce.basic.api.ChitServiceApi;
import com.zacx.serivce.basic.api.exceptions.BasicServiceException;
import com.zacx.serivce.basic.util.SmsUtil;
import com.zacx.serivce.cache.key.RedisKeys;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.stereotype.Service;
import redis.clients.jedis.JedisCluster;

import javax.annotation.Resource;

/**
 * @author Liang Jun
 * @version 1.0
 * @desc 短信相关功能
 * @date 2018年10月02日 14:35:23
 **/
@Slf4j
@Service
public class ChitServiceApiImpl implements ChitServiceApi {
    @Resource
    private JedisCluster jedisCluster;

    /**
     * @Description: 发送验证码（多语言）
     * @author: litao
     * @date: 2017年8月4日  下午2:53:45
     */
    @Override
    public Boolean sendSmsCode(String tel, String ip) {
        String code = smsCode();
        log.info("INFO UserServiceImpl.sendCode request:tel:{};ip:{};code:{};language:{}", tel, ip, code);
        // 校验ip攻击、同一手机号限制每天生成验证码次数、操作频繁
        countCode(tel, ip);
        String codeKey = RedisKeys.getMobileCodeKey(tel);
        String mobileLimitKey = RedisKeys.getMobileLimitKey(tel);

        // 发送验证码
        log.info("new sendMsgCode : codeKey:" + codeKey + " code:" + code);
        sendMsgCode(tel, code);

        log.info("sendMsgCode: codeKey:" + codeKey + " code:" + code);
        jedisCluster.set(codeKey, code);
        jedisCluster.expire(codeKey, 60*60);//验证码60分钟有效
        jedisCluster.set(mobileLimitKey, mobileLimitKey);
        jedisCluster.expire(mobileLimitKey, 60);//验证码60s可重发

        boolean addCodeCountRes = addCodeCount(tel, ip);
        if (!addCodeCountRes) {
            throw new BasicServiceException("addCodeCountRes is false");
        }
        return true;
    }

    private boolean sendMsgCode(String mobile, String code) {
        try {
            if (!sendSmsAliyun(mobile, code)) {
                throw new BasicServiceException("短信发送失败:ChitServiceImpl.sendMsgCode");
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            log.error("ERROR:  sendMsgCode({},{},{}). Exception:{}", mobile, code,  e);
            throw new BasicServiceException("ChitServiceImpl.sendMsgCode happen error");
        }
    }

    private boolean sendSmsAliyun(String phones, String code) {
//        String templateCode = sysConfigService.getCacheConfigValue("SMS_TEMPLATECODE_CHECKCODE", language, "SMS_128580053");
        try {
            return SmsUtil.sendSmsAliyun(phones, code, "SMS_128580053");
        } catch (Exception e) {
            log.error("ERROR UserServiceImpl.sendSmsAliyun(phones:{}, code:{}). Exception:{}.",phones,code,e);
            return false;
        }
    }

//    @Value("#{app.ipCountNum}")
    private Integer ipCountNum = 500;

//    @Value("#{app.mobileCountNum}")
    private Integer mobileCountNum = 500;

    private void countCode(String mobile, String ip) {
        String ipCountKey = RedisKeys.getIpCountCodeKey(ip);
        String mobileCountKey = RedisKeys.getMobileCountCodeKey(mobile);
        String mobileLimitKey = RedisKeys.getMobileLimitKey(mobile);

        // 频繁操作拦截
        boolean mobileLimit = mobileLimitKey.equals(jedisCluster.get(mobileLimitKey));
        if (mobileLimit) {
            throw new BasicServiceException("验证码一分钟内不能重复发送");
        }

        // 校验手机号每天发验证次数
        String mobileCount = jedisCluster.get(mobileCountKey);
        mobileCount = Strings.isNullOrEmpty(mobileCount) ? "1" : mobileCount;

        if (Integer.parseInt(mobileCount) > mobileCountNum) {
            log.error("check mobileCount:{} out of sys_set_val:{}", mobileCount, mobileCountNum);
            throw new BasicServiceException("登录频繁，请联系客服");
        }
        //ip 拦截
        String ipCount = jedisCluster.get(ipCountKey);
        ipCount = Strings.isNullOrEmpty(ipCount) ? "1" : ipCount;

        if (Integer.parseInt(ipCount) > ipCountNum) {
            log.error("check ipcount:{} out of sys_set_val:{}", ipCount, ipCountNum);
            throw new BasicServiceException("登录频繁，请稍后再试");
        }
    }

    private static int expireTime = 24 * 60 * 60;
    private static int expireTime1 = 1 * 60 * 60;

    private boolean addCodeCount(String tel, String ip) {
        String ipCountKey = RedisKeys.getIpCountCodeKey(ip);
        String mobileCountKey = RedisKeys.getMobileCountCodeKey(tel);

            String ipCount = jedisCluster.get(ipCountKey);
            String mobileCount = jedisCluster.get(mobileCountKey);

            if (Strings.isNullOrEmpty(ipCount)) {
                jedisCluster.set(ipCountKey, "1");
                jedisCluster.expire(ipCountKey, expireTime1);
            } else{
                jedisCluster.incr(ipCountKey);
            }

            if (Strings.isNullOrEmpty(mobileCount)) {
                jedisCluster.set(mobileCountKey, "1");
                jedisCluster.expire(mobileCountKey, expireTime);
            } else{
                jedisCluster.incr(mobileCountKey);
            }
            return true;
    }

    private String smsCode() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            sb.append(RandomUtils.nextInt(0, 10));
        }
        return sb.toString();
    }

    public static void main(String[] args)  {
        new ChitServiceApiImpl().sendMsgCode("18788891200", "1200");
    }
}