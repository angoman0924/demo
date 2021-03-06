/*
*
* SymFunctionpointMapper.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.mapper;

import com.zacx.serivce.dal.entity.SymFunctionpoint;
import com.zacx.serivce.dal.entity.SymFunctionpointExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SymFunctionpointMapper {
    /**
     *
     * @mbggenerated
     */
    int countByExample(SymFunctionpointExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByExample(SymFunctionpointExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String functionpointid);

    /**
     *
     * @mbggenerated
     */
    int insert(SymFunctionpoint record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(SymFunctionpoint record);

    /**
     *
     * @mbggenerated
     */
    List<SymFunctionpoint> selectByExample(SymFunctionpointExample example);

    /**
     *
     * @mbggenerated
     */
    SymFunctionpoint selectByPrimaryKey(String functionpointid);

    /**
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") SymFunctionpoint record, @Param("example") SymFunctionpointExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") SymFunctionpoint record, @Param("example") SymFunctionpointExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SymFunctionpoint record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SymFunctionpoint record);
}