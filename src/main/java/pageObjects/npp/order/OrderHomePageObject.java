package pageObjects.npp.order;

import commons.BasePage;
import pageUIs.npp.NppHomePageUI;

public class OrderHomePageObject extends BasePage {

    public OrderHomePageObject() {
    }

    public CreateOrderPageObject createOrderButton() {
        waitForElementVisible(NppHomePageUI.CREATE_ORDER_BUTTON);
        clickToElement(NppHomePageUI.CREATE_ORDER_BUTTON);
        return new CreateOrderPageObject();
    }

    public void clickInProgressTab() {
        waitForLoadingItemInvisible();
        waitForElementVisible(NppHomePageUI.IN_PROGRESS_TAB);
        clickToElement(NppHomePageUI.IN_PROGRESS_TAB);
    }

    public void clickViewOrderDetailsButton() {
        waitForElementVisible(NppHomePageUI.VIEW_ORDER_DETAILS_BUTTON);
        clickToElement(NppHomePageUI.VIEW_ORDER_DETAILS_BUTTON);
    }

    public void clickConfirmReceivedButton() {
        waitForElementVisible(NppHomePageUI.CONFIRM_RECEIVED_BUTTON);
        clickToElement(NppHomePageUI.CONFIRM_RECEIVED_BUTTON);
    }

    public void inputNoteInReceivedPopup() {
        waitForElementVisible(NppHomePageUI.RECEIVED_NOTE);
        sendKeyToElement(NppHomePageUI.RECEIVED_NOTE, "Đã kiểm tra và nhận đủ hàng");
    }

    public void inputImage(String productImage) {
        uploadImage(NppHomePageUI.PRODUCT_IMAGE, productImage);
    }

    public void clickConfirmReceivedButtonFromPopup() {
        waitForElementVisible(NppHomePageUI.CONFIRM_RECEIVED_BUTTON_FROM_POPUP);
        clickToElement(NppHomePageUI.CONFIRM_RECEIVED_BUTTON_FROM_POPUP);
    }

    public CreateOrderPageObject clickExportOrderTab() {
        waitForElementVisible(NppHomePageUI.EXPORT_ORDER_TAB);
        clickToElement(NppHomePageUI.EXPORT_ORDER_TAB);
        return new CreateOrderPageObject();
    }
}
