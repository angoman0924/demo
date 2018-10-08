package com.zacx.gateway.base.base;



import com.zacx.core.enums.Code;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @classDesc: 功能描述:(公共响应类)
 * @author: 顾理想
 * @createTime: 2017年07月07日 11:28
 * @version: v1.0
 *
 */
@ApiModel(value="AbstractResponse",description="公共响应类")
public abstract class AbstractResponse<T> implements Serializable {
	@ApiModelProperty(value="响应码成功SUCCESS，其他代码都是失败，具体错误码参考文档",dataType="String",required=true)
    protected Code code;// 返回值code
	@ApiModelProperty(value="数据对象",dataType="T",required=false)
    protected T data;// 数据对象
	@ApiModelProperty(value="错误提示信息",dataType="String",required=false)
    protected String error; // 错误提示信息



    public String getError() {
        return error;
    }

    public Code getCode() {
        return code;
    }

    public T getData() {
        return data;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AbstractResponse{");
        sb.append("code='").append(code).append('\'');
        sb.append(", data=").append(data);
        sb.append(", error='").append(error).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
