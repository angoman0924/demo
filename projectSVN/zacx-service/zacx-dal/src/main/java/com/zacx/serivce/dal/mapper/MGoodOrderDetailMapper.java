/*
*
* MGoodOrderDetailMapper.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.mapper;

import com.zacx.serivce.dal.entity.MGoodOrderDetail;
import com.zacx.serivce.dal.entity.MGoodOrderDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MGoodOrderDetailMapper {
    /**
     *
     * @mbggenerated
     */
    int countByExample(MGoodOrderDetailExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByExample(MGoodOrderDetailExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int insert(MGoodOrderDetail record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(MGoodOrderDetail record);

    /**
     *
     * @mbggenerated
     */
    List<MGoodOrderDetail> selectByExample(MGoodOrderDetailExample example);

    /**
     *
     * @mbggenerated
     */
    MGoodOrderDetail selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") MGoodOrderDetail record, @Param("example") MGoodOrderDetailExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") MGoodOrderDetail record, @Param("example") MGoodOrderDetailExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MGoodOrderDetail record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MGoodOrderDetail record);
}