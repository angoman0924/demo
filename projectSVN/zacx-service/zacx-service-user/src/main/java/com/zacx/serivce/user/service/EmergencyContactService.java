package com.zacx.serivce.user.service;

import com.zacx.serivce.dal.entity.UEmergencyContact;

import java.util.List;

/**
 * @desc    报警
 * @version 1.0
 * @author  zzg
 * @date    2018年10月09日
 **/
public interface EmergencyContactService {


    /**
     * 插入用户紧急联系人
     * @param uEmergencyContact
     * @return
     */
    int insertEmergencyContact(List<UEmergencyContact> uEmergencyContact);


    /**
     * 删除用户紧急联系人
     * @param userId
     * @return
     */
    int deleteEmergencyContactByUserId(Integer userId,Integer userType);

    /**
     * 根据用户编号查询用户信息
     * @param userId
     * @return
     */
    List<UEmergencyContact> selectEmergencyContactByUserId(Integer userId,Integer userType);

}
