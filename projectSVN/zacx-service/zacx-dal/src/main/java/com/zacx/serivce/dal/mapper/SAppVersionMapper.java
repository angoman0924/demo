/*
*
* SAppVersionMapper.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.mapper;

import com.zacx.serivce.dal.entity.SAppVersion;
import com.zacx.serivce.dal.entity.SAppVersionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SAppVersionMapper {
    /**
     *
     * @mbggenerated
     */
    int countByExample(SAppVersionExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByExample(SAppVersionExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int insert(SAppVersion record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(SAppVersion record);

    /**
     *
     * @mbggenerated
     */
    List<SAppVersion> selectByExample(SAppVersionExample example);

    /**
     *
     * @mbggenerated
     */
    SAppVersion selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") SAppVersion record, @Param("example") SAppVersionExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") SAppVersion record, @Param("example") SAppVersionExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SAppVersion record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SAppVersion record);
}