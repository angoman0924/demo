package com.zacx.serivce.user.service;


import com.zacx.serivce.dal.entity.UUserDriver;
import com.zacx.serivce.user.api.dto.UserDriverDTO;

import java.util.List;

/**
* @desc    司机用户
* @version 1.0
* @author  Liang Jun
* @date    2018年10月05日 15:20:08
**/
public interface UserDriverService {
    UUserDriver getUserDriverByUserId(int userId);

    List<UUserDriver> getUserDriverList(UserDriverDTO dto);
}