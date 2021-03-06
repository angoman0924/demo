package com.zacx.gateway.driver.controller;


import com.google.common.base.Strings;
import com.zacx.core.annotation.MethodFlag;
import com.zacx.core.enums.Code;
import com.zacx.core.enums.PlatformEnum;
import com.zacx.core.util.ObjectUtils;
import com.zacx.gateway.base.base.Result;
import com.zacx.gateway.base.util.WebUtils;
import com.zacx.gateway.driver.constants.DriverApiUrl;
import com.zacx.gateway.driver.dto.user.ApplyCashWithdrawEnter;
import com.zacx.gateway.driver.dto.user.LoginEnter;
import com.zacx.gateway.driver.dto.user.WalletInfoResult;
import com.zacx.serivce.basic.api.ChitServiceApi;
import com.zacx.serivce.user.api.UserServiceApi;
import com.zacx.serivce.user.api.dto.LoginInfoDTO;
import com.zacx.serivce.user.api.dto.UserCashWithdrawApplyDTO;
import com.zacx.serivce.user.api.dto.UserDTO;
import com.zacx.serivce.user.api.dto.UserWalletInfoDTO;
import io.swagger.annotations.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 用户
 *
 * @author gulx
 * @version 1.0
 * @create 2018-09-17 20:31
 * @copyright 上海拜米网络科技有限公司
 **/
@Api(description = "用户")
@RestController
@RequestMapping(DriverApiUrl.USER)
public class UserController {
    @Resource
    private ChitServiceApi chitServiceApi;
    @Autowired
    private UserServiceApi userServiceApi;

    @ApiOperation(value = "根据手机号码查询用户")
    @GetMapping(DriverApiUrl.MOBILE)
    public Result<UserDTO> selectUserByMobile(@ApiParam("手机号码") @PathVariable("mobile") String mobile){
        UserDTO result = userServiceApi.selectUserByMobile(mobile);
        return Result.success(result);
    }

    @MethodFlag
    @ApiOperation(value = "用户登陆")
    @PostMapping("login")
    public Result<String> login(@RequestBody LoginEnter enter){
        LoginInfoDTO loginInfoDTO = new LoginInfoDTO();
        BeanUtils.copyProperties(enter, loginInfoDTO);
        loginInfoDTO.setPlatform(PlatformEnum.DRIVER);
//        String result = userServiceApi.login(loginInfoDTO);
//        return Result.success(result);
        return null;
    }

    @MethodFlag
    @ApiOperation(value = "发送验证码")
    @PostMapping("sendSmsCode")
    public Result<Boolean> sendSmsCode(HttpServletRequest request, @ApiParam(name = "mobile", value = "手机号码") @RequestBody String mobile) {
        if (Strings.isNullOrEmpty(mobile) || mobile.length() < 11) {
            return Result.error(Code.ERROR_ARGUMENT,"手机号码格式错误");
        }
        String ip = WebUtils.getClientIpAddr(request);
        ip = Strings.isNullOrEmpty(ip) ? "": ip;
        chitServiceApi.sendSmsCode(mobile, ip);
        return Result.success(true);
    }

    @MethodFlag
    @ApiOperation(value = "申请提现")
    @PostMapping("applyCashWithdraw")
    public Result<Boolean> applyCashWithdraw(ApplyCashWithdrawEnter enter) {
        UserCashWithdrawApplyDTO dto = new UserCashWithdrawApplyDTO();
        dto.setUserId(enter.getUserId());
        dto.setUserType(1);
        dto.setToBankAccountId(enter.getToAccountId());
        dto.setMoney(enter.getMoney());
        if (userServiceApi.addCashWithdraw(dto) == 0) {
            return Result.error(Code.ERROR_DB_OPERATE, "新增提现申请失败");
        }
        return Result.success(true);
    }

    @MethodFlag
    @ApiOperation("查看钱包信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户ID", paramType = "query", required = true)
    })
    @PostMapping("getWalletInfo")
    public Result<WalletInfoResult> getWalletInfo(Integer userId) {
        UserWalletInfoDTO dto = new UserWalletInfoDTO();
        dto.setUserType(2); //1:用户;2:司机
        dto.setUserId(userId);
        dto = userServiceApi.getUserWalletInfo(dto);
        return Result.success(ObjectUtils.copyBean(dto, WalletInfoResult.class));
    }
}
