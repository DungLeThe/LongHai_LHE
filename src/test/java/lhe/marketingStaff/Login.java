package lhe.marketingStaff;

import com.aventstack.extentreports.Status;
import commons.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.marketingStaff.MarketingStaffHomePageObject;
import pageObjects.marketingStaff.MarketingStaffLoginPageObject;
import reportConfig.ExtentTestManager;

import java.lang.reflect.Method;

import static commons.GlobalConstants.*;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class Login extends BaseTest {

    private String account, password, accountInvalid, passwordInvalid;
    private String browserName;

    private MarketingStaffLoginPageObject marketingStaffLoginPage;
    private MarketingStaffHomePageObject marketingStaffHomePage;

    @BeforeClass
    public void beforeClass() {
        browserName = "chrome";
        marketingStaffLoginPage = new MarketingStaffLoginPageObject(MARKETING_STAFF_LOGIN);
        marketingStaffHomePage = new MarketingStaffHomePageObject();
        account = MARKETING_STAFF_ACCOUNT;
        accountInvalid = "dungtest";
        password = MARKETING_STAFF_PASSWORD;
        passwordInvalid = "dungtest@11";
    }

    @Test
    public void TC_01_Login_Empty_Data(Method method) {
        ExtentTestManager.startTest(method.getName(), "Login Empty Data");
        ExtentTestManager.getTest().log(Status.INFO, "Login - Step 01: Click Account Textbox");
        marketingStaffLoginPage.clickToAccountTextbox();

        ExtentTestManager.getTest().log(Status.INFO, "Login - Step 02: Click Password Textbox");
        marketingStaffLoginPage.clickToPasswordTextbox();

        ExtentTestManager.getTest().log(Status.INFO, "Login - Step 03: Click Account Textbox again");
        marketingStaffLoginPage.clickToAccountTextbox();

        ExtentTestManager.getTest().log(Status.INFO, "Login - Step 04: Verify Error Message At Account Textbox");
        assertEquals(marketingStaffLoginPage.getErrorMessageAtAccountTextbox(), "Bạn cần điền vào mục này");

        ExtentTestManager.getTest().log(Status.INFO, "Login - Step 05: Verify Error Message At Password Textbox");
        assertEquals(marketingStaffLoginPage.getErrorMessageAtPassworkTextbox(), "Bạn cần điền vào mục này");
    }

    @Test
    public void TC_02_Login_Invalid(Method method) {
        marketingStaffLoginPage.openLoginPage();

        ExtentTestManager.startTest(method.getName(), "Login Invalid Data");
        ExtentTestManager.getTest().log(Status.INFO, "Login - Step 01: Input Account Textbox");
        marketingStaffLoginPage.inputToAccountTextbox(accountInvalid);

        ExtentTestManager.getTest().log(Status.INFO, "Login - Step 02: Input Password Textbox");
        marketingStaffLoginPage.inputToPasswordTextbox(passwordInvalid);

        ExtentTestManager.getTest().log(Status.INFO, "Login - Step 03: Click Button Login");
        marketingStaffLoginPage.clickToLoginButton();

        ExtentTestManager.getTest().log(Status.INFO, "Login - Step 04: Verify Modal Confirm");
        assertTrue(marketingStaffLoginPage.isModalConfirmDisplayed());

    }

    @Test
    public void TC_03_Login_Success(Method method) {
        marketingStaffLoginPage.openLoginPage();

        ExtentTestManager.startTest(method.getName(), "Login Success");
        ExtentTestManager.getTest().log(Status.INFO, "Login - Step 01: Input Account Textbox");
        marketingStaffLoginPage.inputToAccountTextbox(account);

        ExtentTestManager.getTest().log(Status.INFO, "Login - Step 02: Input Password Textbox");
        marketingStaffLoginPage.inputToPasswordTextbox(password);

        ExtentTestManager.getTest().log(Status.INFO, "Login - Step 03: Click Icon Eye Slash");
        marketingStaffLoginPage.clickToIconEyeSlash();

        ExtentTestManager.getTest().log(Status.INFO, "Login - Step 04: Click Button Login");
        marketingStaffHomePage = marketingStaffLoginPage.clickToLoginButton();
    }
}
