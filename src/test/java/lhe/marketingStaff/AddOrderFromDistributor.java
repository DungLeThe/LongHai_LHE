package lhe.marketingStaff;

import commons.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.marketingStaff.MarketingStaffHomePageObject;
import pageObjects.marketingStaff.MarketingStaffLoginPageObject;
import pageObjects.marketingStaff.order.AddOrderFromDistributorPageObject;
import pageObjects.marketingStaff.order.ListProductsPageObject;
import pageObjects.marketingStaff.order.OrderHomePageObject;
import reportConfig.ExtentTestManager;

import java.lang.reflect.Method;

import static commons.GlobalConstants.MARKETING_STAFF_LOGIN;
import static org.testng.AssertJUnit.assertTrue;

public class AddOrderFromDistributor extends BaseTest {
    WebDriver driver;

    private String browserName;

    private MarketingStaffLoginPageObject marketingStaffLoginPage;
    private MarketingStaffHomePageObject marketingStaffHomePage;
    private OrderHomePageObject orderHomePage;
    private AddOrderFromDistributorPageObject addOrderFromDistributorPage;
    private ListProductsPageObject listProductsPage;
    private String product, numberOfBoxes, numberOfBags;

    @BeforeClass
    public void beforeClass() {
        browserName = "chrome";
        driver = getBrowserDriver(browserName, MARKETING_STAFF_LOGIN);
        marketingStaffLoginPage = new MarketingStaffLoginPageObject(driver);
        marketingStaffHomePage = marketingStaffLoginPage.goToMarketingStaffHomePage(driver);

        product = "Thạch rau câu phong cách Nhật Bản Kimiko 990g";
        numberOfBoxes = "3";
        numberOfBags = "3";
    }

    public void goToMarketingStaffHomePage() {
        marketingStaffHomePage.openPageUrl(driver, MARKETING_STAFF_LOGIN);
    }

    @Test
    public void TC_01_Cancel_Order_Page(Method method) {
        ExtentTestManager.startTest(method.getName(), "Cancel Order Page");
        goToMarketingStaffHomePage();
        orderHomePage = marketingStaffHomePage.clickOrderButton();
        addOrderFromDistributorPage = orderHomePage.clickAddOrderFromDistributor();
        listProductsPage = addOrderFromDistributorPage.clickAddOrderButton();
        addOrderFromDistributorPage = listProductsPage.clickCancelAddOrderButton();
    }

    @Test
    public void TC_02_Cancel_Popup_Select_Product(Method method) {
        ExtentTestManager.startTest(method.getName(), "Cancel Order Page");
        goToMarketingStaffHomePage();
        orderHomePage = marketingStaffHomePage.clickOrderButton();
        addOrderFromDistributorPage = orderHomePage.clickAddOrderFromDistributor();
        listProductsPage = addOrderFromDistributorPage.clickAddOrderButton();
        listProductsPage.clickChooseProductButton();
        listProductsPage.clickCancelChooseProductButton();
        assertTrue(listProductsPage.isChooseProductButtonDisplayed());
    }

    @Test
    public void TC_03_Choose_Product(Method method) {
        ExtentTestManager.startTest(method.getName(), "Choose Product Success");
        goToMarketingStaffHomePage();
        orderHomePage = marketingStaffHomePage.clickOrderButton();
        addOrderFromDistributorPage = orderHomePage.clickAddOrderFromDistributor();
        listProductsPage = addOrderFromDistributorPage.clickAddOrderButton();
        listProductsPage.clickChooseProductButton();
        listProductsPage.inputSearchProduct(product);
        listProductsPage.dragAndDropIcon();
        listProductsPage.clickTextboxChooseProduct();
        listProductsPage.clickAddNewProductButton();
        listProductsPage.clickAddUnitIcon();
        listProductsPage.inputNumberOfBoxes(numberOfBoxes);
        listProductsPage.inputNumberOfBags(numberOfBags);
        listProductsPage.clickConfirmButton();
        listProductsPage.clickDetailOrderButton();
    }

    @AfterClass(alwaysRun = true)
    public void afterClass() {
        closeBrowserAndDriver();
    }
}
