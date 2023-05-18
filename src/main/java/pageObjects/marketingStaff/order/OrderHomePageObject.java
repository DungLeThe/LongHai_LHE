package pageObjects.marketingStaff.order;

import commons.BasePage;
import pageUIs.marketingStaff.MarketingStaffHomePageUI;

public class OrderHomePageObject extends BasePage {

    public OrderHomePageObject() {
    }

    public AddOrderFromDistributorPageObject clickAddOrderFromDistributor() {
        waitForElementVisible(MarketingStaffHomePageUI.ADD_ORDER_FROM_DISTRIBUTOR_BUTTON);
        clickToElement(MarketingStaffHomePageUI.ADD_ORDER_FROM_DISTRIBUTOR_BUTTON);
        return new AddOrderFromDistributorPageObject();
    }

    public AddOrderForGroceriesPageObject clickAddOrderForGroceries() {
        waitForElementVisible(MarketingStaffHomePageUI.ADD_ORDER_FOR_GROCERIES_BUTTON);
        clickToElement(MarketingStaffHomePageUI.ADD_ORDER_FOR_GROCERIES_BUTTON);
        return new AddOrderForGroceriesPageObject();
    }
}
