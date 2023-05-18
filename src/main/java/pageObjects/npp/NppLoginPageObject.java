package pageObjects.npp;

import commons.BasePage;
import driver.DriverManager;
import io.qameta.allure.Step;
import pageUIs.npp.NppLoginPageUI;

import static commons.GlobalConstants.*;

public class NppLoginPageObject extends BasePage {

    public void openLoginPage() {
        DriverManager.getDriver().get(NPP_LOGIN);
    }

    public NppLoginPageObject(String nppLogin) {
        openPageUrl(nppLogin);
    }

    @Step("Login to website")
    public NppHomePageObject loginWebsite(String account, String password) {
        inputToAccountTextbox(account);
        inputToPasswordTextbox(password);
        clickToLoginButton();
        waitForLoadingIconInvisible();
        return new NppHomePageObject();
    }

    @Step("Click to Account textbox")
    public void clickToAccountTextbox() {
        waitForElementClickable(NppLoginPageUI.NPP_ACCOUNT_TEXTBOX);
        clickToElement(NppLoginPageUI.NPP_ACCOUNT_TEXTBOX);
    }

    @Step("Click to Password textbox")
    public void clickToPasswordTextbox() {
        waitForElementClickable(NppLoginPageUI.NPP_PASSWORD_TEXTBOX);
        clickToElement(NppLoginPageUI.NPP_PASSWORD_TEXTBOX);
    }

    @Step("Verify Error Message At Account Textbox")
    public String getErrorMessageAtAccountTextbox() {
        waitForElementVisible(NppLoginPageUI.ACCOUNT_EMPTY_ERROR_MESSAGE);
        return getElementText(NppLoginPageUI.ACCOUNT_EMPTY_ERROR_MESSAGE);
    }

    @Step("Verify Error Message At Passwork Textbox")
    public String getErrorMessageAtPassworkTextbox() {
        waitForElementVisible(NppLoginPageUI.PASS_EMPTY_ERROR_MESSAGE);
        return getElementText(NppLoginPageUI.PASS_EMPTY_ERROR_MESSAGE);
    }

    public void inputToAccountTextbox(String account) {
        waitForElementVisible(NppLoginPageUI.NPP_ACCOUNT_TEXTBOX);
        sendKeyToElement(NppLoginPageUI.NPP_ACCOUNT_TEXTBOX, account);

    }

    public void inputToPasswordTextbox(String passwordInvalid) {
        waitForElementVisible(NppLoginPageUI.NPP_PASSWORD_TEXTBOX);
        sendKeyToElement(NppLoginPageUI.NPP_PASSWORD_TEXTBOX, passwordInvalid);
    }

    public void clickToEyeIcon() {
        waitForElementVisible(NppLoginPageUI.EYE_ICON);
        clickToElement(NppLoginPageUI.EYE_ICON);
    }

    public void clickToLoginButton() {
        waitForElementVisible(NppLoginPageUI.LOGIN_BUTTON);
        clickToElement(NppLoginPageUI.LOGIN_BUTTON);
    }

    public void closeErrorPopup() {
        waitForElementVisible(NppLoginPageUI.CLOSE_POPUP_BUTTON);
        clickToElement(NppLoginPageUI.CLOSE_POPUP_BUTTON);
    }

    public String getErrorTextModal() {
        waitForElementVisible(NppLoginPageUI.MODAL_TEXT);
        return getElementText(NppLoginPageUI.MODAL_TEXT);
    }

    public boolean chartTextIsDisplayed() {
        waitForElementVisible(NppLoginPageUI.LOGIN_SUCCESS_MARK);
        return isElementDisplay(NppLoginPageUI.LOGIN_SUCCESS_MARK);
    }

    public void dragToLeft() {
        waitForElementVisible(NppLoginPageUI.PROFIT_TEXT);
        clickAndHold(NppLoginPageUI.PROFIT_TEXT);
    }

    public NppHomePageObject goToNppHomePage() {
        NppLoginPageObject loginNppPage = new NppLoginPageObject(NPP_LOGIN);
        NppHomePageObject NppHomePage;
        NppHomePage = loginNppPage.loginWebsite(NPP_ACCOUNT, NPP_PASSWORD);
        NppHomePage.clickAndHold(NppLoginPageUI.PROFIT_TEXT);
        return new NppHomePageObject();
    }
}
