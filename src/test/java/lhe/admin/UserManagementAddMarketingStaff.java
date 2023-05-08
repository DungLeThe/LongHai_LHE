package lhe.admin;

import commons.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.admin.AdminHomePageObject;
import pageObjects.admin.AdminLoginPageObject;
import pageObjects.admin.distributorManagement.CreateAccountDistributorPageObject;
import pageObjects.admin.distributorManagement.CreateInformationDistributorPageObject;
import pageObjects.admin.userManagement.CreateUserManagementPageObject;
import pageObjects.admin.userManagement.UserManagementHomePageObject;
import pageUIs.admin.AdminHomePageUI;
import reportConfig.ExtentTestManager;

import java.lang.reflect.Method;

import static commons.BasePage.getRandomInt;
import static commons.BasePage.getRandomString;
import static commons.GlobalConstants.ADMIN_LOGIN;
import static org.testng.Assert.assertTrue;

public class UserManagementAddMarketingStaff extends BaseTest {
    WebDriver driver;

    private String browserName;

    private AdminHomePageUI homePageUI;
    private AdminLoginPageObject loginPage;
    private AdminHomePageObject homePage;
    private UserManagementHomePageObject userManagementHomePage;
    private CreateUserManagementPageObject createUserManagementPage;
    private CreateInformationDistributorPageObject createInformationDistributorPage;
    private CreateAccountDistributorPageObject createAccountDistributorPage;
    private String representative, phone, taxCode, idCard, dateRange, issuedBy, enterAddress, region,
            area, businessModel, warehouseArea, labor, timeIn, distributionRoomCode, marketRoomCode,
            accountDistributor, passwordDistributor, emailDistributor;

    @BeforeClass
    public void beforeClass() {
        browserName = "chrome";
        driver = getBrowserDriver(browserName, ADMIN_LOGIN);
        loginPage = new AdminLoginPageObject(driver);
        homePage = loginPage.goToAdminHomePage(driver);

        representative = "LHETest" + getRandomString();
        phone = "098765" + getRandomInt();
        taxCode = "01234" + getRandomInt();
        idCard = "0123456" + getRandomInt();
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
        passwordDistributor = "LHETest@123";
    }

    public void goToHomPage() {
        homePage.openPageUrl(driver, ADMIN_LOGIN);
        homePage.clickButtonDragToTheLeft();
    }

    @Test
    public void TC_01_Add_Marketing_Staff(Method method) {
        ExtentTestManager.startTest(method.getName(), "Add Marketing Staff");
        goToHomPage();
        userManagementHomePage = homePage.clickUserManagementButton();
        createUserManagementPage = userManagementHomePage.clickAddUserManagementButton();
        createInformationDistributorPage = createUserManagementPage.clickAddDistributorManagement();
    }

    @AfterClass(alwaysRun = true)
    public void afterClass() {
//        closeBrowserAndDriver();
    }
}
