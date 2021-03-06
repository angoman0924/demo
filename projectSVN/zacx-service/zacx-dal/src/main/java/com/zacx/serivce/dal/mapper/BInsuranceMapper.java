/*
*
* BInsuranceMapper.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.mapper;

import com.zacx.serivce.dal.entity.BInsurance;
import com.zacx.serivce.dal.entity.BInsuranceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BInsuranceMapper {
    /**
     *
     * @mbggenerated
     */
    int countByExample(BInsuranceExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByExample(BInsuranceExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int insert(BInsurance record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(BInsurance record);

    /**
     *
     * @mbggenerated
     */
    List<BInsurance> selectByExample(BInsuranceExample example);

    /**
     *
     * @mbggenerated
     */
    BInsurance selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") BInsurance record, @Param("example") BInsuranceExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") BInsurance record, @Param("example") BInsuranceExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(BInsurance record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(BInsurance record);
}