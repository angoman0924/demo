package com.zacx.serivce.line.service;

import com.github.pagehelper.PageInfo;
import com.zacx.serivce.dal.entity.LLine;
import com.zacx.serivce.dal.entity.LPlan;
import com.zacx.serivce.line.api.dto.LineDTO;
import com.zacx.serivce.line.api.dto.PlanDTO;
import com.zacx.serivce.line.api.exceptions.LineServiceException;

import java.util.List;

/**
 * 线路内部服务逻辑
 * Created by song on 2018/10/2.
 */
public interface LineService {
    //写表
    int insert(LLine record) throws LineServiceException;
    //更新
    int update(LLine record) throws LineServiceException;
    //删除
    int removeListByIds(List<Integer> ids) throws LineServiceException;
    //根据主键查找
    LLine  findByPrimaryKey(Integer id);
    /**
     * 分页查询
     * @return
     */
    PageInfo<LLine> getLinePageInfo(LineDTO dto);

    //根据线路信息获取相应班次信息
    PageInfo<LPlan> getPlanInfoByLine(LineDTO dto);
}
