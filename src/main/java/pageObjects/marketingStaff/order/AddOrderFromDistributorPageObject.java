package pageObjects.marketingStaff.order;

import commons.BasePage;
import pageUIs.marketingStaff.MarketingStaffHomePageUI;

public class AddOrderFromDistributorPageObject extends BasePage {

    public AddOrderFromDistributorPageObject() {
    }

    public ListProductsPageObject clickAddOrderButton() {
        waitForElementVisible(MarketingStaffHomePageUI.ADD_ORDER_BUTTON);
        clickToElement(MarketingStaffHomePageUI.ADD_ORDER_BUTTON);
        return new ListProductsPageObject();
    }
}
