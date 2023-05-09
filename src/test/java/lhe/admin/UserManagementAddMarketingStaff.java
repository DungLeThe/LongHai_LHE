package lhe.admin;

import commons.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.admin.AdminHomePageObject;
import pageObjects.admin.AdminLoginPageObject;
import pageObjects.admin.distributorManagement.CreateMarketingStaffPageObject;
import pageObjects.admin.userManagement.CreateAccountMarketingStaffPageObject;
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

public class UserManagementAddMarketingStaff extends BaseTest {
    WebDriver driver;

    private String browserName;

    private AdminHomePageUI homePageUI;
    private AdminLoginPageObject loginPage;
    private AdminHomePageObject homePage;
    private UserManagementHomePageObject userManagementHomePage;
    private CreateUserManagementPageObject createUserManagementPage;
    private CreateMarketingStaffPageObject createMarketingStaffPage;
    private CreateAccountMarketingStaffPageObject createAccountMarketingStaffPage;

    private String name, nameInvalid, gender, phone, maritalStatus, dateOfBirth, idCard, dateRange,
            issuedBy, address, position, region, area, nationality, nation,
            timeIn, account, password, passwordShort, passwordMissNumber, passwordMissSpecial, email, emailInvalid;

    @BeforeClass
    public void beforeClass() {
        browserName = "chrome";
        driver = getBrowserDriver(browserName, ADMIN_LOGIN);
        loginPage = new AdminLoginPageObject(driver);
        homePage = loginPage.goToAdminHomePage(driver);

        name = "LHETest" + getRandomString();
        nameInvalid = "LHETest1";
        gender = "Nam";
        phone = "098765" + getRandomInt();
        maritalStatus = "Độc thân";
        dateOfBirth = "01/01/2000";
        idCard = "0123456" + getRandomInt();
        dateRange = "01/01/2011";
        issuedBy = "Ha Noi";
        address = "Cau Giay, Ha Noi";
        position = "Trưởng phòng thị trường";
        region = "Vùng 1";
        area = "Khu vực 11";
        nationality = "Việt Nam";
        nation = "Kinh";
        timeIn = "20/04/2020";
        passwordShort = "test";
        passwordMissNumber = "LongHaiTest@";
        passwordMissSpecial = "LongHaiTest123";
        emailInvalid = "LongHaiTest";
        account = "Account" + getRandomInt();
        password = "LHETest@123";
        email = "LongHaiTest" + getRandomInt() + "@gmail.com";
    }

    public void goToHomPage() {
        homePage.openPageUrl(driver, ADMIN_LOGIN);
        homePage.clickButtonDragToTheLeft();
    }

    @Test
    public void TC_01_Cancel_Marketing_Staff(Method method) {
        ExtentTestManager.startTest(method.getName(), "Cancel Marketing Staff");
        goToHomPage();
        userManagementHomePage = homePage.clickUserManagementButton();
        createUserManagementPage = userManagementHomePage.clickAddUserManagementButton();
        createMarketingStaffPage = createUserManagementPage.clickAddMarketingStaff();
        createUserManagementPage = createMarketingStaffPage.clickCancelMarketingStaffButton();
    }

    @Test
    public void TC_02_Add_Marketing_Staff_Empty_Data(Method method) {
        ExtentTestManager.startTest(method.getName(), "Add Marketing Staff Empty Data");
        goToHomPage();
        userManagementHomePage = homePage.clickUserManagementButton();
        createUserManagementPage = userManagementHomePage.clickAddUserManagementButton();
        createMarketingStaffPage = createUserManagementPage.clickAddMarketingStaff();
        createMarketingStaffPage.inputToName("");
        createMarketingStaffPage.inputToPhone("");
        createMarketingStaffPage.inputToDateOfBirth("");
        createMarketingStaffPage.inputToIdCard("");
        createMarketingStaffPage.inputToDateRange("");
        createMarketingStaffPage.inputToIssuedBy("");
        createMarketingStaffPage.inputToAddress("");
        createMarketingStaffPage.inputToTimeIn("");
        createMarketingStaffPage.clickNextMarketingStaffButton();

        assertEquals(createMarketingStaffPage.getErrorMessageName(), "Bạn cần điền vào mục này");
        assertEquals(createMarketingStaffPage.getErrorMessagePhone(), "Bạn cần điền vào mục này");
        assertEquals(createMarketingStaffPage.getErrorMessageDateOfBirth(), "Bạn cần điền vào mục này");
        assertEquals(createMarketingStaffPage.getErrorMessageIdCard(), "Bạn cần điền vào mục này");
        assertEquals(createMarketingStaffPage.getErrorMessageDateRange(), "Bạn cần điền vào mục này");
        assertEquals(createMarketingStaffPage.getErrorMessageIssuedBy(), "Bạn cần điền vào mục này");
        assertEquals(createMarketingStaffPage.getErrorMessageAddress(), "Bạn cần điền vào mục này");
    }

