package com.zacx.serivce.basic.api.impl;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zacx.core.util.StringUtils;
import com.zacx.serivce.basic.api.CharteredCarModelServiceApi;
import com.zacx.serivce.basic.api.dto.CharteredCarModelDTO;
import com.zacx.serivce.basic.api.dto.CharteredCarModelQueryDTO;
import com.zacx.serivce.dal.entity.BCharteredCarModel;
import com.zacx.serivce.dal.entity.BCharteredCarModelExample;
import com.zacx.serivce.dal.entity.OOrderExample;
import com.zacx.serivce.dal.mapper.BCharteredCarModelMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @description: 包车类型
 * @author: kiting
 * @date: 2018年10月07日 10:07
 * @version: 1.0
 * @copyright: 上海拜米网络科技有限公司
 **/
@Slf4j
@Service
public class CharteredCarModelServiceApiImpl implements CharteredCarModelServiceApi {
    @Autowired
    BCharteredCarModelMapper bCharteredCarModelMapper;

    @Override
    public CharteredCarModelDTO findByKey(Integer id) {
        BCharteredCarModel entity = bCharteredCarModelMapper.selectByPrimaryKey(id);
        return JSON.parseObject(JSON.toJSONString(entity), CharteredCarModelDTO.class);
    }

    @Override
    public PageInfo<CharteredCarModelDTO> queryCarModel(CharteredCarModelQueryDTO queryDTO) {
        BCharteredCarModelExample qExample = new BCharteredCarModelExample();
        BCharteredCarModelExample.Criteria qCriteria = qExample.createCriteria();

        if (queryDTO.getCarTypeId() != null && queryDTO.getCarTypeId() > 0) {
            qCriteria.andCarTypeIdEqualTo(queryDTO.getCarTypeId());
        }
        if (!StringUtils.isBlank(queryDTO.getName())) {
            qCriteria.andNameLike(queryDTO.getName() + "%");
        }
        if (!StringUtils.isBlank(queryDTO.getCarBrand())) {
            qCriteria.andCarBrandLike(queryDTO.getCarBrand() + "%");
        }
        if (!StringUtils.isBlank(queryDTO.getCarModel())) {
            qCriteria.andCarModelLike(queryDTO.getCarModel() + "%");
        }
        if (queryDTO.getSeatNumberStart() != null && queryDTO.getSeatNumberStart() > 0) {
            qCriteria.andSeatNumberGreaterThanOrEqualTo(queryDTO.getSeatNumberStart());
        }
        if (queryDTO.getSeatNumberEnd() != null && queryDTO.getSeatNumberEnd() > 0) {
            qCriteria.andSeatNumberLessThanOrEqualTo(queryDTO.getSeatNumberEnd());
        }

        PageHelper.startPage(queryDTO.getPageIndex(), queryDTO.getPageSize());
        List<BCharteredCarModel> qList = bCharteredCarModelMapper.selectByExample(qExample);
        //类型转化
        List<CharteredCarModelDTO> resultList = JSON.parseArray(JSON.toJSONString(qList), CharteredCarModelDTO.class);
        PageInfo<CharteredCarModelDTO> resultPageList = new PageInfo<>(resultList);

        return resultPageList;
    }

}
