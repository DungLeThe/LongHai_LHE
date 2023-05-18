package lhe.npp;

import commons.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.npp.NppHomePageObject;
import pageObjects.npp.NppLoginPageObject;
import pageObjects.npp.product.category.ProductPageObject;
import pageUIs.npp.NppCategoryPageUI;
import reportConfig.ExtentTestManager;

import java.lang.reflect.Method;

import static commons.GlobalConstants.NPP_LOGIN;

public class CreateCategory extends BaseTest {
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
    public void TC_01_View_And_Create_New_Category_Success(Method method) {
        ExtentTestManager.startTest(method.getName(), "Go To Npp Home Page");
        goToNppHomePage();
        nppProductPage = nppHomePage.clickProductButton();
        nppProductPage.clickViewCategoryButton();
        nppProductPage.createNewCategory();
        nppProductPage.inputCategoryName();
        nppProductPage.confirmCreateNewCategory();
    }

    @Test
    public void TC_02_DeleteCategory(Method method) {
        ExtentTestManager.startTest(method.getName(), "Go To Npp Home Page");
        goToNppHomePage();
        nppProductPage = nppHomePage.clickProductButton();
        nppProductPage.clickViewCategoryButton();
        nppProductPage.createNewCategory();
        nppProductPage.inputCategoryName();
        nppProductPage.confirmCreateNewCategory();
        nppProductPage.deleteCategory();
        nppProductPage.clickDeleteCategoryButton();
    }

    @Test
    public void TC_03_CreateNewCategoryWithoutInputName(Method method) {
        ExtentTestManager.startTest(method.getName(), "Go To Npp Home Page");
        goToNppHomePage();
        nppProductPage = nppHomePage.clickProductButton();
        nppProductPage.clickViewCategoryButton();
        nppProductPage.createNewCategory();
        nppProductPage.isElementEnable(NppCategoryPageUI.CONFIRM_CREATE_NEW_CATEGORY_BUTTON);
        System.out.println(nppProductPage.isElementEnable(NppCategoryPageUI.CONFIRM_CREATE_NEW_CATEGORY_BUTTON));

        Assert.assertFalse(nppProductPage.isElementEnable(NppCategoryPageUI.CONFIRM_CREATE_NEW_CATEGORY_BUTTON));
    }

    @Test
    public void TC_04_ConfigCategory(Method method) {
        ExtentTestManager.startTest(method.getName(), "Go To Npp Home Page");
        goToNppHomePage();
        nppProductPage = nppHomePage.clickProductButton();
        nppProductPage.clickViewCategoryButton();
        nppProductPage.clickConfigCategoryButton();
        nppProductPage.clickCategoryCheckbox();
        Assert.assertEquals(nppProductPage.numberOfCheckboxesIsSelected(), "Đã chọn (1)");
        System.out.println(nppProductPage.numberOfCheckboxesIsSelected());
    }
}