package com.zacx.serivce.line.api.impl;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.zacx.core.util.ObjectUtils;
import com.zacx.serivce.dal.entity.*;
import com.zacx.serivce.line.api.LineServiceApi;
import com.zacx.serivce.line.api.dto.HotzoneDTO;
import com.zacx.serivce.line.api.dto.HotzoneResultByLineDTO;
import com.zacx.serivce.line.api.dto.LineDTO;
import com.zacx.serivce.line.api.dto.PlanDTO;
import com.zacx.serivce.line.api.exceptions.LineServiceException;
import com.zacx.serivce.line.service.HotzoneService;
import com.zacx.serivce.line.service.LineService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * 线路服务api
 * Created by song on 2018/10/3.
 */
@Service
public class LineServiceApiImpl implements LineServiceApi {
    Logger logger=LoggerFactory.getLogger(LineServiceApiImpl.class);
    @Autowired
    private LineService lineService;
    @Autowired
    private HotzoneService hotzoneService;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int insert(LineDTO dto) throws LineServiceException {
        logger.info("LineServiceApi.insert,params:{}", JSON.toJSONString(dto));
        LLine record=new LLine();
        BeanUtils.copyProperties(dto,record);
        int r = lineService.insert(record);
        logger.info("r={}",r);
        return r;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int update(LineDTO dto) throws LineServiceException {
        logger.info("LineServiceApi.update,params:{}", JSON.toJSONString(dto));
        LLine record=new LLine();
        BeanUtils.copyProperties(dto,record);
        int r = lineService.update(record);
        logger.info("r={}",r);
        return r;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int removeListByIds(List<Integer> ids) throws LineServiceException {
        logger.info("LineServiceApi.removeListByIds,params:{}", JSON.toJSONString(ids));
        int r = lineService.removeListByIds(ids);
        logger.info("r={}",r);
        return r;
    }

    @Override
    public PageInfo<LineDTO> getLinePageInfo(LineDTO dto) {
        logger.info("LineServiceApi.getLinePageInfo,params:{}",JSON.toJSONString(dto));

        PageInfo<LLine> linePageInfo = lineService.getLinePageInfo(dto);
        logger.info("linePageInfo_result:{}",JSON.toJSONString(linePageInfo));

        PageInfo<LineDTO> page=ObjectUtils.pageEntityConvert2PageDTO(linePageInfo,LineDTO.class);
        logger.info("page_result:{}",JSON.toJSONString(page));


        return page;
    }

    //根据线路信息获取相应班次信息
    @Override
    public PageInfo<PlanDTO> getPlanInfoByLine(LineDTO dto) {
        logger.info("LineServiceApi.getPlanInfoByLine,params:{}",JSON.toJSONString(dto));

        PageInfo<LPlan> planInfoByLine = lineService.getPlanInfoByLine(dto);
        logger.info("planInfoByLine_result:{}",JSON.toJSONString(planInfoByLine));

        PageInfo<PlanDTO> page= ObjectUtils.pageEntityConvert2PageDTO(planInfoByLine,PlanDTO.class);
        logger.info("page_result:{}",JSON.toJSONString(page));
        return page;
    }

    @Override
    public HotzoneResultByLineDTO getHotzoneResultByLine(int lineId) {
        logger.info("LineServiceApi.getHotzoneResultByLine,params:{}",lineId);
        HotzoneResultByLineDTO dto=new HotzoneResultByLineDTO();
        LLine byPrimaryKey = lineService.findByPrimaryKey(lineId);
        if(!ObjectUtils.isNull(byPrimaryKey)){
            LHotzoneExample example1=new LHotzoneExample();
            example1.createCriteria().
                    andSiteIdEqualTo(byPrimaryKey.getSiteStartId()).
                    andIsTemplateEqualTo(false).
                    andLineIdEqualTo(lineId);
            List<LHotzone> startHotzoneList = hotzoneService.getLHotzoneList(example1);
            logger.info("startHotzoneList_result:{}",JSON.toJSONString(dto));

            if(startHotzoneList!=null){
                dto.setStartSiteHotzongs(ObjectUtils.listEntityConvert2ListDTO(startHotzoneList, HotzoneDTO.class));
            }

            LHotzoneExample example2=new LHotzoneExample();
            example2.createCriteria().
                    andSiteIdEqualTo(byPrimaryKey.getSiteEndId()).
                    andIsTemplateEqualTo(false).
                    andLineIdEqualTo(lineId);
            List<LHotzone> endHotzoneList = hotzoneService.getLHotzoneList(example2);
            logger.info("endHotzoneList_result:{}",JSON.toJSONString(dto));

            if(endHotzoneList!=null){
                dto.setEndSiteHotzongs(ObjectUtils.listEntityConvert2ListDTO(endHotzoneList, HotzoneDTO.class));
            }
        }
        logger.info("result:{}",JSON.toJSONString(dto));
        return dto;
    }

    @Override
    public LineDTO findLineById(int lineId) {
        logger.info("LineServiceApi.findLineById,params:{}",lineId);
        LLine byPrimaryKey = lineService.findByPrimaryKey(lineId);
        if(byPrimaryKey!=null){
            LineDTO dto=new LineDTO();
            BeanUtils.copyProperties(byPrimaryKey,dto);
            logger.info("result:{}",dto);
            return dto;
        }
        return null;
    }
}
