package com.zacx.serivce.basic.api;

import com.zacx.serivce.basic.api.dto.*;

/**
 * @ClassName: MapService
 * @Description: 地图服务
 * @author wcj
 * @date 2017-02-28
 */
public interface MapServiceApi {

	/**
	 * @Title: getAreaCode @Description : 经纬度查询行政区域及详细地址 @param location @return
	 * gdcode,address @throws
	 */
	MapLocationResult getAreaCode(MapLocationEnter location);

	/**
	 * @Description: 根据经纬度解析省市区及其code
	 * @author: lvyihang
	 * @date: 2017/6/27 11:28
	 */
	MapCodeResult getCode(MapLocationEnter location);

	/**
	 * 获取城市电子围栏
	 * @param lng 经度
	 * @param lat 纬度
	 * @return
	 */
//	List<CoordinateInfo> getCityAreaByCoordinate(String lng, String lat);

	/**
	 * 根据经纬度获取城市
	 * @param lng
	 * @param lat
	 * @return
	 */
	CityDTO getCityByCoordinate(String lng, String lat);

	/**
	 * 查询坐标信息
	 * @return
	 */
	CoordinateDTO getCoordinateInfo(CoordinateDTO dto);
}
