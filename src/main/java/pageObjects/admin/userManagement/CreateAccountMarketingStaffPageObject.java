package pageObjects.admin.userManagement;

import commons.BasePage;
import pageUIs.admin.AdminHomePageUI;

public class CreateAccountMarketingStaffPageObject extends BasePage {

    public CreateAccountMarketingStaffPageObject() {
    }

    public boolean isAccountMarketingStaffTextDisplayed() {
        waitForElementVisible(AdminHomePageUI.ACCOUNT_IN_USER_MANAGEMENT_TEXT);
        return isElementDisplay(AdminHomePageUI.ACCOUNT_IN_USER_MANAGEMENT_TEXT);
    }

    public void closeModalErrorButton() {
        waitForElementClickable(AdminHomePageUI.CLOSE_MODAL_BUTTON);
        clickToElement(AdminHomePageUI.CLOSE_MODAL_BUTTON);
    }

    public UserManagementHomePageObject clickToUserManagementHomePageButton() {
        waitForLoadingIconInvisible();
        clickToElement(AdminHomePageUI.BACK_TO_MANAGEMENT_HOME_PAGE_BUTTON);
        return new UserManagementHomePageObject();
    }

    public boolean isModalErrorDisplayed() {
        waitForElementVisible(AdminHomePageUI.MODAL_ERROR);
        return isElementDisplay(AdminHomePageUI.MODAL_ERROR);
    }

    public void inputToAccountMarketingStaff(String account) {
        waitForElementVisible(AdminHomePageUI.ACCOUNT_IN_USER_MANAGEMENT_INPUT_TEXT);
        sendKeyToElement(AdminHomePageUI.ACCOUNT_IN_USER_MANAGEMENT_INPUT_TEXT, account);
    }

    public void inputToPassWordMarketingStaff(String password) {
        waitForElementVisible(AdminHomePageUI.PASSWORD_IN_USER_MANAGEMENT_INPUT_TEXT);
        sendKeyToElement(AdminHomePageUI.PASSWORD_IN_USER_MANAGEMENT_INPUT_TEXT, password);
    }

    public void inputToEmailMarketingStaff(String email) {
        waitForElementVisible(AdminHomePageUI.EMAIL_IN_USER_MANAGEMENT_INPUT_TEXT);
        sendKeyToElement(AdminHomePageUI.EMAIL_IN_USER_MANAGEMENT_INPUT_TEXT, email);
    }

    public void clickCreateMarketingStaffButton() {
        waitForElementClickable(AdminHomePageUI.CREATE_IN_USER_MANAGEMENT_BUTTON);
        clickToElement(AdminHomePageUI.CREATE_IN_USER_MANAGEMENT_BUTTON);
    }

    public String getErrorMessageAccountMarketingStaff() {
        waitForElementVisible(AdminHomePageUI.ERROR_MESSAGE_ACCOUNT);
        return getElementText(AdminHomePageUI.ERROR_MESSAGE_ACCOUNT);
    }

    public String getErrorMessagePassWordMarketingStaff() {
        waitForElementVisible(AdminHomePageUI.ERROR_MESSAGE_PASSWORD);
        return getElementText(AdminHomePageUI.ERROR_MESSAGE_PASSWORD);
    }

    public String getErrorMessageEmailMarketingStaff() {
        waitForElementVisible(AdminHomePageUI.ERROR_MESSAGE_EMAIL);
        return getElementText(AdminHomePageUI.ERROR_MESSAGE_EMAIL);
    }
}
