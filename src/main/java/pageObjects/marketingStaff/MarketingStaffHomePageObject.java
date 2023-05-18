package pageObjects.marketingStaff;

import commons.BasePage;
import pageObjects.marketingStaff.order.OrderHomePageObject;
import pageUIs.marketingStaff.MarketingStaffHomePageUI;

public class MarketingStaffHomePageObject extends BasePage {

    public MarketingStaffHomePageObject() {
    }

    public OrderHomePageObject clickOrderButton() {
        waitForLoadingIconInvisible();
        waitForElementClickable(MarketingStaffHomePageUI.ORDER_BUTTON);
        clickToElement(MarketingStaffHomePageUI.ORDER_BUTTON);
        return new OrderHomePageObject();
    }
}
