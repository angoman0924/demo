/*
*
* CActivitydEtailMapper.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.mapper;

import com.zacx.serivce.dal.entity.CActivitydEtail;
import com.zacx.serivce.dal.entity.CActivitydEtailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CActivitydEtailMapper {
    /**
     *
     * @mbggenerated
     */
    int countByExample(CActivitydEtailExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByExample(CActivitydEtailExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int insert(CActivitydEtail record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(CActivitydEtail record);

    /**
     *
     * @mbggenerated
     */
    List<CActivitydEtail> selectByExampleWithBLOBs(CActivitydEtailExample example);

    /**
     *
     * @mbggenerated
     */
    List<CActivitydEtail> selectByExample(CActivitydEtailExample example);

    /**
     *
     * @mbggenerated
     */
    CActivitydEtail selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") CActivitydEtail record, @Param("example") CActivitydEtailExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExampleWithBLOBs(@Param("record") CActivitydEtail record, @Param("example") CActivitydEtailExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") CActivitydEtail record, @Param("example") CActivitydEtailExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(CActivitydEtail record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(CActivitydEtail record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(CActivitydEtail record);
}