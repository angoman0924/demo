package com.zacx.gateway.base.util;

import com.zacx.core.constants.Constants;
import com.zacx.core.util.SerialNumberUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.MDC;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @author gulx
 * @version 1.0
 * @create 2018-09-26 16:11
 * @copyright 上海拜米网络科技有限公司
 **/
public class SpringUtils {
    //获取流水号
    public static String getSerialNumber() {
        String serialnumber= MDC.get(Constants.SERIAL_NUMBER);
        if(StringUtils.isBlank(serialnumber)){
            HttpServletRequest request = getHttpServletRequest();
            serialnumber = request.getHeader(Constants.SERIAL_NUMBER);
            if(StringUtils.isBlank(serialnumber)){
                serialnumber = SerialNumberUtils.getSerialNumber();
            }
        }
        return serialnumber;
    }

    public static HttpServletRequest getHttpServletRequest() {
        // 接收到请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        return attributes.getRequest();
    }
}