    @Test
    public void TC_03_Add_Marketing_Staff_Empty_Data_In_Dropdown_List(Method method) {
        ExtentTestManager.startTest(method.getName(), "Add Marketing Staff Empty Data In Dropdown List");
        goToHomPage();
        userManagementHomePage = homePage.clickUserManagementButton();
        createUserManagementPage = userManagementHomePage.clickAddUserManagementButton();
        createMarketingStaffPage = createUserManagementPage.clickAddMarketingStaff();
        createMarketingStaffPage.inputToName(name);
        createMarketingStaffPage.inputToPhone(phone);
        createMarketingStaffPage.inputToDateOfBirth(dateOfBirth);
        createMarketingStaffPage.inputToIdCard(idCard);
        createMarketingStaffPage.inputToDateRange(dateRange);
        createMarketingStaffPage.inputToIssuedBy(issuedBy);
        createMarketingStaffPage.inputToAddress(address);
        createMarketingStaffPage.inputToTimeIn(timeIn);
        createMarketingStaffPage.clickNextMarketingStaffButton();

        assertEquals(createMarketingStaffPage.getErrorMessageGender(), "Vui lòng chọn");
        createMarketingStaffPage.inputToGender(gender);
        createMarketingStaffPage.clickToValueGender();

        createMarketingStaffPage.clickNextMarketingStaffButton();
        assertEquals(createMarketingStaffPage.getErrorMessageMaritalStatus(), "Vui lòng chọn");
    }

    @Test
    public void TC_04_Add_Marketing_Staff_Success(Method method) {
        ExtentTestManager.startTest(method.getName(), "Add Marketing Staff Success");
        goToHomPage();
        userManagementHomePage = homePage.clickUserManagementButton();
        createUserManagementPage = userManagementHomePage.clickAddUserManagementButton();
        createMarketingStaffPage = createUserManagementPage.clickAddMarketingStaff();
        createMarketingStaffPage.inputToName(name);
        createMarketingStaffPage.inputToPhone(phone);
        createMarketingStaffPage.inputToDateOfBirth(dateOfBirth);
        createMarketingStaffPage.inputToIdCard(idCard);
        createMarketingStaffPage.inputToDateRange(dateRange);
        createMarketingStaffPage.inputToIssuedBy(issuedBy);
        createMarketingStaffPage.inputToAddress(address);
        createMarketingStaffPage.inputToTimeIn(timeIn);
        createMarketingStaffPage.clickNextMarketingStaffButton();
        createMarketingStaffPage.inputToGender(gender);
        createMarketingStaffPage.clickToValueGender();

        createMarketingStaffPage.clickNextMarketingStaffButton();
        createMarketingStaffPage.inputToMaritalStatus(maritalStatus);
        createMarketingStaffPage.clickToValueMaritalStatus();

        createMarketingStaffPage.inputToPosition(position);
        createMarketingStaffPage.clickToValuePosition();

        createMarketingStaffPage.inputToRegion(region);
        createMarketingStaffPage.clickToValueRegion();
        createMarketingStaffPage.inputToArea(area);
        createMarketingStaffPage.clickToValueArea();

        createMarketingStaffPage.inputToNationality(nationality);
        createMarketingStaffPage.clickToValueNationality();
        createMarketingStaffPage.inputToNation(nation);
        createMarketingStaffPage.clickToValueNation();
        createAccountMarketingStaffPage = createMarketingStaffPage.clickNextMarketingStaffButton();
        assertTrue(createAccountMarketingStaffPage.isAccountMarketingStaffTextDisplayed());
    }

