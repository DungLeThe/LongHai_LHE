package pageObjects.marketingStaff.order;

import commons.BasePage;
import pageUIs.marketingStaff.MarketingStaffHomePageUI;

public class OrderDetailPageObject extends BasePage {

    public OrderDetailPageObject() {
    }

    public String getProductNameText() {
        waitForLoadingItemInvisible();
        waitForElementVisible(MarketingStaffHomePageUI.PRODUCT_NAME_TEXT);
        return getElementText(MarketingStaffHomePageUI.PRODUCT_NAME_TEXT);
    }
}
