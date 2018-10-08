package com.zacx.serivce.user.service.impl;


import com.github.pagehelper.PageHelper;
import com.zacx.serivce.dal.entity.UAlarm;
import com.zacx.serivce.dal.entity.UAlarmExample;
import com.zacx.serivce.dal.mapper.UAlarmMapper;
import com.zacx.serivce.user.api.dto.AlarmDTO;
import com.zacx.serivce.user.service.AlarmService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

/**
* @desc    报警
* @version 1.0
* @author  Liang Jun
* @date    2018年10月05日 19:46:54
**/
@Service
public class AlarmServiceImpl implements AlarmService {
    @Resource
    private UAlarmMapper uAlarmMapper;

    @Override
    public int addAlarm(UAlarm entity) {
        return uAlarmMapper.insertSelective(entity);
    }

    @Override
    public List<UAlarm> getAlarmList(AlarmDTO dto) {
        PageHelper.startPage(dto.getPageIndex(),dto. getPageSize());
        List<UAlarm> uAlarmList = uAlarmMapper.selectByExample(this.params2example(dto));
        return uAlarmList;
    }

    private UAlarmExample params2example(AlarmDTO dto){
        UAlarmExample example = new UAlarmExample();
        UAlarmExample.Criteria criteria = example.createCriteria();

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