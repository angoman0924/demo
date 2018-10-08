/*
*
* CActivityMapper.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.mapper;

import com.zacx.serivce.dal.entity.CActivity;
import com.zacx.serivce.dal.entity.CActivityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CActivityMapper {
    /**
     *
     * @mbggenerated
     */
    int countByExample(CActivityExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByExample(CActivityExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int insert(CActivity record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(CActivity record);

    /**
     *
     * @mbggenerated
     */
    List<CActivity> selectByExample(CActivityExample example);

    /**
     *
     * @mbggenerated
     */
    CActivity selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") CActivity record, @Param("example") CActivityExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") CActivity record, @Param("example") CActivityExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(CActivity record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(CActivity record);
}