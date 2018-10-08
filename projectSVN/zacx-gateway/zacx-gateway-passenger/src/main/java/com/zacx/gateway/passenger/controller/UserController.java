package com.zacx.gateway.passenger.controller;

import com.google.common.base.Strings;
import com.zacx.core.annotation.MethodFlag;
import com.zacx.core.enums.Code;
import com.zacx.core.enums.PlatformEnum;
import com.zacx.core.enums.UserTypeEnum;
import com.zacx.core.util.ObjectUtils;
import com.zacx.gateway.base.base.ClientInfo;
import com.zacx.gateway.base.base.Result;
import com.zacx.gateway.base.util.WebUtils;
import com.zacx.gateway.passenger.constants.PassengerApiUrl;
import com.zacx.gateway.passenger.dto.user.LoginEnter;
import com.zacx.gateway.passenger.dto.user.LoginResult;
import com.zacx.gateway.passenger.dto.user.RealNameEnter;
import com.zacx.gateway.passenger.dto.user.UMessageEnter;
import com.zacx.serivce.basic.api.ChitServiceApi;
import com.zacx.serivce.user.api.UserMessageApi;
import com.zacx.serivce.user.api.UserServiceApi;
import com.zacx.serivce.user.api.dto.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @desc    用户相关
 * @version 1.0
 * @author  Liang Jun
 * @date    2018年10月07日 16:00:42
 **/
@Api(description = "用户模块")
@RequestMapping(PassengerApiUrl.USER)
public class UserController {
    @Resource
    private ChitServiceApi chitServiceApi;
    @Resource
    private UserServiceApi userServiceApi;
    @Resource
    private UserMessageApi userMessageApi;

    @MethodFlag
    @ApiOperation(value = "用户登录/注册")
    @PostMapping(PassengerApiUrl.LOGIN)
    public Result<LoginResult> login(LoginEnter enter){
        LoginInfoDTO loginInfoDTO = ObjectUtils.copyBean(enter, LoginInfoDTO.class);
        loginInfoDTO.setPlatform(PlatformEnum.PASSENGER);
        SessionUser sessionUser = userServiceApi.login(loginInfoDTO);
        return Result.success(ObjectUtils.copyBean(sessionUser, LoginResult.class));
    }

