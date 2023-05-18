package lhe.admin;

import commons.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.admin.AdminHomePageObject;
import pageObjects.admin.AdminLoginPageObject;
import pageObjects.admin.product.CreateProductPageObject;
import pageObjects.admin.product.EditProductPageObject;
import pageObjects.admin.product.ProductDetailPageObject;
import pageObjects.admin.product.ProductHomePageObject;
import reportConfig.ExtentTestManager;

import java.lang.reflect.Method;

import static commons.BasePage.getRandomInt;
import static commons.GlobalConstants.ADMIN_LOGIN;
import static commons.GlobalConstants.PROJECT_PATH;
import static org.testng.Assert.assertTrue;
import static pageUIs.admin.AdminHomePageUI.ADD_ATTRIBUTE_BUTTON;
import static pageUIs.admin.AdminHomePageUI.EXISTING_ATTRIBUTE_DIV;

public class EditProduct extends BaseTest {
    private String browserName;
    private AdminLoginPageObject loginPage;
    private AdminHomePageObject homePage;
    private ProductHomePageObject productHomePage;
    private EditProductPageObject editProductPage;
    private ProductDetailPageObject productDetailPage;
    private CreateProductPageObject createProductPage;


    private String productName, productDescription, productImage, retailPrice,
            perBarrelPrice, numberOfProductsInOneBox, attributeName, attributeValue, productStatusActiveText, productStatusInactiveText;

    @BeforeClass
    public void beforeClass() {
        browserName = "chrome";
        loginPage = new AdminLoginPageObject(ADMIN_LOGIN);
        homePage = loginPage.goToAdminHomePage();

        productName = "Thạch rau câu" + getRandomInt();
        productDescription = "Thạch 900g";
        productImage = PROJECT_PATH + "\\uploadFiles\\ProductImage.jpg";
        retailPrice = "100000";
        perBarrelPrice = "50000";
        numberOfProductsInOneBox = "20";
        attributeName = "LHETest";
        attributeValue = "LHETest";
        productStatusActiveText = "Đang hoạt động";
        productStatusInactiveText = "Ngưng hoạt động";
    }

    public void goToHomPage() {
        homePage.openPageUrl(ADMIN_LOGIN);
        homePage.clickButtonDragToTheLeft();
    }

    @Test
    public void TC_01_Cancel_Edit_Product_Page(Method method) {
        ExtentTestManager.startTest(method.getName(), "Cancel Product Page");
        goToHomPage();
        productHomePage = homePage.clickProductButton();
        productDetailPage = productHomePage.clickViewProduct();
        editProductPage = productDetailPage.editProductPageButton();
        productDetailPage = editProductPage.clickCancelButton();
        assertTrue(productDetailPage.isProductDetailTextDisplayed());
    }

    @Test
    public void TC_02_Edit_Product(Method method) {
        ExtentTestManager.startTest(method.getName(), "Edit Product Page Success");
        goToHomPage();
        productHomePage = homePage.clickProductButton();
        productDetailPage = productHomePage.clickViewProduct();
        editProductPage = productDetailPage.editProductPageButton();

        editProductPage.clickChangeStatusLabel();
        editProductPage.scrollToElement(EXISTING_ATTRIBUTE_DIV);
        editProductPage.clickExistingAttribute();
        editProductPage.scrollToBottomPage();
        editProductPage.inputNewProperties(attributeValue);
        editProductPage.clickSaveProductButton();
        editProductPage.inputRetailPrice(retailPrice);
        editProductPage.inputPerBarrelPrice(perBarrelPrice);
        editProductPage.inputNumberOfProductsInOneBox(numberOfProductsInOneBox);
        editProductPage.clickSaveProductButton();

        productHomePage = editProductPage.clickCloseModalButton();
        assertTrue(productHomePage.isProductWareHouseTextDisplayed());
    }

    @Test
    public void TC_03_Edit_Status_Product(Method method) {
        ExtentTestManager.startTest(method.getName(), "Edit Status Product");
        goToHomPage();
        productHomePage = homePage.clickProductButton();
        createProductPage = productHomePage.clickAddNewProductButton();
        createProductPage.clickToCategory();
        createProductPage.clickSelectCategory();
        createProductPage.inputDynamic("Nhập tên sản phẩm", productName);
        createProductPage.inputProductDescription(productDescription);
        createProductPage.inputProductImage(productImage);
        createProductPage.inputDynamic("Nhập giá bán lẻ", retailPrice);
        createProductPage.inputDynamic("Nhập giá theo thùng", perBarrelPrice);
        createProductPage.inputDynamic("Nhập số lượng sản phẩm trong 1 thùng", numberOfProductsInOneBox);
        createProductPage.scrollToElement(ADD_ATTRIBUTE_BUTTON);
        createProductPage.clickAddAttributeButton();
        createProductPage.inputDynamic("Nhập tên thuộc tính", attributeName);
        createProductPage.inputDynamic("Nhập giá trị thuộc tính", attributeValue);
        createProductPage.clickDeleteAttributeButton();
        createProductPage.clickAddAttributeButton();
        createProductPage.inputDynamic("Nhập tên thuộc tính", attributeName);
        createProductPage.inputDynamic("Nhập giá trị thuộc tính", attributeValue);
        createProductPage.clickCreateNewButton();
        productHomePage = createProductPage.clickCloseModalButton();

        productDetailPage = productHomePage.clickViewProduct();
        editProductPage = productDetailPage.editProductPageButton();
        editProductPage.clickChangeStatusLabel();
        editProductPage.clickSaveProductButton();
        productHomePage = editProductPage.clickCloseModalButton();

        assertTrue(productHomePage.isProductStatusInactiveTextDisplayed(productStatusInactiveText));
        productHomePage.clickInactiveButton();
        assertTrue(productHomePage.productNameDisplayed(productName), productName);
        assertTrue(productHomePage.isProductStatusInactiveTextDisplayed(productStatusInactiveText));

        productDetailPage = productHomePage.clickViewProduct();
        editProductPage = productDetailPage.editProductPageButton();
        editProductPage.clickChangeStatusLabel();
        editProductPage.clickSaveProductButton();
        productHomePage = editProductPage.clickCloseModalButton();
        assertTrue(productHomePage.isProductStatusActiveTextDisplayed(productStatusActiveText));
        productHomePage.clickActiveButton();
        assertTrue(productHomePage.productNameDisplayed(productName), productName);
        assertTrue(productHomePage.isProductStatusActiveTextDisplayed(productStatusActiveText));
    }
}
