package com.zacx.serivce.line.service;

import com.zacx.serivce.dal.entity.LCar;
import com.zacx.serivce.dal.entity.LCar2User;
import com.zacx.serivce.dal.entity.LCar2UserExample;
import com.zacx.serivce.dal.entity.LCarExample;
import com.zacx.serivce.line.api.exceptions.LineServiceException;

import java.util.List;

/**
 * 车辆信息内部服务
 * Created by song on 2018/10/5.
 */
public interface CarService {

    int insertCarInfo(LCar record) throws LineServiceException;
    int updateCarInfo(LCar record) throws LineServiceException;
    int removeCarsByExample(LCarExample example) throws LineServiceException;

    //车辆司机分配
    int insertCarUserInfo(LCar2User record) throws LineServiceException;
    //移除车辆司机关系
    int removeCarUserInfo(LCar2UserExample example) throws LineServiceException;

    //根据主键查找
    LCar  findByPrimaryKey(Integer id);
    //查找车辆
    List<LCar> getCarList(LCarExample example);
    //车辆驾驶员关系
    List<LCar2User> getCar2UserList(LCar2UserExample example);
}
