/*
*
* BCarTypeMapper.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.mapper;

import com.zacx.serivce.dal.entity.BCarType;
import com.zacx.serivce.dal.entity.BCarTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BCarTypeMapper {
    /**
     *
     * @mbggenerated
     */
    int countByExample(BCarTypeExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByExample(BCarTypeExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int insert(BCarType record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(BCarType record);

    /**
     *
     * @mbggenerated
     */
    List<BCarType> selectByExample(BCarTypeExample example);

    /**
     *
     * @mbggenerated
     */
    BCarType selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") BCarType record, @Param("example") BCarTypeExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") BCarType record, @Param("example") BCarTypeExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(BCarType record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(BCarType record);
}