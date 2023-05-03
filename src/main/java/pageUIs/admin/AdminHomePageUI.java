package pageUIs.admin;

public class AdminHomePageUI {
	public static final String PRODUCT_TEXT = "//p[text()='Sản phẩm tiêu thụ trong tháng']";
	public static final String DRAG_BUTTON = "//li[@class='slick-active']/following-sibling::li/button";
	public static final String NEXT_BUTTON = "//span[text()='Tiếp theo']";
	public static final String BACK_BUTTON = "//span[text()='Quay lại']";
	public static final String CREATE_BUTTON = "//span[text()='Tạo mới']";
	public static final String CLOSE_MODAL_BUTTON = "//p[text()='Đóng']";
	public static final String BACK_TO_CREATE_DISTRIBUTOR_PAGE_BUTTON = "//button[@class='btn btn__color--primary btn__size--default']";
	public static final String DISTRIBUTOR_MANAGEMENT = "//a[@href='#/npp-manager']";
	public static final String ADD_MEMBER_BUTTON = "//div[@class='npp-manager__container px1']/button";
	public static final String PERSONAL_INFORMATION_TEXT = "//div[text()='Thông tin cá nhân']";
	public static final String MODAL_ERROR = "//div[@class='modal__content']";
	public static final String DISTRIBUTOR_MANAGEMENT_TEXT = "//span[contains(normalize-space(),'Quản lý nhà phân phối')]";
	public static final String TAX_CODE_INPUT_TEXT = "//input[@placeholder='Nhập mã số thuế']";
	public static final String WAREHOUSE_AREA_INPUT_TEXT = "//input[@placeholder='Nhập diện tích (㎡)']";
	public static final String LABOR_INPUT_TEXT = "//input[@placeholder='Nhập số lượng']";
	public static final String ID_CARD_INPUT_TEXT = "//input[@placeholder='Nhập CMT/CCCD']";
	public static final String ACCOUNT_DISTRIBUTOR_INPUT_TEXT = "//input[@placeholder='VD: Số điện thoại của bạn']";
	public static final String PASSWORD_DISTRIBUTOR_INPUT_TEXT = "//input[@placeholder='Nhập mật khẩu']";
	public static final String EMAIL_DISTRIBUTOR_INPUT_TEXT = "//input[@placeholder='Nhập email']";
	public static final String REGION_INPUT_TEXT = "//input[@placeholder='Chọn vùng']";
	public static final String REGION_VALUE = "//ul[@class='vs__dropdown-menu']/li";
	public static final String AREA_INPUT_TEXT = "//input[@placeholder='Chọn khu vực']";
	public static final String AREA_VALUE = "//ul[@class='vs__dropdown-menu']/li";
	public static final String BUSINESS_MODEL_TEXT = "//input[@placeholder='Chọn loại hình kinh doanh']";
	public static final String BUSINESS_MODEL_VALUE = "//ul[@class='vs__dropdown-menu']/li";
	public static final String LABOR_INPUT = "//input[@placeholder='Nhập số lượng']";
	public static final String SELECT_ADDRESS_INPUT = "//input[@placeholder='Chọn địa chỉ']";
	public static final String SELECT_CITY = "//div[contains(normalize-space(),'An Giang') and @class='address-item']";
	public static final String SELECT_DISTRICT = "//div[contains(normalize-space(),'An Phú') and @class='address-item']";
	public static final String SELECT_WARD = "//div[contains(normalize-space(),'An Phú') and @class='address-item']";
	public static final String CREATE_USER_TEXT = "//div[@class='p1 mb1']";
	public static final String REPRESENTATIVE = "//p[contains(normalize-space(),'%s')]";

