/*
*
* UUserMapper.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.mapper;

import com.zacx.serivce.dal.entity.UUser;
import com.zacx.serivce.dal.entity.UUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UUserMapper {
    /**
     *
     * @mbggenerated
     */
    int countByExample(UUserExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByExample(UUserExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int insert(UUser record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(UUser record);

    /**
     *
     * @mbggenerated
     */
    List<UUser> selectByExample(UUserExample example);

    /**
     *
     * @mbggenerated
     */
    UUser selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") UUser record, @Param("example") UUserExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") UUser record, @Param("example") UUserExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(UUser record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(UUser record);
}