package pageObjects.admin.product;

import commons.BasePage;
import pageUIs.admin.AdminHomePageUI;

public class EditProductPageObject extends BasePage {

    public EditProductPageObject() {
    }

    public ProductDetailPageObject clickCancelButton() {
        waitForLoadingItemInvisible();
        waitForElementClickable(AdminHomePageUI.CANCEL_EDIT_PRODUCT_BUTTON);
        clickToElement(AdminHomePageUI.CANCEL_EDIT_PRODUCT_BUTTON);
        return new ProductDetailPageObject();
    }

    public void clickChangeStatusLabel() {
        waitForLoadingIconInvisible();
        waitForElementClickable(AdminHomePageUI.CHANGE_STATUS_PRODUCT_LABEL);
        clickToElement(AdminHomePageUI.CHANGE_STATUS_PRODUCT_LABEL);
    }

    public void clickExistingAttribute() {
        waitForElementClickable(AdminHomePageUI.EXISTING_ATTRIBUTE_DIV);
        clickToElement(AdminHomePageUI.EXISTING_ATTRIBUTE_DIV);
    }

    public void inputNewProperties(String attributeValue) {
        waitForElementClickable(AdminHomePageUI.ATTRIBUTE_VALUE_INPUT);
        sendKeyToElement(AdminHomePageUI.ATTRIBUTE_VALUE_INPUT, attributeValue);
    }

    public void clickSaveProductButton() {
        waitForElementClickable(AdminHomePageUI.SAVE_PRODUCT_BUTTON);
        clickToElement(AdminHomePageUI.SAVE_PRODUCT_BUTTON);
    }

    public ProductHomePageObject clickCloseModalButton() {
        waitForElementClickable(AdminHomePageUI.CLOSE_MODAL_BUTTON);
        clickToElement(AdminHomePageUI.CLOSE_MODAL_BUTTON);
        return new ProductHomePageObject();
    }

    public void inputRetailPrice(String retailPrice) {
        waitForElementClickable(AdminHomePageUI.RETAIL_PRICE_INPUT);
        sendKeyToElement(AdminHomePageUI.RETAIL_PRICE_INPUT, retailPrice);
    }

    public void inputPerBarrelPrice(String perBarrelPrice) {
        waitForElementClickable(AdminHomePageUI.PER_BARREL_PRICE_INPUT);
        sendKeyToElement(AdminHomePageUI.PER_BARREL_PRICE_INPUT, perBarrelPrice);
    }

    public void inputNumberOfProductsInOneBox(String numberOfProductsInOneBox) {
        waitForElementClickable(AdminHomePageUI.NUMBER_OF_PRODUCTS_IN_ONE_BOX_INPUT);
        sendKeyToElement(AdminHomePageUI.NUMBER_OF_PRODUCTS_IN_ONE_BOX_INPUT, numberOfProductsInOneBox);
    }
}
