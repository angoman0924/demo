package com.zacx.core.util;


import java.util.UUID;

/**
*@classDesc: 功能描述:(生成流水号帮助类)
*@author: 顾理想
*@createTime 2017年10月18日 15:06
*@version: v1.0
*@copyright:
*/
public class SerialNumberUtils {
	private SerialNumberUtils(){}
	/**
	 *@methodDesc: 功能描述:(生成流水号，年月日时分秒毫秒+uuid的后十位组成流水号)
	 *@author: 顾理想
	 *@createTime 2017年10月18日 15:53
	 *@returnType 返回结果类似：20171018155445411e7b31342b8 ，共27位
	 *@copyright:
	 */
	public static String getSerialNumber(){
		StringBuffer sb = new StringBuffer();
		String uuid= UUID.randomUUID().toString();
		sb.append(DateUtils.getCurrentTime()).append(uuid.substring(uuid.length()-10, uuid.length()));
		return sb.toString();
	}

	/**
	 *@methodDesc: 功能描述:(生成流水号，年月日时分秒毫秒+uuid的后十位组成流水号)
	 *@author: 顾理想
	 *@param prefix 流水号的前缀
	 *@createTime 2017年10月18日 15:53
	 *@returnType 返回结果类似：prefix+20171018155445411e7b31342b8 ，prefix的长度加27
	 *@copyright:
	 */
	public static String getSerialNumber(String prefix){
		StringBuffer sb = new StringBuffer(prefix);
		String uuid= UUID.randomUUID().toString();
		sb.append(DateUtils.getCurrentTime()).append(uuid.substring(uuid.length()-10, uuid.length()));
		return sb.toString();
	}

	/**
	*@methodDesc: 功能描述:(获取一个32位的UUID)
	*@author: 顾理想
	*@createTime 2017年12月29日 16:26
	*@returnType
	*@copyright:
	*/
	public static String getUUID(){
		return UUID.randomUUID().toString().replaceAll("-","");
	}



	
}
