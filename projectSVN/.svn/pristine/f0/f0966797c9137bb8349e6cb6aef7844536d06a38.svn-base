package com.zacx.core.exceptions;


import com.zacx.core.enums.Code;

/**
 * 非检查异常 RuntimeException
 *
 * @author gulx
 * @version 1.0
 * @create 2018-09-18 9:58
 * @copyright 上海拜米网络科技有限公司
 **/
public class BaseRTException extends RuntimeException {

    private StringBuilder userMessage;//给用户看的错误信息
    private StringBuilder arguments;//参数列表
    private Code code;//返回的错误代码

    /**
     *@methodDesc: 功能描述:(返回指定的错误代码，和指定的消息提示，推荐使用)
     * 使用方法：throw new BaseException(Code.ERROR_SIGN_FAIL,"参数验签失败，请确认数据是否被篡改")
    .addArgument("name","张飒").addArgument("age",18);
     *@author: 顾理想
     *@param code 错误代码
     *@param userMessage 消息提示
     *@createTime 2017年10月16日 9:34
     *@returnType
     *
     */
    public BaseRTException(Code code, String userMessage){
        super(userMessage);
        this.userMessage = new StringBuilder(userMessage);
        this.arguments = new StringBuilder();
        this.code = code;
    }

    /**
     *@methodDesc: 功能描述:(默认的构造函数，会返回服务器异常000005消息错误，不推荐使用，不够友好)
     *@author: 顾理想
     *@createTime 2017年10月16日 9:28
     *@returnType
     *
     */
    public BaseRTException(){
        throw new IllegalCodeException();
    }



    /**
     *@methodDesc: 功能描述:(添加参数)
     *@author: 顾理想
     *@param key 参数的名字 如（name)
     *@param value 参数的值  如(张三)
     *@createTime 2017年05月16日 11:22
     *@returnType com.shanlinjinrong.constants.exceptions.CException
     *
     */
    public BaseRTException addArgument(String key, Object value){
        this.arguments.append(key).append("=").append(value).append(",");
        return this;
    }
    /**
     *@methodDesc: 功能描述:(添加消息)
     *@author: 顾理想
     *@param message 消息内容
     *@createTime 2017年05月16日 11:22
     *@returnType com.shanlinjinrong.constants.exceptions.CException
     *
     */
    public BaseRTException addMessage(String message){
        this.userMessage.append(message);
        return this;
    }
    public Code getCode() {
        return code;
    }
    /**
     *@methodDesc: 功能描述:(获取错误的详细信息，给开发人员看的)
     *@author: 顾理想
     *@createTime 2017年05月16日 11:16
     *@returnType
     *
     */
    public String getErrorDetail(){
        return this.userMessage+":"+this.arguments;
    }

    /**
     * 给用户看的错误提示信息
     * @return
     */
    public String getUserMessage() {
        return userMessage.toString();
    }


    @Override
    public String toString() {
        return this.getErrorDetail();
    }
}
