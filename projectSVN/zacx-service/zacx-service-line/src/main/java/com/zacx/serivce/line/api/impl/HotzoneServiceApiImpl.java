package com.zacx.serivce.line.api.impl;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.zacx.core.util.ObjectUtils;
import com.zacx.serivce.dal.entity.LHotzone;
import com.zacx.serivce.line.api.HotzoneServiceApi;
import com.zacx.serivce.line.api.dto.HotzoneDTO;
import com.zacx.serivce.line.api.exceptions.LineServiceException;
import com.zacx.serivce.line.service.HotzoneService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by song on 2018/10/3.
 */
@Service
public class HotzoneServiceApiImpl implements HotzoneServiceApi {
    Logger logger= LoggerFactory.getLogger(HotzoneServiceApiImpl.class);
    @Autowired
    private HotzoneService hotzoneService;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int insert(HotzoneDTO dto) throws LineServiceException {
        logger.info("HotzoneServiceApi.insert,params:{}", JSON.toJSONString(dto));
        LHotzone record=new LHotzone();
        BeanUtils.copyProperties(dto,record);
        int r = hotzoneService.insert(record);
        logger.info("r={}",r);
        return r;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int update(HotzoneDTO dto) throws LineServiceException {
        logger.info("HotzoneServiceApi.update,params:{}", JSON.toJSONString(dto));
        LHotzone record=new LHotzone();
        BeanUtils.copyProperties(dto,record);
        int r = hotzoneService.update(record);
        logger.info("r={}",r);
        return r;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int removeListByIds(List<Integer> ids, String userCode) throws LineServiceException {
        logger.info("HotzoneServiceApi.removeListByIds,params:{}", JSON.toJSONString(ids));
        int r = hotzoneService.removeListByIds(ids,userCode);
        logger.info("r={}",r);
        return r;
    }

    @Override
    public PageInfo<HotzoneDTO> getHotzonePageInfo(HotzoneDTO dto) {
        logger.info("HotzoneServiceApi.getHotzonePageInfo,params:{}",JSON.toJSONString(dto));

        PageInfo<LHotzone> pageInfo = hotzoneService.getHotzonePageInfo(dto);
        logger.info("pageInfo_result:{}",JSON.toJSONString(pageInfo));

        PageInfo<HotzoneDTO> page= ObjectUtils.pageEntityConvert2PageDTO(pageInfo,HotzoneDTO.class);
        logger.info("page_result:{}",JSON.toJSONString(page));


        return page;
    }

    @Override
    public List<HotzoneDTO> getHotzoneList(HotzoneDTO dto) {
        logger.info("HotzoneServiceApi.getHotzoneList,params:{}",JSON.toJSONString(dto));
        List<LHotzone> lHotzoneList = hotzoneService.getLHotzoneList(hotzoneService.params2example(dto));

        List<HotzoneDTO> list=ObjectUtils.ListEntity2ListDTO(lHotzoneList,HotzoneDTO.class);
        logger.info("list_result:{}",JSON.toJSONString(list));
        return list;
    }
}
