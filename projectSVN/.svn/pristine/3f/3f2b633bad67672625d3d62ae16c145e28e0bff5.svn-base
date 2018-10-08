package com.zacx.gateway.passenger.controller;

import com.github.pagehelper.PageInfo;
import com.zacx.core.annotation.MethodFlag;
import com.zacx.core.enums.GoodsStatusEnum;
import com.zacx.gateway.base.base.PageResult;
import com.zacx.gateway.base.base.Result;
import com.zacx.gateway.base.util.WebUtils;
import com.zacx.gateway.passenger.constants.PassengerApiUrl;
import com.zacx.gateway.passenger.dto.mall.GoodsResult;
import com.zacx.gateway.passenger.dto.mall.QueryGoodsCondition;
import com.zacx.serivce.mall.api.GoodsSerivceApi;
import com.zacx.serivce.mall.api.dto.GoodsDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 商品模块
 * Created by song on 2018/10/6.
 */
@Api(description = "商品模块")
@RestController
@RequestMapping(PassengerApiUrl.V1)
public class MallController {
    @Autowired
    private GoodsSerivceApi goodsSerivceApi;

    @MethodFlag
    @ApiOperation(value = "获取商品列表")
    @PostMapping(value = PassengerApiUrl.MALL_GET_GOOGS_PAGE_INFO)
    public Result<PageResult<GoodsResult>> getGoodsPageInfo(@RequestBody QueryGoodsCondition condition){

        GoodsDTO dto=new GoodsDTO();
        dto.setPageIndex(condition.getPageIndex());
        dto.setPageSize(condition.getPageSize());
        dto.setStatus(GoodsStatusEnum.UP.getValue());
        PageInfo<GoodsDTO> goodsPageInfo = goodsSerivceApi.getGoodsPageInfo(dto);

        return WebUtils.pageDTOConvert2PageResult(goodsPageInfo,GoodsResult.class);
    }
}
