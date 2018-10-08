package com.zacx.serivce.line.api;

import com.github.pagehelper.PageInfo;
import com.zacx.serivce.line.api.dto.SiteDTO;
import com.zacx.serivce.line.api.dto.QuerySiteInfoByCityCodeConditionDTO;
import com.zacx.serivce.line.api.exceptions.LineServiceException;

import java.util.List;
import java.util.Map;

/**
 * 站点服务api
 * Created by song on 2018/10/3.
 */
public interface SiteServiceApi {
    /**
     * 添加记录
     * @param dto
     * @return
     * @throws LineServiceException
     */
    int insert(SiteDTO dto) throws LineServiceException;

    /**
     * 更新记录
     * @param dto
     * @return
     * @throws LineServiceException
     */
    int update(SiteDTO dto) throws LineServiceException;

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
    PageInfo<SiteDTO> getSitePageInfo(SiteDTO dto);

    /**
     * NO.110  根据城市地点 返回长途汽车站点
     * @param cityCodes 城市code
     * @return
     */
    Map<String,List<SiteDTO>> getSiteInfosByCityCode(QuerySiteInfoByCityCodeConditionDTO cityCodes);

     /**
     * 加载单体信息
     * @param siteId
     * @return
     */
    SiteDTO findLineById(int siteId);

    /**
     * 根据id集获取集合
     * @param ids
     * @return
     */
    List<SiteDTO> getSiteListByIds(List<Integer> ids);
}
