package com.zacx.serivce.basic.api;

import com.zacx.serivce.basic.api.dto.SConfigDTO;

/**
 * 公共配置信息服务api
 * reated by song on 2018/10/6.
 */
public interface SConfigServiceApi {
    /**
     * 根据key取配置信息
     * @param configKey
     * @return
     */
    SConfigDTO findByConfigKey(String configKey);
}
