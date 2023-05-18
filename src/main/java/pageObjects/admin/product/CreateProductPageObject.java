package pageObjects.admin.product;

import commons.BasePage;
import pageUIs.admin.AdminHomePageUI;

import static commons.GlobalConstants.SHORT_TIMEOUT;

public class CreateProductPageObject extends BasePage {

    public CreateProductPageObject() {
    }

    public ProductHomePageObject clickCancelButton() {
        waitForLoadingItemInvisible();
        waitForElementClickable(AdminHomePageUI.CANCEL_BUTTON);
        clickToElement(AdminHomePageUI.CANCEL_BUTTON);
        return new ProductHomePageObject();
    }

    public void inputProductDescription(String productDescription) {
        waitForElementVisible(AdminHomePageUI.PRODUCT_DESCRIPTION_TEXT_AREA);
        sendKeyToElement(AdminHomePageUI.PRODUCT_DESCRIPTION_TEXT_AREA, productDescription);
    }

    public void clickToCategory() {
        waitForElementVisible(AdminHomePageUI.CATEGORY_INPUT);
        clickToElement(AdminHomePageUI.CATEGORY_INPUT);
    }

    public void clickSelectCategory() {
        sleepInSecond(SHORT_TIMEOUT);
        waitForElementVisible(AdminHomePageUI.CATEGORY_INPUT_VALUE);
        clickToElement(AdminHomePageUI.CATEGORY_INPUT_VALUE);
    }

    public void clickAddAttributeButton() {
        waitForElementVisible(AdminHomePageUI.ADD_ATTRIBUTE_BUTTON);
        clickToElement(AdminHomePageUI.ADD_ATTRIBUTE_BUTTON);
    }

    public void clickDeleteAttributeButton() {
        waitForElementVisible(AdminHomePageUI.DELETE_ATTRIBUTE_BUTTON);
        clickToElement(AdminHomePageUI.DELETE_ATTRIBUTE_BUTTON);
    }

    public void clickCreateNewButton() {
        waitForElementClickable(AdminHomePageUI.CREATE_NEW_BUTTON);
        clickToElement(AdminHomePageUI.CREATE_NEW_BUTTON);
    }

    public ProductHomePageObject clickCloseModalButton() {
        waitForElementClickable(AdminHomePageUI.CLOSE_MODAL_BUTTON);
        clickToElement(AdminHomePageUI.CLOSE_MODAL_BUTTON);
        return new ProductHomePageObject();
    }

    public void inputProductImage(String productImage) {
        uploadImage(AdminHomePageUI.PRODUCT_IMAGE, productImage);
    }
}
