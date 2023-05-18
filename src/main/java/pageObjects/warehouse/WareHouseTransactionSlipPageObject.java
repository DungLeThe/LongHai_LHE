package pageObjects.warehouse;

import commons.BasePage;
import io.qameta.allure.Step;

import static commons.GlobalConstants.WARE_HOUSE_LOGIN;

public class WareHouseTransactionSlipPageObject extends BasePage {
    WareHouseLoginPageObject login = new WareHouseLoginPageObject(WARE_HOUSE_LOGIN);

    public WareHouseTransactionSlipPageObject() {
    }

    @Step("Login to website")
    public WareHouseTransactionSlipPageObject loginWebsite(String account, String password) {
        login.inputToAccountTextbox(account);
        login.inputToPasswordTextbox(password);
        login.clickToLoginButton();
        waitForLoadingIconInvisible();
        return new WareHouseTransactionSlipPageObject();
    }
}
