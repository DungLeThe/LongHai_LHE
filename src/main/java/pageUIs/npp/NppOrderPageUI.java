package pageUIs.npp;

public class NppOrderPageUI {
    public static final String SEARCH_ORDER = "//input[@placeholder='Tìm kiếm đơn hàng']";
    public static final String START_DATE = "//span[text()='Từ ngày']/following-sibling::div/span/div/input[@placeholder='Chọn ngày']";
    public static final String END_DATE = "//span[text()='Đến ngày']/following-sibling::div/span/div/input[@placeholder='Chọn ngày']";
    public static final String CREATE_ORDER_BUTTON = "//span[@class='h6 f aic jcc']";

    public static final String ORDER_NOTE = "//input[@placeholder='Nhập ghi chú']";
    public static final String SEARCH_PRODUCT = "//input[@placeholder='Tìm kiếm sản phẩm']";
    public static final String CANCEL_HELP_DESK = "//div[@class='cursor']";
    public static final String HELP_DESK_ICON = "//div[@class='helpdesk__icon up']";
    public static final String BELL_ICON = "//i[@class='v-icon bell']";
    public static final String PRODUCT_CHECKBOX = "//input[@class='primary stick']";
    public static final String CONFIRM_ORDER_BUTTON = "//span[text()='Hoàn thành']";
    public static final String SUCCESSFULL_POPUP_CONTENT = "//p[text()='Bạn đã tạo đơn nhập hàng thành công']";
    public static final String VIEW_ORDER_DETAIL_BUTTON_AFTER_CREATED_SUCCESS = "//p[text()='Chi tiết đơn']";

    public static final String VIEW_ORDER_LIST_BUTTON_AFTER_CREATED_SUCCESS = "//p[normalize-space()='Trang danh sách']";
}
