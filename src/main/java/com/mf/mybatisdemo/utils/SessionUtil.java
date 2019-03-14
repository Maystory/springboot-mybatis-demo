package com.mf.mybatisdemo.utils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Objects;

/**
 * Created by Maven on 2018/9/29.
 * Description:
 */
public class SessionUtil {

    public static void saveOrUpdateSession(HttpServletRequest request, String sessionKey, Object sessionValue) {
        HttpSession session = request.getSession();
        if (Objects.isNull(session.getAttribute(sessionKey))) {
            session.setAttribute(sessionKey, sessionValue);
        }
        session.removeAttribute(sessionKey);
        session.setAttribute(sessionKey, sessionValue);
    }

    public static Object getSession(HttpServletRequest request, String sessionKey) {
        HttpSession session = request.getSession();
        return session.getAttribute(sessionKey);
    }
}