package com.zacx.serivce.line.api.impl;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.zacx.core.enums.BooleanEnum;
import com.zacx.core.enums.PlanSchedulingStatusEnum;
import com.zacx.core.util.ObjectUtils;
import com.zacx.core.util.StringUtils;
import com.zacx.serivce.cache.key.enums.SerialCodeRuleEnum;
import com.zacx.serivce.dal.entity.LLine;
import com.zacx.serivce.dal.entity.LPlan;
import com.zacx.serivce.line.api.PlanServiceApi;
import com.zacx.serivce.line.api.dto.LineDTO;
import com.zacx.serivce.line.api.dto.PlanDTO;
import com.zacx.serivce.line.api.exceptions.LineServiceException;
import com.zacx.serivce.line.service.LineService;
import com.zacx.serivce.line.service.PlanService;
import com.zacx.serivce.service.SerialService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 班次服务api
 * Created by song on 2018/10/3.
 */
@Service
public class PlanServiceApiImpl implements PlanServiceApi {
    Logger logger= LoggerFactory.getLogger(PlanServiceApiImpl.class);
    @Autowired
    private SerialService serialService;
    @Autowired
    private PlanService planService;
    @Autowired
    private LineService lineService;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Integer insert(PlanDTO dto) throws LineServiceException {
        logger.info("PlanServiceApi.insert,params:{}", JSON.toJSONString(dto));
        LPlan record=new LPlan();
        BeanUtils.copyProperties(dto,record);

        String code = serialService.generateCode(SerialCodeRuleEnum.PLAN);
        if (StringUtils.isBlank(code)) {
            throw new LineServiceException("编号获取失败");
        }
        record.setCode(code);
        record.setCreateAt(new Date());
        record.setModifyAt(new Date());
        record.setSchedulingStatus(PlanSchedulingStatusEnum.NO.getValue());
        record.setSaleStatus(BooleanEnum.FALSE.getValue());

        Integer r = planService.insert(record);
        logger.info("r={}",r);
        return record.getId();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int update(PlanDTO dto) throws LineServiceException {
        logger.info("PlanServiceApi.update,params:{}", JSON.toJSONString(dto));
        LPlan record=new LPlan();
        BeanUtils.copyProperties(dto,record);
        int r = planService.update(record);
        logger.info("r={}",r);
        return r;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int removeListByIds(List<Integer> ids, String userCode) throws LineServiceException {
        logger.info("PlanServiceApi.removeListByIds,params:{}", JSON.toJSONString(ids));
        int r = planService.removeListByIds(ids,userCode);
        logger.info("r={}",r);
        return r;
    }

    @Override
    public PlanDTO findPlanWithLineByPrimaryKey(Integer id) {
        logger.info("PlanServiceApi.findPlanByPrimaryKey,params:{}", id);
        PlanDTO dto=new PlanDTO();
        LPlan byPrimaryKey = planService.findByPrimaryKey(id);
        if(byPrimaryKey!=null){
            BeanUtils.copyProperties(byPrimaryKey,dto);
            LLine line = lineService.findByPrimaryKey(byPrimaryKey.getLineId());
            if(line!=null) {
                LineDTO lineDTO = new LineDTO();
                BeanUtils.copyProperties(line, lineDTO);
                dto.setLineDTO(lineDTO);
            }
        }
        logger.info("result:{}",JSON.toJSONString(dto));
        return dto;
    }

    @Override
    public PageInfo<PlanDTO> getPlanPageInfo(PlanDTO dto) {
        logger.info("PlanServiceApi.getPlanPageInfo,params:{}",JSON.toJSONString(dto));

        PageInfo<LPlan> pageInfo = planService.getPlanPageInfo(dto);
        logger.info("pageInfo_result:{}",JSON.toJSONString(pageInfo));

        PageInfo<PlanDTO> page= ObjectUtils.pageEntityConvert2PageDTO(pageInfo,PlanDTO.class);
        logger.info("page_result:{}",JSON.toJSONString(page));


        return page;
    }

    @Override
    public PlanDTO findLineById(int planId) {
        logger.info("PlanServiceApi.findLineById,params:{}",planId);
        LPlan byPrimaryKey = planService.findByPrimaryKey(planId);
        if(byPrimaryKey!=null){
            PlanDTO dto=new PlanDTO();
            BeanUtils.copyProperties(byPrimaryKey,dto);
            logger.info("result:{}",dto);
            return dto;
        }
        return null;
    }
}