	public static final String ERROR_MESSAGE_EMPTY_REPRESENTATIVE =
			"//p[contains(normalize-space(),'Người đại diện')]//ancestor::div[contains(@class,'mb1')]//p[contains(normalize-space(),'Bạn cần điền vào mục này')]";
	public static final String ERROR_MESSAGE_INVALID_REPRESENTATIVE =
			"//p[contains(normalize-space(),'Người đại diện')]//ancestor::div[contains(@class,'mb1')]//p[contains(normalize-space(),'Tên không hợp lệ')]";
	public static final String ERROR_MESSAGE_EMPTY_PHONE =
			"//p[contains(normalize-space(),'Số điện thoại')]//ancestor::div[contains(@class,'mb1')]//p[contains(normalize-space(),'Bạn cần điền vào mục này')]";
	public static final String ERROR_MESSAGE_INVALID_PHONE =
			"//p[contains(normalize-space(),'Số điện thoại')]//ancestor::div[contains(@class,'mb1')]//p[contains(normalize-space(),'Số điện thoại không hợp lệ')]";
	public static final String ERROR_MESSAGE_EMPTY_TAX_CODE =
			"//p[contains(normalize-space(),'Mã số thuế NPP')]//ancestor::div[contains(@class,'mb1')]//p[contains(normalize-space(),'Bạn cần điền vào mục này')]";
	public static final String ERROR_MESSAGE_EMPTY_ID_CARD =
			"//p[contains(normalize-space(),'CMT/CCCD')]//ancestor::div[contains(@class,'mb1')]//p[contains(normalize-space(),'Bạn cần điền vào mục này')]";
	public static final String ERROR_MESSAGE_INVALID_ID_CARD =
			"//p[contains(normalize-space(),'CMT/CCCD')]//ancestor::div[contains(@class,'mb1')]//p[contains(normalize-space(),'CMT/CCCD không hợp lệ')]";
	public static final String ERROR_MESSAGE_EMPTY_DATE_RANGE =
			"//p[contains(normalize-space(),'Ngày cấp')]//ancestor::div[contains(@class,'mb1')]//p[contains(normalize-space(),'Bạn cần điền vào mục này')]";
	public static final String ERROR_MESSAGE_EMPTY_ISSUE_BY =
			"//p[contains(normalize-space(),'Nơi cấp')]//ancestor::div[contains(@class,'mb1')]//p[contains(normalize-space(),'Bạn cần điền vào mục này')]";
	public static final String ERROR_MESSAGE_EMPTY_SELECT_ADDRESS =
			"//p[contains(normalize-space(),'Tỉnh/Thành phố, Quận/Huyện, Phường/Xã')]//ancestor::div[contains(@class,'mb1')]//p[contains(normalize-space(),'Bạn cần điền vào mục này')]";
	public static final String ERROR_MESSAGE_EMPTY_ADDRESS =
			"//p[contains(normalize-space(),'Địa chỉ')]//ancestor::div[contains(@class,'mb1')]//p[contains(normalize-space(),'Bạn cần điền vào mục này')]";
	public static final String ERROR_MESSAGE_EMPTY_WAREHOUSE_AREA =
			"//p[contains(normalize-space(),'Diện tích kho')]//ancestor::div[contains(@class,'mb1')]//p[contains(normalize-space(),'Bạn cần điền vào mục này')]";
	public static final String ERROR_MESSAGE_EMPTY_LABOR =
			"//p[contains(normalize-space(),'Nhân công')]//ancestor::div[contains(@class,'mb1')]//p[contains(normalize-space(),'Bạn cần điền vào mục này')]";
	public static final String ERROR_MESSAGE_EMPTY_TIME_IN =
			"//p[contains(normalize-space(),'Thời gian vào')]//ancestor::div[contains(@class,'mb1')]//p[contains(normalize-space(),'Bạn cần điền vào mục này')]";
	public static final String ERROR_MESSAGE_EMPTY_REGION =
			"//input[@placeholder='Chọn vùng']//ancestor::div[@class='input__content']/following-sibling::p";
	public static final String ERROR_MESSAGE_EMPTY_AREA =
			"//input[@placeholder='Chọn khu vực']//ancestor::div[@class='input__content']/following-sibling::p";
	public static final String ERROR_MESSAGE_ACCOUNT =
			"//input[@placeholder='VD: Số điện thoại của bạn']/parent::div/following-sibling::p";
	public static final String ERROR_MESSAGE_PASSWORD =
			"//input[@placeholder='Nhập mật khẩu']/parent::div/following-sibling::p";
	public static final String ERROR_MESSAGE_EMAIL =
			"//input[@placeholder='Nhập email']/parent::div/following-sibling::p";

	// Product Page
	public static final String PRODUCT_BUTTON = "//a[@href='#/product']";
	public static final String ADD_NEW_PRODUCT_BUTTON = "//div[@class='product-tab__search mb15']/button";
	public static final String ADD_NEW_PRODUCT_TEXT = "//span[contains(normalize-space(),'Thêm mới sản phẩm')]";
	public static final String PRODUCT_WAREHOUSE_TEXT = "//span[@class='h5']";
	public static final String PRODUCT_DESCRIPTION_TEXT_AREA = "//textarea[@placeholder='Nhập mô tả sản phẩm']";
	public static final String CATEGORY_INPUT = "//input[@placeholder='Chọn một danh mục']";
	public static final String PRODUCT_IMAGE = "//input[@type='file']";
	public static final String CATEGORY_INPUT_VALUE = "//li[contains(normalize-space(),'Khuyến mại tháng 5')]";
	public static final String ADD_ATTRIBUTE_BUTTON = "//span[@class='f aic jcc h6']";
	public static final String DELETE_ATTRIBUTE_BUTTON = "//button[@class='btn btn__color--danger btn__size--default out__line']";
	public static final String CANCEL_BUTTON = "//span[text()='Huỷ bỏ']";
	public static final String CREATE_NEW_BUTTON = "//span[text()='Tạo mới']";
	public static final String PRODUCT_NAME = "//p[contains(normalize-space(),'%s')]";
}
