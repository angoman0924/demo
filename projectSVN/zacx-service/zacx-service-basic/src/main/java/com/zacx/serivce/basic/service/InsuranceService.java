package com.zacx.serivce.basic.service;

import com.zacx.serivce.basic.api.dto.InsuranceDTO;
import com.zacx.serivce.dal.entity.BInsurance;

import java.util.List;

/**
* @desc    保险
* @version 1.0
* @author  Liang Jun
* @date    2018年10月04日 20:24:25
**/
public interface InsuranceService {
    List<BInsurance> getInsuranceList(InsuranceDTO insuranceDTO);
    List<BInsurance> getListByIds(List<Integer> insuranceIds);
}