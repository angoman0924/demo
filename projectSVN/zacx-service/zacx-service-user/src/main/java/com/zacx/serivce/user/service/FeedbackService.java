package com.zacx.serivce.user.service;


import com.github.pagehelper.PageInfo;
import com.zacx.serivce.dal.entity.UFeedback;
import com.zacx.serivce.user.api.dto.FeedbackDTO;

/**
* @desc    意见反馈
* @version 1.0
* @author  Liang Jun
* @date    2018年10月07日 19:33:01
**/
public interface FeedbackService {
    int addFeedBack(UFeedback entity);

    PageInfo<UFeedback> getFeedbackPageInfo(FeedbackDTO dto);
}