package com.zacx.serivce.user.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zacx.serivce.dal.entity.UFeedback;
import com.zacx.serivce.dal.entity.UFeedbackExample;
import com.zacx.serivce.dal.mapper.UFeedbackMapper;
import com.zacx.serivce.user.api.dto.FeedbackDTO;
import com.zacx.serivce.user.service.FeedbackService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

/**
* @desc    意见反馈
* @version 1.0
* @author  Liang Jun
* @date    2018年10月07日 19:34:30
**/
@Service
public class FeedbackServiceImpl implements FeedbackService {
    @Resource
    private UFeedbackMapper feedbackMapper;

    @Override
    public int addFeedBack(UFeedback entity) {
        return feedbackMapper.insertSelective(entity);
    }

    @Override
    public PageInfo<UFeedback> getFeedbackPageInfo(FeedbackDTO dto) {
        PageHelper.startPage(dto.getPageIndex(), dto.getPageSize());
        List<UFeedback> list = feedbackMapper.selectByExample(params2example(dto));
        return new PageInfo<>(list);
    }

    private UFeedbackExample params2example(FeedbackDTO dto){
        UFeedbackExample example = new UFeedbackExample();
        UFeedbackExample.Criteria criteria = example.createCriteria();

        if (null != dto.getId()) {
            criteria.andIdEqualTo(dto.getId());
        }
        if (dto.getUserId() != null) {
            criteria.andUserIdEqualTo(dto.getUserId());
        }
        if (StringUtils.hasText(dto.getSortCase())) {
            example.setOrderByClause(dto.getSortCase());
        }
        return example;
    }
}