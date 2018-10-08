package com.zacx.serivce.user.api.exceptions;

import com.zacx.core.enums.Code;
import com.zacx.core.exceptions.BaseRTException;

/**
 * @author : lwg
 * @version : 1.0
 * @desc :
 * @date : 2018/10/7
 */
public class UserMessageException extends BaseRTException {
    public UserMessageException(String msg){
        super(Code.ERROR_UNKNOWN, msg);
    }

    public UserMessageException(Code code, String userMessage){
        super(code,userMessage);
    }
}