    @MethodFlag
    @ApiOperation(value = "发送验证码")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "mobile", value = "手机号码", paramType = "query", required = true)
    })
    @GetMapping("sendSmsCode")
    public Result<Boolean> sendSmsCode(HttpServletRequest request, String mobile) {
        if (Strings.isNullOrEmpty(mobile) || mobile.length() < 11) {
            return Result.error(Code.ERROR_ARGUMENT,"手机号码格式错误");
        }
        String ip = WebUtils.getClientIpAddr(request);
        ip = Strings.isNullOrEmpty(ip) ? "": ip;
        chitServiceApi.sendSmsCode(mobile, ip);
        return Result.success(true);
    }

    /**
     * 实名认证
     */
    @MethodFlag
    @ApiOperation(value = "实名认证")
    @PostMapping(value = "realName")
    public Result<Boolean> realName(RealNameEnter enter) {
        RealNameDTO realNameDTO = new RealNameDTO();
        BeanUtils.copyProperties(enter, realNameDTO);
        if (!userServiceApi.realName(realNameDTO)) {
            return Result.error(Code.ERROR_DB_OPERATE, "认证失败");
        }
        return Result.success();
    }

    @ApiOperation(value = "根据手机号码查询用户")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "mobile", value = "手机号", required = true, paramType = "query", dataType = "string")
    })
    @GetMapping("getUserByMobile")
    public Result<UserDTO> selectUserByMobile(@ApiIgnore String mobile){
        UserDTO result = userServiceApi.selectUserByMobile(mobile);
        return Result.success(result);
    }

    @MethodFlag
    @ApiOperation(value = "根据用户ID查询用户详细信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID", required = true, paramType = "query", dataType = "string")
    })
    @GetMapping("getUserById")
    public Result<UserDetailDTO> getUserById(@ApiIgnore Integer id){
        if(id == null || id == 0){
            return Result.error(Code.ERROR_ARGUMENT,"用户ID不能为空");
        }
        UserDetailDTO userDetailDTO = userServiceApi.selectUserDetailById(id);
        if(userDetailDTO == null){
            return Result.error(Code.ERROR_DATA_NOT_FOUND,"没有找到相关信息");
        }
        return Result.success(userDetailDTO);
    }

    @ApiOperation(value = "根据用户ID查询用户紧急联系人")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID", required = true, paramType = "query", dataType = "string")
    })
    @GetMapping("selectUserEmergencyContactBykey")
    public Result<List<EmergencyContactDTO>> selectUserEmergencyContactBykey(@ApiIgnore Integer id){
        if (ObjectUtils.isNull(id) || id == 0) {
             return Result.error(Code.ERROR_ARGUMENT,"用户ID不能为空");
        }
        List<EmergencyContactDTO> mergencyContactDTOList = userServiceApi.selectEmergencyContactByUserId(id, UserTypeEnum.USER.getValue());//用户
        return Result.success(mergencyContactDTOList);
    }


    @MethodFlag
    @ApiOperation(value = "根据用户ID查询用户紧急联系人")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID", required = true, paramType = "query", dataType = "string")
    })
    @GetMapping("updateUserEmergencyContact")
    public Result<Boolean> updateUserEmergencyContact(@ApiIgnore Integer id,List<EmergencyContactDTO> mergencyContactDTOList){
        if(id == null || id == 0){
            return Result.error(Code.ERROR_ARGUMENT,"用户ID不能为空");
        }
        userServiceApi.updateUserEmergencyContact(id,UserTypeEnum.USER.getValue(),mergencyContactDTOList); //1 用户
        return Result.success(true);
    }

    @MethodFlag
    @ApiOperation(value = "参数测试")
    @GetMapping("parameter")
    public Result<ClientInfo> parameter(ClientInfo clientInfo){
        return Result.success(clientInfo);
    }

    @MethodFlag
    @ApiOperation(value = "参数测试1")
    @GetMapping("parameter1")
    public Result<String> parameter1(ClientInfo clientInfo,@RequestParam("id") int id){
        return Result.success(clientInfo+"id="+id);
    }

    // region 用户站内消息
    @ApiOperation(value = "用户站内消息-列表查询")
    @PostMapping("getMessageList")
    public Result<List<UserMessageDTO>> getMessageList(@RequestBody UMessageEnter enter){
        UserMessageDTO dto = new UserMessageDTO();
        BeanUtils.copyProperties(enter, dto);
        List<UserMessageDTO> result = userMessageApi.getMessageList(dto);
        return Result.success(result);
    }

    @MethodFlag
    @ApiOperation(value = "用户站内消息-添加")
    @PostMapping("insertUMessage")
    public Result<String> insertUMessage(UserMessageDTO dto){
        Integer result = userMessageApi.insertSelective(dto);
        if(result > 0)
            return Result.success();
        else
            return Result.error(Code.ERROR_DB_OPERATE,"用户站内消息-新增失败");
    }

    @MethodFlag
    @ApiOperation(value = "用户站内消息-修改")
    @PostMapping("updateUMessage")
    public Result<String> updateUMessage(UserMessageDTO dto) {
        Integer result = userMessageApi.updateByPrimaryKeySelective(dto);
        if(result > 0)
            return Result.success();
        else
            return Result.error(Code.ERROR_DB_OPERATE,"用户站内消息-修改失败");
    }

    @MethodFlag
    @ApiOperation(value = "用户站内消息-删除")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "messageId", value = "消息ID", paramType = "query", required = true)
    })
    @PostMapping("deleteUMessage")
    public Result<String> deleteUMessage(int messageId) {
        Integer result = userMessageApi.deleteByPrimaryKey(messageId);
        if(result > 0)
            return Result.success();
        else
            return Result.error(Code.ERROR_DB_OPERATE,"用户站内消息-软删除失败");
    }

    @MethodFlag
    @ApiOperation(value = "用户站内消息-批量删除")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "messageIds", value = "消息ID", paramType = "query", required = true)
    })
    @PostMapping("deleteUMessageByIds")
    public Result<String> deleteUMessageByIds(String messageIds) {
        Integer result = 0;
        List<Integer> ids = ObjectUtils.string2IntegerList(messageIds);
        if (ids != null && ids.size() > 0)
        result = userMessageApi.deleteByIds(ids);
        if(result > 0)
            return Result.success();
        else
            return Result.error(Code.ERROR_DB_OPERATE,"用户站内消息-批量软删除失败");
    }

    @MethodFlag
    @ApiOperation(value = "用户站内消息-根据key查询")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "messageId", value = "消息ID", paramType = "query", required = true)
    })
    @PostMapping("getMessageByKey")
    public Result<UserMessageDTO> getMessageByKey(int messageId) {
        UserMessageDTO dto = userMessageApi.selectByKey(messageId);
        if(dto == null)
            return Result.error(Code.ERROR_DATA_NOT_FOUND,"未查询到相关数据");
        else
            return Result.success(dto);
    }
    // endregion
}
