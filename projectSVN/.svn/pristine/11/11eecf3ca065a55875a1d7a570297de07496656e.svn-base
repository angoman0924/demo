package com.zacx.serivce.user.service.impl;


import com.github.pagehelper.PageHelper;
import com.zacx.serivce.dal.entity.UUserCashWithdrawApply;
import com.zacx.serivce.dal.entity.UUserCashWithdrawApplyExample;
import com.zacx.serivce.dal.entity.ext.UUserCashWithdrawApplyExt;
import com.zacx.serivce.dal.mapper.UUserCashWithdrawApplyMapperExt;
import com.zacx.serivce.user.api.dto.UserCashWithdrawApplyDTO;
import com.zacx.serivce.user.service.UserCashWithdrawApplyService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

/**
* @desc    用户提现申请
* @version 1.0
* @author  Liang Jun
* @date    2018年10月06日 13:22:41
**/
@Service
public class UserCashWithdrawApplyServiceImpl implements UserCashWithdrawApplyService {
    @Resource
    private UUserCashWithdrawApplyMapperExt UUserCashWithdrawApplyMapperExt;

    @Override
    public int addUserCashWithdrawApply(UUserCashWithdrawApply entity) {
        return UUserCashWithdrawApplyMapperExt.insertSelective(entity);
    }

    @Override
    public List<UUserCashWithdrawApply> getUserCashWithdrawApplyList(UserCashWithdrawApplyDTO dto) {
        PageHelper.startPage(dto.getPageIndex(),dto. getPageSize());
        List<UUserCashWithdrawApply> uUsers = UUserCashWithdrawApplyMapperExt.selectByExample(this.params2example(dto));
        return uUsers;
    }

    @Override
    public List<UUserCashWithdrawApplyExt> getUserCashWithdrawApplyExtList(UserCashWithdrawApplyDTO dto) {
        UUserCashWithdrawApplyExt ext = new UUserCashWithdrawApplyExt();
        BeanUtils.copyProperties(dto, ext);
        return UUserCashWithdrawApplyMapperExt.selectExtList(ext);
    }

    private UUserCashWithdrawApplyExample params2example(UserCashWithdrawApplyDTO dto){
        UUserCashWithdrawApplyExample example = new UUserCashWithdrawApplyExample();
        UUserCashWithdrawApplyExample.Criteria criteria = example.createCriteria();

        if (null != dto.getId()) {
            criteria.andIdEqualTo(dto.getId());
        }
        if (null != dto.getUserId()) {
            criteria.andUserIdEqualTo(dto.getUserId());
        }
        if (null != dto.getUserType()) {
            criteria.andUserTypeEqualTo(dto.getUserType());
        }
        if (StringUtils.hasText(dto.getSortCase())) {
            example.setOrderByClause(dto.getSortCase());
        }
        return example;
    }
}