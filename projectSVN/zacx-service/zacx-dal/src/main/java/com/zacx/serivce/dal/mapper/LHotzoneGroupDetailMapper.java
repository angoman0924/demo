/*
*
* LHotzoneGroupDetailMapper.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.mapper;

import com.zacx.serivce.dal.entity.LHotzoneGroupDetail;
import com.zacx.serivce.dal.entity.LHotzoneGroupDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LHotzoneGroupDetailMapper {
    /**
     *
     * @mbggenerated
     */
    int countByExample(LHotzoneGroupDetailExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByExample(LHotzoneGroupDetailExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int insert(LHotzoneGroupDetail record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(LHotzoneGroupDetail record);

    /**
     *
     * @mbggenerated
     */
    List<LHotzoneGroupDetail> selectByExample(LHotzoneGroupDetailExample example);

    /**
     *
     * @mbggenerated
     */
    LHotzoneGroupDetail selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") LHotzoneGroupDetail record, @Param("example") LHotzoneGroupDetailExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") LHotzoneGroupDetail record, @Param("example") LHotzoneGroupDetailExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(LHotzoneGroupDetail record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(LHotzoneGroupDetail record);
}