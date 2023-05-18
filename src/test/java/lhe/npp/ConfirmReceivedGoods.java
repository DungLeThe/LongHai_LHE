package lhe.npp;

import commons.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.npp.NppHomePageObject;
import pageObjects.npp.NppLoginPageObject;
import pageObjects.npp.order.OrderHomePageObject;
import reportConfig.ExtentTestManager;

import java.lang.reflect.Method;

import static commons.GlobalConstants.NPP_LOGIN;
import static commons.GlobalConstants.PROJECT_PATH;

public class ConfirmReceivedGoods extends BaseTest {
    private String browserName, productImage;
    private NppHomePageObject nppHomePage;
    private NppLoginPageObject nppLoginPage;
    private OrderHomePageObject orderHomePage;

    @BeforeClass
    public void beforeClass() {
        browserName = "chrome";
        nppLoginPage = new NppLoginPageObject(NPP_LOGIN);
        nppHomePage = nppLoginPage.goToNppHomePage();
        productImage = PROJECT_PATH + "\\uploadFiles\\ProductImage.jpg";
    }

    public void goToNppHomePage() {
        nppHomePage.openPageUrl(NPP_LOGIN);
        nppHomePage.dragToLeft();
    }

    @Test
    public void TC_01_ConfirmReceivedGoods(Method method) {
        ExtentTestManager.startTest(method.getName(), "Go To Npp Home Page");
        goToNppHomePage();
        orderHomePage = nppHomePage.clickOrderButton();
        orderHomePage.clickInProgressTab();
        orderHomePage.clickViewOrderDetailsButton();
        orderHomePage.clickConfirmReceivedButton();
        orderHomePage.inputNoteInReceivedPopup();
        orderHomePage.inputImage(productImage);
        orderHomePage.clickConfirmReceivedButtonFromPopup();
    }
}