    @Test
    public void TC_05_Add_Marketing_Staff_Account_Empty_Data(Method method) {
        ExtentTestManager.startTest(method.getName(), "Add Marketing Staff Account Empty Data");
        goToHomPage();
        userManagementHomePage = homePage.clickUserManagementButton();
        createUserManagementPage = userManagementHomePage.clickAddUserManagementButton();
        createMarketingStaffPage = createUserManagementPage.clickAddMarketingStaff();
        createMarketingStaffPage.inputToName(name);
        createMarketingStaffPage.inputToPhone(phone);
        createMarketingStaffPage.inputToDateOfBirth(dateOfBirth);
        createMarketingStaffPage.inputToIdCard(idCard);
        createMarketingStaffPage.inputToDateRange(dateRange);
        createMarketingStaffPage.inputToIssuedBy(issuedBy);
        createMarketingStaffPage.inputToAddress(address);
        createMarketingStaffPage.inputToTimeIn(timeIn);
        createMarketingStaffPage.clickNextMarketingStaffButton();
        createMarketingStaffPage.inputToGender(gender);
        createMarketingStaffPage.clickToValueGender();

        createMarketingStaffPage.clickNextMarketingStaffButton();
        createMarketingStaffPage.inputToMaritalStatus(maritalStatus);
        createMarketingStaffPage.clickToValueMaritalStatus();

        createMarketingStaffPage.inputToPosition(position);
        createMarketingStaffPage.clickToValuePosition();

        createMarketingStaffPage.inputToRegion(region);
        createMarketingStaffPage.clickToValueRegion();
        createMarketingStaffPage.inputToArea(area);
        createMarketingStaffPage.clickToValueArea();

        createMarketingStaffPage.inputToNationality(nationality);
        createMarketingStaffPage.clickToValueNationality();
        createMarketingStaffPage.inputToNation(nation);
        createMarketingStaffPage.clickToValueNation();
        createAccountMarketingStaffPage = createMarketingStaffPage.clickNextMarketingStaffButton();

        createAccountMarketingStaffPage.inputToAccountMarketingStaff("");
        createAccountMarketingStaffPage.inputToPassWordMarketingStaff("");
        createAccountMarketingStaffPage.inputToEmailMarketingStaff("");

        createAccountMarketingStaffPage.clickCreateMarketingStaffButton();

        assertEquals(createAccountMarketingStaffPage.getErrorMessageAccountMarketingStaff(), "Bạn cần điền vào mục này");
        assertEquals(createAccountMarketingStaffPage.getErrorMessagePassWordMarketingStaff(), "Bạn cần điền vào mục này");
        assertEquals(createAccountMarketingStaffPage.getErrorMessageEmailMarketingStaff(), "Bạn cần điền vào mục này");
        assertTrue(createAccountMarketingStaffPage.isModalErrorDisplayed());

        createAccountMarketingStaffPage.closeModalErrorButton();
    }

