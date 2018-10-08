package com.zacx.core.util;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/**
 * @classDesc: 功能描述:(AES加密)
 * @author: 顾理想
 * @createTime: 2017年11月17日 10:30
 * @version: v1.0
 * @copyright:
 */
public class AESUtils {
    private static final String TRANSFORMATION = "AES/CBC/PKCS5Padding";

    /**
     * 算法
     */
    private static final String ALGORITHM = "AES";



    private AESUtils() {
    }



    /**

     * 加密
     * @param key
     * @param data
     * @return
     */

    @SuppressWarnings("restriction")
    public static String encrypt(String key, String data) {

        try {
            Cipher aesECB = Cipher.getInstance(TRANSFORMATION);
            javax.crypto.spec.IvParameterSpec ips = new javax.crypto.spec.IvParameterSpec(key.getBytes("UTF-8"));
            SecretKeySpec keySpec = new SecretKeySpec(key.getBytes("UTF-8"), ALGORITHM);
            aesECB.init(Cipher.ENCRYPT_MODE, keySpec, ips);
            byte[] result = aesECB.doFinal(data.getBytes("UTF-8"));
            return new BASE64Encoder().encode(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }



    /**
     * 解密
     * @param key
     * @param encryptedData
     * @return
     */

    @SuppressWarnings("restriction")
    public static String dencrypt(String key, String encryptedData) {
        try {
            SecretKeySpec keySpec = new SecretKeySpec(key.getBytes("UTF-8"), ALGORITHM);
            // 创建密码器
            Cipher cipher = Cipher.getInstance(TRANSFORMATION);
            javax.crypto.spec.IvParameterSpec ips = new javax.crypto.spec.IvParameterSpec(key.getBytes("UTF-8"));
            // 初始化
            cipher.init(Cipher.DECRYPT_MODE, keySpec, ips);
            byte[] result = new BASE64Decoder().decodeBuffer(encryptedData);
            // 解密
            return new String(cipher.doFinal(result), "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }



}
