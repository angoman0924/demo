package com.zacx.gateway.driver.controller;

import com.zacx.core.enums.Code;
import com.zacx.gateway.base.base.Result;
import com.zacx.gateway.driver.constants.PlatformApiUrl;

import com.zacx.serivce.user.api.PlatformServiceApi;
import com.zacx.serivce.user.api.dto.PlatformAccountDTO;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liusi on 2018/9/26.
 */
@RestController
@RequestMapping(PlatformApiUrl.PLATFORM)
public class PlatformController {

    @Autowired
    private PlatformServiceApi platformServiceApi;

    @ApiOperation(value = "新增平台账号")
    @PostMapping(PlatformApiUrl.INSERT)
   public Result<Integer> insertPlatform(@RequestBody PlatformAccountDTO platformAccount){
        Integer result = platformServiceApi.insertSelective(platformAccount);
        if(result == 0){
            return Result.error(Code.ERROR_DB_OPERATE,"新增平台账号");
        }else {
            return Result.success();
        }
   }


   @ApiOperation(value = "删除用户")
   @PostMapping(PlatformApiUrl.DELETE)
   public Result<Integer> deletePlatform(@RequestBody Integer platform_id){
       //软删除
       Integer result = platformServiceApi.deleteByPrimaryKey(platform_id);
       if (result == 0){
           return Result.error(Code.ERROR_DB_OPERATE,"更改状态失败");
       }
       return Result.success(result);
   }


    @ApiOperation(value = "修改")
    @PostMapping(PlatformApiUrl.UPDATE)
    public Result<Integer> updatePlatform(@RequestBody PlatformAccountDTO platformAccount){
        Integer result = platformServiceApi.updateByPrimaryKeySelective(platformAccount);
        if (result == 0){
            return Result.error(Code.ERROR_DB_OPERATE,"修改失败");
        }
        return Result.success(result);
    }
}
