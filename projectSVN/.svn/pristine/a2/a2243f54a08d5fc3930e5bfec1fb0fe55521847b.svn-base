package com.zacx.gateway.passenger.controller;


import com.zacx.core.annotation.MethodFlag;
import com.zacx.core.util.ObjectUtils;
import com.zacx.gateway.base.base.Result;
import com.zacx.gateway.passenger.dto.basic.InsuranceResult;
import com.zacx.serivce.basic.api.InsuranceServiceApi;
import com.zacx.serivce.basic.api.dto.InsuranceDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* @desc    保险信息
* @version 1.0
* @author  Liang Jun
* @date    2018年10月04日 18:49:02
**/
@Api(description = "保险相关")
@RestController(value = "insurance")
public class InsuranceController {
    @Resource
    private InsuranceServiceApi insuranceServiceApi;

    @MethodFlag
    @ApiOperation(value = "获取保险列表")
    @GetMapping(value = "insuranceList")
    public Result<List<InsuranceResult>> insuranceList() {
        List<InsuranceDTO> dtoList = insuranceServiceApi.getInsuranceList(new InsuranceDTO());
        return Result.success(ObjectUtils.ListEntity2ListDTO(dtoList,InsuranceResult.class));
    }
}
