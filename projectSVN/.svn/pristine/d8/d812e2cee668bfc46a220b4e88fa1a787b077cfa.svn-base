package com.zacx.serivce.user.api.impl;

import com.alibaba.fastjson.JSON;
import com.zacx.serivce.user.api.PassengerServiceApi;
import com.zacx.serivce.user.api.dto.PassengerDTO;
import com.zacx.serivce.user.service.PassengerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by liusi on 2018/9/25.
 */

@Slf4j
@Service
public class PassengerServiceApiImpl implements PassengerServiceApi {

    @Resource
    private PassengerService passengerService;

    @Override
    public Integer insert(PassengerDTO record) {
        log.info("====== 新增乘客信息参数 ======：{}", JSON.toJSONString(record));
        Integer result = passengerService.insert(record);
        log.info("====== 新增乘客信息后結果 ======：{}", result);
        return result;
    }

    @Override
    public List<PassengerDTO> selectByUserId(Integer userLd) {
        log.info("====== 用戶編號為查詢乘客信息参数， ======：{}", userLd);
        List<PassengerDTO> list = passengerService.selectByUserId(userLd);
        log.info("====== 查詢关联乘客信息结果 ======：{}", JSON.toJSONString(list));
        return list;
    }


    @Override
    public List<PassengerDTO> selectListByIds(List<Integer> passengerIds) {

        log.info("====== 用戶編號為查詢乘客信息参数， ======：{}", passengerIds);
        List<PassengerDTO> passengerDTOList = passengerService.selectListByIds(passengerIds);
        log.info("====== 用戶编号查詢乘客信息结果， ======：{}", JSON.toJSONString(passengerDTOList));
        return passengerService.selectListByIds(passengerIds);
    }

    @Override
    public PassengerDTO selectByKey(String mobile) {
        log.info("====== 查詢乘客参数， ======：{}", mobile);
        PassengerDTO passengerDTO = passengerService.selectByKey(mobile);
        log.info("====== 查詢乘客信息结果， ======：{}", JSON.toJSONString(passengerDTO));
        return passengerService.selectByKey(mobile);
    }

    @Override
    public Integer updateByPrimaryKeySelective(PassengerDTO passengerEntity) {
        log.info("====== 修改乘客信息参数， ======：{}", JSON.toJSONString(passengerEntity));
        Integer result =passengerService.updateByPrimaryKeySelective(passengerEntity);
        log.info("====== 修改乘客结果， ======：{}", result);
        return result;
    }

    @Override
    public Integer deleteByPrimaryKey(Integer id) {
        log.info("====== 软删除乘客编号参数， ======：{}", id);
        Integer result = passengerService.deleteByPrimaryKey(id);
        log.info("====== 软删除乘客结果， ======：{}", result);
        return result;
    }
}
