package com.zacx.gateway.passenger.controller;

import com.github.pagehelper.PageInfo;
import com.zacx.core.annotation.MethodFlag;
import com.zacx.core.enums.Code;
import com.zacx.core.util.ObjectUtils;
import com.zacx.gateway.base.base.PageResult;
import com.zacx.gateway.base.base.Result;
import com.zacx.gateway.passenger.constants.PassengerApiUrl;
import com.zacx.gateway.passenger.dto.user.*;
import com.zacx.serivce.user.api.UserBankServiceApi;
import com.zacx.serivce.user.api.dto.BankAccountDTO;
import com.zacx.serivce.user.api.dto.UserBankWaterBillsDTO;
import com.zacx.serivce.user.api.dto.UserCashWithdrawApplyDTO;
import com.zacx.serivce.user.api.dto.UserWalletInfoDTO;
import io.swagger.annotations.*;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 用户绑定银行卡
 * Created by Wu Peng on 2018/10/7.
 */
@Api(description = "用户账户相关")
@RestController
@RequestMapping(PassengerApiUrl.BANK)
public class UserBankController {
    @Resource
    private UserBankServiceApi userBankServiceApi;

    @MethodFlag
    @ApiOperation(value = "新增银行卡信息")
    @PostMapping(PassengerApiUrl.BANKACCOUNT)
    public Result<BankAccountResult> insertBankAccount(@RequestBody BankAccountEnter bankAccountEnter) {
        //是否是根据用户输入的账号，查询该账号所属银行，找到该银行再bank表中的id,获取用户的身份证？
        //用户的手机号码绑定:是绑定银行的手机号码，还是平台用户的手机号码
        if(null == bankAccountEnter.getUserId()){
            return Result.error(Code.ERROR_ARGUMENT,"用户编号不能为空");
        }
        if(StringUtils.isBlank(bankAccountEnter.getCode())){
            return Result.error(Code.ERROR_ARGUMENT,"银行卡号不能为空");
        }
        if(bankAccountEnter.getCode().length() < 16){
            return Result.error(Code.ERROR_ARGUMENT,"银行卡号格式不正确");
        }
        if( null == bankAccountEnter.getWithdrawCashMax()){
            bankAccountEnter.setWithdrawCashMax(0);//如果不输入则默认为0
        }
        if(StringUtils.isBlank(bankAccountEnter.getUserName())){
            return Result.error(Code.ERROR_ARGUMENT,"持卡人性名不能为空");
        }

        BankAccountDTO bankAccountDTO = new BankAccountDTO();
        BeanUtils.copyProperties(bankAccountEnter,bankAccountDTO);
        Integer result = userBankServiceApi.insert(bankAccountDTO);
        if(result == 3){
            return Result.error(Code.ERROR_ARGUMENT,"银行卡号不正确");
        }
        BankAccountResult bankAccountResult = new BankAccountResult();
        BeanUtils.copyProperties(bankAccountDTO,bankAccountResult);
        if(result > 0){
            return Result.success(bankAccountResult);
        }else{
            return Result.error(Code.ERROR_DB_OPERATE,"新增个人银行卡失败");
        }
    }

    @MethodFlag//跳过注解
    @ApiOperation(value = "删除个人银行卡信息")
    @PostMapping("deleteBankAccount")
    public Result<String> deleteBankAccount(@RequestBody Integer bankAccountId){
        if( null == bankAccountId){
            return  Result.error(Code.ERROR_ARGUMENT,"ID不能为空");
        }
        Integer result = userBankServiceApi.deleteByPrimaryKey(bankAccountId);
        if(result == 0){
            return Result.error(Code.ERROR_DB_OPERATE,"删除失败");
        }
        if(result == 2){
            return Result.error(Code.ERROR_DATA_NOT_FOUND,"该银行卡已经删除");
        }
        return Result.success("删除成功");
    }

