/*
*
* UPassengerMapper.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.mapper;

import com.zacx.serivce.dal.entity.UPassenger;
import com.zacx.serivce.dal.entity.UPassengerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UPassengerMapper {
    /**
     *
     * @mbggenerated
     */
    int countByExample(UPassengerExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByExample(UPassengerExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int insert(UPassenger record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(UPassenger record);

    /**
     *
     * @mbggenerated
     */
    List<UPassenger> selectByExample(UPassengerExample example);

    /**
     *
     * @mbggenerated
     */
    UPassenger selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") UPassenger record, @Param("example") UPassengerExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") UPassenger record, @Param("example") UPassengerExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(UPassenger record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(UPassenger record);
}