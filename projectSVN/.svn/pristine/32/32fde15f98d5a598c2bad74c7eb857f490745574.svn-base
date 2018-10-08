package com.zacx.gateway.passenger.controller;

import com.zacx.core.annotation.MethodFlag;
import com.zacx.core.enums.Code;
import com.zacx.core.enums.SourceEnum;
import com.zacx.gateway.base.base.Result;
import com.zacx.gateway.passenger.constants.PassengerApiUrl;
import com.zacx.gateway.passenger.dto.TicketRuleResult;
import com.zacx.serivce.dal.enums.VerificationCodeEnum;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;


/**
* @author gulx
* @Description 功能接口
* @Date  2018/9/27 19:37
* @Param
* @copyright 上海拜米网络科技有限公司
* @return
**/
@ApiIgnore
@Api(description = "公共模块")
@RestController
@RequestMapping(PassengerApiUrl.COMMON)
public class CommonController {


    @MethodFlag
    @ApiOperation(value = "获取验证码")
    @GetMapping(PassengerApiUrl.VERIFICATION_CODE)
    public Result<String> verificationCode(
            @ApiParam("手机号码") @RequestParam("mobile") VerificationCodeEnum mobile,
            @ApiParam("验证码类型") @RequestParam("type") VerificationCodeEnum type) {

        //这里执行发送验证码代码
        return Result.success();
    }


    @MethodFlag
    @ApiOperation(value = "取退票规则")
    @GetMapping(PassengerApiUrl.TICKET_RULE)
    public Result<TicketRuleResult> ticketRule() {
        TicketRuleResult result=new TicketRuleResult();
        //这里执行发送验证码代码
        return Result.success(result);
    }


    @MethodFlag
    @ApiOperation(value = "获取APP最新版本号")
    @GetMapping(PassengerApiUrl.VERSION)
    public Result<String> version(@ApiParam("APP的当前版本") @RequestParam("version")String version,
                                  @ApiParam("客户端来源IOS,ANDROID") @RequestParam("source") SourceEnum source){
        if(source!=SourceEnum.IOS&&source!=SourceEnum.ANDROID){
            return Result.error(Code.ERROR_ARGUMENT,"当前只支持IOS,ANDROID查询版本号");
        }
        //这里需要去数据库查询
        return Result.success("1.0");
    }


}
