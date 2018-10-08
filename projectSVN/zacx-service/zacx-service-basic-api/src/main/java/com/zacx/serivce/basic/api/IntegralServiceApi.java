package com.zacx.serivce.basic.api;
import com.github.pagehelper.PageInfo;
import com.zacx.serivce.basic.api.dto.IntegralDTO;
import com.zacx.serivce.basic.api.dto.QueryIntegralConditionDTO;
import com.zacx.serivce.basic.api.exceptions.BasicServiceException;

import java.util.List;

/**
 * 积分服务api
 * Created by song on 2018/10/7.
 */
public interface IntegralServiceApi {
    /**
     * 新增
     * @param record
     * @return
     * @throws BasicServiceException
     */
    int insert(IntegralDTO record) throws BasicServiceException;

    /**
     * 修改
     * @param record
     * @return
     * @throws BasicServiceException
     */
    int update(IntegralDTO record) throws BasicServiceException;

    /**
     * 批量删除记录
     * @param ids
     * @param userCode
     * @return
     * @throws BasicServiceException
     */
    int removeListByIds(List<Integer> ids, String userCode) throws BasicServiceException;

    /**
     * 加载单体
     * @param id
     * @return
     */
    IntegralDTO findByPrimaryKey(Integer id);

    /**
     * 获取列表
     * @param condition
     * @return
     */
    List<IntegralDTO> getIntegralList(QueryIntegralConditionDTO condition);

    /**
     * 分页列表
     * @param condition
     * @return
     */
    PageInfo<IntegralDTO> getIntegralPageInfo(QueryIntegralConditionDTO condition);
}
