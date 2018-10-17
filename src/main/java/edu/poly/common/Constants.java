package edu.poly.common;

public class Constants {

    public class Url {

        //Login
        public static final String LOGIN = "/login";

        //Logout
        public static final String LOGOUT = "/logout";

        // Forgot password
        public static final String FORGOT_PASS = "/forgot-pass";

        //Change password
        public static final String CHANGE_PASS = "/change-pass";

        //Management Offer
        public static final String OFFER_URL = "/offer";

        //Offer detail by id
        public static final String OFFER_DETAIL_URL = "/{offerId}";

        //Thông tin cá nhân của người dùng
        public static final String PROFILE_URL = "/profile";
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

        // Key to set/get data userId to session first login
        public static final String USER_FIRST_LOGIN = "user-first-login";

        // Key to set/get data userId to session
        public static final String USER_ID = "user-id";

        // Key to set/get data email to session
        public static final String USER_EMAIL = "user-email";

        // Key to set/get data districtId selected to session
        public static final String DISTRICT_ID_SELECTED = "district-id-selected";

        // Key to set/get data genreId selected to session
        public static final String GENRE_ID_SELECTED = "genre-id-selected";

        // Key to set/get data serviceId selected to session
        public static final String SERVICE_ID_SELECTED = "service-id-selected";

        // Key to set/get data upload-type to session
        public static final String UPLOAD_TYPE = "upload-type";

        // Key to set/get token to session
        public static final String ORDER_TOKEN = "order-token";

        // Key to set/get update user token to session
        public static final String USER_UPDATE_TOKEN = "update-user-token";

        // Key to set/get token to session
        public static final String REGIST_OFFER_TOKEN = "regist-offer-token";

        // Key to set/get send offer display mode
        public static final String SEND_OFFER_DISPLAY_MODE = "send-offer-display-mode";

        // Key to set/get send offer data
        public static final String SEND_OFFER_DATA = "send-offer-data";

        // Key to set/get data role to session
        public static final String IS_SHIPPER = "is-shipper";

        // Key to set/get data plusbenlly token to session
        public static final String PLUSBENLLY_TOKEN = "plusbennly-token";
    }

}
