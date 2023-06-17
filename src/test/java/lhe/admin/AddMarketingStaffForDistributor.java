package lhe.admin;

import commons.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.admin.AdminHomePageObject;
import pageObjects.admin.AdminLoginPageObject;
import pageObjects.admin.distributorManagement.DetailDistributorPageObject;
import pageObjects.admin.distributorManagement.DetailUserPageObject;
import pageObjects.admin.distributorManagement.DistributorManagementPageObject;
import pageObjects.admin.userManagement.CreateAccountMarketingStaffPageObject;
import pageObjects.admin.userManagement.CreateMarketingStaffPageObject;
import pageObjects.admin.userManagement.CreateUserManagementPageObject;
import pageObjects.admin.userManagement.UserManagementHomePageObject;
import pageUIs.admin.AdminHomePageUI;
import reportConfig.ExtentTestManager;

import java.lang.reflect.Method;

import static commons.BasePage.getRandomIntEightNumber;
import static commons.BasePage.getRandomString;
import static commons.GlobalConstants.ADMIN_LOGIN;

public class AddMarketingStaffForDistributor extends BaseTest {
    WebDriver driver;

    private String browserName;

    private AdminHomePageUI homePageUI;
    private AdminLoginPageObject loginPage;
    private AdminHomePageObject homePage;
    private UserManagementHomePageObject userManagementHomePage;
    private CreateUserManagementPageObject createUserManagementPage;
    private CreateMarketingStaffPageObject createMarketingStaffPage;
    private CreateAccountMarketingStaffPageObject createAccountMarketingStaffPage;
    private DetailUserPageObject detailUserPage;
    private DistributorManagementPageObject distributorPage;
    private DetailDistributorPageObject detailDistributorPage;

    private String name, gender, phone, maritalStatus, dateOfBirth, idCard, dateRange,
            issuedBy, address, position, region, area, nationality, nation,
            timeIn, account, password, passwordShort, passwordMissNumber, passwordMissSpecial, email, emailInvalid;

    @BeforeClass
    public void beforeClass() {
        browserName = "chrome";
        loginPage = new AdminLoginPageObject(ADMIN_LOGIN);
        homePage = loginPage.goToAdminHomePage();

        name = "Test" + getRandomString();
        gender = "Nam";
        phone = "09" + getRandomIntEightNumber();
        maritalStatus = "Độc thân";
        dateOfBirth = "2011-01-01";
        idCard = "0380" + getRandomIntEightNumber();
        dateRange = "2011-01-01";
        issuedBy = "Ha Noi";
        address = "Cau Giay, Ha Noi";
        position = "Trưởng phòng thị trường";
        region = "Vùng 1";
        area = "Khu vực 11";
        nationality = "Việt Nam";
        nation = "Kinh";
        timeIn = "2011-01-01";
        passwordShort = "test";
        passwordMissNumber = "LongHaiTest@";
        passwordMissSpecial = "LongHaiTest123";
        emailInvalid = "LongHaiTest";
        account = "LHETest" + getRandomIntEightNumber();
        password = "LHETest@123";
        email = "LHETest" + getRandomIntEightNumber() + "@gmail.com";
    }

    public void goToHomePage() {
        homePage.openPageUrl(ADMIN_LOGIN);
        homePage.clickButtonDragToTheLeft();
    }

    @Test
    public void TC_01_Add_Marketing_Staff_For_Distributor(Method method) {
        ExtentTestManager.startTest(method.getName(), "Add Marketing Staff For Distributor");
        goToHomePage();
        userManagementHomePage = homePage.clickUserManagementButton();
        createUserManagementPage = userManagementHomePage.clickAddUserManagementButton();
        createMarketingStaffPage = createUserManagementPage.clickAddMarketingStaff();
        createMarketingStaffPage.inputToName(name);
        createMarketingStaffPage.inputToPhone(phone);
        createMarketingStaffPage.inputToGender(gender);
        createMarketingStaffPage.clickToValueGender();
        createMarketingStaffPage.inputToDateOfBirth(dateOfBirth);
        createMarketingStaffPage.inputToIdCard(idCard);
        createMarketingStaffPage.inputToDateRange(dateRange);
        createMarketingStaffPage.inputToIssuedBy(issuedBy);
        createMarketingStaffPage.inputToAddress(address);
        createMarketingStaffPage.inputToTimeIn(timeIn);
        createMarketingStaffPage.clickNextMarketingStaffButton();

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

        homePage = userManagementHomePage.clickGoToAdminHomePageIcon();
        homePage.clickButtonDragToTheLeft();
        distributorPage = homePage.clickDistributorManagementButton();
        detailDistributorPage = distributorPage.clickViewDetailDistributorButton();
        detailDistributorPage.clickStaffTab();
        detailDistributorPage.clickAddNewStaffButton();
        detailDistributorPage.dragAndDropIcon();
        detailDistributorPage.inputSearchStaff(name);
        detailDistributorPage.clickSelectStaffCheckbox(name);
        detailDistributorPage.clickAddStaffButtonInModal();
        detailDistributorPage.clickCloseModalButton();
    }

}
