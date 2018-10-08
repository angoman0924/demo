/*
*
* SymRoleMapper.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.mapper;

import com.zacx.serivce.dal.entity.SymRole;
import com.zacx.serivce.dal.entity.SymRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SymRoleMapper {
    /**
     *
     * @mbggenerated
     */
    int countByExample(SymRoleExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByExample(SymRoleExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String roleid);

    /**
     *
     * @mbggenerated
     */
    int insert(SymRole record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(SymRole record);

    /**
     *
     * @mbggenerated
     */
    List<SymRole> selectByExample(SymRoleExample example);

    /**
     *
     * @mbggenerated
     */
    SymRole selectByPrimaryKey(String roleid);

    /**
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") SymRole record, @Param("example") SymRoleExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") SymRole record, @Param("example") SymRoleExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SymRole record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SymRole record);
}