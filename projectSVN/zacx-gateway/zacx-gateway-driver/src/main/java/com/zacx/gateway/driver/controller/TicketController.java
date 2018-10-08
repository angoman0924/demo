package com.zacx.gateway.driver.controller;

import com.zacx.gateway.base.base.ClientInfo;
import com.zacx.gateway.base.base.Result;
import com.zacx.gateway.driver.constants.DriverApiUrl;
import com.zacx.gateway.driver.dto.ticket.BoardingValiSmsEnter;
import com.zacx.serivce.order.api.OrderServiceApi;
import com.zacx.serivce.order.api.dto.BoardingSmsValiDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 车票
 */
@Api(description = "车票模块")
@RestController
@RequestMapping(DriverApiUrl.TICKET)
public class TicketController {
    @Autowired
    private OrderServiceApi orderServiceApi;

    @ApiOperation(value = "验证乘客车票短信码")
    @PostMapping(DriverApiUrl.VALI_BOARDING_SMSCODE)
    public Result<Boolean> valiBoardingSmsCode(ClientInfo clientInfo, @RequestBody BoardingValiSmsEnter boardingValiSmsEnter) {
        BoardingSmsValiDTO boardingSmsValiDTO = new BoardingSmsValiDTO();
        BeanUtils.copyProperties(boardingValiSmsEnter, boardingSmsValiDTO);
        boardingSmsValiDTO.setDriverId(clientInfo.getUserId());
        Boolean valiResult = orderServiceApi.valiSmsBoardingCode(boardingSmsValiDTO);
        return Result.success(valiResult);
    }

}
