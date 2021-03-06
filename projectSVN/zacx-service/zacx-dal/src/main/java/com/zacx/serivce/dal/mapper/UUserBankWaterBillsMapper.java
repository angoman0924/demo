/*
*
* UUserBankWaterBillsMapper.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.mapper;

import com.zacx.serivce.dal.entity.UUserBankWaterBills;
import com.zacx.serivce.dal.entity.UUserBankWaterBillsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UUserBankWaterBillsMapper {
    /**
     *
     * @mbggenerated
     */
    int countByExample(UUserBankWaterBillsExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByExample(UUserBankWaterBillsExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int insert(UUserBankWaterBills record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(UUserBankWaterBills record);

    /**
     *
     * @mbggenerated
     */
    List<UUserBankWaterBills> selectByExample(UUserBankWaterBillsExample example);

    /**
     *
     * @mbggenerated
     */
    UUserBankWaterBills selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") UUserBankWaterBills record, @Param("example") UUserBankWaterBillsExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") UUserBankWaterBills record, @Param("example") UUserBankWaterBillsExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(UUserBankWaterBills record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(UUserBankWaterBills record);
}