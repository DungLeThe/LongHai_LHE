package pageUIs.marketingStaff;

public class MarketingStaffHomePageUI {
    public static final String ORDER_BUTTON = "//a[@href='/order']/img";
    public static final String ADD_ORDER_FROM_DISTRIBUTOR_BUTTON = "//a[@href='/order/pickup']";
    public static final String ADD_ORDER_BUTTON = "//button[@class='btn btn__color--primary btn__size--default']";
    public static final String CANCEL_ADD_ORDER_BUTTON = "//div[contains(text(),'Huỷ')]";
    public static final String CHOOSE_PRODUCT_BUTTON = "//button[@class='btn btn__color--warning btn__size--large']";
    public static final String CANCEL_CHOOSE_PRODUCT_BUTTON = "//div[contains(text(),'Huỷ')]";
    public static final String INPUT_SEARCH_PRODUCT = "//input[@placeholder='Tìm kiếm sản phẩm']";
    public static final String TEXT_BOX_CHOOSE_PRODUCT = "//div[@class='f aic border border-radius-m px1 mb1'][1]//input";
    public static final String ADD_NEW_PRODUCT_BUTTON = "//button/div[contains(text(),'Thêm')]";
    public static final String HELP_DESK_ICON = "//div[@class='helpdesk__icon up']";
    public static final String BELL_ICON = "//i[@class='v-icon bell']";
    public static final String ADD_UNIT_ICON = "//div[contains(text(),'Thêm đơn vị')]";
    public static final String NUMBER_OF_BOXES_INPUT = "//div[@class='f jcs aic gap05 mb1 input-custom-wrapper'][1]//input[@placeholder='Nhập số lượng']";
    public static final String NUMBER_OF_BAGS_INPUT = "//div[@class='f jcs aic gap05 mb1 input-custom-wrapper'][2]//input[@placeholder='Nhập số lượng']";
    public static final String CONFIRM_BUTTON = "//div[contains(text(),'Xác nhận')]";
    public static final String DETAIL_ORDER_BUTTON = "//p[text()='Chi tiết đơn']";
    public static final String PRODUCT_NAME_TEXT = "//div[@class='card-product__name f aic cursor border-radius-m px1']//p[@class='p3 mb025']";
    public static final String PRICE_VALUE = "//div[text()='Tổng đơn hàng']/following-sibling::div[contains(text(),'960.000')]";
    public static final String PRICE_TEXT = "//div[text()='Tổng đơn hàng']/following-sibling::div";
}
