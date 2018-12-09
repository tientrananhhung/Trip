package edu.poly.common;


public class Constants {

    public class Url {
        //Đăng nhập
        public static final String LOGIN = "/dang-nhap";

        //Đăng xuất
        public static final String LOGOUT = "/dang-xuat";

        //Quên mật khẩu
        public static final String FORGOT_PASS = "/quen-mat-khau";

        //Đổi mật khẩu
        public static final String CHANGE_PASS = "/doi-mat-khau";

        //Trang admin
        public static final String ADMIN_PAGE_URL = "/admin";

        //Management Offer
        public static final String OFFER_URL = "/uu-dai";

        //Offer detail by id
        public static final String OFFER_DETAIL_URL = "/{offerId}";

        //Thông tin cá nhân của người dùng
        public static final String PROFILE_URL = "/thong-tin";

        //Trang đăng ký
        public static final String REGISTER = "/dang-ky";

        //Trang danh sách người dùng
        public static final String LIST_USER = "/quan-ly-nguoi-dung";

        //Trang thêm người dùng
        public static final String ADD_USER = "/quan-ly-nguoi-dung/them";

        //Trang sửa người dùng
        public static final String UPDATE_USER = "/quan-ly-nguoi-dung/{id}";

        //Trang sửa người dùng
        public static final String UPDATED_USER = "/quan-ly-nguoi-dung/{id}";

        //Trang xóa người dùng
        public static final String DELETE_USER = "/quan-ly-nguoi-dung/xoa/{id}";

        //Trang active người dùng
        public static final String ACTIVE_USER = "/quan-ly-nguoi-dung/active/{id}/{active}";

        //Trang active người dùng
        public static final String ACTIVE_USER_TOKEN = "/activeuser/{token}";

        //Change info người dùng
        public static final String CHANGE_CUSTOMER_INFORMATION = "/changeinfo";

        //Change role user
        public static final String CHANGE_ROLE_USER = "/quan-ly-nguoi-dung/changerole/{id}/{role}";

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

        //Trang danh sách đối tác
        public static final String LIST_PARTNER = "/quan-ly-doi-tac";

        //Trang thêm đối tác
        public static final String ADD_PARNER = "/quan-ly-doi-tac/them";

        //Trang sửa đối tác
        public static final String UPDATE_PARNER = "/quan-ly-doi-tac/{id}";

        //Trang sửa đối tác
        public static final String UPDATED_PARNER = "/quan-ly-doi-tac/sua";

        //Xóa đối tác
        public static final String DELETE_PARNER = "/quan-ly-doi-tac/xoa/{id}";

        //Active đối tác
        public static final String ACTIVE_PARNER = "/quan-ly-doi-tac/active/{id}/{active}";

        //Đăng ký đối tác
        public static final String REGISTER_PARNER = "/doitac/dangky";

        //Trang danh sách ưu đãi
        public static final String LIST_OFFER = "/quan-ly-uu-dai";

        //Trang thêm ưu đãi
        public static final String ADD_OFFER = "/quan-ly-uu-dai/them";

        //Trang sửa ưu đãi
        public static final String UPDATE_OFFER = "/quan-ly-uu-dai/{id}";

        //Trang sửa ưu đãi
        public static final String UPDATED_OFFER = "/quan-ly-uu-dai/sua";

        //Trang xóa ưu đãi
        public static final String DELETE_OFFER = "/quan-ly-uu-dai/xoa/{id}";

        //Active ưu đãi
        public static final String ACTIVE_OFFER = "/quan-ly-uu-dai/active/{id}/{isused}";

        //Trang danh sách tour
        public static final String LIST_TOUR = "/quan-ly-tour";

        //Trang thêm tour
        public static final String ADD_TOUR = "/quan-ly-tour/them";

        //Trang sửa tour
        public static final String UPDATE_TOUR = "/quan-ly-tour/{id}";

        //Trang xóa tour
        public static final String DELETE_TOUR = "/quan-ly-tour/xoa/{id}/{xoa}";

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
        public static final String DELETE_FOOD_PLACE = "/quan-ly-dia-diem/{id}/{action}";

        //Trang sua tour
        public static final String UPDATED_FOOD_PLACE = "/quan-ly-dia-diem/sua";

        //Trang danh sach order
        public static final String LIST_ORDER = "/quan-ly-hoa-don";

        //Trang danh sach order
        public static final String DELETE_ORDER = "/quan-ly-hoa-don/xoa/{id}";

        //thanh toan order
        public static final String PURCHASE_ORDER = "/quan-ly-hoa-don/thanh-toan/{id}";

        //hoàn tiền order
        public static final String REFUND_ORDER = "/quan-ly-hoa-don/hoan-tien/{id}";

        //thanh toan order
        public static final String PURCHASE_PARTNER_ORDER = "/thanh-toan/{id}";

        //hoàn tiền order partner
        public static final String REFUND_PARTNER_ORDER = "/hoan-tien/{id}";

        //Trang tour detail của user
        public static final String TOUR_DETAIL_URL = "/tour/{id}";

        //Trang quản lý tour của partner
        public static final String MANAGEMENT_TOUR_URL = "/tour";

        //Trang hiển thị chi tiết tour của partner
        public static final String GET_MANAGEMENT_TOUR_URL = "/{id}/tour";

        //Trang hiển thị thêm tour của partner
        public static final String ADD_MANAGEMENT_TOUR_URL = "/tour/them";

        //Trang thêm tour của partner
        public static final String POST_MANAGEMENT_TOUR_URL = "/tour/post";

