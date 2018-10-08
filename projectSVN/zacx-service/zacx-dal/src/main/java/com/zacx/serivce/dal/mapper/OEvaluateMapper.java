/*
*
* OEvaluateMapper.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.mapper;

import com.zacx.serivce.dal.entity.OEvaluate;
import com.zacx.serivce.dal.entity.OEvaluateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OEvaluateMapper {
    /**
     *
     * @mbggenerated
     */
    int countByExample(OEvaluateExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByExample(OEvaluateExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int insert(OEvaluate record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(OEvaluate record);

    /**
     *
     * @mbggenerated
     */
    List<OEvaluate> selectByExample(OEvaluateExample example);

    /**
     *
     * @mbggenerated
     */
    OEvaluate selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") OEvaluate record, @Param("example") OEvaluateExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") OEvaluate record, @Param("example") OEvaluateExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(OEvaluate record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(OEvaluate record);
}