package com.zacx.core.session;


import com.zacx.core.enums.PlatformEnum;
import com.zacx.core.util.SpringContext;

/**
* @desc    session
* @version 1.0
* @author  Liang Jun
* @date    2018年10月07日 09:36:31
**/
public enum SessionClientFactory {
    PASSENGER_MOBILE(PlatformEnum.PASSENGER, "passengerMobileSessionClient"),
    DRIVER_MOBILE(PlatformEnum.DRIVER, "driverMobileSessionClient");

    private PlatformEnum type;
    private String sessionClient;

    SessionClientFactory(PlatformEnum type, String sessionClient) {
        this.type = type;
        this.sessionClient = sessionClient;
    }

    public PlatformEnum getType() {
        return type;
    }

    public String getSessionClient() {
        return sessionClient;
    }

    public static SessionClient getSessionClient(PlatformEnum clientType) {
        String sessionClientName = PASSENGER_MOBILE.sessionClient;
        if (clientType != null) {
            for (SessionClientFactory sessionClientTypeEnum : SessionClientFactory.values()) {
                if (sessionClientTypeEnum.type.equals(clientType)) {
                    sessionClientName = sessionClientTypeEnum.sessionClient;
                    break;
                }
            }
        }
        return SpringContext.getBean(sessionClientName);
    }
}