package com.zacx.core.util;




import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class MoneyUtils {
    public static final Logger log = LoggerFactory.getLogger(MoneyUtils.class);
    /**
     * 将分为单位的转换为元 (除100)
     *
     * @param amount 分
     * @return 元
     */
    public static String fen2yuan(String amount) {
    	if (StringUtils.isNotBlank(amount)) {
    		try {
    			String temp = BigDecimal.valueOf(Double.valueOf(amount)).divide(new BigDecimal(100)).toString();
    			
    			if (temp.indexOf(".") > 0) {
    				if (StringUtils.split(temp, ".")[1].length() == 1) {
    					temp += "0";
    				}
    			} else {
    				temp += ".00";
    			}
    			return temp;
    		} catch (Exception e) {
    			log.error("金额:{},分转换成元异常:{}", amount, e);
    		}
    	}
        return null;
    }

    /**
     * 将元为单位的转换为分 (乘100)
     *
     * @param amount 元
     * @return 分
     */
    public static String yuan2fen(String amount) {

        if (StringUtils.isBlank(amount)) {
            return "";
        }
        String temp = amount.trim();
        int postion = -100;
        postion = temp.indexOf(".");
        if (postion != 0) {
            BigDecimal inhead = new BigDecimal(0);
            if (postion != -1) {
                BigDecimal head = new BigDecimal(temp.substring(0, postion));
                String foots = temp.substring(postion + 1, temp.length());
                if (foots.length() >= 3) {
                    inhead = new BigDecimal(foots.substring(0, 2));
                    temp = (head.multiply(new BigDecimal(100)).add(inhead))
                            .toString();
                    return temp;
                } else if (foots.length() == 2) {
                    temp = (head.multiply(new BigDecimal(100))
                            .add(new BigDecimal(foots))).toString();
                    return temp;
                } else {
                    temp = (head.multiply(new BigDecimal(100))
                            .add(new BigDecimal(foots).multiply(new BigDecimal(
                                    10)))).toString();
                    return temp;
                }
            } else {
                BigDecimal head = new BigDecimal(temp);
                temp = head.multiply(new BigDecimal(100)).toString();
                return temp;
            }
        } else {
            BigDecimal head = new BigDecimal(temp);
            temp = head.multiply(new BigDecimal(100)).toString();
            return temp;
        }
    }


    //四舍五入方式
    public static BigDecimal getScaleRound(BigDecimal value, int scale){
        if(value!=null && scale>0){
            return value.setScale(scale, BigDecimal.ROUND_HALF_UP );
        }
        return value;
    }

    //四舍五入方式：2位金额
    public static BigDecimal getRoundMoney(BigDecimal value){
        if(value!=null){
            return value.setScale(2, BigDecimal.ROUND_HALF_UP );
        }
        return value;
    }
    //向上方式取整：2位金额Up
    public static BigDecimal getUpMoney(BigDecimal value){
        if(value!=null){
            return value.setScale(2, BigDecimal.ROUND_UP );
        }
        return value;
    }

    public static String getStrMoney(BigDecimal value){
        if(value != null){
            if(new BigDecimal(value.intValue()).compareTo(value) == 0){
                DecimalFormat df = new DecimalFormat("0.##");
                return df.format(value);
            }else{
                DecimalFormat df = new DecimalFormat("0.00");
                return df.format(value);
            }
        }
        return "";
    }

}
