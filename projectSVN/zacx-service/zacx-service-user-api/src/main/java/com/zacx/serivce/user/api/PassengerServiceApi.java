package com.zacx.serivce.user.api;


import com.zacx.serivce.user.api.dto.PassengerDTO;

import java.util.List;

/**
 * Created by liusi on 2018/9/25.
 */
public interface PassengerServiceApi {

    /**
     * 新增乘客信息
     * @param record 乘客对象
     * @return
     */
    Integer insert(PassengerDTO record);

    /**
     * 根据关联用户编号查询 所有关联乘客信息
     * @param userLd 关联用户编号
     * @return
     */
    List<PassengerDTO> selectByUserId(Integer userLd);

    /**
     * 根据乘客ID列表获取信息 所选择的乘客信息
     * @param passengerIds 关联用户编号
     * @return
     */
    List<PassengerDTO> selectListByIds(List<Integer> passengerIds);

    /**
     *根据乘客手机号码查询信息
     * @param mobile
     * @return
     */
    PassengerDTO selectByKey(String mobile);

    /**
     * 修改乘客信息 手机号码
     * @param passengerEntity
     * @return
     */
    Integer updateByPrimaryKeySelective(PassengerDTO passengerEntity);

    /**
     * 删除乘客信息
     * @param id 乘客编号
     * @return
     */
    Integer deleteByPrimaryKey(Integer id);
}
