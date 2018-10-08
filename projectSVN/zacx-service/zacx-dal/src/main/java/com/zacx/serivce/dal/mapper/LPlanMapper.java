/*
*
* LPlanMapper.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.mapper;

import com.zacx.serivce.dal.entity.LPlan;
import com.zacx.serivce.dal.entity.LPlanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LPlanMapper {
    /**
     *
     * @mbggenerated
     */
    int countByExample(LPlanExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByExample(LPlanExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int insert(LPlan record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(LPlan record);

    /**
     *
     * @mbggenerated
     */
    List<LPlan> selectByExample(LPlanExample example);

    /**
     *
     * @mbggenerated
     */
    LPlan selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") LPlan record, @Param("example") LPlanExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") LPlan record, @Param("example") LPlanExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(LPlan record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(LPlan record);
}