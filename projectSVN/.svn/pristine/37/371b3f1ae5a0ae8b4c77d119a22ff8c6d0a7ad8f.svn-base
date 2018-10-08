package com.zacx.gateway.passenger.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.zacx.core.enums.Code;
import com.zacx.core.util.DateUtils;
import com.zacx.core.util.MoneyUtils;
import com.zacx.core.util.StringUtils;
import com.zacx.gateway.base.base.ClientInfo;
import com.zacx.gateway.base.base.PageResult;
import com.zacx.gateway.base.base.Result;
import com.zacx.gateway.base.util.WebUtils;
import com.zacx.gateway.passenger.constants.OrderApiUrl;
import com.zacx.gateway.passenger.dto.basic.CharteredCarModelQueryEnter;
import com.zacx.gateway.passenger.dto.basic.CharteredCarModelResult;
import com.zacx.gateway.passenger.dto.order.*;
import com.zacx.serivce.basic.api.CharteredCarModelServiceApi;
import com.zacx.serivce.basic.api.dto.CharteredCarModelDTO;
import com.zacx.serivce.basic.api.dto.CharteredCarModelQueryDTO;
import com.zacx.serivce.order.api.OrderServiceApi;
import com.zacx.serivce.order.api.dto.*;
import com.zacx.serivce.order.api.enums.BusinessTypeEnum;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @author gulx
 * @Description 基础模块
 * @Date 2018/9/27 19:37
 * @Param
 * @copyright 上海拜米网络科技有限公司
 * @return
 **/
@Api(description = "基础模块")
@RestController
@RequestMapping(OrderApiUrl.V1_BASIC)
public class BasicController {
    @Autowired
    private CharteredCarModelServiceApi charteredCarModelServiceApi;

    @ApiOperation(value = "车品牌列表")
    @PostMapping(OrderApiUrl.CHART_CARMODEL_LIST)
    public Result<PageResult<CharteredCarModelResult>> queryOrderList(ClientInfo clientInfo, @RequestBody CharteredCarModelQueryEnter modelQueryEnter) {
        CharteredCarModelQueryDTO orderQueryDTO = new CharteredCarModelQueryDTO();
        BeanUtils.copyProperties(modelQueryEnter, orderQueryDTO);
        PageInfo<CharteredCarModelDTO> pageList = charteredCarModelServiceApi.queryCarModel(orderQueryDTO);
        return WebUtils.pageDTOConvert2PageResult(pageList, CharteredCarModelResult.class);
    }

}
