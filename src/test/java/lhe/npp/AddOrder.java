package lhe.npp;

import commons.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.npp.NppHomePageObject;
import pageObjects.npp.NppLoginPageObject;
import pageObjects.npp.order.CreateOrderPageObject;
import pageObjects.npp.order.OrderHomePageObject;
import reportConfig.ExtentTestManager;

import java.lang.reflect.Method;

import static commons.GlobalConstants.NPP_LOGIN;

public class AddOrder extends BaseTest {
    private WebDriver driver;
    private String browserName;
    private NppHomePageObject nppHomePage;
    private NppLoginPageObject nppLoginPage;
    private CreateOrderPageObject addOrderPage;
    private OrderHomePageObject orderHomePage;

    @BeforeClass
    public void beforeClass() {
        browserName = "chrome";
        driver = getBrowserDriver(browserName, NPP_LOGIN);
        nppLoginPage = new NppLoginPageObject(driver);
        nppHomePage = nppLoginPage.goToNppHomePage(driver);
    }

    public void goToNppHomPage() {
        nppHomePage.openPageUrl(driver, NPP_LOGIN);
        nppHomePage.dragToLeft();
    }

    @Test
    public void TC_01_AddOrderSuccessfully(Method method) {
        ExtentTestManager.startTest(method.getName(), "Go To Npp Home Page");
        goToNppHomPage();
        orderHomePage = nppHomePage.clickOrderButton();
        addOrderPage = orderHomePage.CreateOrderButton();
        addOrderPage.inputNote();
        addOrderPage.waitForLoadingItemInvisible(driver);
        addOrderPage.dragAndDropIcon();
        addOrderPage.searchProduct();
        addOrderPage.waitForLoadingItemInvisible(driver);
        addOrderPage.inputSelectProductCheckbox();
        addOrderPage.clickConfirmOrder();
        addOrderPage.getTextFromSuccessPopup();
        Assert.assertEquals(addOrderPage.getTextFromSuccessPopup(), "Bạn đã tạo đơn nhập hàng thành công");


    }


    @Test
    public void TC_02_AddOrderSuccessThenViewOrderDetail(Method method) {
        ExtentTestManager.startTest(method.getName(), "Go To Npp Home Page");
        goToNppHomPage();
        orderHomePage = nppHomePage.clickOrderButton();
        addOrderPage = orderHomePage.CreateOrderButton();
        addOrderPage.inputNote();
        addOrderPage.waitForLoadingItemInvisible(driver);
        addOrderPage.dragAndDropIcon();
        addOrderPage.searchProduct();
        addOrderPage.waitForLoadingItemInvisible(driver);
        addOrderPage.inputSelectProductCheckbox();
        addOrderPage.clickConfirmOrder();
        addOrderPage.clickOnOrderDetail();
    }

    @Test
    public void TC_03_AddOrderSuccessThenViewOrderList(Method method) {
        ExtentTestManager.startTest(method.getName(), "Go To Npp Home Page");
        goToNppHomPage();
        orderHomePage = nppHomePage.clickOrderButton();
        addOrderPage = orderHomePage.CreateOrderButton();
        addOrderPage.inputNote();
        addOrderPage.waitForLoadingItemInvisible(driver);
        addOrderPage.dragAndDropIcon();
        addOrderPage.searchProduct();
        addOrderPage.waitForLoadingItemInvisible(driver);
        addOrderPage.inputSelectProductCheckbox();
        addOrderPage.clickConfirmOrder();
        addOrderPage.clickOnOrderList();


    }

    @AfterClass(alwaysRun = true)
    public void afterClass() {
        closeBrowserAndDriver();
    }
}