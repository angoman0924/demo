package com.zacx.serivce.line.api.impl;

import com.alibaba.fastjson.JSON;
import com.zacx.serivce.dal.entity.LCar;
import com.zacx.serivce.line.api.CarServiceApi;
import com.zacx.serivce.line.api.dto.CarDTO;
import com.zacx.serivce.line.service.CarService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by song on 2018/10/6.
 */
@Service
public class CarServiceApiImpl implements CarServiceApi {
    Logger logger= LoggerFactory.getLogger(CarServiceApiImpl.class);
    @Autowired
    private CarService carService;
    @Override
    public CarDTO findByPrimaryKey(Integer id) {
        logger.info("CarServiceApi.findByPrimaryKey,params:{}", id);
        LCar byPrimaryKey = carService.findByPrimaryKey(id);
        if(null!=byPrimaryKey){
            CarDTO dto=new CarDTO();
            BeanUtils.copyProperties(byPrimaryKey,dto);
            logger.info("result:{}", dto);
            return dto;
        }
        return null;
    }
}
