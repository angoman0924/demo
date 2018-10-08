/*
*
* UUserDetailMapper.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.mapper;

import com.zacx.serivce.dal.entity.UUserDetail;
import com.zacx.serivce.dal.entity.UUserDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UUserDetailMapper {
    /**
     *
     * @mbggenerated
     */
    int countByExample(UUserDetailExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByExample(UUserDetailExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int insert(UUserDetail record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(UUserDetail record);

    /**
     *
     * @mbggenerated
     */
    List<UUserDetail> selectByExample(UUserDetailExample example);

    /**
     *
     * @mbggenerated
     */
    UUserDetail selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") UUserDetail record, @Param("example") UUserDetailExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") UUserDetail record, @Param("example") UUserDetailExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(UUserDetail record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(UUserDetail record);
}