package com.zacx.serivce.service;


import com.google.common.base.Strings;
import com.zacx.core.constants.Constants;
import com.zacx.core.enums.Code;
import com.zacx.core.exceptions.BaseRTException;
import com.zacx.core.util.StringUtils;
import com.zacx.serivce.cache.key.RedisKeys;
import com.zacx.serivce.cache.key.enums.SerialCodeRuleEnum;
import com.zacx.serivce.cache.key.enums.SerialIDRuleEnum;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.client.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.JedisCluster;

import java.util.Date;
import java.util.Objects;

/**
* @desc    生成序列号
* @version 1.0
* @author  Liang Jun
* @date    2018年10月05日 14:34:55
**/
@Slf4j
@Service
public class SerialService {
    @Autowired
    private JedisCluster jedisCluster;

    public String generateID(SerialIDRuleEnum serialIDRule){
        if(serialIDRule == null){
            throw new BaseRTException(Code.ERROR_ILLEGAL_CODE, "序列ID规则未指定异常");
        }

        String key = serialIDRule.name() + "_ID_SEQ_KEY";
        return generateID(key);
    }

    public String generateCode(SerialCodeRuleEnum serialCodeRule){
        if(serialCodeRule == null){
            throw new BaseRTException(Code.ERROR_UNKNOWN, "序列编号规则未指定异常");
        }
        if(StringUtils.isBlank(serialCodeRule.getPrefix())){
            throw new BaseRTException(Code.ERROR_UNKNOWN, "序列编号规则前缀未定义");
        }
        if(serialCodeRule.getSeqlen() == null || serialCodeRule.getSeqlen() < 3){
            throw new BaseRTException(Code.ERROR_UNKNOWN, "序列编号规则序列长度定义错误");
        }

        String key = serialCodeRule.name() + "_CODE_SEQ_KEY";
        return generateCode(serialCodeRule.getPrefix(), serialCodeRule.getSeqlen(), key);
    }

    /**
     * 通用单号code生成
     * @param prefix
     * @param length
     * @param key
     * @return
     */
    private String generateCode(String prefix,int length,String key){
        log.info("call SerialService.generateCode request:{};{};{}", prefix,length,key);
        String ret = "";

        Long seq = jedisCluster.incr(key);
        if (Objects.equals(seq, null)) {
            throw new BaseRTException(Code.ERROR_UNKNOWN, prefix + "编号生成失败");
        }
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<length;i++){
            sb.append("9");
        }
        Long max=Long.parseLong(sb.toString());
        if (seq > max) {
            jedisCluster.del(key);
        }

        String dateNow = DateUtils.formatDate(new Date(), "yyMMdd");
        ret = prefix + dateNow + Strings.padStart(seq + "", length, '0');
        log.info("call SerialService.generateOrderId request:key{};prefix:{};ret:{};", key, prefix, ret);
        return ret;
    }

    /**
     * 通用主键ID生成
     * @param key
     * @return
     */
    private String generateID(String key) {
        log.info("call SerialService.SerialService request:{};", key);
        String ret = "";
        Long seq = jedisCluster.incr(key);
        if (Objects.equals(seq, null))
            throw new BaseRTException(Code.ERROR_UNKNOWN, "序列号生成失败");
        ret = seq + "";
        log.info("call SerialService.SerialService request:{};response:{};", key, seq);
        return ret;
    }

    //生成订单编号
    private String generateOrderCode(String key, String prefix) {
        log.info("call SerialService.generateOrderId request:{};{};", key, prefix);
        String ret = "";

        Long seq = jedisCluster.incr(key);
        if (Objects.equals(seq, null))
            throw new BaseRTException(Code.ERROR_UNKNOWN, "订单编号生成失败");
        if (seq > 9999999)
            jedisCluster.del(key);
        String dateNow = DateUtils.formatDate(new Date(), "yyMMdd");
        ret = prefix + dateNow + Strings.padStart(seq + "", 7, '0');

        log.info("call SerialService.generateOrderId request:{};{};response:{};", key, prefix, ret);
        return ret;
    }
}
