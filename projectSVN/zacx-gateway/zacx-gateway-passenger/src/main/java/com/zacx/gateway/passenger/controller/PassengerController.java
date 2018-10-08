package com.zacx.gateway.passenger.controller;

import com.zacx.core.annotation.MethodFlag;
import com.zacx.core.enums.Code;
import com.zacx.core.util.ObjectUtils;
import com.zacx.gateway.base.base.Result;
import com.zacx.gateway.passenger.constants.PassengerApiUrl;
import com.zacx.gateway.passenger.dto.user.PassengerEnter;
import com.zacx.gateway.passenger.dto.user.PassengerResult;
import com.zacx.serivce.user.api.PassengerServiceApi;
import com.zacx.serivce.user.api.dto.PassengerDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
* @author gulx
* @Description 乘客管理
* @Date  2018/9/28 10:50
* @Param 
* @copyright 上海拜米网络科技有限公司
* @return 
**/
@Api(description = "乘客模块")
@RestController
@RequestMapping(PassengerApiUrl.PASSENGER)
public class PassengerController {

    @Autowired
    private PassengerServiceApi passengerServiceApi;

    @MethodFlag
    @ApiOperation(value = "新增乘客信息")
    @PostMapping(PassengerApiUrl.INSERT_PASSENGER)
    public Result<PassengerResult> insertPassenger(@RequestBody PassengerEnter passenger) {
        PassengerDTO passengerDTO = new PassengerDTO();
        BeanUtils.copyProperties(passenger,passengerDTO);
        Integer result = passengerServiceApi.insert(passengerDTO);
        if(result > 0){
            PassengerResult passengerResult = new PassengerResult();
            BeanUtils.copyProperties(passengerDTO,passengerResult);
            return Result.success(passengerResult);
        }else{
            return Result.error(Code.ERROR_DB_OPERATE,"新增乘客信息失败");
        }
    }

    @MethodFlag
    @ApiOperation(value = "修改乘客信息")
    @PostMapping(PassengerApiUrl.UPDATE_MOBILE)
    public Result<PassengerResult> updatePassenger(@RequestBody PassengerEnter passenger) {
        if(StringUtils.isBlank(passenger.getPhone())){
            return Result.error(Code.ERROR_ARGUMENT,"手机号码不能为空");
        }
        if ( 11 != passenger.getPhone().length()) {
            return Result.error(Code.ERROR_ARGUMENT,"电话号码格式不正确");
        }
        if( null == passenger.getId() ){
            return Result.error(Code.ERROR_ARGUMENT,"乘客编号不能为空");
        }
        PassengerDTO passengerDTO = new PassengerDTO();
        BeanUtils.copyProperties(passenger,passengerDTO);
        Integer result = passengerServiceApi.updateByPrimaryKeySelective(passengerDTO);
        if(result > 0){
            //处理返回结果
            PassengerResult passengerResult = new PassengerResult();
            BeanUtils.copyProperties(passengerDTO,passengerResult);
            return Result.success(passengerResult);
        }else{
            return Result.error(Code.ERROR_DB_OPERATE,"修改乘客信息失败");
        }
    }

    @MethodFlag
    @ApiOperation(value = "删除乘客信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "passengerId", value = "乘客ID", paramType = "delete", required = true)
    })
    @PostMapping(PassengerApiUrl.DEL_PASSENGER)
    public Result<String> deletePassenger(@RequestBody  int passengerId) {
        Integer result = passengerServiceApi.deleteByPrimaryKey(passengerId);
        if(result == 0){
            return Result.success("删除成功");
        }
        if(result == 2){
            return Result.error(Code.ERROR_DATA_NOT_FOUND,"未找到编号为："+passengerId+"的乘客信息");
        }
        return Result.error(Code.ERROR_DB_OPERATE,"软栓除乘客信息失败");

    }

    @MethodFlag
    @ApiOperation(value = "根据用户查询关联乘客信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户ID", paramType = "query", required = true)
    })
    @GetMapping("passengerList")
    public Result<List<PassengerResult>> passengerList(Integer userId){
        if( userId == 0 ){
            return  Result.error(Code.ERROR_ARGUMENT,"用户编号不能为空！");
        }
        List<PassengerDTO> passengerList = passengerServiceApi.selectByUserId(userId);

        List<PassengerResult> passengerResults = ObjectUtils.ListEntity2ListDTO(passengerList, PassengerResult.class);
        if(passengerResults ==  null){
            return Result.error(Code.ERROR_DATA_NOT_FOUND,"您还未添加乘客~");
        }else {
            return Result.success(passengerResults);
        }
    }

    @MethodFlag
    @ApiOperation(value = "根据用户所选乘客查询关联乘客信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "passengerIds", value = "乘客ID,多个用,隔开", paramType = "query", required = true)
    })
    @GetMapping("choosePassengerList")
    public Result<List<PassengerResult>> choosePassengerList(String passengerIds){
        if( passengerIds == null){
            return  Result.error(Code.ERROR_ARGUMENT,"用户编号不能为空！");
        }
        List<Integer> list = new ArrayList<>();
        String[] split = passengerIds.split(",");
        for (String s: split){
            list.add(Integer.valueOf(s));
        }
        List<PassengerDTO> passengerList = passengerServiceApi.selectListByIds(list);
        List<PassengerResult> passengerResults = ObjectUtils.ListEntity2ListDTO(passengerList, PassengerResult.class);
        if(passengerResults ==  null){
            return Result.error(Code.ERROR_DATA_NOT_FOUND,"您未选择乘客~");
        }else {
            return Result.success(passengerResults);
        }
    }

}
