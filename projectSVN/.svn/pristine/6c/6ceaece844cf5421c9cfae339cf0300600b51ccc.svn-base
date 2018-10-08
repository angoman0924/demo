package com.zacx.serivce.basic.api.impl;

import com.zacx.core.util.ObjectUtils;
import com.zacx.serivce.basic.api.InsuranceServiceApi;
import com.zacx.serivce.basic.api.dto.InsuranceDTO;
import com.zacx.serivce.basic.service.InsuranceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Liang Jun
 * @version 1.0
 * @desc 保险
 * @date 2018年10月04日 20:20:35
 **/
@Slf4j
@Service
public class InsuranceServiceApiImpl implements InsuranceServiceApi {
    @Resource
    private InsuranceService insuranceService;

    @Override
    public List<InsuranceDTO> getInsuranceList(InsuranceDTO insuranceDTO) {
        return ObjectUtils.ListEntity2ListDTO(insuranceService.getInsuranceList(insuranceDTO), InsuranceDTO.class);
    }

    @Override
    public List<InsuranceDTO> getListByIds(List<Integer> insuranceIds) {
        return ObjectUtils.ListEntity2ListDTO(insuranceService.getListByIds(insuranceIds), InsuranceDTO.class);
    }
}
