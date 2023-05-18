package lhe.npp;
import commons.BaseTest;
import org.testng.Assert;
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
    private String browserName;
    private NppHomePageObject nppHomePage;
    private NppLoginPageObject nppLoginPage;
    private CreateOrderPageObject addOrderPage;
    private OrderHomePageObject orderHomePage;

    @BeforeClass
    public void beforeClass() {
        browserName = "chrome";
        nppLoginPage = new NppLoginPageObject(NPP_LOGIN);
        nppHomePage = nppLoginPage.goToNppHomePage();
    }

    public void goToNppHomePage() {
        nppHomePage.openPageUrl(NPP_LOGIN);
        nppHomePage.dragToLeft();
    }

    @Test
    public void TC_01_AddOrderSuccessfully(Method method) {
        ExtentTestManager.startTest(method.getName(), "Add Order");
        goToNppHomePage();
        orderHomePage = nppHomePage.clickOrderButton();
        addOrderPage = orderHomePage.createOrderButton();
        addOrderPage.inputNote();
        addOrderPage.waitForLoadingItemInvisible();
        addOrderPage.dragAndDropIcon();
        addOrderPage.searchProduct();
        addOrderPage.waitForLoadingItemInvisible();
        addOrderPage.inputSelectProductCheckbox();
        addOrderPage.clickConfirmOrder();
        addOrderPage.getTextFromSuccessPopup();
        Assert.assertEquals(addOrderPage.getTextFromSuccessPopup(), "Bạn đã tạo đơn nhập hàng thành công");
    }

    @Test
    public void TC_02_AddOrderSuccessThenViewOrderDetail(Method method) {
        ExtentTestManager.startTest(method.getName(), "Add Order Then View Order Detail");
        goToNppHomePage();
        orderHomePage = nppHomePage.clickOrderButton();
        addOrderPage = orderHomePage.createOrderButton();
        addOrderPage.inputNote();
        addOrderPage.waitForLoadingItemInvisible();
        addOrderPage.dragAndDropIcon();
        addOrderPage.searchProduct();
        addOrderPage.waitForLoadingItemInvisible();
        addOrderPage.inputSelectProductCheckbox();
        addOrderPage.clickConfirmOrder();
        addOrderPage.clickOnOrderDetail();
    }

    @Test
    public void TC_03_AddOrderSuccessThenViewOrderList(Method method) {
        ExtentTestManager.startTest(method.getName(), "Add Order Then View Order List");
        goToNppHomePage();
        orderHomePage = nppHomePage.clickOrderButton();
        addOrderPage = orderHomePage.createOrderButton();
        addOrderPage.inputNote();
        addOrderPage.waitForLoadingItemInvisible();
        addOrderPage.dragAndDropIcon();
        addOrderPage.searchProduct();
        addOrderPage.waitForLoadingItemInvisible();
        addOrderPage.inputSelectProductCheckbox();
        addOrderPage.clickConfirmOrder();
        addOrderPage.clickOnOrderList();
    }
}