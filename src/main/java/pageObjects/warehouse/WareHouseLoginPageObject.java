package pageObjects.warehouse;

import commons.BasePage;
import driver.DriverManager;
import io.qameta.allure.Step;
import pageUIs.warehouse.WareHouseLoginPageUI;

import static commons.GlobalConstants.*;

public class WareHouseLoginPageObject extends BasePage {

    public void openLoginPage() {
        DriverManager.getDriver().get(WARE_HOUSE_LOGIN);
    }

    public WareHouseLoginPageObject(String wareHouseLogin) {
        openPageUrl(wareHouseLogin);
    }

    @Step("Login to website")
    public WareHouseHomePageObject loginWebsite(String account, String password) {
        inputToAccountTextbox(account);
        inputToPasswordTextbox(password);
        clickToLoginButton();
        waitForLoadingIconInvisible();
        return new WareHouseHomePageObject();
    }

    @Step("Click to Account textbox")
    public void clickToAccountTextbox() {
        waitForElementClickable(WareHouseLoginPageUI.WAREHOUSE_ACCOUNT_TEXTBOX);
        clickToElement(WareHouseLoginPageUI.WAREHOUSE_ACCOUNT_TEXTBOX);
    }

    @Step("Click to Password textbox")
    public void clickToPasswordTextbox() {
        waitForElementClickable(WareHouseLoginPageUI.WAREHOUSE_PASSWORD_TEXTBOX);
        clickToElement(WareHouseLoginPageUI.WAREHOUSE_PASSWORD_TEXTBOX);
    }

    @Step("Verify Error Message At Account Textbox")
    public String getErrorMessageAtAccountTextbox() {
        waitForElementVisible(WareHouseLoginPageUI.ACCOUNT_EMPTY_ERROR_MESSAGE);
        return getElementText(WareHouseLoginPageUI.ACCOUNT_EMPTY_ERROR_MESSAGE);
    }

    @Step("Verify Error Message At Passwork Textbox")
    public String getErrorMessageAtPassworkTextbox() {
        waitForElementVisible(WareHouseLoginPageUI.PASS_EMPTY_ERROR_MESSAGE);
        return getElementText(WareHouseLoginPageUI.PASS_EMPTY_ERROR_MESSAGE);
    }

    public void inputToAccountTextbox(String account) {
        waitForElementVisible(WareHouseLoginPageUI.WAREHOUSE_ACCOUNT_TEXTBOX);
        sendKeyToElement(WareHouseLoginPageUI.WAREHOUSE_ACCOUNT_TEXTBOX, account);

    }

    public void inputToPasswordTextbox(String password) {
        waitForElementVisible(WareHouseLoginPageUI.WAREHOUSE_PASSWORD_TEXTBOX);
        sendKeyToElement(WareHouseLoginPageUI.WAREHOUSE_PASSWORD_TEXTBOX, password);
    }

    public void clickToEyeIcon() {
        waitForElementVisible(WareHouseLoginPageUI.EYE_ICON);
        clickToElement(WareHouseLoginPageUI.EYE_ICON);
    }

    public void clickToLoginButton() {
        waitForElementVisible(WareHouseLoginPageUI.LOGIN_BUTTON);
        clickToElement(WareHouseLoginPageUI.LOGIN_BUTTON);
    }

    public void closeErrorPopup() {
        waitForElementVisible(WareHouseLoginPageUI.CLOSE_POPUP_BUTTON);
        clickToElement(WareHouseLoginPageUI.CLOSE_POPUP_BUTTON);
    }

    public String getErrorTextModal() {
        waitForElementVisible(WareHouseLoginPageUI.MODAL_TEXT);
        return getElementText(WareHouseLoginPageUI.MODAL_TEXT);
    }

    public boolean loginSuccessMark() {
        waitForElementVisible(WareHouseLoginPageUI.LOGIN_SUCCESS_MARK);
        return isElementDisplay(WareHouseLoginPageUI.LOGIN_SUCCESS_MARK);
    }

    public WareHouseHomePageObject goToWareHouseHomePage() {
        WareHouseLoginPageObject loginWareHousePage = new WareHouseLoginPageObject(WARE_HOUSE_LOGIN);
        WareHouseHomePageObject WareHouseHomePage;
        WareHouseHomePage = loginWareHousePage.loginWebsite(WARE_HOUSE_ACCOUNT, WARE_HOUSE_PASSWORD);
        return new WareHouseHomePageObject();
    }

}

