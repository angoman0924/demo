package com.zacx.gateway.driver.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.zacx.core.annotation.MethodFlag;
import com.zacx.core.enums.Code;
import com.zacx.core.enums.SchedulingMoveApplyStatus;
import com.zacx.core.util.ObjectUtils;
import com.zacx.core.util.StringUtils;
import com.zacx.gateway.base.base.PageResult;
import com.zacx.gateway.base.base.Result;
import com.zacx.gateway.base.util.WebUtils;
import com.zacx.gateway.driver.constants.DriverApiUrl;
import com.zacx.gateway.driver.dto.lines.*;
import com.zacx.serivce.line.api.HotzoneServiceApi;
import com.zacx.serivce.line.api.LineServiceApi;
import com.zacx.serivce.line.api.SchedulingServiceApi;
import com.zacx.serivce.line.api.dto.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by song on 2018/10/5.
 */
@Api(description = "路线模块")
@RestController
@RequestMapping(DriverApiUrl.V1)
public class LineController {
    @Autowired
    private SchedulingServiceApi schedulingServiceApi;

    @Autowired
    private LineServiceApi lineServiceApi;
    @Autowired
    private HotzoneServiceApi hotzoneServiceApi;

    //region 192  查询我的排班
    @MethodFlag
    @ApiOperation(value = "查询我的排班")
    @PostMapping(value = DriverApiUrl.LINE_GET_MY_SCHEDULING_INFO)
    public Result<PageResult<SchedulingExtResult>> getMySchedulingInfo(
            @ApiParam(value = "线路id", required = true)@RequestBody QuerySchedulingByDriverIdCondition condition) {
        if (ObjectUtils.isNull(condition)||ObjectUtils.isNull(condition.getDriverId())) {
            return Result.error(Code.getByCode(Code.ERROR_ARGUMENT.getDescription()), Code.ERROR_ARGUMENT.getDescription());
        }

        QuerySchedulingByDriverConditionDTO dto=new QuerySchedulingByDriverConditionDTO();
        dto.setDriverId(condition.getDriverId());

        if(!ObjectUtils.isNull(condition.getStartTime())){
            dto.setStartTime(condition.getStartTime());
        }
        if(!ObjectUtils.isNull(condition.getEndTime())){
            dto.setEndTime(condition.getEndTime());
        }
        if(!ObjectUtils.isNull(condition.getStatus())){
            dto.setStatus(condition.getStatus());
        }
        dto.setPageIndex(condition.getPageIndex());
        dto.setPageSize(condition.getPageSize());
        PageInfo<SchedulingExtDTO> pageInfo = schedulingServiceApi.getSchedulingPageInfoByDriver(dto);

        return WebUtils.pageDTOConvert2PageResult(pageInfo,SchedulingExtResult.class);
    }
    //endregion

    //region 193 班次调班申请
    @MethodFlag   //TODO 免验证需要去掉
    @ApiOperation(value = "班次调班申请(支持批量)")
    @PostMapping(value = DriverApiUrl.LINE_SCHEDULING_MOVE_APPLY)
    public Result schedulingMoveApply(@RequestBody List<SchedulingMoveApplyEnter> enters){
        if(ObjectUtils.isNull(enters)||enters.isEmpty()){
            return Result.error(Code.getByCode(Code.ERROR_ARGUMENT.getDescription()), Code.ERROR_ARGUMENT.getDescription());
        }

        List<SchedulingMoveApplyDTO> dtos=new ArrayList<>();
        for(SchedulingMoveApplyEnter enter:enters){
            if (ObjectUtils.isNull(enter)
                    ||ObjectUtils.isNull(enter.getUserId())
                    ||ObjectUtils.isNull(enter.getUserName())|| !StringUtils.isNotBlank(enter.getUserName().trim())
                    ||ObjectUtils.isNull(enter.getSchedulingId())
                    ||ObjectUtils.isNull(enter.getType())) {
                return Result.error(Code.getByCode(Code.ERROR_ARGUMENT.getDescription()), Code.ERROR_ARGUMENT.getDescription());
            }

            SchedulingMoveApplyDTO dto=new SchedulingMoveApplyDTO();

            dto.setCreateBy(enter.getUserName().trim());
            dto.setModifyBy(enter.getUserName().trim());
            dto.setDescribe(enter.getDescribe());
            dto.setSchedulingId(enter.getSchedulingId());
            dto.setStatus(SchedulingMoveApplyStatus.WAITING.getValue());
            dto.setType(enter.getType());
            dto.setUserId(enter.getUserId());

            dtos.add(dto);
        }

        int i = schedulingServiceApi.schedulingMoveApply(dtos);

        if(i==1){
            return Result.success("申请成功");
        }else{
            return Result.error(Code.ERROR_DB_OPERATE,"申请失败");
        }
    }
    //endregion

