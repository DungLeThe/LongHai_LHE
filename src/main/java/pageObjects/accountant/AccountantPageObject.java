package pageObjects.accountant;

import commons.BasePage;
import driver.DriverManager;
import io.qameta.allure.Step;
import pageUIs.accountant.AccountantPageUI;
import pageUIs.npp.NppLoginPageUI;

import static commons.GlobalConstants.*;

public class AccountantPageObject extends BasePage {

    public void openLoginPage() {
        DriverManager.getDriver().get(ACCOUNTANT_LOGIN);
    }

    public AccountantPageObject(String accountantLogin) {
        openPageUrl(accountantLogin);
    }

    @Step("Login to website")
    public AccountantPageObject loginWebsite(String account, String password) {
        inputToAccountTextbox(account);
        inputToPasswordTextbox(password);
        clickToLoginButton();
        waitForLoadingIconInvisible();
        return new AccountantPageObject(ACCOUNTANT_LOGIN);
    }

    @Step("Click to Account textbox")
    public void clickToAccountTextbox() {
        waitForElementClickable(AccountantPageUI.ACCOUNTANT_ACCOUNT_TEXTBOX);
        clickToElement(AccountantPageUI.ACCOUNTANT_ACCOUNT_TEXTBOX);
    }

    @Step("Click to Password textbox")
    public void clickToPasswordTextbox() {
        waitForElementClickable(AccountantPageUI.ACCOUNTANT_PASSWORD_TEXTBOX);
        clickToElement(AccountantPageUI.ACCOUNTANT_PASSWORD_TEXTBOX);
    }

    @Step("Verify Error Message At Account Textbox")
    public String getErrorMessageAtAccountTextbox() {
        waitForElementVisible(AccountantPageUI.ACCOUNT_EMPTY_ERROR_MESSAGE);
        return getElementText(AccountantPageUI.ACCOUNT_EMPTY_ERROR_MESSAGE);
    }

    @Step("Verify Error Message At Password Textbox")
    public String getErrorMessageAtPasswordTextbox() {
        waitForElementVisible(AccountantPageUI.PASS_EMPTY_ERROR_MESSAGE);
        return getElementText(AccountantPageUI.PASS_EMPTY_ERROR_MESSAGE);
    }

    public void inputToAccountTextbox(String account) {
        waitForElementVisible(AccountantPageUI.ACCOUNTANT_ACCOUNT_TEXTBOX);
        sendKeyToElement(AccountantPageUI.ACCOUNTANT_ACCOUNT_TEXTBOX, account);

    }

    public void inputToPasswordTextbox(String passwordInvalid) {
        waitForElementVisible(AccountantPageUI.ACCOUNTANT_PASSWORD_TEXTBOX);
        sendKeyToElement(AccountantPageUI.ACCOUNTANT_PASSWORD_TEXTBOX, passwordInvalid);
    }

    public void clickToEyeIcon() {
        waitForElementVisible(NppLoginPageUI.EYE_ICON);
        clickToElement(NppLoginPageUI.EYE_ICON);
    }

    public void clickToLoginButton() {
        waitForElementVisible(AccountantPageUI.LOGIN_BUTTON);
        clickToElement(AccountantPageUI.LOGIN_BUTTON);
    }

    public void closeErrorPopup() {
        waitForElementVisible(AccountantPageUI.CLOSE_POPUP_BUTTON);
        clickToElement(AccountantPageUI.CLOSE_POPUP_BUTTON);
    }

    public String getErrorTextModal() {
        waitForElementVisible(AccountantPageUI.MODAL_TEXT);
        return getElementText(AccountantPageUI.MODAL_TEXT);
    }

    public AccountantPageObject goToAccountantHomePage() {
        AccountantPageObject loginAccountantPage = new AccountantPageObject(ACCOUNTANT_LOGIN);
        AccountantPageObject accountantPage;
        accountantPage = loginAccountantPage.loginWebsite(ACCOUNTANT_ACCOUNT, ACCOUNTANT_PASSWORD);
        return new AccountantPageObject(ACCOUNTANT_LOGIN);
    }

    public boolean dashboardTextIsDisplayed() {
        waitForElementVisible(AccountantPageUI.LOGIN_SUCCESS_MARK);
        return isElementDisplay(AccountantPageUI.LOGIN_SUCCESS_MARK);
    }

    public AccountantPageObject goToOrderDetailPage() {
        AccountantPageObject loginAccountantPage = new AccountantPageObject(ACCOUNTANT_LOGIN);
        AccountantPageObject accountantHomePage;
        accountantHomePage = loginAccountantPage.loginWebsite(ACCOUNTANT_ACCOUNT, ACCOUNTANT_PASSWORD);
        return new AccountantPageObject(ACCOUNTANT_LOGIN);
    }

    public AccountantPageObject clickOrderButton() {
        waitForElementVisible(AccountantPageUI.ORDER_BUTTON);
        clickToElement(AccountantPageUI.ORDER_BUTTON);
        return new AccountantPageObject(ACCOUNTANT_LOGIN);
    }

    public void clickViewDetail() {
        waitForElementVisible(AccountantPageUI.VIEW_ORDER_DETAIL_BUTTON);
        clickToElement(AccountantPageUI.VIEW_ORDER_DETAIL_BUTTON);
    }

    public void clickOrderStatusDropDown() {
        waitForLoadingItemInvisible();
        waitForElementVisible(AccountantPageUI.ORDER_STATUS_DROPDOWN);
        clickToElement(AccountantPageUI.ORDER_STATUS_DROPDOWN);
    }

    public void clickInProgressStatus() {
        waitForElementVisible(AccountantPageUI.ORDER_STATUS_VALUE);
        clickToElement(AccountantPageUI.ORDER_STATUS_VALUE);
    }

    public void clickFinishOrderButton() {
        waitForLoadingIconInvisible();
        waitForElementVisible(AccountantPageUI.FINISH_ORDER_BUTTON);
        clickToElement(AccountantPageUI.FINISH_ORDER_BUTTON);
    }
}
