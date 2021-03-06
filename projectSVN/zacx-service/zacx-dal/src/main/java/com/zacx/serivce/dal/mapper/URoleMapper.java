/*
*
* URoleMapper.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.mapper;

import com.zacx.serivce.dal.entity.URole;
import com.zacx.serivce.dal.entity.URoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface URoleMapper {
    /**
     *
     * @mbggenerated
     */
    int countByExample(URoleExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByExample(URoleExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int insert(URole record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(URole record);

    /**
     *
     * @mbggenerated
     */
    List<URole> selectByExample(URoleExample example);

    /**
     *
     * @mbggenerated
     */
    URole selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") URole record, @Param("example") URoleExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") URole record, @Param("example") URoleExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(URole record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(URole record);
}