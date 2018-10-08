package com.zacx.serivce.line.api;

import com.github.pagehelper.PageInfo;
import com.zacx.serivce.line.api.dto.HotzoneResultByLineDTO;
import com.zacx.serivce.line.api.dto.LineDTO;
import com.zacx.serivce.line.api.dto.PlanDTO;
import com.zacx.serivce.line.api.exceptions.LineServiceException;

import java.util.List;

/**
 * 线路服务api
 */
public interface LineServiceApi {
    /**
     * 添加记录
     * @param dto
     * @return
     * @throws LineServiceException
     */
    int insert(LineDTO dto) throws LineServiceException;

    /**
     * 更新记录
     * @param dto
     * @return
     * @throws LineServiceException
     */
    int update(LineDTO dto) throws LineServiceException;
    /**
     * 批量删除记录
     * @param ids
     * @return
     * @throws LineServiceException
     */
    int removeListByIds(List<Integer> ids) throws LineServiceException;

    /**
     * 数据查询
     * @param dto
     * @return
     */
    PageInfo<LineDTO> getLinePageInfo(LineDTO dto);

    /**
     * NO.113 根据线路信息获取相应班次信息
     * @param dto
     * @return
     */
    PageInfo<PlanDTO> getPlanInfoByLine(LineDTO dto);

    /**
     * 195 司机端 获取班线 起始点热区
     * @param lineId
     * @return
     */
    HotzoneResultByLineDTO getHotzoneResultByLine(int lineId);

    /**
     * 加载单体信息
     * @param lineId
     * @return
     */
    LineDTO findLineById(int lineId);
}
