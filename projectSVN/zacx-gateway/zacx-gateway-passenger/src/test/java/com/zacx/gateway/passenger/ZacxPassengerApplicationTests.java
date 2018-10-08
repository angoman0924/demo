package com.zacx.gateway.passenger;



import com.github.pagehelper.PageInfo;
import com.xiaoleilu.hutool.http.HttpUtil;
import com.xiaoleilu.hutool.util.ReUtil;
import com.zacx.core.enums.SourceEnum;
import com.zacx.serivce.basic.service.CityService;
import com.zacx.serivce.dal.entity.BCity;

import com.zacx.serivce.line.api.LineServiceApi;
import com.zacx.serivce.line.api.dto.LineDTO;

import com.zacx.serivce.user.api.PassengerServiceApi;
import com.zacx.serivce.user.api.UserServiceApi;
import com.zacx.serivce.user.api.dto.LoginInfoDTO;
import com.zacx.serivce.user.api.dto.PassengerDTO;

import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.ArrayList;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ZacxPassengerApplicationTests {

    @Autowired
    private LineServiceApi lineService;
	@Test
	public void contextLoads() {
	}

	@Test
	public void testOperateDB(){
        LineDTO dto=new LineDTO();
//        dto.setDistance(331.00);
//        dto.setName("北22京到上334海");
//        dto.setSiteEndId(4);
//        dto.setSiteStartId(4);
//        dto.setStatus(1);
//	    int i=lineService.insert(dto);
//        Assert.assertEquals(1,i);
        dto.setPageIndex(1);
        dto.setPageSize(2);
        lineService.getLinePageInfo(dto);
    }


    @Autowired
    private UserServiceApi userServiceApi;

    @Autowired
    private PassengerServiceApi passengerServiceApi;

    @Autowired
    private CityService cityService;

    @Test
    public void testCity(){
        BCity bCity = new BCity();
//        bCity.setName("H");
//        bCity.setPinyinCode("H");
        PageInfo<BCity> pageInfo =  cityService.getCityPageinfo2(bCity,0,0);
        for (BCity city: pageInfo.getList()){
            System.out.println(city.getName() + "简拼" + city.getPinyinCode()+"Type:"+city.getType()+"======Leavel" +city.getLevel());
        }
        System.out.println("总数："+pageInfo.getList().size());
    }

    @Test
    public void textUser(){

//		UUserDetail uUserDetail = userServiceApi.selectByUserId(18L);
//		System.out.println("用户详情：" + uUserDetail.toString());

        LoginInfoDTO enter = new LoginInfoDTO();
        enter.setLat(123.2343);
        enter.setLng(3323.123);
        enter.setMobile("13122299888");
        enter.setSource(SourceEnum.ANDROID);
        enter.setVersion("1.0");
        enter.setVerificationCode("9091");
//        UserInfo userInfo = userServiceApi.login(enter);
//        System.out.println(userInfo.toString());



    }

    @Test
    public void testPassenger(){
//        PassengerDTO passengerDTO = new PassengerDTO();
//        passengerDTO.setCardType(1);//护照
//        passengerDTO.setCardNumber("430281198709248756");
//        passengerDTO.setMobile("13348120999");
//        passengerDTO.setName("kevin");
//        passengerDTO.setPersonGroup(1);//成人  CHILD小孩
//        passengerDTO.setStatus(1);
//        passengerDTO.setUserId(22L);
//        passengerServiceApi.insert(passengerDTO);
//        System.out.println(passengerDTO.getId());

       List<PassengerDTO> passengerDTOList = passengerServiceApi.selectByUserId(22);
       for (PassengerDTO p:passengerDTOList){
           System.out.println(p.toString());
       }


    }


    @Test
    public void test1(){
	    LineDTO dto=new LineDTO();
	    List<LineDTO> l=new ArrayList<>();
	    dto.setName("111");
	    l.add(dto);
	    dto.setName("232");
	    l.add(dto);
	    dto.setName("23312");
    }


}
