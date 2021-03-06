/*
*
* UInvoiceApplyMapper.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-08
*/
package com.zacx.serivce.dal.mapper;

import com.zacx.serivce.dal.entity.UInvoiceApply;
import com.zacx.serivce.dal.entity.UInvoiceApplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UInvoiceApplyMapper {
    /**
     *
     * @mbggenerated
     */
    int countByExample(UInvoiceApplyExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByExample(UInvoiceApplyExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int insert(UInvoiceApply record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(UInvoiceApply record);

    /**
     *
     * @mbggenerated
     */
    List<UInvoiceApply> selectByExample(UInvoiceApplyExample example);

    /**
     *
     * @mbggenerated
     */
    UInvoiceApply selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") UInvoiceApply record, @Param("example") UInvoiceApplyExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") UInvoiceApply record, @Param("example") UInvoiceApplyExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(UInvoiceApply record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(UInvoiceApply record);
}