    //region 200 结束行程
    @MethodFlag   //TODO 免验证需要去掉
    @ApiOperation(value = "结束行程")
    @PostMapping(value = DriverApiUrl.LINE_SCHEDULING_COMPLETE_BY_DRIVER)
    public Result schedulingCompleteByDriver(@RequestBody DriverEnter enter){
        if (ObjectUtils.isNull(enter)
                ||ObjectUtils.isNull(enter.getUserId())
                ||ObjectUtils.isNull(enter.getUserName())|| !StringUtils.isNotBlank(enter.getUserName().trim())
                ||ObjectUtils.isNull(enter.getSchedulingId())) {
            return Result.error(Code.getByCode(Code.ERROR_ARGUMENT.getDescription()), Code.ERROR_ARGUMENT.getDescription());
        }

        SchedulingDTO dto=new SchedulingDTO();
        dto.setId(enter.getSchedulingId());
        dto.setDriverId(enter.getUserId());
        dto.setModifyBy(enter.getUserName());

        int update = schedulingServiceApi.schedulingCompleteByDriver(dto);
        if(1==update){
            return Result.success("结束成功");
        }else{
            return Result.error(Code.ERROR_DB_OPERATE,"结束失败");
        }
    }
    //endregion

    //region 194 扫描签到
    @MethodFlag   //TODO 免验证需要去掉
    @ApiOperation(value = "扫描签到")
    @PostMapping(value = DriverApiUrl.LINE_DRIVER_SIGN)
    public Result driverSign(@RequestBody DriverEnter enter){
        if (ObjectUtils.isNull(enter)
                ||ObjectUtils.isNull(enter.getUserId())
                ||ObjectUtils.isNull(enter.getUserName())|| !StringUtils.isNotBlank(enter.getUserName().trim())
                ||ObjectUtils.isNull(enter.getSchedulingId())) {
            return Result.error(Code.getByCode(Code.ERROR_ARGUMENT.getDescription()), Code.ERROR_ARGUMENT.getDescription());
        }

        SchedulingDTO dto=new SchedulingDTO();
        dto.setId(enter.getSchedulingId());
        dto.setDriverId(enter.getUserId());

        dto.setModifyBy(enter.getUserName());

        int update = schedulingServiceApi.driverSign(dto);
        if(1==update){
            return Result.success("签到成功");
        }else{
            return Result.error(Code.ERROR_DB_OPERATE,"签到失败");
        }
    }
    //endregion

    //region 195 获取班线起始点热区
    @MethodFlag   //TODO 免验证需要去掉
    @ApiOperation(value = "获取班线起始点热区")
    @PostMapping(value = DriverApiUrl.LINE_GET_HOTZONE_BY_LINE)
    public Result<HotzoneResultByLineResult> getHotzoneResultByLine(@ApiParam(value = "线路id", required = true) @RequestBody Integer lineId){
        if (ObjectUtils.isNull(lineId)) {
            return Result.error(Code.getByCode(Code.ERROR_ARGUMENT.getDescription()), Code.ERROR_ARGUMENT.getDescription());
        }

        HotzoneResultByLineDTO hotzoneResultByLine = lineServiceApi.getHotzoneResultByLine(lineId);

        HotzoneResultByLineResult re=new HotzoneResultByLineResult();
        if(null!=hotzoneResultByLine){
            if(hotzoneResultByLine.getStartSiteHotzongs()!=null){
                List<HotzoneResult> hotzoneResults = WebUtils.listDTOConvert2ListResult(hotzoneResultByLine.getStartSiteHotzongs(), HotzoneResult.class);
                re.setStartSiteHotzongs(hotzoneResults);
            }
            if(hotzoneResultByLine.getEndSiteHotzongs()!=null){
                List<HotzoneResult> hotzoneResults = WebUtils.listDTOConvert2ListResult(hotzoneResultByLine.getEndSiteHotzongs(), HotzoneResult.class);
                re.setEndSiteHotzongs(hotzoneResults);
            }
        }

        return Result.success(re);
    }
    //endregion