    @Test
    public void TC_06_Add_Marketing_Staff_Account_Invalid_Data(Method method) {
        ExtentTestManager.startTest(method.getName(), "Add Marketing Staff Account Invalid Data");
        goToHomPage();
        userManagementHomePage = homePage.clickUserManagementButton();
        createUserManagementPage = userManagementHomePage.clickAddUserManagementButton();
        createMarketingStaffPage = createUserManagementPage.clickAddMarketingStaff();
        createMarketingStaffPage.inputToName(name);
        createMarketingStaffPage.inputToPhone(phone);
        createMarketingStaffPage.inputToDateOfBirth(dateOfBirth);
        createMarketingStaffPage.inputToIdCard(idCard);
        createMarketingStaffPage.inputToDateRange(dateRange);
        createMarketingStaffPage.inputToIssuedBy(issuedBy);
        createMarketingStaffPage.inputToAddress(address);
        createMarketingStaffPage.inputToTimeIn(timeIn);
        createMarketingStaffPage.clickNextMarketingStaffButton();
        createMarketingStaffPage.inputToGender(gender);
        createMarketingStaffPage.clickToValueGender();

        createMarketingStaffPage.clickNextMarketingStaffButton();
        createMarketingStaffPage.inputToMaritalStatus(maritalStatus);
        createMarketingStaffPage.clickToValueMaritalStatus();

        createMarketingStaffPage.inputToPosition(position);
        createMarketingStaffPage.clickToValuePosition();

        createMarketingStaffPage.inputToRegion(region);
        createMarketingStaffPage.clickToValueRegion();
        createMarketingStaffPage.inputToArea(area);
        createMarketingStaffPage.clickToValueArea();

        createMarketingStaffPage.inputToNationality(nationality);
        createMarketingStaffPage.clickToValueNationality();
        createMarketingStaffPage.inputToNation(nation);
        createMarketingStaffPage.clickToValueNation();
        createAccountMarketingStaffPage = createMarketingStaffPage.clickNextMarketingStaffButton();

        createAccountMarketingStaffPage.inputToPassWordMarketingStaff(passwordShort);
        createAccountMarketingStaffPage.inputToEmailMarketingStaff(emailInvalid);
        assertEquals(createAccountMarketingStaffPage.getErrorMessagePassWordMarketingStaff(), "Cần ít nhất 8 ký tự");

        createAccountMarketingStaffPage.inputToPassWordMarketingStaff(passwordMissSpecial);
        assertEquals(createAccountMarketingStaffPage.getErrorMessageEmailMarketingStaff(), "Không đúng định dạng email");
        createAccountMarketingStaffPage.inputToEmailMarketingStaff(emailInvalid);
        assertEquals(createAccountMarketingStaffPage.getErrorMessagePassWordMarketingStaff(), "Cần chứa ít nhất 1 ký tự đặc biệt");

        createAccountMarketingStaffPage.inputToPassWordMarketingStaff(passwordMissNumber);
        createAccountMarketingStaffPage.inputToEmailMarketingStaff(emailInvalid);
        assertEquals(createAccountMarketingStaffPage.getErrorMessagePassWordMarketingStaff(), "Cần ít nhất 1 chữ số");
    }

    @Test
    public void TC_07_Add_Marketing_Staff_Account_Success(Method method) {
        ExtentTestManager.startTest(method.getName(), "Add Marketing Staff Account Success");
        goToHomPage();
        userManagementHomePage = homePage.clickUserManagementButton();
        createUserManagementPage = userManagementHomePage.clickAddUserManagementButton();
        createMarketingStaffPage = createUserManagementPage.clickAddMarketingStaff();
        createMarketingStaffPage.inputToName(name);
        createMarketingStaffPage.inputToPhone(phone);
        createMarketingStaffPage.inputToDateOfBirth(dateOfBirth);
        createMarketingStaffPage.inputToIdCard(idCard);
        createMarketingStaffPage.inputToDateRange(dateRange);
        createMarketingStaffPage.inputToIssuedBy(issuedBy);
        createMarketingStaffPage.inputToAddress(address);
        createMarketingStaffPage.inputToTimeIn(timeIn);
        createMarketingStaffPage.clickNextMarketingStaffButton();
        createMarketingStaffPage.inputToGender(gender);
        createMarketingStaffPage.clickToValueGender();

        createMarketingStaffPage.clickNextMarketingStaffButton();
        createMarketingStaffPage.inputToMaritalStatus(maritalStatus);
        createMarketingStaffPage.clickToValueMaritalStatus();

        createMarketingStaffPage.inputToPosition(position);
        createMarketingStaffPage.clickToValuePosition();

        createMarketingStaffPage.inputToRegion(region);
        createMarketingStaffPage.clickToValueRegion();
        createMarketingStaffPage.inputToArea(area);
        createMarketingStaffPage.clickToValueArea();

        createMarketingStaffPage.inputToNationality(nationality);
        createMarketingStaffPage.clickToValueNationality();
        createMarketingStaffPage.inputToNation(nation);
        createMarketingStaffPage.clickToValueNation();
        createAccountMarketingStaffPage = createMarketingStaffPage.clickNextMarketingStaffButton();

        createAccountMarketingStaffPage.inputToAccountMarketingStaff(account);
        createAccountMarketingStaffPage.inputToPassWordMarketingStaff(password);
        createAccountMarketingStaffPage.inputToEmailMarketingStaff(email);

        createAccountMarketingStaffPage.clickCreateMarketingStaffButton();
        userManagementHomePage = createAccountMarketingStaffPage.clickToUserManagementHomePageButton();
    }

    @AfterClass(alwaysRun = true)
    public void afterClass() {
//        closeBrowserAndDriver();
    }
}
