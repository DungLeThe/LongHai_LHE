package lhe.admin;

import commons.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.admin.AdminHomePageObject;
import pageObjects.admin.AdminLoginPageObject;
import pageObjects.admin.accountManagement.AccountManagementPageObject;
import pageObjects.admin.distributorManagement.CreateAccountDistributorPageObject;
import pageObjects.admin.distributorManagement.DistributorManagementPageObject;
import pageObjects.admin.distributorManagement.CreateInformationPageObject;
import pageUIs.admin.AdminHomePageUI;
import reportConfig.ExtentTestManager;

import java.lang.reflect.Method;

import static commons.BasePage.getRandomInt;
import static commons.BasePage.getRandomString;
import static commons.GlobalConstants.ADMIN_LOGIN;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class AddDistributorManagement extends BaseTest {
    WebDriver driver;

    private String representative, representativeInvalid, phone, phoneInvalid, taxCode, idCard, idCardInvalid, dateRange, issuedBy, enterAddress, region,
            area, businessModel, warehouseArea, labor, timeIn, distributionRoomCode, marketRoomCode,
            accountDistributor, passwordDistributor, passwordShort, passwordMissNumber, passwordMissSpecial, emailDistributor, emailInvalid;
    private String browserName;

    private AdminLoginPageObject loginPage;
    private AdminHomePageObject homePage;
    private DistributorManagementPageObject distributorPage;
    private CreateInformationPageObject createInformationPage;
    private CreateAccountDistributorPageObject createAccountDistributorPage;
    private AccountManagementPageObject accountManagementPage;
    private AdminHomePageUI homePageUI;

    @BeforeClass
    public void beforeClass() {
        browserName = "chrome";
        driver = getBrowserDriver(browserName, ADMIN_LOGIN);
        loginPage = new AdminLoginPageObject(driver);
        homePage = loginPage.goToAdminHomePage(driver);

        representative = "LHETest" + getRandomString();
        representativeInvalid = "Test1";
        phone = "098765" + getRandomInt();
        phoneInvalid = "0987654321987654321";
        taxCode = "01234" + getRandomInt();
        idCard = "0123456" + getRandomInt();
        idCardInvalid = "0987654321987654321";
        dateRange = "01/01/2011";
        issuedBy = "Ha Noi";
        enterAddress = "Cau Giay, Ha Noi";
        region = "Vùng 1";
        area = "Khu vực 11";
        businessModel = "Công ty";
        warehouseArea = "1000";
        labor = "20";
        timeIn = "20/04/2020";
        distributionRoomCode = "AD1";
        marketRoomCode = "AD1";
        accountDistributor = "Account" + getRandomInt();
        passwordDistributor = "LHETest@123";
        emailDistributor = "LongHaiTest" + getRandomInt() + "@gmail.com";
        passwordShort = "test";
        passwordMissNumber = "LongHaiTest@";
        passwordMissSpecial = "LongHaiTest123";
        passwordDistributor = "LHETest@123";
        emailInvalid = "LongHaiTest";
    }

    public void goToHomPage() {
        homePage.openPageUrl(driver, ADMIN_LOGIN);
        homePage.clickButtonDragToTheLeft();
    }

    @Test
    public void TC_01_Cancel(Method method) {
        ExtentTestManager.startTest(method.getName(), "Click Cancel Button");
        goToHomPage();
        distributorPage = homePage.clickDistributorManagementButton();
        createInformationPage = distributorPage.clickAddMemberButton();
        distributorPage = createInformationPage.clickCancelButton();
        assertTrue(distributorPage.isDistributorManagementTextDisplayed());
    }

    @Test
    public void TC_02_Go_To_Add_Distributor_Management(Method method) {
        ExtentTestManager.startTest(method.getName(), "Add Distributor Management");
        goToHomPage();
        distributorPage = homePage.clickDistributorManagementButton();
        createInformationPage = distributorPage.clickAddMemberButton();

        assertTrue(createInformationPage.isPersonalInformationTextDisplayed());
    }

    @Test
    public void TC_03_Invalid_Data(Method method) {
        ExtentTestManager.startTest(method.getName(), "Add Distributor Management Invalid Data");
        goToHomPage();
        distributorPage = homePage.clickDistributorManagementButton();
        createInformationPage = distributorPage.clickAddMemberButton();

        createInformationPage.inputByPlaceholder(driver, "Người đại diện", representativeInvalid);
        createInformationPage.inputByPlaceholder(driver, "Số điện thoại", phoneInvalid);
        createInformationPage.inputToIdCard(idCardInvalid);

        createInformationPage.clickNextButton();

        assertEquals(createInformationPage.getErrorMessageInvalidRepresentative(), "Tên không hợp lệ");
        assertEquals(createInformationPage.getErrorMessageInvalidPhone(), "Số điện thoại không hợp lệ");
        assertEquals(createInformationPage.getErrorInvalidMessageIdCard(), "CMT/CCCD không hợp lệ");
    }

    @Test
    public void TC_04_Empty_Data(Method method) {
        ExtentTestManager.startTest(method.getName(), "Add Distributor Management Empty Data");
        goToHomPage();
        distributorPage = homePage.clickDistributorManagementButton();
        createInformationPage = distributorPage.clickAddMemberButton();

        createInformationPage.clickToInputByPlaceholder(driver, "Nơi cấp");
        createInformationPage.inputByPlaceholder(driver, "Người đại diện", "");
        createInformationPage.inputByPlaceholder(driver, "Số điện thoại", "");

        createInformationPage.clickToInputByPlaceholder(driver, "Mã số thuế NPP");
        createInformationPage.inputToIdCard("");
        createInformationPage.clickToInputByPlaceholder(driver, "Ngày cấp");
        createInformationPage.clickToInputByPlaceholder(driver, "Địa chỉ cụ thể");

        createInformationPage.scrollToBottomPage(driver);

        createInformationPage.clickToInputByPlaceholder(driver, "Mã chiện - Phòng thị trường tạo");
        createInformationPage.clickToInputByPlaceholder(driver, "Mã NPP - Phòng kế toán tạo");
        createInformationPage.clickToInputByPlaceholder(driver, "Thời gian vào");
        createInformationPage.clickToInputByPlaceholder(driver, "Diện tích kho");
        createInformationPage.clickToLabor();
        createInformationPage.clickToInputByPlaceholder(driver, "Loại hình kinh doanh");

        createInformationPage.clickNextButton();

        assertEquals(createInformationPage.getErrorMessageRepresentative(), "Bạn cần điền vào mục này");
        assertEquals(createInformationPage.getErrorMessagePhone(), "Bạn cần điền vào mục này");
        assertEquals(createInformationPage.getErrorMessageTaxCode(), "Bạn cần điền vào mục này");
        assertEquals(createInformationPage.getErrorMessageIdCard(), "Bạn cần điền vào mục này");
        assertEquals(createInformationPage.getErrorMessageDateRange(), "Bạn cần điền vào mục này");
        assertEquals(createInformationPage.getErrorMessageIssuedBy(), "Bạn cần điền vào mục này");
        assertEquals(createInformationPage.getErrorMessageSelectAdress(), "Bạn cần điền vào mục này");
        assertEquals(createInformationPage.getErrorMessageAddress(), "Bạn cần điền vào mục này");

        createInformationPage.scrollToBottomPage(driver);

        assertEquals(createInformationPage.getErrorMessageWarehouseArea(), "Bạn cần điền vào mục này");
        assertEquals(createInformationPage.getErrorMessageLabor(), "Bạn cần điền vào mục này");
        assertEquals(createInformationPage.getErrorMessageTimeIn(), "Bạn cần điền vào mục này");
    }

    @Test()
    public void TC_05_Add_Distributor_Management_Success(Method method) {
        ExtentTestManager.startTest(method.getName(), "Add Distributor Management Success");
        goToHomPage();
        distributorPage = homePage.clickDistributorManagementButton();
        createInformationPage = distributorPage.clickAddMemberButton();

        createInformationPage.inputByPlaceholder(driver, "Nơi cấp", issuedBy);
        createInformationPage.inputByPlaceholder(driver, "Người đại diện", representative);
        createInformationPage.inputByPlaceholder(driver, "Số điện thoại", phone);

        createInformationPage.inputToTaxCode(taxCode);
        createInformationPage.inputToIdCard(idCard);
        createInformationPage.inputByPlaceholder(driver, "Ngày cấp", dateRange);
        createInformationPage.clickToSelectAddress();
        createInformationPage.clickToSelectCity();
        createInformationPage.clickToSelectDistrict();
        createInformationPage.clickToSelectWard();
        createInformationPage.inputByPlaceholder(driver, "Địa chỉ cụ thể", enterAddress);

        createInformationPage.scrollToBottomPage(driver);

        createInformationPage.inputByPlaceholder(driver, "Mã chiện - Phòng thị trường tạo", marketRoomCode);
        createInformationPage.inputByPlaceholder(driver, "Mã NPP - Phòng kế toán tạo", distributionRoomCode);
        createInformationPage.inputByPlaceholder(driver, "Thời gian vào", timeIn);
        createInformationPage.inputByPlaceholder(driver, "Diện tích kho", warehouseArea);
        createInformationPage.inputToWarehouseArea(warehouseArea);
        createInformationPage.inputToLabor(labor);
        createInformationPage.selectItemInCustomDropdown(driver, homePageUI.BUSINESS_MODEL_TEXT, homePageUI.BUSINESS_MODEL_VALUE, businessModel);

        createInformationPage.clickToInputRegion();
        createInformationPage.selectItemInCustomDropdown(driver, homePageUI.REGION_INPUT_TEXT, homePageUI.REGION_VALUE, region);
        createInformationPage.clickToInputArea();
        createInformationPage.selectItemInCustomDropdown(driver, homePageUI.AREA_INPUT_TEXT, homePageUI.AREA_VALUE, area);

        createAccountDistributorPage = createInformationPage.clickNextButton();
        assertTrue(createAccountDistributorPage.isCreateUserTextDisplayed());
    }

        @Test
    public void TC_06_Back_To_Previous_Page(Method method) {
        ExtentTestManager.startTest(method.getName(), "Click Back Button");
        goToHomPage();
        distributorPage = homePage.clickDistributorManagementButton();
        createInformationPage = distributorPage.clickAddMemberButton();

        createInformationPage.inputByPlaceholder(driver, "Nơi cấp", issuedBy);
        createInformationPage.inputByPlaceholder(driver, "Người đại diện", representative);
        createInformationPage.inputByPlaceholder(driver, "Số điện thoại", phone);

        createInformationPage.inputToTaxCode(taxCode);
        createInformationPage.inputToIdCard(idCard);
        createInformationPage.inputByPlaceholder(driver, "Ngày cấp", dateRange);
        createInformationPage.clickToSelectAddress();
        createInformationPage.clickToSelectCity();
        createInformationPage.clickToSelectDistrict();
        createInformationPage.clickToSelectWard();
        createInformationPage.inputByPlaceholder(driver, "Địa chỉ cụ thể", enterAddress);

        createInformationPage.scrollToBottomPage(driver);

        createInformationPage.inputByPlaceholder(driver, "Mã chiện - Phòng thị trường tạo", marketRoomCode);
        createInformationPage.inputByPlaceholder(driver, "Mã NPP - Phòng kế toán tạo", distributionRoomCode);
        createInformationPage.inputByPlaceholder(driver, "Thời gian vào", timeIn);
        createInformationPage.inputByPlaceholder(driver, "Diện tích kho", warehouseArea);
        createInformationPage.inputToWarehouseArea(warehouseArea);
        createInformationPage.inputToLabor(labor);
        createInformationPage.selectItemInCustomDropdown(driver, homePageUI.BUSINESS_MODEL_TEXT, homePageUI.BUSINESS_MODEL_VALUE, businessModel);

        createInformationPage.clickToInputRegion();
        createInformationPage.selectItemInCustomDropdown(driver, homePageUI.REGION_INPUT_TEXT, homePageUI.REGION_VALUE, region);
        createInformationPage.clickToInputArea();
        createInformationPage.selectItemInCustomDropdown(driver, homePageUI.AREA_INPUT_TEXT, homePageUI.AREA_VALUE, area);

        createAccountDistributorPage = createInformationPage.clickNextButton();
        assertTrue(createAccountDistributorPage.isCreateUserTextDisplayed());
        createInformationPage = createAccountDistributorPage.clickBackButton();

        assertTrue(createInformationPage.isPersonalInformationTextDisplayed());
    }

    @Test()
    public void TC_07_Create_Account_Empty_Data(Method method) {
        ExtentTestManager.startTest(method.getName(), "Create Account Distributor Empty Data");
        goToHomPage();
        distributorPage = homePage.clickDistributorManagementButton();
        createInformationPage = distributorPage.clickAddMemberButton();

        createInformationPage.inputByPlaceholder(driver, "Nơi cấp", issuedBy);
        createInformationPage.inputByPlaceholder(driver, "Người đại diện", representative);
        createInformationPage.inputByPlaceholder(driver, "Số điện thoại", phone);

        createInformationPage.inputToTaxCode(taxCode);
        createInformationPage.inputToIdCard(idCard);
        createInformationPage.inputByPlaceholder(driver, "Ngày cấp", dateRange);
        createInformationPage.clickToSelectAddress();
        createInformationPage.clickToSelectCity();
        createInformationPage.clickToSelectDistrict();
        createInformationPage.clickToSelectWard();
        createInformationPage.inputByPlaceholder(driver, "Địa chỉ cụ thể", enterAddress);

        createInformationPage.scrollToBottomPage(driver);

        createInformationPage.inputByPlaceholder(driver, "Mã chiện - Phòng thị trường tạo", marketRoomCode);
        createInformationPage.inputByPlaceholder(driver, "Mã NPP - Phòng kế toán tạo", distributionRoomCode);
        createInformationPage.inputByPlaceholder(driver, "Thời gian vào", timeIn);
        createInformationPage.inputByPlaceholder(driver, "Diện tích kho", warehouseArea);
        createInformationPage.inputToWarehouseArea(warehouseArea);
        createInformationPage.inputToLabor(labor);
        createInformationPage.selectItemInCustomDropdown(driver, homePageUI.BUSINESS_MODEL_TEXT, homePageUI.BUSINESS_MODEL_VALUE, businessModel);

        createInformationPage.clickToInputRegion();
        createInformationPage.selectItemInCustomDropdown(driver, homePageUI.REGION_INPUT_TEXT, homePageUI.REGION_VALUE, region);
        createInformationPage.clickToInputArea();
        createInformationPage.selectItemInCustomDropdown(driver, homePageUI.AREA_INPUT_TEXT, homePageUI.AREA_VALUE, area);

        createAccountDistributorPage = createInformationPage.clickNextButton();
        assertTrue(createAccountDistributorPage.isCreateUserTextDisplayed());

        createAccountDistributorPage.inputToAccountDistributor("");
        createAccountDistributorPage.inputToPassWordDistributor("");
        createAccountDistributorPage.inputToEmailDistributor("");

        createAccountDistributorPage.clickCreateButton();

        assertEquals(createAccountDistributorPage.getErrorMessageAccountDistributor(), "Bạn cần điền vào mục này");
        assertEquals(createAccountDistributorPage.getErrorMessagePassWordDistributor(), "Bạn cần điền vào mục này");
        assertEquals(createAccountDistributorPage.getErrorMessageEmailDistributor(), "Bạn cần điền vào mục này");
        assertTrue(createAccountDistributorPage.isModalErrorDisplayed());

        createAccountDistributorPage.closeModalErrorButton();
    }

    @Test()
    public void TC_08_Create_Account_Invalid_Data(Method method) {
        ExtentTestManager.startTest(method.getName(), "Create Account Distributor Invalid Data");
        goToHomPage();
        distributorPage = homePage.clickDistributorManagementButton();
        createInformationPage = distributorPage.clickAddMemberButton();

        createInformationPage.inputByPlaceholder(driver, "Nơi cấp", issuedBy);
        createInformationPage.inputByPlaceholder(driver, "Người đại diện", representative);
        createInformationPage.inputByPlaceholder(driver, "Số điện thoại", phone);

        createInformationPage.inputToTaxCode(taxCode);
        createInformationPage.inputToIdCard(idCard);
        createInformationPage.inputByPlaceholder(driver, "Ngày cấp", dateRange);
        createInformationPage.clickToSelectAddress();
        createInformationPage.clickToSelectCity();
        createInformationPage.clickToSelectDistrict();
        createInformationPage.clickToSelectWard();
        createInformationPage.inputByPlaceholder(driver, "Địa chỉ cụ thể", enterAddress);

        createInformationPage.scrollToBottomPage(driver);

        createInformationPage.inputByPlaceholder(driver, "Mã chiện - Phòng thị trường tạo", marketRoomCode);
        createInformationPage.inputByPlaceholder(driver, "Mã NPP - Phòng kế toán tạo", distributionRoomCode);
        createInformationPage.inputByPlaceholder(driver, "Thời gian vào", timeIn);
        createInformationPage.inputByPlaceholder(driver, "Diện tích kho", warehouseArea);
        createInformationPage.inputToWarehouseArea(warehouseArea);
        createInformationPage.inputToLabor(labor);
        createInformationPage.selectItemInCustomDropdown(driver, homePageUI.BUSINESS_MODEL_TEXT, homePageUI.BUSINESS_MODEL_VALUE, businessModel);

        createInformationPage.clickToInputRegion();
        createInformationPage.selectItemInCustomDropdown(driver, homePageUI.REGION_INPUT_TEXT, homePageUI.REGION_VALUE, region);
        createInformationPage.clickToInputArea();
        createInformationPage.selectItemInCustomDropdown(driver, homePageUI.AREA_INPUT_TEXT, homePageUI.AREA_VALUE, area);

        createAccountDistributorPage = createInformationPage.clickNextButton();
        assertTrue(createAccountDistributorPage.isCreateUserTextDisplayed());

        createAccountDistributorPage.inputToPassWordDistributor(passwordShort);
        createAccountDistributorPage.inputToEmailDistributor(emailInvalid);
        assertEquals(createAccountDistributorPage.getErrorMessagePassWordDistributor(), "Cần ít nhất 8 ký tự");

        createAccountDistributorPage.inputToPassWordDistributor(passwordMissSpecial);
        assertEquals(createAccountDistributorPage.getErrorMessageEmailDistributor(), "Không đúng định dạng email");
        createAccountDistributorPage.inputToEmailDistributor(emailInvalid);
        assertEquals(createAccountDistributorPage.getErrorMessagePassWordDistributor(), "Cần chứa ít nhất 1 ký tự đặc biệt");

        createAccountDistributorPage.inputToPassWordDistributor(passwordMissNumber);
        createAccountDistributorPage.inputToEmailDistributor(emailInvalid);
        assertEquals(createAccountDistributorPage.getErrorMessagePassWordDistributor(), "Cần ít nhất 1 chữ số");
    }

    @Test()
    public void TC_09_Create_Account_Success(Method method) {
        ExtentTestManager.startTest(method.getName(), "Create Account Distributor Success");
        goToHomPage();
        distributorPage = homePage.clickDistributorManagementButton();
        createInformationPage = distributorPage.clickAddMemberButton();

        createInformationPage.inputByPlaceholder(driver, "Nơi cấp", issuedBy);
        createInformationPage.inputByPlaceholder(driver, "Người đại diện", representative);
        createInformationPage.inputByPlaceholder(driver, "Số điện thoại", phone);

        createInformationPage.inputToTaxCode(taxCode);
        createInformationPage.inputToIdCard(idCard);
        createInformationPage.inputByPlaceholder(driver, "Ngày cấp", dateRange);
        createInformationPage.clickToSelectAddress();
        createInformationPage.clickToSelectCity();
        createInformationPage.clickToSelectDistrict();
        createInformationPage.clickToSelectWard();
        createInformationPage.inputByPlaceholder(driver, "Địa chỉ cụ thể", enterAddress);

        createInformationPage.scrollToBottomPage(driver);

        createInformationPage.inputByPlaceholder(driver, "Mã chiện - Phòng thị trường tạo", marketRoomCode);
        createInformationPage.inputByPlaceholder(driver, "Mã NPP - Phòng kế toán tạo", distributionRoomCode);
        createInformationPage.inputByPlaceholder(driver, "Thời gian vào", timeIn);
        createInformationPage.inputByPlaceholder(driver, "Diện tích kho", warehouseArea);
        createInformationPage.inputToWarehouseArea(warehouseArea);
        createInformationPage.inputToLabor(labor);
        createInformationPage.selectItemInCustomDropdown(driver, homePageUI.BUSINESS_MODEL_TEXT, homePageUI.BUSINESS_MODEL_VALUE, businessModel);

        createInformationPage.clickToInputRegion();
        createInformationPage.selectItemInCustomDropdown(driver, homePageUI.REGION_INPUT_TEXT, homePageUI.REGION_VALUE, region);
        createInformationPage.clickToInputArea();
        createInformationPage.selectItemInCustomDropdown(driver, homePageUI.AREA_INPUT_TEXT, homePageUI.AREA_VALUE, area);

        createAccountDistributorPage = createInformationPage.clickNextButton();
        assertTrue(createAccountDistributorPage.isCreateUserTextDisplayed());

        createAccountDistributorPage.inputToAccountDistributor(accountDistributor);
        createAccountDistributorPage.inputToPassWordDistributor(passwordDistributor);
        createAccountDistributorPage.inputToEmailDistributor(emailDistributor);

        createAccountDistributorPage.clickCreateButton();
        accountManagementPage = createAccountDistributorPage.clickToBackCreateDistributorPageButton();
        assertTrue(accountManagementPage.representativeDisplayed(representative), representative);
    }

    @AfterClass(alwaysRun = true)
    public void afterClass() {
        closeBrowserAndDriver();
    }
}
