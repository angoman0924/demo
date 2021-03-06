/*
*
* USteelementCollectMapper.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.mapper;

import com.zacx.serivce.dal.entity.USteelementCollect;
import com.zacx.serivce.dal.entity.USteelementCollectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface USteelementCollectMapper {
    /**
     *
     * @mbggenerated
     */
    int countByExample(USteelementCollectExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByExample(USteelementCollectExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int insert(USteelementCollect record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(USteelementCollect record);

    /**
     *
     * @mbggenerated
     */
    List<USteelementCollect> selectByExample(USteelementCollectExample example);

    /**
     *
     * @mbggenerated
     */
    USteelementCollect selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") USteelementCollect record, @Param("example") USteelementCollectExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") USteelementCollect record, @Param("example") USteelementCollectExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(USteelementCollect record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(USteelementCollect record);
}