    //region 197通过起始点或终点获取热区信息
    @MethodFlag
    @ApiOperation(value = "通过起始点或终点获取热区信息")
    @PostMapping(value = DriverApiUrl.LINE_GET_HOTZONE_INFO_BY_SITEID)
    public Result<List<HotzoneResult>> getHotzoneInfoBySiteId(@ApiParam(value = "站点id", required = true) @RequestBody Integer siteId) {
        if (ObjectUtils.isNull(siteId)) {
            return Result.error(Code.getByCode(Code.ERROR_ARGUMENT.getDescription()), Code.ERROR_ARGUMENT.getDescription());
        }

        HotzoneDTO dto=new HotzoneDTO();
        dto.setSiteId(siteId);
        dto.setIsTemplate(false);
        List<HotzoneDTO> list = hotzoneServiceApi.getHotzoneList(dto);

        List<HotzoneResult> re=new ArrayList<>();
        if(null!=list&&!list.isEmpty()) {
            re=WebUtils.listDTOConvert2ListResult(list, HotzoneResult.class);
        }
        return Result.success(re);
    }
    //endregion

    //region 205 查看车辆或人员的历史排班
    @MethodFlag
    @ApiOperation(value = "查看车辆或人员的历史排班")
    @PostMapping(value = DriverApiUrl.LINE_GET_SCHEDULING_HISTORY)
    public Result<PageResult<SchedulingExtResult>> getSchedulingHistory(@RequestBody QuerySchedulingHistoryCondition condition){
        if (ObjectUtils.isNull(condition)||ObjectUtils.isNull(condition.getDriverId())||ObjectUtils.isNull(condition.getFlag())) {
            return Result.error(Code.getByCode(Code.ERROR_ARGUMENT.getDescription()), Code.ERROR_ARGUMENT.getDescription());
        }

        QuerySchedulingHistoryConditionDTO dto=new QuerySchedulingHistoryConditionDTO();
        dto.setQueryId(condition.getDriverId());
        if(condition.getFlag()==1){
            dto.setFlag(true);
        }else {
            dto.setFlag(false);
        }

        dto.setPageIndex(condition.getPageIndex());
        dto.setPageSize(condition.getPageSize());

        PageInfo<SchedulingExtDTO> pageInfo = schedulingServiceApi.getSchedulingHistory(dto);

        return WebUtils.pageDTOConvert2PageResult(pageInfo,SchedulingExtResult.class);

    }
    //endregion

    //region 202 获取当前车次的信息
    @MethodFlag
    @ApiOperation(value = "获取当前车次的信息(起点、终点的站点热区乘客等消息)")
    @PostMapping(value = DriverApiUrl.LINE_GET_SCHEDULING_SITE_HOTZONE_PASSENGER_INFO)
    public Result<SiteHotzonePassengerResult> getSchedulingSiteHotzonePassengerInfo(
            @RequestBody QuerySchedulingSiteHotzonePassengerCondition condition){
        if (ObjectUtils.isNull(condition)||ObjectUtils.isNull(condition.getSchedulingId())||ObjectUtils.isNull(condition.getSiteId())) {
            return Result.error(Code.getByCode(Code.ERROR_ARGUMENT.getDescription()), Code.ERROR_ARGUMENT.getDescription());
        }
        QuerySchedulingSiteHotzonePassengerConditionDTO dto=new QuerySchedulingSiteHotzonePassengerConditionDTO();
        dto.setSchedulingId(condition.getSchedulingId());
        dto.setSiteId(condition.getSiteId());

        SchedulingSiteHotzonePassengerDTO re = schedulingServiceApi.getSchedulingSiteHotzonePassengerInfo(dto);

        SiteHotzonePassengerResult result=new SiteHotzonePassengerResult();
        if(null!=re){
            String s = JSON.toJSONString(re);
            result= JSON.parseObject(s, SiteHotzonePassengerResult.class);
        }
        return Result.success(result);
    }
    //endregion

    //region 196 获取上车点人员信息
    @MethodFlag
    @ApiOperation(value = "获取上车点人员信息)")
    @PostMapping(value = DriverApiUrl.LINE_GET_TICKET_INFO_LIST)
    public Result<List<TicketInfoResult>> getTicketInfoListBy(@RequestBody Integer schedulingId){
        if (ObjectUtils.isNull(schedulingId)) {
            return Result.error(Code.getByCode(Code.ERROR_ARGUMENT.getDescription()), Code.ERROR_ARGUMENT.getDescription());
        }

        TicketInfoListDTO ticketInfoListBy = schedulingServiceApi.getTicketInfoListBy(schedulingId);
        if(null!=ticketInfoListBy&&null!=ticketInfoListBy.getList()&&!ticketInfoListBy.getList().isEmpty()){
            List<TicketInfoResult> list=WebUtils.listDTOConvert2ListResult(ticketInfoListBy.getList(),TicketInfoResult.class);
            return Result.success(list);
        }else{
            return Result.success(new ArrayList<>());
        }
    }
    //endregion
}
