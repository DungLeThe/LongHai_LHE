package lhe.warehouse;

import com.aventstack.extentreports.Status;
import commons.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.warehouse.WareHouseHomePageObject;
import pageObjects.warehouse.WareHouseLoginPageObject;
import reportConfig.ExtentTestManager;

import java.lang.reflect.Method;

import static commons.GlobalConstants.WARE_HOUSE_LOGIN;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class WareHouseLogin extends BaseTest {

    private String account, password, accountInvalid, passwordInvalid;
    private String browserName;

    private WareHouseLoginPageObject loginPage;
    private WareHouseHomePageObject homePage;

    @BeforeClass
    public void beforeClass() {
        browserName = "chrome";
        loginPage = new WareHouseLoginPageObject(WARE_HOUSE_LOGIN);
        homePage = new WareHouseHomePageObject();
        account = "kho.lhe";
        accountInvalid = "hoangtest";
        password = "lhe@1234";
        passwordInvalid = "hoangtest@11";
    }

    @Test
    public void TC_01_Login_Empty_Data(Method method) {
        ExtentTestManager.startTest(method.getName(), "Login Empty Data");
        ExtentTestManager.getTest().log(Status.INFO, "Login - Step 01: Click Account Textbox");
        loginPage.clickToAccountTextbox();

        ExtentTestManager.getTest().log(Status.INFO, "Login - Step 02: Click Password Textbox");
        loginPage.clickToPasswordTextbox();

        ExtentTestManager.getTest().log(Status.INFO, "Login - Step 03: Click Account Textbox again");
        loginPage.clickToAccountTextbox();

        ExtentTestManager.getTest().log(Status.INFO, "Login - Step 04: Verify Error Message At Account Textbox");
        assertEquals(loginPage.getErrorMessageAtAccountTextbox(), "Bạn cần điền vào mục này");

        ExtentTestManager.getTest().log(Status.INFO, "Login - Step 05: Verify Error Message At Password Textbox");
        assertEquals(loginPage.getErrorMessageAtPassworkTextbox(), "Bạn cần điền vào mục này");
    }

    @Test
    public void TC_02_Login_Invalid() {
        loginPage.inputToAccountTextbox(accountInvalid);
        loginPage.inputToPasswordTextbox(passwordInvalid);
        loginPage.clickToEyeIcon();
        loginPage.clickToLoginButton();
        loginPage.getErrorTextModal();
        assertEquals(loginPage.getErrorTextModal(), "Sai tên hoặc sai mật khẩu");
        loginPage.closeErrorPopup();
    }

    @Test
    public void TC_03_Login_Valid() {
        loginPage.openLoginPage();
        loginPage.inputToAccountTextbox(account);
        loginPage.inputToPasswordTextbox(password);
        loginPage.clickToLoginButton();
        assertTrue(loginPage.loginSuccessMark());
    }
}