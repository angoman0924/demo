/*
*
* BOtherPlatformMapper.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.mapper;

import com.zacx.serivce.dal.entity.BOtherPlatform;
import com.zacx.serivce.dal.entity.BOtherPlatformExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BOtherPlatformMapper {
    /**
     *
     * @mbggenerated
     */
    int countByExample(BOtherPlatformExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByExample(BOtherPlatformExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int insert(BOtherPlatform record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(BOtherPlatform record);

    /**
     *
     * @mbggenerated
     */
    List<BOtherPlatform> selectByExample(BOtherPlatformExample example);

    /**
     *
     * @mbggenerated
     */
    BOtherPlatform selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") BOtherPlatform record, @Param("example") BOtherPlatformExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") BOtherPlatform record, @Param("example") BOtherPlatformExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(BOtherPlatform record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(BOtherPlatform record);
}