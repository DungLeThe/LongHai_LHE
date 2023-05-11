package pageObjects.npp.order;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageUIs.npp.NppOrderPageUI;

import static pageUIs.npp.NppOrderPageUI.*;

public class CreateOrderPageObject extends BasePage {

    private WebDriver driver;

    public CreateOrderPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public void inputNote() {
        sendKeyToElement(driver, ORDER_NOTE, "Giao hàng nhanh trong ngày");
    }

    public void searchProduct() {
        sendKeyToElement(driver, SEARCH_PRODUCT, "Thạch rau câu phong cách Nhật Bản Kimiko 990g");
    }

    public void dragAndDropIcon() {
        waitForElementClickable(driver, NppOrderPageUI.HELP_DESK_ICON);
        dragAndDrop(driver, NppOrderPageUI.HELP_DESK_ICON, NppOrderPageUI.BELL_ICON);
    }

    public void inputSelectProductCheckbox() {
        waitForElementClickable(driver, NppOrderPageUI.PRODUCT_CHECKBOX);
        clickToElement(driver, NppOrderPageUI.PRODUCT_CHECKBOX);
    }

    public void clickConfirmOrder() {
        waitForElementClickable(driver, NppOrderPageUI.CONFIRM_ORDER_BUTTON);
        clickToElement(driver, NppOrderPageUI.CONFIRM_ORDER_BUTTON);
    }

    public String getTextFromSuccessPopup() {
        waitForElementVisible(driver, NppOrderPageUI.SUCCESSFULL_POPUP_CONTENT);
        return getElementText(driver, SUCCESSFULL_POPUP_CONTENT);
    }

    public void clickOnOrderDetail() {
        waitForElementVisible(driver, NppOrderPageUI.VIEW_ORDER_DETAIL_BUTTON_AFTER_CREATED_SUCCESS);
        clickToElement(driver, VIEW_ORDER_DETAIL_BUTTON_AFTER_CREATED_SUCCESS);
    }

    public void clickOnOrderList() {
        waitForLoadingIconInvisible(driver);
        waitForElementVisible(driver, VIEW_ORDER_LIST_BUTTON_AFTER_CREATED_SUCCESS);
        clickToElement(driver, VIEW_ORDER_LIST_BUTTON_AFTER_CREATED_SUCCESS);
    }
}


