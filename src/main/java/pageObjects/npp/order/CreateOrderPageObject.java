package pageObjects.npp.order;

import commons.BasePage;
import pageUIs.npp.NppOrderPageUI;

import static pageUIs.npp.NppOrderPageUI.*;

public class CreateOrderPageObject extends BasePage {

    public CreateOrderPageObject() {
    }

    public void inputNote() {
        sendKeyToElement(ORDER_NOTE, "Giao hàng nhanh trong ngày");
    }

    public void searchProduct() {
        sendKeyToElement(SEARCH_PRODUCT, "Thạch rau câu phong cách Nhật Bản Kimiko 990g");
    }

    public void dragAndDropIcon() {
        waitForElementClickable(NppOrderPageUI.HELP_DESK_ICON);
        dragAndDrop(NppOrderPageUI.HELP_DESK_ICON, NppOrderPageUI.BELL_ICON);
    }

    public void inputSelectProductCheckbox() {
        waitForElementClickable(NppOrderPageUI.PRODUCT_CHECKBOX);
        clickToElement(NppOrderPageUI.PRODUCT_CHECKBOX);
    }

    public void clickConfirmOrder() {
        waitForElementClickable(NppOrderPageUI.CONFIRM_ORDER_BUTTON);
        clickToElement(NppOrderPageUI.CONFIRM_ORDER_BUTTON);
    }

    public String getTextFromSuccessPopup() {
        waitForElementVisible(NppOrderPageUI.SUCCESSFULL_POPUP_CONTENT);
        return getElementText(SUCCESSFULL_POPUP_CONTENT);
    }

    public void clickOnOrderDetail() {
        waitForElementVisible(NppOrderPageUI.VIEW_ORDER_DETAIL_BUTTON_AFTER_CREATED_SUCCESS);
        clickToElement(VIEW_ORDER_DETAIL_BUTTON_AFTER_CREATED_SUCCESS);
    }

    public void clickOnOrderList() {
        waitForLoadingIconInvisible();
        waitForElementVisible(VIEW_ORDER_LIST_BUTTON_AFTER_CREATED_SUCCESS);
        clickToElement(VIEW_ORDER_LIST_BUTTON_AFTER_CREATED_SUCCESS);
    }

    public void clickChooseProductFromWarehouseButton() {
        waitForLoadingIconInvisible();
        waitForElementVisible(NppOrderPageUI.CHOOSE_PRODUCT_FROM_WAREHOUSE);
        clickToElement(NppOrderPageUI.CHOOSE_PRODUCT_FROM_WAREHOUSE);
    }

    public void clickToWarehouseList() {
        waitForLoadingIconInvisible();
        waitForElementVisible(NppOrderPageUI.EXPORT_FROM_FIELD);
        clickToElement(EXPORT_FROM_FIELD);
    }

    public void chooseWarehouseValue() {
        waitForElementVisible(NppOrderPageUI.EXPORT_FROM_VALUE);
        clickToElement(EXPORT_FROM_VALUE);
    }

    public void clickToObjectList() {
        waitForElementVisible(EXPORT_TO_FIELD);
        clickToElement(EXPORT_TO_FIELD);
    }

    public void chooseObject() {
        waitForElementVisible(EXPORT_TO_VALUE);
        clickToElement(EXPORT_TO_VALUE);
    }

    public void clickChooseProductFromWareHouseButton() {
        waitForElementVisible(CHOOSE_PRODUCT_FROM_WAREHOUSE_BUTTON);
        clickToElement(CHOOSE_PRODUCT_FROM_WAREHOUSE_BUTTON);
    }

    public void selectProductFromWareHouse() {
        waitForElementVisible(PRODUCT_FROM_WAREHOUSE);
        clickToElement(PRODUCT_FROM_WAREHOUSE);
    }

    public void clickToExportFromConsignmentButton() {
        waitForElementVisible(EXPORT_CONSIGNMENT_BUTTON);
        clickToElement(EXPORT_CONSIGNMENT_BUTTON);
    }

    public void inputExportAmount() {
        waitForElementVisible(INPUT_AMOUNT_FIELD);
        sendKeyToElement(INPUT_AMOUNT_FIELD, "1");
    }

    public void inputSingleAmount() {
        waitForElementVisible(INPUT_SINGLE_AMOUNT_FIELD);
        sendKeyToElement(INPUT_SINGLE_AMOUNT_FIELD, "1");
    }

    public void clickConfirmExportButton() {
        waitForElementVisible(CONFIRM_EXPORT_BUTTON);
        clickToElement(CONFIRM_EXPORT_BUTTON);
    }

    public void clickCreateExportOrderButton() {
        waitForElementVisible(CREATE_EXPORT_ORDER);
        clickToElement(CREATE_EXPORT_ORDER);
    }

    public void clickViewExportOrderDetail() {
        waitForLoadingIconInvisible();
        waitForElementVisible(VIEW_EXPORT_ORDER_DETAIL);
        clickToElement(VIEW_EXPORT_ORDER_DETAIL);
    }
}


