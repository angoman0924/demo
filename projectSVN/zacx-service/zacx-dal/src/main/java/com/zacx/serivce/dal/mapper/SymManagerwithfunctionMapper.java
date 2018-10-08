/*
*
* SymManagerwithfunctionMapper.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.mapper;

import com.zacx.serivce.dal.entity.SymManagerwithfunction;
import com.zacx.serivce.dal.entity.SymManagerwithfunctionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SymManagerwithfunctionMapper {
    /**
     *
     * @mbggenerated
     */
    int countByExample(SymManagerwithfunctionExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByExample(SymManagerwithfunctionExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbggenerated
     */
    int insert(SymManagerwithfunction record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(SymManagerwithfunction record);

    /**
     *
     * @mbggenerated
     */
    List<SymManagerwithfunction> selectByExample(SymManagerwithfunctionExample example);

    /**
     *
     * @mbggenerated
     */
    SymManagerwithfunction selectByPrimaryKey(String id);

    /**
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") SymManagerwithfunction record, @Param("example") SymManagerwithfunctionExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") SymManagerwithfunction record, @Param("example") SymManagerwithfunctionExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SymManagerwithfunction record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SymManagerwithfunction record);
}