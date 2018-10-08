package com.zacx.serivce.user.api;

import com.zacx.serivce.user.api.dto.PlatformAccountDTO;

public interface PlatformServiceApi {

    /**
     * 新增平台账号
     * @param record
     * @return
     */
    int insertSelective(PlatformAccountDTO record);

    /**
     * 删除平台账号
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 修改平台信息
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(PlatformAccountDTO record);

    /**
     * 根据id查询平台用户信息
     * @param id
     * @return
     */
    PlatformAccountDTO selectByPrimaryKey(Integer id);

}
