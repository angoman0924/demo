package com.zacx.serivce.dal.mapper;

import com.zacx.serivce.dal.entity.ext.UUserCashWithdrawApplyExt;

import java.util.List;

public interface UUserCashWithdrawApplyMapperExt extends UUserCashWithdrawApplyMapper {
    List<UUserCashWithdrawApplyExt> selectExtList(UUserCashWithdrawApplyExt ext);
}