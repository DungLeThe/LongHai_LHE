package lhe.npp;

import commons.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.npp.NppHomePageObject;
import pageObjects.npp.NppLoginPageObject;
import pageObjects.npp.product.category.ProductPageObject;
import reportConfig.ExtentTestManager;

import java.lang.reflect.Method;

import static commons.GlobalConstants.NPP_LOGIN;

public class ProductListAndViewDetailProduct extends BaseTest {
    private String browserName;
    private NppHomePageObject nppHomePage;
    private NppLoginPageObject nppLoginPage;
    private ProductPageObject nppProductPage;

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
    public void TC_01_View_Product_List_And_Product_Detail(Method method) {
        ExtentTestManager.startTest(method.getName(), "View List and Product Detail");
        goToNppHomePage();
        nppProductPage = nppHomePage.clickProductButton();
        nppProductPage.clickViewProductDetail();
    }
}