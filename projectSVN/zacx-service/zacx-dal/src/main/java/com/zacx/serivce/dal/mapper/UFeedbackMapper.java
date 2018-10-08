/*
*
* UFeedbackMapper.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.mapper;

import com.zacx.serivce.dal.entity.UFeedback;
import com.zacx.serivce.dal.entity.UFeedbackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UFeedbackMapper {
    /**
     *
     * @mbggenerated
     */
    int countByExample(UFeedbackExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByExample(UFeedbackExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int insert(UFeedback record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(UFeedback record);

    /**
     *
     * @mbggenerated
     */
    List<UFeedback> selectByExample(UFeedbackExample example);

    /**
     *
     * @mbggenerated
     */
    UFeedback selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") UFeedback record, @Param("example") UFeedbackExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") UFeedback record, @Param("example") UFeedbackExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(UFeedback record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(UFeedback record);
}