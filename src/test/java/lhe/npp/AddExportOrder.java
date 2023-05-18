package lhe.npp;

import commons.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.npp.NppHomePageObject;
import pageObjects.npp.NppLoginPageObject;
import pageObjects.npp.order.CreateOrderPageObject;
import pageObjects.npp.order.OrderHomePageObject;
import pageUIs.npp.NppOrderPageUI;
import reportConfig.ExtentTestManager;

import java.lang.reflect.Method;

import static commons.GlobalConstants.NPP_LOGIN;
import static pageUIs.npp.NppOrderPageUI.MARK_POINT;

public class AddExportOrder extends BaseTest {
    private String browserName;
    private NppHomePageObject nppHomePage;
    private NppLoginPageObject nppLoginPage;
    private CreateOrderPageObject addExportOrder;
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
    public void TC_01_AddExportOrderSuccessfully(Method method) throws InterruptedException {
        ExtentTestManager.startTest(method.getName(), "Add Export Order");
        goToNppHomePage();
        orderHomePage = nppHomePage.clickOrderButton();
        addExportOrder = orderHomePage.clickExportOrderTab();
        addExportOrder.clickChooseProductFromWarehouseButton();
        addExportOrder.clickToWarehouseList();
        addExportOrder.chooseWarehouseValue();
        addExportOrder.clickToObjectList();
        addExportOrder.chooseObject();
        addExportOrder.clickToElement(NppOrderPageUI.SEARCH_MARKETING_STAFF);
        addExportOrder.clickToElement(NppOrderPageUI.MARKETING_STAFF_VALUE);
        addExportOrder.inputNote();
        addExportOrder.clickChooseProductFromWareHouseButton();
        addExportOrder.selectProductFromWareHouse();
        addExportOrder.clickToExportFromConsignmentButton();
        addExportOrder.inputExportAmount();
        addExportOrder.inputSingleAmount();
        addExportOrder.clickToElement(MARK_POINT);
        Thread.sleep(1000);
        addExportOrder.clickConfirmExportButton();
        addExportOrder.clickCreateExportOrderButton();
        addExportOrder.clickViewExportOrderDetail();
    }
}