package com.zacx.serivce.basic.api.impl;

import com.zacx.serivce.basic.api.SConfigServiceApi;
import com.zacx.serivce.basic.api.dto.SConfigDTO;
import com.zacx.serivce.basic.service.SConfigService;
import com.zacx.serivce.dal.entity.SConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by song on 2018/10/6.
 */
@Service
public class SConfigServiceApiImpl implements SConfigServiceApi {
    Logger logger= LoggerFactory.getLogger(SConfigServiceApiImpl.class);
    @Autowired
    private SConfigService configService;
    @Override
    public SConfigDTO findByConfigKey(String configKey) {
        logger.info("SConfigServiceApi.findByConfigKey,params:{}", configKey);
        SConfigDTO dto=new SConfigDTO();
        SConfig byConfigKey = configService.findByConfigKey(configKey);
        if(null!=byConfigKey){
            BeanUtils.copyProperties(byConfigKey,dto);
        }
        logger.info("result:{}", dto);
        return dto;
    }
}
