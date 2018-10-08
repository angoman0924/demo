package com.zacx.serivce.user.api.impl;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.zacx.core.util.ObjectUtils;
import com.zacx.serivce.dal.entity.UIntegralWaterBills;
import com.zacx.serivce.user.api.UserIntegralSerivceApi;
import com.zacx.serivce.user.api.dto.UserIntegralDTO;
import com.zacx.serivce.user.api.exceptions.UserServiceException;
import com.zacx.serivce.user.service.UserIntegralSerivce;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by song on 2018/10/7.
 */
@Service
public class UserIntegralSerivceApiImpl implements UserIntegralSerivceApi {
    Logger logger= LoggerFactory.getLogger(UserIntegralSerivceApiImpl.class);
    @Autowired
    private UserIntegralSerivce userIntegralSerivce;
    @Override
    @Transactional(rollbackFor = Exception.class)
    public Integer insert(UserIntegralDTO record) throws UserServiceException {
        logger.info("UserIntegralSerivceApi.insert,params:{}", JSON.toJSONString(record));
        UIntegralWaterBills entry=new UIntegralWaterBills();
        BeanUtils.copyProperties(record,entry);
        Integer insert = userIntegralSerivce.insert(entry);
        logger.info("insert:{}", JSON.toJSONString(insert));
        return insert;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int removeByIds(List<Integer> ids) throws UserServiceException {
        logger.info("UserIntegralSerivceApi.removeByIds,params:{}", JSON.toJSONString(ids));
        return userIntegralSerivce.removeByIds(ids);
    }

    @Override
    public UserIntegralDTO findByPrimaryKey(Integer id) {
        UIntegralWaterBills byPrimaryKey = userIntegralSerivce.findByPrimaryKey(id);
        if(byPrimaryKey!=null){
            UserIntegralDTO dto=new UserIntegralDTO();
            BeanUtils.copyProperties(byPrimaryKey,dto);
            return dto;
        }
        return null;
    }

    @Override
    public UserIntegralDTO findByCode(String code) {
        UIntegralWaterBills byPrimaryKey = userIntegralSerivce.findByCode(code);
        if(byPrimaryKey!=null){
            UserIntegralDTO dto=new UserIntegralDTO();
            BeanUtils.copyProperties(byPrimaryKey,dto);
            return dto;
        }
        return null;
    }

    @Override
    public PageInfo<UserIntegralDTO> getIntegeralPageInfo(UserIntegralDTO dto) {
        logger.info("GoodsSerivceApi.getGoodsPageInfo,params:{}",JSON.toJSONString(dto));

        PageInfo<UIntegralWaterBills> pageInfo = userIntegralSerivce.getIntegeralPageInfo(dto);
        logger.info("pageInfo_result:{}",JSON.toJSONString(pageInfo));

        PageInfo<UserIntegralDTO> page= ObjectUtils.pageEntityConvert2PageDTO(pageInfo,UserIntegralDTO.class);
        logger.info("page_result:{}",JSON.toJSONString(page));

        return page;
    }

    @Override
    public long totalPoint(UserIntegralDTO dto) {
        logger.info("UserIntegralSerivceApi.totalPoint,params:{}", JSON.toJSONString(dto));
        long l = userIntegralSerivce.totalPoint(dto);
        logger.info("totalPoint:{}",l);
        return l;
    }
}
