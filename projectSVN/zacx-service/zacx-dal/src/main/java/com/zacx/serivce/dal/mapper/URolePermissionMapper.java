/*
*
* URolePermissionMapper.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.mapper;

import com.zacx.serivce.dal.entity.URolePermission;
import com.zacx.serivce.dal.entity.URolePermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface URolePermissionMapper {
    /**
     *
     * @mbggenerated
     */
    int countByExample(URolePermissionExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByExample(URolePermissionExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int insert(URolePermission record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(URolePermission record);

    /**
     *
     * @mbggenerated
     */
    List<URolePermission> selectByExample(URolePermissionExample example);

    /**
     *
     * @mbggenerated
     */
    URolePermission selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") URolePermission record, @Param("example") URolePermissionExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") URolePermission record, @Param("example") URolePermissionExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(URolePermission record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(URolePermission record);
}