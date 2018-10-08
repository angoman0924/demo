/**
 * 
 */
package com.zacx.core.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @classDesc: Md5加密
 * @author: 姚磊
 * @createTime: 2018年1月5日 下午1:57:30  
 * @version: v1.0  
 * @copyright:
 */
public class MD5Utils {
	/** 
     * md5加密方法 
     * @param params
     * @return 
     */  
    public static String encoderByMd5(String params) {  
  
        try {  
            // 得到一个信息摘要器  
            MessageDigest digest = MessageDigest.getInstance("md5");  
            byte[] result = digest.digest(params.getBytes());  
            StringBuffer buffer = new StringBuffer();  
            // 把没一个byte 做一个与运算 0xff;  
            for (byte b : result) {  
                // 与运算  
                int number = b & 0xff;// 加密 
                String str = Integer.toHexString(number);  
                if (str.length() == 1) {  
                    buffer.append("0");  
                }  
                buffer.append(str);  
            }  
            // 标准的md5加密后的结果  
            return buffer.toString();  
        } catch (NoSuchAlgorithmException e) {  
            e.printStackTrace();  
            return "";  
        }  
  
    }

    private final static String[] hexDigits = { "0", "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "a", "b", "c", "d", "e", "f" };

    /**
     * 转换字节数组为16进制字串
     *
     * @param b
     *            字节数组
     * @return 16进制字串
     */

    public static String byteArrayToHexString(byte[] b) {
        StringBuffer resultSb = new StringBuffer();
        for (int i = 0; i < b.length; i++) {
            resultSb.append(byteToHexString(b[i]));
        }
        return resultSb.toString();
    }

    private static String byteToHexString(byte b) {
        int n = b;
        if (n < 0)
            n = 256 + n;
        int d1 = n / 16;
        int d2 = n % 16;
        return hexDigits[d1] + hexDigits[d2];
    }

    /**
     * 默认编码可能和环境有关
     * @param origin
     * @return
     */
    public static String MD5Encode(String origin) {
        String resultString = null;

        try {
            resultString = new String(origin);
            MessageDigest md = MessageDigest.getInstance("MD5");
            resultString = byteArrayToHexString(md.digest(resultString
                    .getBytes()));
        } catch (Exception ex) {

        }
        return resultString;
    }

    /**
     * 指定编码
     * @param origin
     * @param charsetName
     * @return
     */
    public static String MD5Encode(String origin, String charsetName) {
        String resultString = null;

        try {
            resultString = new String(origin);
            MessageDigest md = MessageDigest.getInstance("MD5");
            resultString = byteArrayToHexString(md.digest(resultString
                    .getBytes(charsetName)));
        } catch (Exception ex) {

        }
        return resultString;
    }

//    public static void main(String[] args) {
//		/*
//		Long i=new Long(100);
//		Long k=new Long(10);
//		System.out.println(i-k);
//		*/
//        String s=MD5Utils.MD5Encode("414072243");
//        System.out.println(s);
//
//    }
}
