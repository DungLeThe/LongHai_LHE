package pageObjects.marketingStaff.order;

import commons.BasePage;
import pageUIs.marketingStaff.MarketingStaffHomePageUI;

public class DetailOrderPageObject extends BasePage {

    public DetailOrderPageObject() {
    }

    public String getProductNameText() {
        waitForLoadingItemInvisible();
        waitForElementVisible(MarketingStaffHomePageUI.PRODUCT_NAME_TEXT);
        return getElementText(MarketingStaffHomePageUI.PRODUCT_NAME_TEXT);
    }
}
