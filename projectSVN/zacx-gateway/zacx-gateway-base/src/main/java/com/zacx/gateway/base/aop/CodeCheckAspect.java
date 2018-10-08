package com.zacx.gateway.base.aop;

import com.zacx.core.exceptions.IllegalCodeException;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;


/**
 * 非法代码检测工具
 *
 * @author gulx
 * @version 1.0
 * @create 2018-09-21 10:43
 * @copyright 上海拜米网络科技有限公司
 **/
@Aspect
@Component
@Order(-98)
public class CodeCheckAspect {

    private Logger logger = LoggerFactory.getLogger(CodeCheckAspect.class);

    //and @annotation(org.springframework.web.bind.annotation.RestController
    //@Pointcut("execution(* com.zacx.gateway.*.controller..*(..)))")
    @Pointcut("execution(* com.zacx.gateway.*.controller..*(..)) and @annotation(org.springframework.stereotype.Controller)")
    public void controllerMethodPointcut(){}




    @Around("controllerMethodPointcut()") //指定拦截器规则
    public Object Interceptor(ProceedingJoinPoint pjp) throws Throwable {
        RestController controller=  pjp.getTarget().getClass().getAnnotation(RestController.class);
        if(controller==null){
            throw new IllegalCodeException("不能使用@Controller 注解，请使用@RestController");
        }
        return pjp.proceed();
    }



}