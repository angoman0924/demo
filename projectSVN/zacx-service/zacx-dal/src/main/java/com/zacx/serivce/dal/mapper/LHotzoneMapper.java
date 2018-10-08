/*
*
* LHotzoneMapper.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.mapper;

import com.zacx.serivce.dal.entity.LHotzone;
import com.zacx.serivce.dal.entity.LHotzoneExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LHotzoneMapper {
    /**
     *
     * @mbggenerated
     */
    int countByExample(LHotzoneExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByExample(LHotzoneExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int insert(LHotzone record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(LHotzone record);

    /**
     *
     * @mbggenerated
     */
    List<LHotzone> selectByExample(LHotzoneExample example);

    /**
     *
     * @mbggenerated
     */
    LHotzone selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") LHotzone record, @Param("example") LHotzoneExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") LHotzone record, @Param("example") LHotzoneExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(LHotzone record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(LHotzone record);
}