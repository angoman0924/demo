package com.zacx.serivce.basic.service.impl;

import com.zacx.core.enums.BooleanEnum;
import com.zacx.serivce.basic.api.exceptions.BasicServiceException;
import com.zacx.serivce.basic.service.SConfigService;
import com.zacx.serivce.dal.entity.SConfig;
import com.zacx.serivce.dal.entity.SConfigExample;
import com.zacx.serivce.dal.mapper.SConfigMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by song on 2018/10/6.
 */
@Service
public class SConfigServiceImpl implements SConfigService {
    @Autowired
    private SConfigMapper configMapper;
    @Override
    public int insert(SConfig record) throws BasicServiceException {
        return configMapper.insertSelective(record);
    }

    @Override
    public int update(SConfig record) throws BasicServiceException {
        return configMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public SConfig findByPrimaryKey(Integer id) {
        return configMapper.selectByPrimaryKey(id);
    }

    @Override
    public SConfig findByConfigKey(String configKey) {
        SConfigExample example=new SConfigExample();
        example.createCriteria().andConfigKeyEqualTo(configKey).andStatusEqualTo(BooleanEnum.TRUE.getValue());
        List<SConfig> sConfigs = configMapper.selectByExample(example);

        if(null!=sConfigs&&!sConfigs.isEmpty()){
            return sConfigs.get(0);
        }
        return null;
    }
}
