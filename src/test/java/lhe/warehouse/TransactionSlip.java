package lhe.warehouse;

import commons.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.warehouse.WareHouseHomePageObject;
import pageObjects.warehouse.WareHouseLoginPageObject;
import reportConfig.ExtentTestManager;

import java.lang.reflect.Method;

import static commons.GlobalConstants.WARE_HOUSE_LOGIN;

public class TransactionSlip extends BaseTest {
    private String browserName;
    private WareHouseHomePageObject whHomePage;
    private WareHouseLoginPageObject whLoginPage;
    private WareHouseHomePageObject whTransactionSlipPage;

    @BeforeClass
    public void beforeClass() {
        browserName = "chrome";
        whLoginPage = new WareHouseLoginPageObject(WARE_HOUSE_LOGIN);
        whHomePage = whLoginPage.goToWareHouseHomePage();
    }

    public void goToWareHouseHomePage() {
        whHomePage.openPageUrl(WARE_HOUSE_LOGIN);
    }

    @Test
    public void TC_01_ViewExportNoteList(Method method) {
        ExtentTestManager.startTest(method.getName(), "Go To Ware House Home Page");
        goToWareHouseHomePage();
        whTransactionSlipPage = whHomePage.clickTransactionSlipButton();
        whTransactionSlipPage.clickExportNote();
    }
}
