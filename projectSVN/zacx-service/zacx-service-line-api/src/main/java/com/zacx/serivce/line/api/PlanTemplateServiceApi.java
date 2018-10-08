package com.zacx.serivce.line.api;

import com.github.pagehelper.PageInfo;
import com.zacx.serivce.line.api.dto.PlanTemplateDTO;
import com.zacx.serivce.line.api.dto.SiteDTO;
import com.zacx.serivce.line.api.exceptions.LineServiceException;

import java.util.List;

/**
 * 班次模版服务api
 * Created by song on 2018/10/3.
 */
public interface PlanTemplateServiceApi {
    /**
     * 添加记录
     * @param dto
     * @return
     * @throws LineServiceException
     */
    int insert(PlanTemplateDTO dto) throws LineServiceException;

    /**
     * 更新记录
     * @param dto
     * @return
     * @throws LineServiceException
     */
    int update(PlanTemplateDTO dto) throws LineServiceException;

    /**
     * 批量删除记录
     * @param ids
     * @param userCode
     * @return
     * @throws LineServiceException
     */
    int removeListByIds(List<Integer> ids, String userCode) throws LineServiceException;

    /**
     * 数据查询
     * @param dto
     * @return
     */
    PageInfo<PlanTemplateDTO> getPlanTemplatePageInfo(PlanTemplateDTO dto);
}
