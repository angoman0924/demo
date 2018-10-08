package com.zacx.serivce.basic.service;

import com.zacx.serivce.basic.api.exceptions.BasicServiceException;
import com.zacx.serivce.dal.entity.SConfig;

/**
 * 配置表内部service
 * Created by song on 2018/10/6.
 */
public interface SConfigService {

    int insert(SConfig record) throws BasicServiceException;

    int update(SConfig record) throws BasicServiceException;

    SConfig findByPrimaryKey(Integer id);

    //根据key取值
    SConfig findByConfigKey(String configKey);
}
