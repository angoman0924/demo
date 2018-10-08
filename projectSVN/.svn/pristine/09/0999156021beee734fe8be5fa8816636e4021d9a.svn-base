package com.zacx.core.util;

import java.util.Base64;

public class Base64Utils {
	
	private static final Base64.Encoder encoder = Base64.getEncoder();
	private static final Base64.Decoder decoder = Base64.getDecoder();
	
	public static String encode(String str) throws Exception {  
		
		return encoder.encodeToString(str.getBytes("GBK"));
    }  
  
    public static String decode(String str) throws Exception {  
  
    	return new String(decoder.decode(str),"GBK");
    }
    
//    public static void main(String[] args) throws Exception {
//		String string = "张三是的啊是大王是的艾德阿挖到我打我打完大大";
//		System.out.println(encode(string));
//		System.out.println(decode(encode(string)));
//		
//	}
}
