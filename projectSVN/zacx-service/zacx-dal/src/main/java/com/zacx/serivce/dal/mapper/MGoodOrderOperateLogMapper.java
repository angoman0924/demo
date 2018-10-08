/*
*
* MGoodOrderOperateLogMapper.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.mapper;

import com.zacx.serivce.dal.entity.MGoodOrderOperateLog;
import com.zacx.serivce.dal.entity.MGoodOrderOperateLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MGoodOrderOperateLogMapper {
    /**
     *
     * @mbggenerated
     */
    int countByExample(MGoodOrderOperateLogExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByExample(MGoodOrderOperateLogExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int insert(MGoodOrderOperateLog record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(MGoodOrderOperateLog record);

    /**
     *
     * @mbggenerated
     */
    List<MGoodOrderOperateLog> selectByExample(MGoodOrderOperateLogExample example);

    /**
     *
     * @mbggenerated
     */
    MGoodOrderOperateLog selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") MGoodOrderOperateLog record, @Param("example") MGoodOrderOperateLogExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") MGoodOrderOperateLog record, @Param("example") MGoodOrderOperateLogExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MGoodOrderOperateLog record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MGoodOrderOperateLog record);
}