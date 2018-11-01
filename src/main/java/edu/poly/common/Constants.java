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

        //Trang xóa người dùng
        public static final String DELETE_USER = "/quan-ly-nguoi-dung/xoa/{id}";

        //Trang active người dùng
        public static final String ACTIVE_USER = "/quan-ly-nguoi-dung/active/{id}/{active}";

        //Trang danh sách các quận Đà Nẵng
        public static final String LIST_DISTRICT = "/quan-ly-quan";

        //Trang thêm quận
        public static final String ADD_DISTRICT = "/quan-ly-quan/them";

        //Trang sửa quận
        public static final String UPDATE_DISTRICT = "/quan-ly-quan/{id}";

        //Trang active quận
        public static final String ACTIVE_DISTRICT = "/quan-ly-quan/active/{id}/{active}";

        //Trang xóa quạn
        public static final String DELETE_DISTRICT = "/quan-ly-quan/xoa/{id}";

        //Trang danh sách các loại quán
        public static final String LIST_KIND_OF_FOOD = "/quan-ly-loai-quan";

        //Trang thêm loại quán
        public static final String ADD_KIND_OF_FOOD = "/quan-ly-loai-quan/them";

        //Trang sửa loại quán
        public static final String UPDATE_KIND_OF_FOOD = "/quan-ly-loai-quan/{id}";

        //Trang danh mục bài viết
        public static final String LIST_POSTCATEGORY = "/quan-ly-danh-muc-bai-viet";

        //Trang thêm danh mục bài viết
        public static final String ADD_POSTCATEGORY = "/quan-ly-danh-muc-bai-viet/them";

        //Trang sửa danh mục bài viết
        public static final String UPDATE_POSTCATEGORY = "/quan-ly-danh-muc-bai-viet/{id}";

        //Trang xóa danh mục bài viết
        public static final String DELETE_POSTCATEGORY = "/quan-ly-danh-muc-bai-viet/xoa/{id}";

        //Trang danh mục địa điểm
        public static final String LIST_FOODCATEGORY = "/quan-ly-danh-muc-dia-diem";

        //Trang thêm danh mục địa điểm
        public static final String ADD_FOODCATEGORY = "/quan-ly-danh-muc-dia-diem/them";

        //Trang sửa danh mục địa điểm
        public static final String UPDATE_FOODCATEGORY = "/quan-ly-danh-muc-dia-diem/{id}";

        //Trang xóa danh mục địa điểm
        public static final String DELETE_FOODCATEGORY = "/quan-ly-danh-muc-dia-diem/xoa/{id}";

//        Trang danh sách đối tác
        public static final String LIST_PARTNER = "/quan-ly-doi-tac";

        //Trang thêm đối tác
        public static final String ADD_PARNER = "/quan-ly-doi-tac/them";

        //Trang sửa đối tác
        public static final String UPDATE_PARNER = "/quan-ly-doi-tac/{id}";

        //Trang sửa đối tác
        public static final String UPDATED_PARNER = "/quan-ly-doi-tac/sua";

        //Xóa đối tác
        public static final String DELETE_PARNER = "/quan-ly-doi-tac/xoa/${id}";

        //Active đối tác
        public static final String ACTIVE_PARNER = "/quan-ly-doi-tac/active/{id}/{active}";

        //Trang danh sách ưu đãi
        public static final String LIST_OFFER = "/quan-ly-uu-dai";

        //Trang thêm ưu đãi
        public static final String ADD_OFFER = "/quan-ly-uu-dai/them";

        //Trang sửa ưu đãi
        public static final String UPDATE_OFFER = "/quan-ly-uu-dai/{id}";

        //Trang xóa ưu đãi
        public static final String DELETE_OFFER = "/quan-ly-uu-dai/xoa/{id}";

        //Active ưu đãi
        public static final String ACTIVE_OFFER = "/quan-ly-uu-dai/active/{id}/{active}";

        //Trang danh sách tour
        public static final String LIST_TOUR = "/quan-ly-tour";

        //Trang thêm tour
        public static final String ADD_TOUR = "/quan-ly-tour/them";

        //Trang sửa tour
        public static final String UPDATE_TOUR = "/quan-ly-tour/{id}";

        //Trang xóa tour
        public static final String DELETE_TOUR = "/quan-ly-tour/xoa/{id}";

        //Trang sua tour
        public static final String UPDATED_TOUR = "/quan-ly-tour/sua";

        //Trang danh sách tour
        public static final String LIST_POST = "/quan-ly-bai-viet";

        //Trang thêm tour
        public static final String ADD_POST = "/quan-ly-bai-viet/them";

        //Trang sửa tour
        public static final String UPDATE_POST = "/quan-ly-bai-viet/{id}";

        //Trang xóa tour
        public static final String DELETE_POST = "/quan-ly-bai-viet/xoa/{id}";

        //Trang sua tour
        public static final String UPDATED_POST = "/quan-ly-bai-viet/sua";

        //Trang danh sách tour
        public static final String LIST_FOOD_PLACE = "/quan-ly-dia-diem";

        //Trang thêm tour
        public static final String ADD_FOOD_PLACE = "/quan-ly-dia-diem/them";

        //Trang sửa tour
        public static final String UPDATE_FOOD_PLACE = "/quan-ly-dia-diem/{id}";

        //Trang xóa tour
        public static final String DELETE_FOOD_PLACE = "/quan-ly-dia-diem/xoa/{id}";

        //Trang sua tour
        public static final String UPDATED_FOOD_PLACE = "/quan-ly-dia-diem/sua";


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
