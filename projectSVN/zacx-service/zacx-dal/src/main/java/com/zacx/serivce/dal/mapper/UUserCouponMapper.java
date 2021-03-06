/*
*
* UUserCouponMapper.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.mapper;

import com.zacx.serivce.dal.entity.UUserCoupon;
import com.zacx.serivce.dal.entity.UUserCouponExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UUserCouponMapper {
    /**
     *
     * @mbggenerated
     */
    int countByExample(UUserCouponExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByExample(UUserCouponExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int insert(UUserCoupon record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(UUserCoupon record);

    /**
     *
     * @mbggenerated
     */
    List<UUserCoupon> selectByExample(UUserCouponExample example);

    /**
     *
     * @mbggenerated
     */
    UUserCoupon selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") UUserCoupon record, @Param("example") UUserCouponExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") UUserCoupon record, @Param("example") UUserCouponExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(UUserCoupon record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(UUserCoupon record);
}