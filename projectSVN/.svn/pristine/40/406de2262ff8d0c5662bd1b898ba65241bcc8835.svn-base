package com.zacx.serivce.user.api;


import com.github.pagehelper.PageInfo;
import com.zacx.serivce.user.api.dto.*;

import java.util.List;

/**
 * @desc    用户相关
 * @version 1.0
 * @author  Liang Jun
 * @date    2018年10月07日 16:00:42
 **/
public interface UserServiceApi {
    /**
     * 登录接口
     **/
    SessionUser login(LoginInfoDTO enter);
    /**
     * 根据手机号查询用户
     * @param mobile
     * @return
     */
    UserDTO selectUserByMobile(String mobile);

    /**
     * 根据手机号查询用户
     * @param id
     * @return
     */
    UserDTO selectUserById(Integer id);
    /**
     * 根据用户编号查询用户信息
     * @param userId
     * @return
     */
    UserDetailDTO selectUserDetailById(Integer userId);
    /**
     * 注册用户
     * @param userInfo
     * @return
     */
    UserInfo mobileRegister(UserInfo userInfo);
    /**
     * 实名认证
     * @param dto
     * @return
     */
    boolean realName(RealNameDTO dto);
    /**
     * 更新用户紧急联系人
     * @param userId
     * @param userType
     * @param uEmergencyContactDTO
     * @return
     */
    int updateUserEmergencyContact(Integer userId,Integer userType,List<EmergencyContactDTO> uEmergencyContactDTO);

    /**
     * 根据用户id 查询用户紧急联系人
     * @param userId
     * @param userType
     * @return
     */
    List<EmergencyContactDTO> selectEmergencyContactByUserId(Integer userId,Integer userType);
}