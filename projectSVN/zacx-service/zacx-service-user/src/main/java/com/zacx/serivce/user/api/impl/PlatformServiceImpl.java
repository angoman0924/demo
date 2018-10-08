package com.zacx.serivce.user.api.impl;


import com.alibaba.fastjson.JSON;
import com.zacx.core.enums.BooleanEnum;
import com.zacx.serivce.dal.entity.UPlatformAccount;
import com.zacx.serivce.dal.mapper.UPlatformAccountMapper;
import com.zacx.serivce.user.api.PlatformServiceApi;
import com.zacx.serivce.user.api.dto.PlatformAccountDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by liusi on 2018/9/26.
 */
@Service
public class PlatformServiceImpl implements PlatformServiceApi {

    @Autowired
    private UPlatformAccountMapper uPlatformAccountMapper;

    @Override
    public int insertSelective(PlatformAccountDTO platformAccountDTO) {
        UPlatformAccount entity = new UPlatformAccount();
        BeanUtils.copyProperties(platformAccountDTO, entity);
        return uPlatformAccountMapper.insertSelective(entity);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        UPlatformAccount entity = new UPlatformAccount();
        entity.setId(id);
        entity.setStatus(BooleanEnum.TRUE.getValue());
        return uPlatformAccountMapper.updateByPrimaryKeySelective(entity);
    }


    @Override
    public int updateByPrimaryKeySelective(PlatformAccountDTO platformAccountDTO) {
        UPlatformAccount entity = new UPlatformAccount();
        BeanUtils.copyProperties(platformAccountDTO, entity);
        return uPlatformAccountMapper.updateByPrimaryKeySelective(entity);
    }

    @Override
    public PlatformAccountDTO selectByPrimaryKey(Integer id) {
        UPlatformAccount entity = uPlatformAccountMapper.selectByPrimaryKey(id);
        return JSON.parseObject(JSON.toJSONString(entity), PlatformAccountDTO.class);
    }
}
