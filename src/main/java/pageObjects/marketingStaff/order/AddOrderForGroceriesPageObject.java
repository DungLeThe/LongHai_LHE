package pageObjects.marketingStaff.order;

import commons.BasePage;
import pageUIs.marketingStaff.MarketingStaffHomePageUI;

public class AddOrderForGroceriesPageObject extends BasePage {

    public AddOrderForGroceriesPageObject() {
    }

    public ListGroceriesPageObject clickAddOrderForGroceriesButton() {
        waitForElementVisible(MarketingStaffHomePageUI.ADD_ORDER_BUTTON);
        clickToElement(MarketingStaffHomePageUI.ADD_ORDER_BUTTON);
        return new ListGroceriesPageObject();
    }

    public boolean isAddOrderTextDisplayed() {
        waitForElementVisible(MarketingStaffHomePageUI.ADD_ORDER_TEXT);
        return isElementDisplay(MarketingStaffHomePageUI.ADD_ORDER_TEXT);
    }
}