    @MethodFlag
    @ApiOperation(value = "查询个人银行卡列表信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID", paramType = "query", required = true)
    })
    @GetMapping(PassengerApiUrl.ID)
    public Result<List<BankAccountResult>> selectByUserBankAccount( Integer id){
        if( null == id){
            return  Result.error(Code.ERROR_ARGUMENT,"用户编号不能为空");
        }
        BankAccountDTO bankAccountDTO = new BankAccountDTO();
        bankAccountDTO.setId(id);
        List<BankAccountDTO> bankAccountDTOList = userBankServiceApi.selectByExample(bankAccountDTO);
        List<BankAccountResult> bankAccountResults = ObjectUtils.ListEntity2ListDTO(bankAccountDTOList, BankAccountResult.class);
        if(0 == bankAccountResults.size()){
            return  Result.error(Code.ERROR_DATA_NOT_FOUND,"查询无结果");
        }
        return Result.success(bankAccountResults);
    }

    @MethodFlag
    @ApiOperation(value = "申请提现")
    @PostMapping("applyCashWithdraw")
    public Result<Boolean> applyCashWithdraw(ApplyCashWithdrawEnter enter) {
        UserCashWithdrawApplyDTO dto = new UserCashWithdrawApplyDTO();
        dto.setUserId(enter.getUserId());
        dto.setUserType(0);
        dto.setToBankAccountId(enter.getToAccountId());
        dto.setMoney(enter.getMoney());
        if (userBankServiceApi.addCashWithdraw(dto) == 0) {
            return Result.error(Code.ERROR_DB_OPERATE, "新增提现申请失败");
        }
        return Result.success(true);
    }

    @MethodFlag
    @ApiOperation("查询提现申请记录")
    @PostMapping("getCashWithdrawList")
    public Result<List<GetCashWithdrawListResult>> getCashWithdrawList(GetCashWithdrawListEnter enter) {
        UserCashWithdrawApplyDTO dto = new UserCashWithdrawApplyDTO();
        BeanUtils.copyProperties(enter, dto);
        List<UserCashWithdrawApplyDTO> dtoList = userBankServiceApi.getCashWithdrawList(dto);
        List<GetCashWithdrawListResult> results = ObjectUtils.ListEntity2ListDTO(dtoList, GetCashWithdrawListResult.class);
        return Result.success(results);
    }

    @MethodFlag
    @ApiOperation("获取充值记录")
    @PostMapping("getChargeRecordList")
    public Result<PageResult<ChargeRecordResult>> getChargeRecordList(ChargeRecordEnter enter) {
        UserBankWaterBillsDTO dto = new UserBankWaterBillsDTO();
        dto.setUserId(enter.getUserId());
        dto.setPageIndex(enter.getStartIndex());
        dto.setPageSize(enter.getPageSize());

        PageInfo<UserBankWaterBillsDTO> dtoPageInfo = userBankServiceApi.getChargeRecordPageInfo(dto);
        List<ChargeRecordResult> resultList = ObjectUtils.listEntityConvert2ListDTO(dtoPageInfo.getList(), ChargeRecordResult.class);

        PageResult pageResult = new PageResult((int)dtoPageInfo.getTotal(), dtoPageInfo.getPageNum(), dtoPageInfo.getPageSize(), resultList);
        return Result.success(pageResult);
    }

    @MethodFlag
    @ApiOperation(value = "查看钱包信息")
    @PostMapping("getWalletInfo")
    public Result<WalletInfoResult> getWalletInfo(@ApiParam(value = "用户ID", required = true) @RequestBody Map<String, Integer> userId) {
        UserWalletInfoDTO dto = new UserWalletInfoDTO();
        dto.setUserType(1); //1:用户;2:司机
        dto.setUserId(userId.get("userId"));
        dto = userBankServiceApi.getUserWalletInfo(dto);
        return Result.success(ObjectUtils.copyBean(dto, WalletInfoResult.class));
    }

}
