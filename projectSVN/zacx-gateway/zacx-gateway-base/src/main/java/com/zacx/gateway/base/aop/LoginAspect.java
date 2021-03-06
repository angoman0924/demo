package com.zacx.gateway.base.aop;

import com.zacx.core.annotation.MethodFlag;
import com.zacx.core.enums.Code;
import com.zacx.core.enums.PlatformEnum;
import com.zacx.core.enums.SourceEnum;
import com.zacx.core.exceptions.IllegalCodeException;
import com.zacx.core.model.api.TokenInfo;
import com.zacx.core.util.JwtUtils;
import com.zacx.gateway.base.base.ClientInfo;
import com.zacx.gateway.base.base.Result;
import com.zacx.gateway.base.util.SpringUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.Optional;


/**
 * 日志拦截器
 *
 * @author gulx
 * @version 1.0
 * @create 2018-09-21 10:43
 * @copyright 上海拜米网络科技有限公司
 **/
@Aspect
@Order(1)
public class LoginAspect {
    private PlatformEnum platform;
    public LoginAspect(PlatformEnum platform){
        this.platform=platform;
    }

    private Logger logger = LoggerFactory.getLogger(LoginAspect.class);
    @Autowired
    private JwtUtils jwtUtils;

    //and @annotation(org.springframework.web.bind.annotation.RestController
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
        Method interfaceMethod = ((MethodSignature)pjp.getSignature()).getMethod();
        MethodFlag smsMethod =  interfaceMethod.getAnnotation(MethodFlag.class);
        if(smsMethod!=null&&smsMethod.jumpFilter()==true){
            HttpServletRequest request = SpringUtils.getHttpServletRequest();
            if(request!=null){
                processParameter(pjp,request,false);
            }
            //若使用invoke执行函，内部异常无法在LogAspect正常处理
            Object rValue = pjp.proceed();
//            Object rValue = interfaceMethod.invoke(pjp.getTarget(),pjp.getArgs());//执行函
            logger.info("SERIAL_NUMBER:{};{}.{} 返回结果：{}",serialnumber,pjp.getSignature().getDeclaringTypeName(),pjp.getSignature().getName(),rValue);
            return rValue;
        }
        if(platform== PlatformEnum.PASSENGER||platform== PlatformEnum.DRIVER){
            HttpServletRequest request = SpringUtils.getHttpServletRequest();
            if(request!=null){
                Result x = processParameter(pjp, request,true);
                if (x != null) return x;
            }
        }
        Object objResult = pjp.proceed();
        if(!(objResult instanceof Result)){
            throw new IllegalCodeException("返回值必须是:com.zacx.gateway.base.base.Result。或者加 MethodFlag 注解跳过验证");
        }
        Result response = (Result) objResult;


        return response;
    }
    /**
    * @author gulx
    * @Description 参数验证和参数填充
    * @Date  2018/9/27 11:54
    * @Param [pjp, request]
    * @copyright 上海拜米网络科技有限公司
    * @return com.zacx.gateway.base.base.Result
    **/
    private Result processParameter(ProceedingJoinPoint pjp, HttpServletRequest request, boolean check) {
        String latitude = request.getHeader(ClientInfo.LAT);
        if(StringUtils.isBlank(latitude)&&check){
            return Result.error(Code.ERROR_ARGUMENT,"请求头没有找到纬度(header_lat)参数");
        }
        double lat = NumberUtils.toDouble(latitude,-1);
        if(lat==-1&&check){
            return Result.error(Code.ERROR_ARGUMENT,"无效的纬度(header_lat)参数");
        }
        String longitude = request.getHeader(ClientInfo.LNG);
        if(StringUtils.isBlank(longitude)&&check){
            return Result.error(Code.ERROR_ARGUMENT,"请求头没有找到经度(header_lng)参数");
        }
        double lng = NumberUtils.toDouble(longitude,-1);
        if(lng==-1&&check){
            return Result.error(Code.ERROR_ARGUMENT,"无效的经度(header_lng)参数");
        }
        String source = request.getHeader(ClientInfo.SOURCE);
        if(StringUtils.isBlank(source)&&check){
            return Result.error(Code.ERROR_ARGUMENT,"请求头没有找到来源(header_source)参数");
        }
        Optional<SourceEnum> sourceOp =  SourceEnum.getByName(source);
        if(!sourceOp.isPresent()&&check){
            return Result.error(Code.ERROR_ARGUMENT,"无效的来源(header_source)参数");
        }
        String version = request.getHeader(ClientInfo.VERSION);
        if(StringUtils.isBlank(version)&&check){
            return Result.error(Code.ERROR_ARGUMENT,"请求头没有找到版本号(header_version)参数");
        }
        String token = request.getHeader(ClientInfo.TOKEN);
        if(StringUtils.isBlank(token)&&check){
            return Result.error(Code.ERROR_ARGUMENT,"请求头没有找到令牌(header_token)参数");
        }
        Optional<TokenInfo> loginUserOp=jwtUtils.getLoginUser(token);
        if(!loginUserOp.isPresent()&&check){
            return Result.error(Code.ERROR_LOGIN_TIMEOUT,"无效的令牌(header_token)");
        }
        TokenInfo jwtUser=null;
        if(loginUserOp.isPresent()||check){
             jwtUser=loginUserOp.get();
            if(jwtUser.getPlatform()!=this.platform){
                return Result.error(Code.ERROR_AUTHORIZED_FAIL,"无效的令牌(header_token)");
            }
        }

        //填充参数
        for(Object param:pjp.getArgs()){
            if(param instanceof ClientInfo){
                ClientInfo enter=(ClientInfo)param;
                enter.setLat(lat);
                enter.setLng(lng);
                if(sourceOp.isPresent()){
                    enter.setSource(sourceOp.get());
                }

                enter.setVersion(version);
                if(jwtUser!=null){
                    enter.setUserId(jwtUser.getUserId());
                }

            }
        }
        return null;
    }


}