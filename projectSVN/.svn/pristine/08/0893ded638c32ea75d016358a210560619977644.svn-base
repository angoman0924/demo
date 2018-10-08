package com.zacx.gateway.base.base;



import com.zacx.core.enums.Code;
import io.swagger.annotations.ApiModel;

/**
 * @classDesc: 功能描述:(内部微服务公共响应类)
 * @author: 顾理想
 * @createTime 2017年10月23日 22:19
 * @version: v1.0
 *
 */
@ApiModel(description= "公共响应类")
public class Result<T> extends AbstractResponse<T> {


	protected String serialNumber;//流水号,系统生成
	protected Result() {

	}

	protected Result(Code code) {
		this.code = code;
	}

	protected Result(Code code, String error) {
		this.code = code;
		this.error = error;
	}

	protected Result(Code code, T data) {
		this.code = code;
		this.data = data;
	}
	public String getSerialNumber() {
		return serialNumber;
	}

	/**
	 * @methodDesc: 功能描述:(成功有数据响应结果)
	 * @author: 顾理想
	 * @createTime 2017年07月7日 9:06
	 * @returnType
	 *
	 */
	public static <T> Result<T> success(T data) {
		return new Result<T>(Code.SUCCESS, data);
	}

	/**
	 * @methodDesc: 功能描述:(成功无返回数据响应结果)
	 * @author: 顾理想
	 * @createTime 2017年07月7日 9:06
	 * @returnType
	 *
	 */
	public static <T> Result<T> success() {
		return new Result<T>(Code.SUCCESS);
	}

	/**
	 * @methodDesc: 功能描述:(公共错误响应结果)
	 * @author: 顾理想
	 * @param errorMessage
	 *            错误提示信息
	 * @createTime 2017年07月07日 15:36
	 * @returnType
	 *
	 */
	public static <T> Result<T> error(Code codeEnum, String errorMessage) {
		return new Result<T>(codeEnum, errorMessage);
	}

}
