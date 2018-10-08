package com.zacx.serivce.user.api.impl;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.zacx.core.enums.Code;
import com.zacx.core.util.ObjectUtils;
import com.zacx.serivce.cache.key.enums.SerialCodeRuleEnum;
import com.zacx.serivce.dal.entity.UUserBankWaterBills;
import com.zacx.serivce.dal.entity.UUserCashWithdrawApply;
import com.zacx.serivce.dal.entity.UUserDetail;
import com.zacx.serivce.dal.entity.UUserDriver;
import com.zacx.serivce.dal.entity.ext.UUserCashWithdrawApplyExt;
import com.zacx.serivce.service.SerialService;
import com.zacx.serivce.user.api.UserBankServiceApi;
import com.zacx.serivce.user.api.dto.BankAccountDTO;
import com.zacx.serivce.user.api.dto.UserBankWaterBillsDTO;
import com.zacx.serivce.user.api.dto.UserCashWithdrawApplyDTO;
import com.zacx.serivce.user.api.dto.UserWalletInfoDTO;
import com.zacx.serivce.user.api.exceptions.UserAssert;
import com.zacx.serivce.user.service.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * 用户银行卡api接口实现
 * Created by liusi on 2018/10/7.
 */
@Slf4j
@Service
public class UserBankServiceApiImpl implements UserBankServiceApi {
    @Resource
    private SerialService serialService;
    @Resource
    private UserDetailService userDetailService;
    @Resource
    private UserDriverService userDriverService;
    @Resource
    private UserCashWithdrawApplyService userCashWithdrawApplyService;
    @Resource
    private UserBankWaterBillsService userBankWaterBillsService;
    @Resource
    private BankAccountService bankAccountService;

    /**
     * 新增个人银行卡
     * @param bankAccountDTO
     * @return
     */
    @Override
    public int insert(BankAccountDTO bankAccountDTO) {
        log.info("新增个人银行卡请求参数", JSON.toJSONString(bankAccountDTO));
        Integer result = bankAccountService.insert(bankAccountDTO);
        log.info("新增个人银行卡结果",result);
        return result;
    }

    /**
     * 查询个人银行卡列表
     * @param bankAccountDTO
     * @return
     */
    @Override
    public List<BankAccountDTO> selectByExample(BankAccountDTO bankAccountDTO) {
        log.info("查询个人银行卡请求参数", JSON.toJSONString(bankAccountDTO));
        List<BankAccountDTO> bankAccountDTOList = bankAccountService.selectByExample(bankAccountDTO);
        log.info("查询个人银行卡结果",JSON.toJSONString(bankAccountDTOList));
        return bankAccountDTOList;
    }

    //删除个人银行卡
    @Override
    public int deleteByPrimaryKey(Integer id) {
        log.info("删除个人银行卡请求参数", id);
        Integer result = bankAccountService.deleteByPrimaryKey(id);
        log.info("删除个人银行卡结果",result);
        return result;
    }

    @Override
    public int addCashWithdraw(UserCashWithdrawApplyDTO dto) {
        UserAssert.notNull(dto.getUserId(), Code.ERROR_ARGUMENT, "用户ID不能为空");
        UserAssert.notNull(dto.getUserType(), Code.ERROR_ARGUMENT, "用户类型不能为空");
        UserAssert.notNull(dto.getToBankAccountId(), Code.ERROR_ARGUMENT, "转入账号ID不能为空");
        UserAssert.notNull(dto.getMoney(), Code.ERROR_ARGUMENT, "提现金额不能为空");

        UUserCashWithdrawApply entity = new UUserCashWithdrawApply();
        BeanUtils.copyProperties(dto, entity);
        entity.setStatus(0); //申请状态
        entity.setApplyTime(new Date()); //申请时间
        entity.setCode(serialService.generateCode(SerialCodeRuleEnum.USER_WITHDRAW));
        return userCashWithdrawApplyService.addUserCashWithdrawApply(entity);
    }

    @Override
    public List<UserCashWithdrawApplyDTO> getCashWithdrawList(UserCashWithdrawApplyDTO dto) {
        List<UserCashWithdrawApplyDTO> dtoList = new ArrayList<>();
        List<UUserCashWithdrawApplyExt> entityList = userCashWithdrawApplyService.getUserCashWithdrawApplyExtList(dto);
        entityList.forEach(item -> {
            int codeLength = item.getToBankAccountCode().length();
            item.setToBankAccountDesc(item.getToBankAccountName() + "(" + item.getToBankAccountCode().substring(codeLength - 4) + ")");
            UserCashWithdrawApplyDTO temp = new UserCashWithdrawApplyDTO();
            BeanUtils.copyProperties(item, temp);
            dtoList.add(temp);
        });
        return dtoList;
    }

    @Override
    public PageInfo<UserBankWaterBillsDTO> getChargeRecordPageInfo(UserBankWaterBillsDTO dto) {
        dto.setBusinessType(10); //业务类型：10充值 11平台充值 12退款 20提现 21消费
        PageInfo<UUserBankWaterBills> pageInfo = userBankWaterBillsService.getUserBankWaterBillsPageInfo(dto);
        return ObjectUtils.pageEntityConvert2PageDTO(pageInfo, UserBankWaterBillsDTO.class);
    }

    @Override
    public UserWalletInfoDTO getUserWalletInfo(UserWalletInfoDTO dto) {
        UserAssert.notNull(dto.getUserId(), Code.ERROR_ARGUMENT, "用户ID不能为空");
        UserAssert.notNull(dto.getUserType(), Code.ERROR_ARGUMENT, "用户类型不能为空");
        UserWalletInfoDTO ret = new UserWalletInfoDTO();
        //查询用户信息详情
        if (dto.getUserType() == 1) { //用户
            UUserDetail uUserDetail = userDetailService.getUserDetailByUserId(dto.getUserId());
            UserAssert.notNull(uUserDetail, Code.ERROR_ARGUMENT, "指定用户不存在");
            ret.setBalance(uUserDetail.getWallet());
        }
        if (dto.getUserType() == 2) { //司机
            UUserDriver uUserDriver = userDriverService.getUserDriverByUserId(dto.getUserId());
            UserAssert.notNull(uUserDriver, Code.ERROR_ARGUMENT, "指定司机不存在");
            ret.setBalance(uUserDriver.getWallet());
            //查询用户账户流水
            UserBankWaterBillsDTO billsDTO = new UserBankWaterBillsDTO();
            billsDTO.setUserId(dto.getUserId());
            billsDTO.setUserType(2);
            billsDTO.setExitEntryType(1);
            List<UUserBankWaterBills> list = userBankWaterBillsService.getUserBankWaterBillsList(billsDTO);

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(new Date());
            calendar.set(Calendar.DAY_OF_MONTH, 1);
            calendar.set(Calendar.HOUR_OF_DAY,0);
            calendar.set(Calendar.MINUTE,0);
            calendar.set(Calendar.SECOND,0);
            BigDecimal lastIncome = BigDecimal.ZERO; //本月收入
            BigDecimal totalIncome = BigDecimal.ZERO; //累计收入
            long ms = calendar.getTimeInMillis();
            for (UUserBankWaterBills item : list) {
                if (item.getCreateAt().getTime() >= ms) {
                    lastIncome = lastIncome.add(item.getMoney());
                } else {
                    totalIncome = totalIncome.add(item.getMoney());
                }
            }
            ret.setLastIncome(lastIncome);
            ret.setTotalIncome(totalIncome);
        }
        return ret;
    }
}
