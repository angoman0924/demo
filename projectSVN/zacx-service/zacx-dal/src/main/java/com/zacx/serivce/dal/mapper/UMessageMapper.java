/*
*
* UMessageMapper.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.mapper;

import com.zacx.serivce.dal.entity.UMessage;
import com.zacx.serivce.dal.entity.UMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UMessageMapper {
    /**
     *
     * @mbggenerated
     */
    int countByExample(UMessageExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByExample(UMessageExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int insert(UMessage record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(UMessage record);

    /**
     *
     * @mbggenerated
     */
    List<UMessage> selectByExample(UMessageExample example);

    /**
     *
     * @mbggenerated
     */
    UMessage selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") UMessage record, @Param("example") UMessageExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") UMessage record, @Param("example") UMessageExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(UMessage record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(UMessage record);
}