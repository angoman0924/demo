/*
*
* UPlatformAccountMapper.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.mapper;

import com.zacx.serivce.dal.entity.UPlatformAccount;
import com.zacx.serivce.dal.entity.UPlatformAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UPlatformAccountMapper {
    /**
     *
     * @mbggenerated
     */
    int countByExample(UPlatformAccountExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByExample(UPlatformAccountExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int insert(UPlatformAccount record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(UPlatformAccount record);

    /**
     *
     * @mbggenerated
     */
    List<UPlatformAccount> selectByExample(UPlatformAccountExample example);

    /**
     *
     * @mbggenerated
     */
    UPlatformAccount selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") UPlatformAccount record, @Param("example") UPlatformAccountExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") UPlatformAccount record, @Param("example") UPlatformAccountExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(UPlatformAccount record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(UPlatformAccount record);
}