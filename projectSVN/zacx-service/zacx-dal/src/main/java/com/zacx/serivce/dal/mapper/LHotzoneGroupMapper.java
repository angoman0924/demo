/*
*
* LHotzoneGroupMapper.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.mapper;

import com.zacx.serivce.dal.entity.LHotzoneGroup;
import com.zacx.serivce.dal.entity.LHotzoneGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LHotzoneGroupMapper {
    /**
     *
     * @mbggenerated
     */
    int countByExample(LHotzoneGroupExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByExample(LHotzoneGroupExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int insert(LHotzoneGroup record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(LHotzoneGroup record);

    /**
     *
     * @mbggenerated
     */
    List<LHotzoneGroup> selectByExample(LHotzoneGroupExample example);

    /**
     *
     * @mbggenerated
     */
    LHotzoneGroup selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") LHotzoneGroup record, @Param("example") LHotzoneGroupExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") LHotzoneGroup record, @Param("example") LHotzoneGroupExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(LHotzoneGroup record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(LHotzoneGroup record);
}