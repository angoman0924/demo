package com.zacx.core.session;


import com.zacx.core.model.UserSession;

import java.util.List;
import java.util.Set;

/**
* @desc    session
* @version 1.0
* @author  Liang Jun
* @date    2018年10月07日 09:37:46
**/
public interface SessionClient {

    UserSession getSession(String sessionKey);

    List<UserSession> getSessions(String[] sessionKeys);

    void removeSession(String sessionKey);

    void removeCache(String sessionKey);

    UserSession setSession(UserSession userSession);

    UserSession updateSession(UserSession session);

    Set<String> getSessionKeys();

}