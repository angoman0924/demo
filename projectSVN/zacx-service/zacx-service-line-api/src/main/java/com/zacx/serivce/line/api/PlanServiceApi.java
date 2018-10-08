package com.zacx.serivce.line.api;

import com.github.pagehelper.PageInfo;
import com.zacx.serivce.line.api.dto.PlanDTO;
import com.zacx.serivce.line.api.dto.SiteDTO;
import com.zacx.serivce.line.api.exceptions.LineServiceException;

import java.util.List;

/**
 * 班次服务api
 * Created by song on 2018/10/3.
 */
public interface PlanServiceApi {
    /**
     * 添加记录 返回主键
     * @param dto
     * @return
     * @throws LineServiceException
     */
    Integer insert(PlanDTO dto) throws LineServiceException;

    /**
     * 更新记录
     * @param dto
     * @return
     * @throws LineServiceException
     */
    int update(PlanDTO dto) throws LineServiceException;

    /**
     * 批量删除记录
     * @param ids
     * @param userCode
     * @return
     * @throws LineServiceException
     */
    int removeListByIds(List<Integer> ids, String userCode) throws LineServiceException;

    /**
     * 根据班次id获取班次及线路信息
     * @param id
     * @return
     */
    PlanDTO findPlanWithLineByPrimaryKey(Integer id);
    /**
     * 数据查询
     * @param dto
     * @return
     */
    PageInfo<PlanDTO> getPlanPageInfo(PlanDTO dto);
     /**
     * 加载单体信息
     * @param planId
     * @return
     */
    PlanDTO findLineById(int planId);
}
