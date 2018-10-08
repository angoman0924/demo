/*
*
* LLineMapper.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.mapper;

import com.zacx.serivce.dal.entity.LLine;
import com.zacx.serivce.dal.entity.LLineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LLineMapper {
    /**
     *
     * @mbggenerated
     */
    int countByExample(LLineExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByExample(LLineExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int insert(LLine record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(LLine record);

    /**
     *
     * @mbggenerated
     */
    List<LLine> selectByExample(LLineExample example);

    /**
     *
     * @mbggenerated
     */
    LLine selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") LLine record, @Param("example") LLineExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") LLine record, @Param("example") LLineExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(LLine record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(LLine record);
}