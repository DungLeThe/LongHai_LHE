package lhe.admin;

import commons.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.admin.AdminHomePageObject;
import pageObjects.admin.AdminLoginPageObject;
import pageObjects.admin.userManagement.CreateUserManagementPageObject;
import pageObjects.admin.userManagement.UserManagementHomePageObject;
import pageUIs.admin.AdminHomePageUI;
import reportConfig.ExtentTestManager;

import java.lang.reflect.Method;

import static commons.GlobalConstants.ADMIN_LOGIN;
import static org.testng.Assert.assertTrue;

public class UserManagement extends BaseTest {
    WebDriver driver;

    private String browserName;

    private AdminHomePageUI homePageUI;
    private AdminLoginPageObject loginPage;
    private AdminHomePageObject homePage;
    private UserManagementHomePageObject userManagementHomePage;
    private CreateUserManagementPageObject createUserManagementPage;

    @BeforeClass
    public void beforeClass() {
        browserName = "chrome";
        driver = getBrowserDriver(browserName, ADMIN_LOGIN);
        loginPage = new AdminLoginPageObject(driver);
        homePage = loginPage.goToAdminHomePage(driver);
    }

    public void goToHomPage() {
        homePage.openPageUrl(driver, ADMIN_LOGIN);
        homePage.clickButtonDragToTheLeft();
    }

    @Test
    public void TC_01_Cancel_User_Management_Page(Method method) {
        ExtentTestManager.startTest(method.getName(), "Cancel Order Page");
        goToHomPage();
        userManagementHomePage = homePage.clickUserManagementButton();
        createUserManagementPage = userManagementHomePage.clickAddUserManagementButton();
    }

    @AfterClass(alwaysRun = true)
    public void afterClass() {
//        closeBrowserAndDriver();
    }
}
