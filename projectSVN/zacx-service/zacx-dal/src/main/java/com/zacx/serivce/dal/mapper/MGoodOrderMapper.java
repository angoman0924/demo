/*
*
* MGoodOrderMapper.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.mapper;

import com.zacx.serivce.dal.entity.MGoodOrder;
import com.zacx.serivce.dal.entity.MGoodOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MGoodOrderMapper {
    /**
     *
     * @mbggenerated
     */
    int countByExample(MGoodOrderExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByExample(MGoodOrderExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int insert(MGoodOrder record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(MGoodOrder record);

    /**
     *
     * @mbggenerated
     */
    List<MGoodOrder> selectByExample(MGoodOrderExample example);

    /**
     *
     * @mbggenerated
     */
    MGoodOrder selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") MGoodOrder record, @Param("example") MGoodOrderExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") MGoodOrder record, @Param("example") MGoodOrderExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MGoodOrder record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MGoodOrder record);
}