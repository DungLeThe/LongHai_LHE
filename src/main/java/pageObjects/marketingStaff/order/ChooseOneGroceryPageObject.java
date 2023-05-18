package pageObjects.marketingStaff.order;

import commons.BasePage;
import pageUIs.marketingStaff.MarketingStaffHomePageUI;

import static commons.GlobalConstants.SHORT_TIMEOUT;

public class ChooseOneGroceryPageObject extends BasePage {
    public ChooseOneGroceryPageObject() {
    }

    public AddOrderForGroceriesPageObject clickCancelAddOrderButton() {
        waitForElementVisible(MarketingStaffHomePageUI.CANCEL_ADD_ORDER_BUTTON);
        clickToElement(MarketingStaffHomePageUI.CANCEL_ADD_ORDER_BUTTON);
        return new AddOrderForGroceriesPageObject();
    }

    public void inputNoteArea(String note) {
        waitForElementVisible(MarketingStaffHomePageUI.NOTE_AREA_INPUT);
        sendKeyToElement(MarketingStaffHomePageUI.NOTE_AREA_INPUT, note);
    }

    public void clickChooseProductToOrderButton() {
        waitForLoadingItemInvisible();
        waitForElementVisible(MarketingStaffHomePageUI.CHOOSE_PRODUCT_TO_ORDER_BUTTON);
        clickToElement(MarketingStaffHomePageUI.CHOOSE_PRODUCT_TO_ORDER_BUTTON);
    }

    public void inputSearchProduct(String product) {
        sleepInSecond(SHORT_TIMEOUT);
        waitForElementVisible(MarketingStaffHomePageUI.INPUT_SEARCH_PRODUCT);
        sendKeyToElement(MarketingStaffHomePageUI.INPUT_SEARCH_PRODUCT, product);
    }

    public void dragAndDropIcon() {
        waitForElementClickable(MarketingStaffHomePageUI.HELP_DESK_ICON);
        dragAndDrop(MarketingStaffHomePageUI.HELP_DESK_ICON, MarketingStaffHomePageUI.BELL_ICON);
    }

    public void clickTextboxChooseProduct() {
        waitForLoadingItemInvisible();
        waitForElementVisible(MarketingStaffHomePageUI.TEXT_BOX_CHOOSE_PRODUCT);
        clickToElement(MarketingStaffHomePageUI.TEXT_BOX_CHOOSE_PRODUCT);
    }

    public void clickAddNewProductButton() {
        waitForElementVisible(MarketingStaffHomePageUI.ADD_NEW_PRODUCT_BUTTON);
        clickToElement(MarketingStaffHomePageUI.ADD_NEW_PRODUCT_BUTTON);
    }

    public void clickAddUnitIcon() {
        scrollToElement(MarketingStaffHomePageUI.ADD_UNIT_ICON);
        waitForElementVisible(MarketingStaffHomePageUI.ADD_UNIT_ICON);
        clickToElement(MarketingStaffHomePageUI.ADD_UNIT_ICON);
    }

    public void inputNumberOfBoxes(String numberOfBoxes) {
        waitForElementVisible(MarketingStaffHomePageUI.NUMBER_OF_BOXES_INPUT);
        sendKeyToElement(MarketingStaffHomePageUI.NUMBER_OF_BOXES_INPUT, numberOfBoxes);
    }

    public void inputNumberOfBags(String numberOfBags) {
        waitForElementVisible(MarketingStaffHomePageUI.NUMBER_OF_BAGS_INPUT);
        sendKeyToElement(MarketingStaffHomePageUI.NUMBER_OF_BAGS_INPUT, numberOfBags);
    }

    public PreviewDetailOrderPageObject clickConfirmButton() {
        waitForElementVisible(MarketingStaffHomePageUI.CONFIRM_BUTTON);
        clickToElement(MarketingStaffHomePageUI.CONFIRM_BUTTON);
        return new PreviewDetailOrderPageObject();
    }

    public void clickEditChooseProductToOrderButton() {
        waitForLoadingItemInvisible();
        waitForElementVisible(MarketingStaffHomePageUI.EDIT_CHOOSE_PRODUCT_TO_ORDER_BUTTON);
        clickToElement(MarketingStaffHomePageUI.EDIT_CHOOSE_PRODUCT_TO_ORDER_BUTTON);
    }
}
