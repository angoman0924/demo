package com.zacx.serivce.user.api;

import com.github.pagehelper.PageInfo;
import com.zacx.serivce.user.api.dto.UserIntegralDTO;
import com.zacx.serivce.user.api.exceptions.UserServiceException;

import java.util.List;

/**
 * 积分服务api
 * Created by song on 2018/10/7.
 */
public interface UserIntegralSerivceApi {
    /**
     * 积分收入、支出 返回主键
     * @param record
     * @return
     * @throws UserServiceException
     */
    Integer insert(UserIntegralDTO record) throws UserServiceException;

    /**
     * 删除积分流水记录
     * @param ids
     * @return
     * @throws UserServiceException
     */
    int removeByIds(List<Integer> ids) throws UserServiceException;

    /**
     * 积分详情
     * @param id
     * @return
     */
    UserIntegralDTO findByPrimaryKey(Integer id);

    /**
     * 积分详情
     * @param code
     * @return
     */
    UserIntegralDTO findByCode(String code);

    /**
     * 流水记录
     * @param dto
     * @return
     */
    PageInfo<UserIntegralDTO> getIntegeralPageInfo(UserIntegralDTO dto);

    /**
     * 我的积分（总积分、收入积分、支出积分）
     * @param dto
     * @return
     */
    long totalPoint(UserIntegralDTO dto);
}
