package pageObjects.marketingStaff.order;

import commons.BasePage;
import pageUIs.marketingStaff.MarketingStaffHomePageUI;

public class ListGroceriesPageObject extends BasePage {

    public ListGroceriesPageObject() {
    }

    public AddOrderFromDistributorPageObject clickCancelAddOrderButton() {
        waitForElementVisible(MarketingStaffHomePageUI.CANCEL_ADD_ORDER_BUTTON);
        clickToElement(MarketingStaffHomePageUI.CANCEL_ADD_ORDER_BUTTON);
        return new AddOrderFromDistributorPageObject();
    }

    public void clickChooseProductButton() {
        waitForLoadingItemInvisible();
        waitForElementVisible(MarketingStaffHomePageUI.CHOOSE_PRODUCT_BUTTON);
        clickToElement(MarketingStaffHomePageUI.CHOOSE_PRODUCT_BUTTON);
    }

    public void clickCancelChooseProductButton() {
        waitForElementVisible(MarketingStaffHomePageUI.CANCEL_CHOOSE_PRODUCT_BUTTON);
        clickToElement(MarketingStaffHomePageUI.CANCEL_CHOOSE_PRODUCT_BUTTON);
    }

    public boolean isChooseProductButtonDisplayed() {
        waitForElementVisible(MarketingStaffHomePageUI.CHOOSE_PRODUCT_BUTTON);
        return isElementDisplay(MarketingStaffHomePageUI.CHOOSE_PRODUCT_BUTTON);
    }

    public void inputSearchProduct(String product) {
        waitForElementVisible(MarketingStaffHomePageUI.INPUT_SEARCH_PRODUCT);
        sendKeyToElement(MarketingStaffHomePageUI.INPUT_SEARCH_PRODUCT, product);
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

    public void dragAndDropIcon() {
        waitForElementClickable(MarketingStaffHomePageUI.HELP_DESK_ICON);
        dragAndDrop(MarketingStaffHomePageUI.HELP_DESK_ICON, MarketingStaffHomePageUI.BELL_ICON);
    }

    public void clickAddUnitIcon() {
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

    public void clickConfirmButton() {
        waitForElementVisible(MarketingStaffHomePageUI.CONFIRM_BUTTON);
        clickToElement(MarketingStaffHomePageUI.CONFIRM_BUTTON);
    }

    public OrderDetailPageObject clickDetailOrderButton() {
        waitForLoadingIconInvisible();
        waitForElementVisible(MarketingStaffHomePageUI.DETAIL_ORDER_BUTTON);
        clickToElement(MarketingStaffHomePageUI.DETAIL_ORDER_BUTTON);
        return new OrderDetailPageObject();
    }

    public boolean isPriceTextDisplayed() {
        waitForElementVisible(MarketingStaffHomePageUI.PRICE_VALUE);
        return isElementDisplay(MarketingStaffHomePageUI.PRICE_VALUE);
    }

    public void clickPriceText() {
        waitForElementVisible(MarketingStaffHomePageUI.PRICE_TEXT);
        clickToElement(MarketingStaffHomePageUI.PRICE_TEXT);
    }

    public AddOrderFromDistributorPageObject clickListOrderButton() {
        waitForLoadingIconInvisible();
        waitForElementVisible(MarketingStaffHomePageUI.LIST_ORDER_BUTTON);
        clickToElement(MarketingStaffHomePageUI.LIST_ORDER_BUTTON);
        return new AddOrderFromDistributorPageObject();
    }

    public ChooseOneGroceryPageObject clickChooseOneGroceryButton() {
        waitForLoadingIconInvisible();
        waitForElementVisible(MarketingStaffHomePageUI.CHOOSE_ONE_GROCERY_BUTTON);
        clickToElement(MarketingStaffHomePageUI.CHOOSE_ONE_GROCERY_BUTTON);
        return new ChooseOneGroceryPageObject();
    }
}
