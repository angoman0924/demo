package com.zacx.serivce.order.service;

import com.zacx.serivce.order.api.dto.*;

public interface OrderLocService {

    Boolean scanBoardingCode(BoardingValiDTO boardingValiDTO);

    String smsBoardingCode(BoardingSmsDTO boardingSmsDTO);

    Boolean valiSmsBoardingCode(BoardingSmsValiDTO boardingSmsValiDTO);

    EvaluateCategoryDTO evaluateCategory();

    Boolean doEvaluate(EvaluateInfoDTO evaluateInfoDTO);

}
