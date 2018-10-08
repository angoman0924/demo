package com.zacx.serivce.user.service;

import com.zacx.serivce.user.api.dto.PassengerDTO;

import java.util.List;

/**
 * @desc    乘客相关
 * @version 1.0
 * @author  wupeng
 * @date    2018年10月07日 10:52:38
 **/
public interface PassengerService {

    /**
     * 新增乘客信息
     * @param passengerDTO 乘客对象
     * @return
     */
    Integer insert(PassengerDTO passengerDTO);

    /**
     * 根据用户编号查询关联乘客信息
     * @param userId 关联用户编号
     * @return
     */
    List<PassengerDTO> selectByUserId(Integer userId);

    /**
     * 根据乘客ID列表获取信息
     * @param passengerIds 关联用户编号
     * @return
     */
    List<PassengerDTO> selectListByIds(List<Integer> passengerIds);


    /**
     * 根据证件号码查询
     * @param cardNumber 查询认证信息
     * @return
     */
    PassengerDTO selectByKey(String cardNumber);

    /**
     * 修改乘客信息
     * @param passengerDTO 乘客信息
     * @return
     */
    Integer updateByPrimaryKeySelective(PassengerDTO passengerDTO);

    /**
     * 根据乘客编号删除乘客
     * @param id 乘客编号 软删除
     * @return
     */
    Integer deleteByPrimaryKey(Integer id);
}
