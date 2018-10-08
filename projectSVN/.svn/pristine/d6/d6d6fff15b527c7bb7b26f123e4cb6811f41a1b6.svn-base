package com.zacx.serivce.user.service.impl;

import com.zacx.serivce.dal.entity.UEmergencyContact;
import com.zacx.serivce.dal.entity.UEmergencyContactExample;
import com.zacx.serivce.dal.mapper.UEmergencyContactMapper;
import com.zacx.serivce.user.service.EmergencyContactService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class EmergencyContactImpl implements EmergencyContactService {

    @Resource
    private UEmergencyContactMapper uEmergencyContactMapper;

    @Override
    public int insertEmergencyContact(List<UEmergencyContact> uEmergencyContacts) {
        for(UEmergencyContact uEmergencyContact:uEmergencyContacts) {
            uEmergencyContactMapper.insertSelective(uEmergencyContact);
        }
        return 1;
    }

    @Override
    public int deleteEmergencyContactByUserId(Integer userId,Integer userType) {
        UEmergencyContactExample uEmergencyContactExample = new UEmergencyContactExample();
        UEmergencyContactExample.Criteria criteria =uEmergencyContactExample.createCriteria();
        criteria.andUserIdEqualTo(userId);
        criteria.andUserTypeEqualTo(userType);
        return uEmergencyContactMapper.deleteByExample(uEmergencyContactExample);
    }

    @Override
    public List<UEmergencyContact> selectEmergencyContactByUserId(Integer userId,Integer userType) {
        UEmergencyContactExample uEmergencyContactExample = new UEmergencyContactExample();
        UEmergencyContactExample.Criteria criteria =uEmergencyContactExample.createCriteria();
        criteria.andUserIdEqualTo(userId);
        criteria.andUserTypeEqualTo(userType);
        List<UEmergencyContact> uEmergencyContactList=uEmergencyContactMapper.selectByExample(uEmergencyContactExample);
        return uEmergencyContactList;
    }
}
