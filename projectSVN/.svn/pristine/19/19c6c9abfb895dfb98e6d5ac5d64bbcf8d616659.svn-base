package com.zacx.serivce.user.api.impl;


import com.github.pagehelper.PageInfo;
import com.zacx.core.enums.Code;
import com.zacx.core.enums.PlatformEnum;
import com.zacx.core.util.ObjectUtils;
import com.zacx.serivce.cache.key.enums.SerialCodeRuleEnum;
import com.zacx.serivce.dal.entity.UAlarm;
import com.zacx.serivce.dal.entity.UFeedback;
import com.zacx.serivce.line.api.SchedulingServiceApi;
import com.zacx.serivce.line.api.dto.SchedulingDTO;
import com.zacx.serivce.order.api.dto.TicketDTO;
import com.zacx.serivce.service.SerialService;
import com.zacx.serivce.user.api.FeedbackServiceApi;
import com.zacx.serivce.user.api.dto.AlarmDTO;
import com.zacx.serivce.user.api.dto.FeedbackDTO;
import com.zacx.serivce.user.api.exceptions.UserAssert;
import com.zacx.serivce.user.service.AlarmService;
import com.zacx.serivce.user.service.FeedbackService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

/**
* @desc    意见反馈相关服务
* @version 1.0
* @author  Liang Jun
* @date    2018年10月08日 10:32:16
**/
@Slf4j
@Service
public class FeedbackServiceApiImpl implements FeedbackServiceApi {
    @Resource
    private FeedbackService feedbackService;
    @Resource
    private AlarmService alarmService;
    @Resource
    private SerialService serialService;
    @Resource
    private SchedulingServiceApi schedulingServiceApi;

    @Override
    public int addFeedback(FeedbackDTO dto) {
        UserAssert.notNull(dto.getUserId(), Code.ERROR_ARGUMENT, "用户ID不能为空");
        UserAssert.hasText(dto.getContent(), Code.ERROR_ARGUMENT, "反馈内容不能为空");

        UFeedback uFeedback = new UFeedback();
        uFeedback.setCode(serialService.generateCode(SerialCodeRuleEnum.USER_FEEDBACK));
        uFeedback.setUserId(dto.getUserId());
        uFeedback.setContent(dto.getContent());
        uFeedback.setImagePath(dto.getImagePath());
        uFeedback.setType(dto.getType()); //类型: 1意见 2投诉
        uFeedback.setCreateAt(new Date());
        uFeedback.setCreateBy(dto.getUserId().toString());
        uFeedback.setModifyAt(uFeedback.getCreateAt());
        uFeedback.setModifyBy(uFeedback.getCreateBy());
        return feedbackService.addFeedBack(uFeedback);
    }

    @Override
    public PageInfo<FeedbackDTO> getFeedbackPageInfo(FeedbackDTO dto) {
        PageInfo<UFeedback> pageInfo = feedbackService.getFeedbackPageInfo(dto);
        return ObjectUtils.pageEntityConvert2PageDTO(pageInfo, FeedbackDTO.class);
    }

    @Override
    public int addAlarm(AlarmDTO dto) {
        log.info("请注意!! {}报警!!, 坐标:{}", dto.getPlatform().equals(PlatformEnum.PASSENGER) ? "乘客" : "司机");
        UserAssert.notNull(dto.getUserId(), Code.ERROR_UNKNOWN, "用户ID不能为空");

        //Todo 从order服务根据用户id查询当前(最后)的车票信息,这里模拟处理
        //TicketDTO ticketDTO = ticktService.getTicketByUserId(dto.getUserId());
        TicketDTO ticketDTO = new TicketDTO();
        UserAssert.notNull(ticketDTO, Code.ERROR_DATA_NOT_FOUND, "当前车票信息不存在");
        //Todo 这里要去scheduling_id,字段暂不存在
        SchedulingDTO schedulingDTO = schedulingServiceApi.findByPrimaryKey(ticketDTO.getId());
        UserAssert.notNull(schedulingDTO, Code.ERROR_UNKNOWN, "指定的车次行程不存在");
        //司机签到后，与司机结束该班次（1个小时内），可以点击报警【（签到时间）  与   （司机结束时间+1小时）之间，可以报警】
        long currTime = System.currentTimeMillis(); //当前时间
        long startTime = schedulingDTO.getSignTime().getTime(); //开始时间
        long endTime = schedulingDTO.getEndTime().getTime() + (60 * 60 * 1000); //结束时间
        UserAssert.isTrue(currTime>startTime && currTime<=endTime, Code.ERROR_UNKNOWN, "“对不起，当前没有班次，无法报警");

        UAlarm uAlarmEntity = new UAlarm();
        uAlarmEntity.setCode(serialService.generateCode(SerialCodeRuleEnum.USER_ALARM)); //流水单号
        uAlarmEntity.setUserId(dto.getUserId());
        uAlarmEntity.setUserType(dto.getPlatform().equals(PlatformEnum.PASSENGER) ? 1 : 2);
        uAlarmEntity.setCoordinate(dto.getCoordinate());
        uAlarmEntity.setTime(new Date());
        uAlarmEntity.setDescribe(dto.getDescribe());
        uAlarmEntity.setStatus(0);
        return alarmService.addAlarm(uAlarmEntity);
    }
}