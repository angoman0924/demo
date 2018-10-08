package com.zacx.serivce.line.service;

import com.github.pagehelper.PageInfo;
import com.zacx.serivce.dal.entity.LPlan;
import com.zacx.serivce.dal.entity.LPlanExample;
import com.zacx.serivce.line.api.dto.PlanDTO;
import com.zacx.serivce.line.api.exceptions.LineServiceException;

import java.util.List;

/**
 * 班次内部服务
 * Created by song on 2018/10/3.
 */
public interface PlanService {
    //写表
    Integer insert(LPlan record) throws LineServiceException;
    //更新
    int update(LPlan record) throws LineServiceException;
    //删除
    int removeListByIds(List<Integer> ids, String userCode) throws LineServiceException;
    //根据主键查找
    LPlan  findByPrimaryKey(Integer id);
    //分页查询
    PageInfo<LPlan> getPlanPageInfo(PlanDTO dto);

    //普通查询
    List<LPlan> getPlanList(LPlanExample example);

    //参入转换
    LPlanExample params2example(PlanDTO dto);
}
