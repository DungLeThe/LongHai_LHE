package pageObjects.admin.order;

import commons.BasePage;
import pageUIs.admin.AdminHomePageUI;

public class OrderHomePageObject extends BasePage {

    public OrderHomePageObject() {
    }

    public CreateOrderPageObject clickAddNewOrderButton() {
        waitForElementClickable(AdminHomePageUI.ADD_NEW_ORDER_BUTTON);
        clickToElement(AdminHomePageUI.ADD_NEW_ORDER_BUTTON);
        return new CreateOrderPageObject();
    }

    public boolean isOrderInFormationTextDisplayed() {
        waitForElementVisible(AdminHomePageUI.ORDER_INFO_TEXT);
        return isElementDisplay(AdminHomePageUI.ORDER_INFO_TEXT);
    }

    public OrderDetailPageObject clickViewDetailButton() {
        waitForElementClickable(AdminHomePageUI.VIEW_DETAIL_BUTTON);
        clickToElement(AdminHomePageUI.VIEW_DETAIL_BUTTON);
        return new OrderDetailPageObject();
    }

    public void clickWaitingForApproveButton() {
        waitForLoadingItemInvisible();
        waitForElementClickable(AdminHomePageUI.WAITING_FOR_APPROVE_BUTTON);
        clickToElement(AdminHomePageUI.WAITING_FOR_APPROVE_BUTTON);
    }
}
