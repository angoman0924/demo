/*
*
* SymManagerinfoMapper.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.mapper;

import com.zacx.serivce.dal.entity.SymManagerinfo;
import com.zacx.serivce.dal.entity.SymManagerinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SymManagerinfoMapper {
    /**
     *
     * @mbggenerated
     */
    int countByExample(SymManagerinfoExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByExample(SymManagerinfoExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String managerid);

    /**
     *
     * @mbggenerated
     */
    int insert(SymManagerinfo record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(SymManagerinfo record);

    /**
     *
     * @mbggenerated
     */
    List<SymManagerinfo> selectByExample(SymManagerinfoExample example);

    /**
     *
     * @mbggenerated
     */
    SymManagerinfo selectByPrimaryKey(String managerid);

    /**
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") SymManagerinfo record, @Param("example") SymManagerinfoExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") SymManagerinfo record, @Param("example") SymManagerinfoExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SymManagerinfo record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SymManagerinfo record);
}