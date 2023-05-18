package pageObjects.marketingStaff;

import commons.BasePage;
import driver.DriverManager;
import io.qameta.allure.Step;
import pageUIs.marketingStaff.MarketingStaffLoginPageUI;

import static commons.GlobalConstants.*;

public class MarketingStaffLoginPageObject extends BasePage {

    public void openLoginPage() {
        DriverManager.getDriver().get(MARKETING_STAFF_LOGIN);
    }

    public MarketingStaffLoginPageObject(String marketingStaffLoginUrl) {
        openPageUrl(marketingStaffLoginUrl);
    }

    @Step("Login to website")
    public MarketingStaffHomePageObject loginWebsite(String account, String password) {
        inputToAccountTextbox(account);
        inputToPasswordTextbox(password);
        clickToLoginButton();
        waitForLoadingIconInvisible();
        return new MarketingStaffHomePageObject();
    }

    @Step("Click to Login button")
    public MarketingStaffHomePageObject clickToLoginButton() {
        waitForElementClickable(MarketingStaffLoginPageUI.LOGIN_BUTTON);
        clickToElement(MarketingStaffLoginPageUI.LOGIN_BUTTON);
        return new MarketingStaffHomePageObject();
    }

    @Step("Enter to Account textbox")
    public void inputToAccountTextbox(String account) {
        waitForElementVisible(MarketingStaffLoginPageUI.ACCOUNT_TEXTBOX);
        sendKeyToElement(MarketingStaffLoginPageUI.ACCOUNT_TEXTBOX, account);
    }

    @Step("Enter to Password textbox")
    public void inputToPasswordTextbox(String password) {
        waitForElementVisible(MarketingStaffLoginPageUI.PASSWORD_TEXTBOX);
        sendKeyToElement(MarketingStaffLoginPageUI.PASSWORD_TEXTBOX, password);
    }

    @Step("Click to Login button")
    public void clickToIconEyeSlash() {
        waitForElementClickable(MarketingStaffLoginPageUI.ICON_EYE);
        clickToElement(MarketingStaffLoginPageUI.ICON_EYE);
    }

    @Step("Click to Account textbox")
    public void clickToAccountTextbox() {
        waitForElementClickable(MarketingStaffLoginPageUI.ACCOUNT_TEXTBOX);
        clickToElement(MarketingStaffLoginPageUI.ACCOUNT_TEXTBOX);
    }

    @Step("Click to Password textbox")
    public void clickToPasswordTextbox() {
        waitForElementClickable(MarketingStaffLoginPageUI.PASSWORD_TEXTBOX);
        clickToElement(MarketingStaffLoginPageUI.PASSWORD_TEXTBOX);
    }

    @Step("Verify Error Message At Account Textbox")
    public String getErrorMessageAtAccountTextbox() {
        waitForElementVisible(MarketingStaffLoginPageUI.ACCOUNT_EMPTY_ERROR_MESSAGE);
        return getElementText(MarketingStaffLoginPageUI.ACCOUNT_EMPTY_ERROR_MESSAGE);
    }

    @Step("Verify Error Message At Passwork Textbox")
    public String getErrorMessageAtPassworkTextbox() {
        waitForElementVisible(MarketingStaffLoginPageUI.PASS_EMPTY_ERROR_MESSAGE);
        return getElementText(MarketingStaffLoginPageUI.PASS_EMPTY_ERROR_MESSAGE);
    }

    @Step("Verify Modal Confirm Displayed")
    public boolean isModalConfirmDisplayed() {
        waitForElementVisible(MarketingStaffLoginPageUI.MODAL_TEXT);
        return isElementDisplay(MarketingStaffLoginPageUI.MODAL_TEXT);
    }

    public MarketingStaffHomePageObject goToMarketingStaffHomePage() {
        MarketingStaffLoginPageObject marketingStaffLoginPage = new MarketingStaffLoginPageObject(MARKETING_STAFF_LOGIN);
        marketingStaffLoginPage.loginWebsite(MARKETING_STAFF_ACCOUNT, MARKETING_STAFF_PASSWORD);
        return new MarketingStaffHomePageObject();
    }
}
