package pageObjects.admin.distributorManagement;

import commons.BasePage;
import pageObjects.admin.userManagement.UserManagementHomePageObject;
import pageUIs.admin.AdminHomePageUI;

public class CreateAccountDistributorPageObject extends BasePage {

    public CreateAccountDistributorPageObject() {
    }

    public boolean isCreateUserTextDisplayed() {
        waitForElementVisible(AdminHomePageUI.CREATE_USER_TEXT);
        return isElementDisplay(AdminHomePageUI.CREATE_USER_TEXT);
    }

    public CreateInformationDistributorPageObject clickBackButton() {
        waitForElementClickable(AdminHomePageUI.BACK_BUTTON);
        clickToElement(AdminHomePageUI.BACK_BUTTON);
        return new CreateInformationDistributorPageObject();
    }

    public void inputToAccountDistributor(String accountDistributor) {
        waitForElementVisible(AdminHomePageUI.ACCOUNT_DISTRIBUTOR_INPUT_TEXT);
        sendKeyToElement(AdminHomePageUI.ACCOUNT_DISTRIBUTOR_INPUT_TEXT, accountDistributor);
    }

    public void inputToPassWordDistributor(String passwordDistributor) {
        waitForElementVisible(AdminHomePageUI.PASSWORD_DISTRIBUTOR_INPUT_TEXT);
        sendKeyToElement(AdminHomePageUI.PASSWORD_DISTRIBUTOR_INPUT_TEXT, passwordDistributor);
    }

    public void inputToEmailDistributor(String emailDistributor) {
        waitForElementVisible(AdminHomePageUI.EMAIL_DISTRIBUTOR_INPUT_TEXT);
        sendKeyToElement(AdminHomePageUI.EMAIL_DISTRIBUTOR_INPUT_TEXT, emailDistributor);
    }

    public void clickCreateButton() {
        waitForElementClickable(AdminHomePageUI.CREATE_BUTTON);
        clickToElement(AdminHomePageUI.CREATE_BUTTON);
    }

    public void closeModalErrorButton() {
        waitForElementClickable(AdminHomePageUI.CLOSE_MODAL_BUTTON);
        clickToElement(AdminHomePageUI.CLOSE_MODAL_BUTTON);
    }

    public UserManagementHomePageObject clickToBackCreateDistributorPageButton() {
        waitForLoadingIconInvisible();
        clickToElement(AdminHomePageUI.BACK_TO_MANAGEMENT_HOME_PAGE_BUTTON);
        return new UserManagementHomePageObject();
    }

    public boolean isModalErrorDisplayed() {
        waitForElementVisible(AdminHomePageUI.MODAL_ERROR);
        return isElementDisplay(AdminHomePageUI.MODAL_ERROR);
    }

    public String getErrorMessageAccountDistributor() {
        waitForElementVisible(AdminHomePageUI.ERROR_MESSAGE_ACCOUNT);
        return getElementText(AdminHomePageUI.ERROR_MESSAGE_ACCOUNT);
    }

    public String getErrorMessagePassWordDistributor() {
        waitForElementVisible(AdminHomePageUI.ERROR_MESSAGE_PASSWORD);
        return getElementText(AdminHomePageUI.ERROR_MESSAGE_PASSWORD);
    }

    public String getErrorMessageEmailDistributor() {
        waitForElementVisible(AdminHomePageUI.ERROR_MESSAGE_EMAIL);
        return getElementText(AdminHomePageUI.ERROR_MESSAGE_EMAIL);
    }
}
