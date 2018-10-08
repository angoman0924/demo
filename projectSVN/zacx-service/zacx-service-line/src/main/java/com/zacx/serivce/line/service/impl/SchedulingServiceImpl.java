package com.zacx.serivce.line.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zacx.core.util.DateUtils;
import com.zacx.core.util.ObjectUtils;
import com.zacx.core.util.StringUtils;
import com.zacx.serivce.dal.entity.*;
import com.zacx.serivce.dal.entity.ext.LSchedulingExt;
import com.zacx.serivce.dal.mapper.LSchedulingMapperExt;
import com.zacx.serivce.dal.model.QuerySchedulingByDriverCondition;
import com.zacx.serivce.dal.model.QuerySchedulingHistoryCondition;
import com.zacx.serivce.line.api.dto.QuerySchedulingByDriverConditionDTO;
import com.zacx.serivce.line.api.dto.SchedulingDTO;
import com.zacx.serivce.line.api.dto.QuerySchedulingHistoryConditionDTO;
import com.zacx.serivce.line.api.exceptions.LineServiceException;
import com.zacx.serivce.line.service.CarService;
import com.zacx.serivce.line.service.SchedulingService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 班次调度内部服务
 * Created by song on 2018/10/3.
 */
@Service
public class SchedulingServiceImpl implements SchedulingService {
    @Autowired
    private LSchedulingMapperExt schedulingMapper;
    @Autowired
    private CarService carService;
    @Override
    public Integer insert(LScheduling record) throws LineServiceException {
        schedulingMapper.insertSelective(record);
        return record.getId();
    }

    @Override
    public int update(LScheduling record) throws LineServiceException {
        return schedulingMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public LScheduling findByPrimaryKey(Integer id) {
        return schedulingMapper.selectByPrimaryKey(id);
    }

    @Override
    public int removeListByIds(List<Integer> ids, String userCode) throws LineServiceException {
        LSchedulingExample example=new LSchedulingExample();
        example.createCriteria().andIdIn(ids);
        return schedulingMapper.deleteByExample(example);
    }

    @Override
    public List<LScheduling> getSchedulingListByExample(LSchedulingExample example) {
        return schedulingMapper.selectByExample(example);
    }

    @Override
    public PageInfo<LScheduling> getSchedulingPageInfo(SchedulingDTO dto) {
        PageHelper.startPage(dto.getPageIndex(),dto.getPageSize());
        List<LScheduling> list = schedulingMapper.selectByExample(this.params2example(dto));
        PageInfo<LScheduling> page=new PageInfo<>(list);
        return page;
    }

    @Override
    public PageInfo<LScheduling> getSchedulingPageInfo(LSchedulingExample example, int pageIndex, int pageSize) {
        PageHelper.startPage(pageIndex,pageSize);
        List<LScheduling> list = schedulingMapper.selectByExample(example);
        PageInfo<LScheduling> page=new PageInfo<>(list);
        return page;
    }

    @Override
    public PageInfo<LSchedulingExt> getSchedulingHistory(QuerySchedulingHistoryConditionDTO dto) {
        PageHelper.startPage(dto.getPageIndex(),dto.getPageSize());
        QuerySchedulingHistoryCondition condition = new QuerySchedulingHistoryCondition();
        if(dto.isFlag()) {
            condition.setQueryId(dto.getQueryId());
            condition.setFlag("y");
        }else{
            condition.setFlag("n");
            LCarExample example=new LCarExample();
            example.createCriteria().andUserIdEqualTo(dto.getQueryId());
            List<LCar> carList = carService.getCarList(example);
            List<Integer> carIds=new ArrayList<>();
            if(null!=carList&&carList.size()>0){
                carList.forEach(i->{
                    carIds.add(i.getId());
                });
            }
            condition.setCarIds(carIds);
        }
        List<LSchedulingExt> schedulingHistory = schedulingMapper.getSchedulingHistory(condition);
        PageInfo<LSchedulingExt> pageInfo=new PageInfo<>(schedulingHistory);
        return pageInfo;
    }

    @Override
    public PageInfo<LSchedulingExt> getSchedulingPageInfoByDriver(QuerySchedulingByDriverConditionDTO condition) {
        QuerySchedulingByDriverCondition querySchedulingByDriverCondition=new QuerySchedulingByDriverCondition();
        BeanUtils.copyProperties(condition,querySchedulingByDriverCondition);
        PageHelper.startPage(condition.getPageIndex(),condition.getPageSize());
        List<LSchedulingExt> list = schedulingMapper.getSchedulingPageInfoByDriver(querySchedulingByDriverCondition);
        PageInfo<LSchedulingExt> pageInfo=new PageInfo<>(list);
        return pageInfo;
    }

    //region params2example 部分入参
    @Override
    public LSchedulingExample params2example(SchedulingDTO dto){
        LSchedulingExample example=new LSchedulingExample();
        LSchedulingExample.Criteria ca = example.createCriteria();

        if(!ObjectUtils.isNull(dto.getIsSign())){
            ca.andIsSignEqualTo(dto.getIsSign());
        }
        if(!ObjectUtils.isNull(dto.getCarId())){
            ca.andCarIdEqualTo(dto.getCarId());
        }
        if(!ObjectUtils.isNull(dto.getCreateBy())&& StringUtils.isNotBlank(dto.getCreateBy().trim())){
            ca.andCreateByLike("%"+dto.getCreateBy().trim()+"%");
        }
        if(!ObjectUtils.isNull(dto.getDriverId())){
            ca.andDriverIdEqualTo(dto.getDriverId());
        }
        if(!ObjectUtils.isNull(dto.getIsWorkOvertime())){
            ca.andIsWorkOvertimeEqualTo(dto.getIsWorkOvertime());
        }
        if(!ObjectUtils.isNull(dto.getModifyBy())&&StringUtils.isNotBlank(dto.getModifyBy().trim())){
            ca.andModifyByLike("%"+dto.getModifyBy().trim()+"%");
        }
        if(!ObjectUtils.isNull(dto.getPassengerNumber())){
            ca.andPassengerNumberEqualTo(dto.getPassengerNumber());
        }
        if(!ObjectUtils.isNull(dto.getPlanId())){
            ca.andPlanIdEqualTo(dto.getPlanId());
        }

        if(!ObjectUtils.isNull(dto.getStatus())){
            ca.andStatusEqualTo(dto.getStatus());
        }

        //region 发车时间检索
        if(!ObjectUtils.isNull(dto.getStartTimeStart())){
            Date start= DateUtils.dateConvertToSqlParamDate(dto.getStartTimeStart(),"yyyy-MM-dd 00:00:00",false);
            ca.andStartTimeGreaterThanOrEqualTo(start);
        }
        if(!ObjectUtils.isNull(dto.getStartTimeEnd())){
            Date end=DateUtils.dateConvertToSqlParamDate(dto.getStartTimeEnd(),"yyyy-MM-dd 23:59:59",true);
            ca.andStartTimeLessThanOrEqualTo(end);
        }
        //endregion

        if(StringUtils.isNotBlank(dto.getSortCase())){
            example.setOrderByClause(dto.getSortCase());
        }
        return example;
    }
    //endregion
}
