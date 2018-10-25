package edu.poly.common;

public class Constants {

    public class Url {
        //Đăng nhập
        public static final String LOGIN = "/dang-nhap";

        //Đăng xuất
        public static final String LOGOUT = "/dang-xuat";

        // Quên mật khẩu
        public static final String FORGOT_PASS = "/quen-mat-khau";

        // Đổi mật khẩu
        public static final String CHANGE_PASS = "/doi-mat-khau";

        //Trang admin
        public static final String ADMIN_PAGE_URL = "/admin";

        //Management Offer
        public static final String OFFER_URL = "/uu-dai";

        //Offer detail by id
        public static final String OFFER_DETAIL_URL = "/{offerId}";

        //Thông tin cá nhân của người dùng
        public static final String PROFILE_URL = "/thong-tin-ca-nhan";

        //Trang đăng ký
        public static final String REGISTER = "/dang-ky";
    }

    public class Characters {
        // blank character
        public static final String BLANK = "";

        // Wave
        public static final String WAVE = "~";
    }

    public class Status {
        public static final int DELETE = 1;
        public static final int EXIST = 0;
    }

    public class UserType {
        // user
        public static final int USER = 0;

        // business user
        public static final int BUSINESS_USER = 1;
    }

    public class UserStatus {

        // user exists in system
        public static final int EXISTS = Status.EXIST;

        // user was deleted in system
        public static final int DELETED = Status.DELETE;
    }

    public class UserActiveStatus {

        // user not active
        public static final int NOT_ACTIVE = 0;

        // user have actived
        public static final int ACTIVATED = 1;
    }

    public class Role {
        // Admin
        public static final int ADMIN = 0;

        // Managers
        public static final int MANAGER = 1;

        // Partners
        public static final int PARTNER = 2;

        // Users
        public static final int USER = 3;
    }

    public class Gender {
        // Name
        public static final int MALE = 1;

        // Nữ
        public static final int FEMALE = 0;
    }

    public class SessionKey {
        // Key to set/get data userId to session
        public static final String USER = "user";
    }

}
