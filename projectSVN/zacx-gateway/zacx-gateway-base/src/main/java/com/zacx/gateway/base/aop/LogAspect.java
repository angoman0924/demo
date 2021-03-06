package com.zacx.gateway.base.aop;

import com.zacx.core.constants.Constants;
import com.zacx.core.enums.Code;
import com.zacx.core.exceptions.BaseException;
import com.zacx.core.exceptions.BaseRTException;
import com.zacx.core.exceptions.IllegalCodeException;
import com.zacx.gateway.base.base.Result;
import com.zacx.core.util.ClassUtils;
import com.zacx.gateway.base.util.SpringUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.Arrays;


/**
 * 日志拦截器
 *
 * @author gulx
 * @version 1.0
 * @create 2018-09-21 10:43
 * @copyright 上海拜米网络科技有限公司
 **/
@Aspect
@Component
@Order(-99)
public class LogAspect {

    private Logger logger = LoggerFactory.getLogger(LogAspect.class);

    //and @annotation(org.springframework.web.bind.annotation.RestController
    //@Pointcut("execution(* com.zacx.gateway.*.controller..*(..)))")
    @Pointcut("@within(org.springframework.web.bind.annotation.RestController)")
    public void controllerMethodPointcut(){}



    /**
     *@methodDesc: 功能描述:(设置CRequest的泛型类型)
     *@author: 顾理想
     *@param pjp
     *@createTime 2017年07月11日 17:09
     *@returnType
     */
    @Around("controllerMethodPointcut()") //指定拦截器规则
    public Object Interceptor(ProceedingJoinPoint pjp) throws Throwable {
        String serialnumber = SpringUtils.getSerialNumber();
        requestLog(pjp,serialnumber);
        Method interfaceMethod = ((MethodSignature)pjp.getSignature()).getMethod();
        RequestMapping requestMapping= interfaceMethod.getAnnotation(RequestMapping.class);
        if(requestMapping!=null){
            throw new IllegalCodeException("不要使用@RequestMapping注解，请使用：@GetMapping,@PostMapping,@PutMapping,@DeleteMapping");
        }


        Result response = null;
        long startTime = System.currentTimeMillis();
        try {
            Object objResult = pjp.proceed();
            response  = (Result) objResult;
        } catch (BaseException e) {
            e.printStackTrace();
            logger.error("SERIAL_NUMBER:{};exceptions:{} ",serialnumber, e.getErrorDetail());
            response = Result.error(e.getCode(),e.getUserMessage());
        } catch (BaseRTException e) {
            e.printStackTrace();
            logger.error("SERIAL_NUMBER:{};exceptions:{} ",serialnumber, e.getErrorDetail());
            response = Result.error(e.getCode(),e.getUserMessage());
        } catch (Throwable e) {
            e.printStackTrace();
            String error = ExceptionUtils.getStackTrace(e);
            logger.error("SERIAL_NUMBER:{};exceptions:{} ",serialnumber, error);
            response = Result.error(Code.ERROR_UNKNOWN,"未知异常");
        }
        long totalSpend = System.currentTimeMillis()-startTime;
        ClassUtils.setObjectValue(response,"serialNumber",serialnumber);
        logger.info("SERIAL_NUMBER:{} {}.{}请求结束。总耗时：{}ms，响应报文：{}",serialnumber,
                pjp.getSignature().getDeclaringTypeName()
                ,interfaceMethod.getName(),
                totalSpend,response);
        return response;
    }



    /**
     *@methodDesc: 功能描述:(输出请求日志)
     *@author: 顾理想
     *@createTime 2017年10月18日 19:06
     *@returnType
     */
    private void requestLog(JoinPoint joinPoint, String serialNumber){
        try{
            HttpServletRequest request = SpringUtils.getHttpServletRequest();
            request.setAttribute(Constants.SERIAL_NUMBER,serialNumber);
            StringBuilder msg = new StringBuilder("SERIAL_NUMBER:");
            msg.append(serialNumber)
                    .append(" [")
                    .append(request.getMethod())
                    .append("] ")
                    .append(" METHOD:")
                    .append(joinPoint.getSignature().getDeclaringTypeName())
                    .append(".")
                    .append(joinPoint.getSignature().getName());
            // 记录下请求内容
            logger.info(msg.toString());
            logger.info("URL : " + request.getRequestURL().toString());
            logger.info("IP : " + request.getRemoteAddr());
            logger.info("ARGS : " + Arrays.toString(joinPoint.getArgs()));
        }catch (Exception e){
            logger.error("日志输出发生异常",e.getMessage());
            e.printStackTrace();
        }

    }





}