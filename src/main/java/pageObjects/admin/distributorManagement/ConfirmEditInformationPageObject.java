package pageObjects.admin.distributorManagement;

import commons.BasePage;
import pageUIs.admin.AdminHomePageUI;

public class ConfirmEditInformationPageObject extends BasePage {

    public ConfirmEditInformationPageObject() {
    }

    public DistributorManagementPageObject clickCancelButton() {
        waitForElementClickable(AdminHomePageUI.CANCEL_BUTTON);
        clickToElement(AdminHomePageUI.CANCEL_BUTTON);
        return new DistributorManagementPageObject();
    }

    public boolean isConfirmSuccessTextDisplayed() {
        waitForLoadingIconInvisible();
        waitForElementVisible(AdminHomePageUI.CONFIRM_SUCCESS_TEXT);
        return isElementDisplay(AdminHomePageUI.CONFIRM_SUCCESS_TEXT);
    }
}
