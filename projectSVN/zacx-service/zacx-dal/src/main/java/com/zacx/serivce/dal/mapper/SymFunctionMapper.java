/*
*
* SymFunctionMapper.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.mapper;

import com.zacx.serivce.dal.entity.SymFunction;
import com.zacx.serivce.dal.entity.SymFunctionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SymFunctionMapper {
    /**
     *
     * @mbggenerated
     */
    int countByExample(SymFunctionExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByExample(SymFunctionExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String functionid);

    /**
     *
     * @mbggenerated
     */
    int insert(SymFunction record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(SymFunction record);

    /**
     *
     * @mbggenerated
     */
    List<SymFunction> selectByExample(SymFunctionExample example);

    /**
     *
     * @mbggenerated
     */
    SymFunction selectByPrimaryKey(String functionid);

    /**
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") SymFunction record, @Param("example") SymFunctionExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") SymFunction record, @Param("example") SymFunctionExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SymFunction record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SymFunction record);
}