package com.zacx.serivce.line.api;

import com.github.pagehelper.PageInfo;
import com.zacx.serivce.line.api.dto.HotzoneDTO;
import com.zacx.serivce.line.api.exceptions.LineServiceException;

import java.util.List;

/**
 * 热区服务api
 * Created by song on 2018/10/3.
 */
public interface HotzoneServiceApi {
    /**
     * 添加记录
     * @param dto
     * @return
     * @throws LineServiceException
     */
    int insert(HotzoneDTO dto) throws LineServiceException;

    /**
     * 更新记录
     * @param dto
     * @return
     * @throws LineServiceException
     */
    int update(HotzoneDTO dto) throws LineServiceException;

    /**
     * 批量删除记录
     * @param ids
     * @param userCode
     * @return
     * @throws LineServiceException
     */
    int removeListByIds(List<Integer> ids, String userCode) throws LineServiceException;

    /**
     * 数据查询 带分页
     * NO.117 通过起始点或终点获取 热区以及热区票价信息（目的地，起始地）
     * @param dto
     * @return
     */
    PageInfo<HotzoneDTO> getHotzonePageInfo(HotzoneDTO dto);

    /**
     * 不带分页
     * NO.117 通过起始点或终点获取 热区以及热区票价信息（目的地，起始地）
     * @param dto
     * @return
     */
    List<HotzoneDTO> getHotzoneList(HotzoneDTO dto);
}
