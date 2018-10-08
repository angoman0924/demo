package com.zacx.serivce.basic.api;


/**
 * @author Liang Jun
 * @version 1.0
 * @desc 短信相关功能
 * @date 2018年10月02日 14:34:03
 **/
public interface ChitServiceApi {
    /**
     * @Description: 发送验证码（多语言）
     * @author: litao
     * @date: 2017年8月4日  下午2:53:45
     */
    Boolean sendSmsCode(String mobile, String ip);
}