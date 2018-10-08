package com.zacx.serivce.line.api;

import com.zacx.serivce.line.api.dto.CarDTO;

/**
 * 车辆服务API
 * Created by song on 2018/10/6.
 */
public interface CarServiceApi {
    /**
     * 加载车辆信息
     * @param id
     * @return
     */
    CarDTO findByPrimaryKey(Integer id);
}
