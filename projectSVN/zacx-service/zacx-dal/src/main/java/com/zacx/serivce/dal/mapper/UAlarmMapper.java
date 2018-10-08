/*
*
* UAlarmMapper.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.mapper;

import com.zacx.serivce.dal.entity.UAlarm;
import com.zacx.serivce.dal.entity.UAlarmExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UAlarmMapper {
    /**
     *
     * @mbggenerated
     */
    int countByExample(UAlarmExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByExample(UAlarmExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int insert(UAlarm record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(UAlarm record);

    /**
     *
     * @mbggenerated
     */
    List<UAlarm> selectByExample(UAlarmExample example);

    /**
     *
     * @mbggenerated
     */
    UAlarm selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") UAlarm record, @Param("example") UAlarmExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") UAlarm record, @Param("example") UAlarmExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(UAlarm record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(UAlarm record);
}