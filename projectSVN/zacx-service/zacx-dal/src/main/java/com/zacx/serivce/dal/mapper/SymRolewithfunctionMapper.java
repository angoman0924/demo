/*
*
* SymRolewithfunctionMapper.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.mapper;

import com.zacx.serivce.dal.entity.SymRolewithfunction;
import com.zacx.serivce.dal.entity.SymRolewithfunctionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SymRolewithfunctionMapper {
    /**
     *
     * @mbggenerated
     */
    int countByExample(SymRolewithfunctionExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByExample(SymRolewithfunctionExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String relationid);

    /**
     *
     * @mbggenerated
     */
    int insert(SymRolewithfunction record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(SymRolewithfunction record);

    /**
     *
     * @mbggenerated
     */
    List<SymRolewithfunction> selectByExample(SymRolewithfunctionExample example);

    /**
     *
     * @mbggenerated
     */
    SymRolewithfunction selectByPrimaryKey(String relationid);

    /**
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") SymRolewithfunction record, @Param("example") SymRolewithfunctionExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") SymRolewithfunction record, @Param("example") SymRolewithfunctionExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SymRolewithfunction record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SymRolewithfunction record);
}