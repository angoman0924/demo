/*
*
* MGoodsMapper.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.mapper;

import com.zacx.serivce.dal.entity.MGoods;
import com.zacx.serivce.dal.entity.MGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MGoodsMapper {
    /**
     *
     * @mbggenerated
     */
    int countByExample(MGoodsExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByExample(MGoodsExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int insert(MGoods record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(MGoods record);

    /**
     *
     * @mbggenerated
     */
    List<MGoods> selectByExample(MGoodsExample example);

    /**
     *
     * @mbggenerated
     */
    MGoods selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") MGoods record, @Param("example") MGoodsExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") MGoods record, @Param("example") MGoodsExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MGoods record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MGoods record);
}