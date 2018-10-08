package com.zacx.serivce.basic.api;


import com.zacx.serivce.basic.api.dto.InsuranceDTO;

import java.util.List;

/**
* @desc    保险
* @version 1.0
* @author  Liang Jun
* @date    2018年10月04日 19:47:21
**/
public interface InsuranceServiceApi {
    List<InsuranceDTO> getInsuranceList(InsuranceDTO insuranceDTO);
    List<InsuranceDTO> getListByIds(List<Integer> insuranceIds);
}