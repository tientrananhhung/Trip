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

        //Trang danh sách người dùng
        public static final String LIST_USER = "/quan-ly-nguoi-dung";

        //Trang thêm người dùng
        public static final String ADD_USER = "/quan-ly-nguoi-dung/them";

        //Trang sửa người dùng
        public static final String UPDATE_USER = "/quan-ly-nguoi-dung/{id}";

        //Trang danh sách các quận Đà Nẵng
        public static final String LIST_DISTRICT = "/quan-ly-quan";

        //Trang thêm quận
        public static final String ADD_DISTRICT = "/quan-ly-quan/them";

        //Trang sửa quận
        public static final String UPDATE_DISTRICT = "/quan-ly-quan/{id}";

        //Trang danh sách các loại quán
        public static final String LIST_KIND_OF_FOOD = "/quan-ly-loai-quan";

        //Trang thêm loại quán
        public static final String ADD_KIND_OF_FOOD = "/quan-ly-loai-quan/them";

        //Trang sửa loại quán
        public static final String UPDATE_KIND_OF_FOOD = "/quan-ly-loai-quan/{id}";

        //Trang Error 404
        public static final String ERROR404 = "/error";
    }

    public class Characters {

        //Ký tự rỗng
        public static final String BLANK = "";

    }

    public class Status {

        //Đã xóa
        public static final int DELETE = 1;

        //tồn tại
        public static final int EXIST = 0;

    }

    public class UserType {

        //người dùng thông thường
        public static final int USER = 0;

        //người dùng đã trở thành đối tác
        public static final int BUSINESS_USER = 1;
    }

    public class UserStatus {

        //người dùng còn tồn tại
        public static final int EXISTS = Status.EXIST;

        //người dùng đã bị xóa
        public static final int DELETED = Status.DELETE;

    }

    public class UserActiveStatus {

        //người dùng chưa kích hoạt
        public static final int NOT_ACTIVE = 0;

        //người dùng đã kích hoạt
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

        // Nam
        public static final int MALE = 1;

        // Nữ
        public static final int FEMALE = 0;

    }

    public class SessionKey {

        //key để get/set user cho session
        public static final String USER = "user";
    }

}
