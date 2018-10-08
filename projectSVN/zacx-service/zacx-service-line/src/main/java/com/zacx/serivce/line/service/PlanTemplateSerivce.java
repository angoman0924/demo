package com.zacx.serivce.line.service;

import com.github.pagehelper.PageInfo;
import com.zacx.serivce.dal.entity.LPlanTemplate;
import com.zacx.serivce.line.api.dto.PlanTemplateDTO;
import com.zacx.serivce.line.api.exceptions.LineServiceException;

import java.util.List;

/**
 * 班次模版内部服务
 * Created by song on 2018/10/3.
 */
public interface PlanTemplateSerivce {
    //写表
    int insert(LPlanTemplate record) throws LineServiceException;
    //更新
    int update(LPlanTemplate record) throws LineServiceException;
    //删除
    int removeListByIds(List<Integer> ids, String userCode) throws LineServiceException;
    //根据主键查找
    LPlanTemplate  findByPrimaryKey(Integer id);
    //分页查询
    PageInfo<LPlanTemplate> getPlanTemplatePageInfo(PlanTemplateDTO record);
}
