package com.zacx.serivce.line.service.impl;

import com.zacx.serivce.dal.entity.LCar;
import com.zacx.serivce.dal.entity.LCar2User;
import com.zacx.serivce.dal.entity.LCar2UserExample;
import com.zacx.serivce.dal.entity.LCarExample;
import com.zacx.serivce.dal.mapper.LCar2UserMapper;
import com.zacx.serivce.dal.mapper.LCarMapper;
import com.zacx.serivce.line.api.exceptions.LineServiceException;
import com.zacx.serivce.line.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 车辆信息内部服务
 * Created by song on 2018/10/5.
 */
@Service
public class CarServiceImpl implements CarService {
    @Autowired
    private LCarMapper carMapper;
    @Autowired
    private LCar2UserMapper car2UserMapper;
    @Override
    public int insertCarInfo(LCar record) throws LineServiceException {
        return carMapper.insertSelective(record);
    }

    @Override
    public int updateCarInfo(LCar record) throws LineServiceException {
        return carMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int removeCarsByExample(LCarExample example) throws LineServiceException {
        return carMapper.deleteByExample(example);
    }

    @Override
    public int insertCarUserInfo(LCar2User record) throws LineServiceException {
        return car2UserMapper.insertSelective(record);
    }

    @Override
    public int removeCarUserInfo(LCar2UserExample example) throws LineServiceException {
        return car2UserMapper.deleteByExample(example);
    }

    @Override
    public LCar findByPrimaryKey(Integer id) {
        return carMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<LCar> getCarList(LCarExample example) {
        return carMapper.selectByExample(example);
    }

    @Override
    public List<LCar2User> getCar2UserList(LCar2UserExample example) {
        return car2UserMapper.selectByExample(example);
    }
}
