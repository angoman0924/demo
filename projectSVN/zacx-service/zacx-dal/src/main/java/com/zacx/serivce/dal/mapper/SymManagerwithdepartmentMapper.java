/*
*
* SymManagerwithdepartmentMapper.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.mapper;

import com.zacx.serivce.dal.entity.SymManagerwithdepartment;
import com.zacx.serivce.dal.entity.SymManagerwithdepartmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SymManagerwithdepartmentMapper {
    /**
     *
     * @mbggenerated
     */
    int countByExample(SymManagerwithdepartmentExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByExample(SymManagerwithdepartmentExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbggenerated
     */
    int insert(SymManagerwithdepartment record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(SymManagerwithdepartment record);

    /**
     *
     * @mbggenerated
     */
    List<SymManagerwithdepartment> selectByExample(SymManagerwithdepartmentExample example);

    /**
     *
     * @mbggenerated
     */
    SymManagerwithdepartment selectByPrimaryKey(String id);

    /**
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") SymManagerwithdepartment record, @Param("example") SymManagerwithdepartmentExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") SymManagerwithdepartment record, @Param("example") SymManagerwithdepartmentExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SymManagerwithdepartment record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SymManagerwithdepartment record);
}