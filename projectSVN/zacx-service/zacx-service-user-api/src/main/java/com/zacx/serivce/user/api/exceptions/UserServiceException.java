package com.zacx.serivce.user.api.exceptions;

import com.zacx.core.enums.Code;
import com.zacx.core.exceptions.BaseRTException;

public class UserServiceException extends BaseRTException {
    public UserServiceException(String msg){
        super(Code.ERROR_UNKNOWN, msg);
    }

    public UserServiceException(Code code, String userMessage){
        super(code,userMessage);
    }
}
