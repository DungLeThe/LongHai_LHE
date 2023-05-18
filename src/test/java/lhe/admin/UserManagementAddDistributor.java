package lhe.admin;

import commons.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.admin.AdminHomePageObject;
import pageObjects.admin.AdminLoginPageObject;
import pageObjects.admin.distributorManagement.CreateAccountDistributorPageObject;
import pageObjects.admin.distributorManagement.CreateInformationDistributorPageObject;
import pageObjects.admin.distributorManagement.DetailUserPageObject;
import pageObjects.admin.userManagement.CreateUserManagementPageObject;
import pageObjects.admin.userManagement.UserManagementHomePageObject;
import pageUIs.admin.AdminHomePageUI;
import reportConfig.ExtentTestManager;

import java.lang.reflect.Method;

import static commons.BasePage.getRandomInt;
import static commons.BasePage.getRandomString;
import static commons.GlobalConstants.ADMIN_LOGIN;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class UserManagementAddDistributor extends BaseTest {

    private String browserName;
    private AdminLoginPageObject loginPage;
    private AdminHomePageObject homePage;
    private UserManagementHomePageObject userManagementHomePage;
    private CreateUserManagementPageObject createUserManagementPage;
    private CreateInformationDistributorPageObject createInformationDistributorPage;
    private CreateAccountDistributorPageObject createAccountDistributorPage;
    private DetailUserPageObject detailUserPage;
    private String representative, phone, taxCode, idCard, dateRange, issuedBy, enterAddress, region,
            area, businessModel, warehouseArea, labor, timeIn, distributionRoomCode, marketRoomCode,
            accountDistributor, passwordDistributor, emailDistributor;

    @BeforeClass
    public void beforeClass() {
        browserName = "chrome";
        loginPage = new AdminLoginPageObject(ADMIN_LOGIN);
        homePage = loginPage.goToAdminHomePage();

        representative = "LHETest" + getRandomString();
        phone = "09876" + getRandomInt();
        taxCode = "01234" + getRandomInt();
        idCard = "0380970" + getRandomInt();
        dateRange = "2011-01-01";
        issuedBy = "Ha Noi";
        enterAddress = "Cau Giay, Ha Noi";
        region = "Vùng 1";
        area = "Khu vực 11";
        businessModel = "Công ty";
        warehouseArea = "1000";
        labor = "20";
        timeIn = "2020-01-01";
        distributionRoomCode = "AD1";
        marketRoomCode = "AD1";
        accountDistributor = "Account" + getRandomInt();
        passwordDistributor = "LHETest@123";
        emailDistributor = "LongHaiTest" + getRandomInt() + "@gmail.com";
        passwordDistributor = "LHETest@123";
    }

    public void goToHomPage() {
        homePage.openPageUrl(ADMIN_LOGIN);
        homePage.clickButtonDragToTheLeft();
    }

    @Test
    public void TC_01_Add_Distributor_Management(Method method) {
        ExtentTestManager.startTest(method.getName(), "Add Distributor Management");
        goToHomPage();
        userManagementHomePage = homePage.clickUserManagementButton();
        createUserManagementPage = userManagementHomePage.clickAddUserManagementButton();
        createInformationDistributorPage = createUserManagementPage.clickAddDistributorManagement();

        createInformationDistributorPage.inputByPlaceholder("Nơi cấp", issuedBy);
        createInformationDistributorPage.inputByPlaceholder("Người đại diện", representative);
        createInformationDistributorPage.inputByPlaceholder("Số điện thoại", phone);

        createInformationDistributorPage.inputToTaxCode(taxCode);
        createInformationDistributorPage.inputToIdCard(idCard);
        createInformationDistributorPage.inputByPlaceholder("Ngày cấp", dateRange);
        createInformationDistributorPage.clickToSelectAddress();
        createInformationDistributorPage.clickToSelectCity();
        createInformationDistributorPage.clickToSelectDistrict();
        createInformationDistributorPage.clickToSelectWard();
        createInformationDistributorPage.inputByPlaceholder("Địa chỉ cụ thể", enterAddress);

        createInformationDistributorPage.scrollToBottomPage();

        createInformationDistributorPage.inputByPlaceholder("Mã chiện - Phòng thị trường tạo", marketRoomCode);
        createInformationDistributorPage.inputByPlaceholder("Mã NPP - Phòng kế toán tạo", distributionRoomCode);
        createInformationDistributorPage.inputByPlaceholder("Thời gian vào", timeIn);
        createInformationDistributorPage.inputByPlaceholder("Diện tích kho", warehouseArea);
        createInformationDistributorPage.inputToWarehouseArea(warehouseArea);
        createInformationDistributorPage.inputToLabor(labor);
        createInformationDistributorPage.selectItemInCustomDropdown(AdminHomePageUI.BUSINESS_MODEL_TEXT, AdminHomePageUI.BUSINESS_MODEL_VALUE, businessModel);

        createInformationDistributorPage.clickToInputRegion();
        createInformationDistributorPage.selectItemInCustomDropdown(AdminHomePageUI.REGION_INPUT_TEXT, AdminHomePageUI.REGION_VALUE, region);
        createInformationDistributorPage.clickToInputArea();
        createInformationDistributorPage.selectItemInCustomDropdown(AdminHomePageUI.AREA_INPUT_TEXT, AdminHomePageUI.AREA_VALUE, area);

        createAccountDistributorPage = createInformationDistributorPage.clickNextButton();
        assertTrue(createAccountDistributorPage.isCreateUserTextDisplayed());

        createAccountDistributorPage.inputToAccountDistributor(accountDistributor);
        createAccountDistributorPage.inputToPassWordDistributor(passwordDistributor);
        createAccountDistributorPage.inputToEmailDistributor(emailDistributor);

        createAccountDistributorPage.clickCreateButton();
        userManagementHomePage = createAccountDistributorPage.clickToBackCreateDistributorPageButton();
        assertTrue(userManagementHomePage.representativeDisplayed(representative), representative);
        userManagementHomePage.clickViewDetailAllDistributor();
        detailUserPage = userManagementHomePage.clickViewDetailNewDistributor();
        assertEquals(detailUserPage.getUserNameText(), representative);
        assertEquals(detailUserPage.getInfoDistributorText("Email"), emailDistributor);
        assertEquals(detailUserPage.getInfoDistributorText("CMT/CCCD"), idCard);
        assertEquals(detailUserPage.getInfoDistributorText("Ngày cấp"), dateRange);
        assertEquals(detailUserPage.getInfoDistributorText("Nơi cấp"), issuedBy);
        assertEquals(detailUserPage.getInfoDistributorText("Địa chỉ"), enterAddress);
        assertEquals(detailUserPage.getInfoDistributorText("Vùng"), region);
        assertEquals(detailUserPage.getInfoDistributorText("Khu vực"), area);
        assertEquals(detailUserPage.getInfoDistributorText("Diện tích kho"), warehouseArea);
        assertEquals(detailUserPage.getInfoDistributorText("Số lượng nhân công"), labor);
        assertEquals(detailUserPage.getInfoDistributorText("Ngày vào"), timeIn);
    }
}
