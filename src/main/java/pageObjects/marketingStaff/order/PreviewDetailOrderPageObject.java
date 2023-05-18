package pageObjects.marketingStaff.order;

import commons.BasePage;
import pageUIs.marketingStaff.MarketingStaffHomePageUI;

public class PreviewDetailOrderPageObject extends BasePage {

    public PreviewDetailOrderPageObject() {
    }

    public String getProductNameText() {
        waitForLoadingItemInvisible();
        waitForElementVisible(MarketingStaffHomePageUI.PRODUCT_NAME_TEXT);
        return getElementText(MarketingStaffHomePageUI.PRODUCT_NAME_TEXT);
    }

    public void clickCompletedButton() {
        waitForElementVisible(MarketingStaffHomePageUI.COMPLETED_BUTTON);
        clickToElement(MarketingStaffHomePageUI.COMPLETED_BUTTON);
    }

    public DetailOrderPageObject clickDetailOrderButton() {
        waitForLoadingIconInvisible();
        waitForElementVisible(MarketingStaffHomePageUI.DETAIL_ORDER_BUTTON);
        clickToElement(MarketingStaffHomePageUI.DETAIL_ORDER_BUTTON);
        return new DetailOrderPageObject();
    }

    public AddOrderForGroceriesPageObject clickListOrderButton() {
        waitForLoadingIconInvisible();
        waitForElementVisible(MarketingStaffHomePageUI.LIST_ORDER_BUTTON);
        clickToElement(MarketingStaffHomePageUI.LIST_ORDER_BUTTON);
        return new AddOrderForGroceriesPageObject();
    }

    public ChooseOneGroceryPageObject clickEditOrderButton() {
        waitForElementVisible(MarketingStaffHomePageUI.EDIT_ORDER_BUTTON);
        clickToElement(MarketingStaffHomePageUI.EDIT_ORDER_BUTTON);
        return new ChooseOneGroceryPageObject();
    }
}
