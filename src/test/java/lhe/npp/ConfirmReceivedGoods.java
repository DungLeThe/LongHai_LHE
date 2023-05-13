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
public class ConfirmReceivedGoods extends BaseTest{
    private WebDriver driver;
    private String browserName;
    private NppHomePageObject nppHomePage;
    private NppLoginPageObject nppLoginPage;
    private OrderHomePageObject orderHomePage;

    @BeforeClass
    public void beforeClass() {
        browserName = "chrome";
        driver = getBrowserDriver(browserName, NPP_LOGIN);
        nppLoginPage = new NppLoginPageObject(driver);
        nppHomePage = nppLoginPage.goToNppHomePage(driver);
    }

    public void goToNppHomePage() {
        nppHomePage.openPageUrl(driver, NPP_LOGIN);
        nppHomePage.dragToLeft();
    }
    @Test
    public void TC_01_ConfirmReceivedGoods(Method method){
        ExtentTestManager.startTest(method.getName(), "Go To Npp Home Page");
        goToNppHomePage();
        orderHomePage = nppHomePage.clickOrderButton();
        orderHomePage.clickInProgressTab();
        orderHomePage.clickViewOrderDetailsButton();
        orderHomePage.clickConfirmReceivedButton();

    }
}
