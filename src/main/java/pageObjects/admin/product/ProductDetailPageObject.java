package pageObjects.admin.product;

import commons.BasePage;
import pageUIs.admin.AdminHomePageUI;

public class ProductDetailPageObject extends BasePage {

    public ProductDetailPageObject() {
    }

    public EditProductPageObject editProductPageButton() {
        waitForElementClickable(AdminHomePageUI.EDIT_PRODUCT_BUTTON);
        clickToElement(AdminHomePageUI.EDIT_PRODUCT_BUTTON);
        return new EditProductPageObject();
    }

    public boolean isProductDetailTextDisplayed() {
        waitForElementVisible(AdminHomePageUI.PRODUCT_DETAIL_TEXT);
        return isElementDisplay(AdminHomePageUI.PRODUCT_DETAIL_TEXT);
    }

    public void clickCancelButton() {
        waitForElementClickable(AdminHomePageUI.CANCEL_ORDER_MODAL_SUCCESS_BUTTON);
        clickToElement(AdminHomePageUI.CANCEL_ORDER_MODAL_SUCCESS_BUTTON);
    }
}
