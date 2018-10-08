/*
*
* SymManagerMapper.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.mapper;

import com.zacx.serivce.dal.entity.SymManager;
import com.zacx.serivce.dal.entity.SymManagerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SymManagerMapper {
    /**
     *
     * @mbggenerated
     */
    int countByExample(SymManagerExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByExample(SymManagerExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String managerid);

    /**
     *
     * @mbggenerated
     */
    int insert(SymManager record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(SymManager record);

    /**
     *
     * @mbggenerated
     */
    List<SymManager> selectByExample(SymManagerExample example);

    /**
     *
     * @mbggenerated
     */
    SymManager selectByPrimaryKey(String managerid);

    /**
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") SymManager record, @Param("example") SymManagerExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") SymManager record, @Param("example") SymManagerExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SymManager record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SymManager record);
}