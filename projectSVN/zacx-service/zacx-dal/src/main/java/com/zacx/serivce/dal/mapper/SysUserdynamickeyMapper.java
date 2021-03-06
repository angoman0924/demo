/*
*
* SysUserdynamickeyMapper.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.mapper;

import com.zacx.serivce.dal.entity.SysUserdynamickey;
import com.zacx.serivce.dal.entity.SysUserdynamickeyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUserdynamickeyMapper {
    /**
     *
     * @mbggenerated
     */
    int countByExample(SysUserdynamickeyExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByExample(SysUserdynamickeyExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String relationid);

    /**
     *
     * @mbggenerated
     */
    int insert(SysUserdynamickey record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(SysUserdynamickey record);

    /**
     *
     * @mbggenerated
     */
    List<SysUserdynamickey> selectByExample(SysUserdynamickeyExample example);

    /**
     *
     * @mbggenerated
     */
    SysUserdynamickey selectByPrimaryKey(String relationid);

    /**
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") SysUserdynamickey record, @Param("example") SysUserdynamickeyExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") SysUserdynamickey record, @Param("example") SysUserdynamickeyExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SysUserdynamickey record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SysUserdynamickey record);
}