package edu.poly.common;

import edu.poly.entity.Users;

import javax.servlet.http.HttpSession;

public class CheckSession {

    public static boolean admin(HttpSession session) {
        if (session.getAttribute(Constants.SessionKey.USER) != null) {
            Users users = (Users) session.getAttribute(Constants.SessionKey.USER);
            if (users.getRole() == Constants.Role.ADMIN || users.getRole() == Constants.Role.MANAGER) {
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
            Users users = (Users) session.getAttribute(Constants.SessionKey.USER);
            if (users.getRole() == Constants.Role.PARTNER) {
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
            Users users = (Users) session.getAttribute(Constants.SessionKey.USER);
            if (users.getRole() == Constants.Role.USER) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

}