        //Trang quản lý order của customer
        public static final String MANAGEMENT_ORDER_URL = "/don-hang";

        //Trang quản lý order của partner
        public static final String MANAGEMENT_PARTNER_ORDER_URL = "/don-hang-doi-tac";

        //Trang quản lý order đã hủy của partner
        public static final String MANAGEMENT_PARTNER_DELETE_ORDER_URL = "/don-hang-doi-tac-da-huy";

        //Trang quản lý order đã thanh toán của partner
        public static final String MANAGEMENT_PARTNER_PURCHASE_ORDER_URL = "/don-hang-doi-tac-da-thanh-toan";

        //Trang quản lý order đã thanh toán của customer
        public static final String MANAGEMENT_PURCHASE_ORDER_URL = "/don-hang-da-thanh-toan";

        //Trang quản lý order của customer
        public static final String MANAGEMENT_DELETE_ORDER_URL = "/don-hang-da-huy";

        //Trang hủy order của customer
        public static final String DELETE_ORDER_CUSTOMER = "/huy-don-hang/{purchase}/{id}";

        //Trang Blog của user
        public static final String BLOG_URL = "/blog";

        //Trang Category blog của user
        public static final String CATEGORY_BLOG_URL = "/{id}/blog";

        //Trang blog detail của user
        public static final String BLOG_DETAIL_URL = "/blog/{id}";

        //Trang Food của user
        public static final String FOOD_URL = "food";

        //Trang category food của user
        public static final String CATEGORY_FOOD_URL = "/{id}/food";

        //Trang food detail của user
        public static final String FOOD_DETAIL_URL = "/food/{id}";

        //Trang đăng ký đối tác
        public static final String REG_PARTNET_URL = "/dang-ky-doi-tac";

        //Trang quản lý chung
        public static final String MANAGEMENT_URL = "/quan-ly";

        //Trang quản lý của đối tác
        public static final String PARTNER_URL = "doi-tac-{id}";

        //Trang quản lý bài viết của đối tác
        public static final String BLOG_PARTNER_URL = "/bai-viet";

        //Trang quản lý bài viết của đối tác
        public static final String BLOG_DELETED_PARTNER_URL = "/bai-viet-da-xoa";

        //Trang thêm bài viết của đối tác
        public static final String BLOG_ADD_PARTNER_URL = "/bai-viet/them";

        //Trang xóa bài viết của đối tác
        public static final String BLOG_DELETE_PARTNER_URL = "/bai-viet/xoa/{id}";

        //Trang sua bài viết của đối tác
        public static final String BLOG_EDIT_PARTNER_URL = "/bai-viet/sua/{id}";

        //Trang sua bài viết của đối tác
        public static final String BLOG_EDITED_PARTNER_URL = "/bai-viet/sua";

        //Trang thêm blog của đối tác
        public static final String POST_BLOG_PARTNER_URL = "dang-bai";

        //Trang quản lý của người dùng
        public static final String USER_URL = "nguoi-dung-{id}";

        //Quên mật khẩu khách hàng
        public static final String FORGOT_USER = "/forgotuser";

        //Lấy mật khẩu khách hàng
        public static final String FORGOT_USER_TOKEN = "/forgotuser/{token}";

        //Lấy mật khẩu khách hàng
        public static final String RECOVER_USER = "/recover";

        //Trang hiển thị thông tin order
        public static final String GET_PROCESSING_ORDER_URL = "/ticket-booking/processing";

        //Trang login cho processing order
        public static final String POST_LOGIN_PROCESS_ORDER_URL = "/order/login";

        public static final String USER_STATISTICS = "/userstatistics/{year}";

        public static final String PARNER_STATISTICS = "/partnerstatistics/{month}/{year}";

        public static final String OFFER_STATISTICS = "/offerstatistics/{month}/{year}";

        public static final String POST_STATISTICS = "/poststatistics/{year}";

        //Trang API
        public static final String API_URL = "/api";

        //Trang API phân trang post
        public static final String PAGING_POST_URL = "/get-post/{page}";

        //Trang API phân trang category post
        public static final String PAGING_CATEGORY_POST_URL = "/{id}/get-post/{page}";

        //Trang API phân trang food
        public static final String PAGING_FOOD_URL = "/get-food/{page}";

        //Trang API phân trang category food
        public static final String PAGING_CATEGORY_FOOD_URL = "/{id}/get-food/{page}";

        //Trang API phân trang rate tour detail
        public static final String PAGING_RATE_TOUR_DETAIL_URL = "/{id}/rate/{page}";

        //Trang API post information order for redirect to processing order
        public static final String POST_PROCESSING_ORDER_URL = "/process/order/{sId}";

        //Trang API post information order for redirect to process ordered
        public static final String POST_PROCESS_ORDER_URL = "/process/order/{sId}/{uId}";

        //Trang Error 404
        public static final String ERROR404 = "/error404";

        //Trang Error 400
        public static final String ERROR400 = "/error400";

        //Trang Error 500
        public static final String ERROR500 = "/error500";

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
        public static final int INACTIVE = 0;

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
        public static final String USER = "userInfo";

        //Key lưu session order
        public static final String ORDER_SESSION = "processOrder";

    }

    public class Attribute {

        //Attribute notify
        public static final String NOTIFY_ATTRIBUTE = "notify";

        //Attribute login
        public static final String LOGIN_ATTRIBUTE = "login";

        //Attribute offer
        public static final String OFFER_ATTRIBUTE = "offer";

    }

}
