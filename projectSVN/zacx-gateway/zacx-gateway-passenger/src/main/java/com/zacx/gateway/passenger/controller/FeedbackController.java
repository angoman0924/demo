package com.zacx.gateway.passenger.controller;


import com.zacx.core.annotation.MethodFlag;
import com.zacx.core.enums.Code;
import com.zacx.core.enums.PlatformEnum;
import com.zacx.gateway.base.base.ClientInfo;
import com.zacx.gateway.base.base.Result;
import com.zacx.gateway.passenger.constants.PassengerApiUrl;
import com.zacx.gateway.passenger.dto.user.FeedbackEnter;
import com.zacx.serivce.user.api.FeedbackServiceApi;
import com.zacx.serivce.user.api.dto.AlarmDTO;
import com.zacx.serivce.user.api.dto.FeedbackDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
* @desc    意见反馈相关
* @version 1.0
* @author  Liang Jun
* @date    2018年10月08日 10:59:16
**/
@Api(description = "意见反馈")
@RestController(PassengerApiUrl.FEEDBACK)
public class FeedbackController {
    @Resource
    private FeedbackServiceApi feedbackServiceApi;

    @MethodFlag
    @ApiOperation("新增意见反馈")
    @PostMapping("addFeedback")
    public Result<Boolean> addFeedback(FeedbackEnter enter) {
        FeedbackDTO dto = new FeedbackDTO();
        dto.setUserId(enter.getUserId());
        dto.setContent(enter.getContent());
        dto.setType(1); //类型: 1意见 2投诉
        dto.setImagePath(enter.getImagePath());
        if (feedbackServiceApi.addFeedback(dto) == 0) {
            return Result.error(Code.ERROR_DB_OPERATE, "新增意见反馈失败");
        }
        return Result.success();
    }

    @MethodFlag
    @ApiOperation(value = "一键报警")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "describe", value = "描述信息", paramType = "query")
    })
    @GetMapping("callAlarm")
    public Result<Boolean> callAlarm(ClientInfo clientInfo, String describe) {
        if (clientInfo.getUserId() == null) {
            Result.error(Code.ERROR_ARGUMENT, "用户ID不能为空");
        }
        AlarmDTO alarmDTO = new AlarmDTO();
        BeanUtils.copyProperties(clientInfo, alarmDTO);
        alarmDTO.setPlatform(PlatformEnum.PASSENGER);
        alarmDTO.setDescribe(describe);
        if (clientInfo.getLng() != null && clientInfo.getLat() != null) {
            alarmDTO.setCoordinate(clientInfo.getLng() + "," + clientInfo.getLat());
        }
        if (feedbackServiceApi.addAlarm(alarmDTO) == 0) {
            Result.error(Code.ERROR_DB_OPERATE, "报警失败");
        }
        return Result.success(true);
    }
}