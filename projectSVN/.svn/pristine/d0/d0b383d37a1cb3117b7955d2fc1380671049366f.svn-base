package com.zacx.serivce.user.api;


import com.github.pagehelper.PageInfo;
import com.zacx.serivce.user.api.dto.AlarmDTO;
import com.zacx.serivce.user.api.dto.FeedbackDTO;

/**
* @desc    用户反馈相关
* @version 1.0
* @author  Liang Jun
* @date    2018年10月08日 10:30:46
**/
public interface FeedbackServiceApi {
    /**
     * 一键报警
     * @param dto
     * @return
     */
    int addAlarm(AlarmDTO dto);

    /**
     * 新增反馈意见
     * @param dto
     * @return
     */
    int addFeedback(FeedbackDTO dto);

    /**
     * 获取反馈意见
     * @param dto
     * @return
     */
    PageInfo<FeedbackDTO> getFeedbackPageInfo(FeedbackDTO dto);
}