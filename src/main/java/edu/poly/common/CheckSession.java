package edu.poly.common;

import javax.servlet.http.HttpSession;

public class CheckSession {

    public static boolean admin(HttpSession session) {
        if (session.getAttribute(Constants.SessionKey.USER) != null) {
            if (session.getAttribute(Constants.SessionKey.USER).equals(Constants.Role.ADMIN)
                    || session.getAttribute(Constants.SessionKey.USER).equals(Constants.Role.MANAGER)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static boolean partner(HttpSession session) {
        if (session.getAttribute(Constants.SessionKey.USER) != null) {
            if (session.getAttribute(Constants.SessionKey.USER).equals(Constants.Role.PARTNER)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static boolean user(HttpSession session) {
        if (session.getAttribute(Constants.SessionKey.USER) != null) {
            if (session.getAttribute(Constants.SessionKey.USER).equals(Constants.Role.USER)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

}
