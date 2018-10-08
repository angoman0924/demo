package com.zacx.serivce.basic.api;

import com.github.pagehelper.PageInfo;
import com.zacx.serivce.basic.api.dto.CharteredCarModelDTO;
import com.zacx.serivce.basic.api.dto.CharteredCarModelQueryDTO;

/**
 * 公共配置信息服务api
 * reated by song on 2018/10/6.
 */
public interface CharteredCarModelServiceApi {
    /**
     * 获取包车品牌
     * @param id
     * @return
     */
    CharteredCarModelDTO findByKey(Integer id);

    /**
     * 分页查询
     * @param queryDTO
     * @return
     */
    PageInfo<CharteredCarModelDTO> queryCarModel(CharteredCarModelQueryDTO queryDTO);

}
