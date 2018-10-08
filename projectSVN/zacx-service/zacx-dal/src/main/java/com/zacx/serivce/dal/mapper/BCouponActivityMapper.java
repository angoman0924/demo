/*
*
* BCouponActivityMapper.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.mapper;

import com.zacx.serivce.dal.entity.BCouponActivity;
import com.zacx.serivce.dal.entity.BCouponActivityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BCouponActivityMapper {
    /**
     *
     * @mbggenerated
     */
    int countByExample(BCouponActivityExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByExample(BCouponActivityExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int insert(BCouponActivity record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(BCouponActivity record);

    /**
     *
     * @mbggenerated
     */
    List<BCouponActivity> selectByExample(BCouponActivityExample example);

    /**
     *
     * @mbggenerated
     */
    BCouponActivity selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") BCouponActivity record, @Param("example") BCouponActivityExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") BCouponActivity record, @Param("example") BCouponActivityExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(BCouponActivity record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(BCouponActivity record);
}