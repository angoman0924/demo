package com.zacx.serivce.line.api.exceptions;

import com.zacx.core.enums.Code;
import com.zacx.core.exceptions.BaseRTException;

public class LineServiceException extends BaseRTException {
    public LineServiceException(String msg){
        super(Code.ERROR_UNKNOWN, msg);
    }

    public LineServiceException(Code code, String userMessage){
        super(code,userMessage);
    }
}
