package com.zacx.core.enums;

public enum Code {
    SUCCESS("请求成功"),
    ERROR_VIOLATE_RULE("违反策略"),//违反业务规则（比如不能重复消费）
    ERROR_ARGUMENT("参数错误"),//参数格式错误、必填参数未传入、参数值
    ERROR_REQUEST_TIMEOUT("请求超时"),
    ERROR_PARTNER("第三方接口不能使用"),//第三方服务异常（接口未开通，接口关闭） 第三方服务更改
    ERROR_LOW_VERSION("版本过低"),//APP版本过低
    ERROR_CONFIG("配置信息错误"),//不管是配置文件没配置，还是数据库配置错了的数据
    ERROR_SIGN("验签失败，请确认数据是否被篡改"),
    ERROR_DATA_FORMAT("数据格式错误"),//数据格式错误、第三方数据结构变化
    ERROR_DB_OPERATE("数据库操作失败"),
    ERROR_DATA_NOT_FOUND("查询无结果"),//应该能查询出的数据，确没有查询出来
    ERROR_SERVER_FAIL("服务出现异常，请联系负责人"),//运行时未知异常
    ERROR_INVALID_PERMISSIONS("权限不足"),//商户号不存在，接口未开通，ip白名单未添加、签名key未配置
    ERROR_INSUFFICIENT_BALANCE("余额不足"),//第三方机构余额不足
    ERROR_DATA_OVER_BOUND("数据大小超限"),//上传文件大小超限，
    ERROR_LOGIN_TIMEOUT("登录超时"),//聚合征信专用
    ERROR_AUTHORIZED_FAIL("授权失败"),
    ERROR_ILLEGAL_REQUEST("非法请求"),//提交速度超过流速限制
    ERROR_REPEAT_REQUEST("重复请求"),//接口只允许请求一次
    ERROR_ILLEGAL_CODE("开发人员违反开发规范,请联系开发人员修改代码"),
    ERROR_UNKNOWN("未知异常");

    private String description;
    Code(String description){

        this.description=description;
    }
    public String getDescription() {
        return description;
    }


    /**
     *@methodDesc: 功能描述:(根据code查询错误代码)
     *@author: 顾理想
     *@param code
     *@createTime 2017年07月10日 14:01
     *@returnType
     *@copyright:
     */
    public static Code getByCode(String code){
        for (Code en: Code.values()){
            if(en.toString().equals(code)){
                return en;
            }
        }
        return Code.ERROR_UNKNOWN;
    }
}
