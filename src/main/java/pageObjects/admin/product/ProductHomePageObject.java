package pageObjects.admin.product;

import commons.BasePage;
import pageUIs.admin.AdminHomePageUI;

public class ProductHomePageObject extends BasePage {

    public ProductHomePageObject() {
    }

    public boolean isProductWareHouseTextDisplayed() {
        waitForElementVisible(AdminHomePageUI.PRODUCT_WAREHOUSE_TEXT);
        return isElementDisplay(AdminHomePageUI.PRODUCT_WAREHOUSE_TEXT);
    }

    public CreateProductPageObject clickAddNewProductButton() {
        waitForElementClickable(AdminHomePageUI.ADD_NEW_PRODUCT_BUTTON);
        clickToElement(AdminHomePageUI.ADD_NEW_PRODUCT_BUTTON);
        return new CreateProductPageObject();
    }

    public boolean productNameDisplayed(String productName) {
        waitForElementVisible(AdminHomePageUI.PRODUCT_NAME, productName);
        return isElementDisplay(AdminHomePageUI.PRODUCT_NAME, productName);
    }

    public ProductDetailPageObject clickViewProduct() {
        waitForLoadingItemInvisible();
        waitForElementClickable(AdminHomePageUI.PRODUCT_DETAIL);
        clickToElement(AdminHomePageUI.PRODUCT_DETAIL);
        return new ProductDetailPageObject();
    }

    public boolean isProductStatusInactiveTextDisplayed(String productStatusInactiveText) {
        waitForElementVisible(AdminHomePageUI.PRODUCT_STATUS_INACTIVE_TEXT, productStatusInactiveText);
        return isElementDisplay(AdminHomePageUI.PRODUCT_STATUS_INACTIVE_TEXT, productStatusInactiveText);
    }

    public void clickInactiveButton() {
        waitForElementClickable(AdminHomePageUI.INFO_PRODUCT_INACTIVE_BUTTON);
        clickToElement(AdminHomePageUI.INFO_PRODUCT_INACTIVE_BUTTON);
    }

    public boolean isProductStatusActiveTextDisplayed(String productStatusActiveText) {
        waitForElementVisible(AdminHomePageUI.PRODUCT_STATUS_ACTIVE_TEXT, productStatusActiveText);
        return isElementDisplay(AdminHomePageUI.PRODUCT_STATUS_ACTIVE_TEXT, productStatusActiveText);
    }

    public void clickActiveButton() {
        waitForElementClickable(AdminHomePageUI.INFO_PRODUCT_ACTIVE_BUTTON);
        clickToElement(AdminHomePageUI.INFO_PRODUCT_ACTIVE_BUTTON);
    }
}
