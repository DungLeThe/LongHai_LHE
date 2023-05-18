package pageObjects.npp;

import commons.BasePage;
import pageObjects.npp.UserInfoObject.NppUserInfoObject;
import pageObjects.npp.order.OrderHomePageObject;
import pageObjects.npp.product.category.ProductPageObject;
import pageUIs.npp.NppHomePageUI;
import pageUIs.npp.NppLoginPageUI;
import pageUIs.npp.NppProductPageUI;
import pageUIs.npp.NppUserInfoPageUI;

import static commons.GlobalConstants.SHORT_TIMEOUT;


public class NppHomePageObject extends BasePage {

    public NppHomePageObject() {
    }

    public void dragToLeft() {
        waitForElementVisible(NppLoginPageUI.PROFIT_TEXT);
        clickAndHold(NppLoginPageUI.PROFIT_TEXT);
    }

    public OrderHomePageObject clickOrderButton() {
        sleepInSecond(SHORT_TIMEOUT);
        waitForElementVisible(NppHomePageUI.ORDER_BUTTON);
        clickToElement(NppHomePageUI.ORDER_BUTTON);
        return new OrderHomePageObject();
    }

    public ProductPageObject clickProductButton() {
        sleepInSecond(SHORT_TIMEOUT);
        waitForElementVisible(NppProductPageUI.PRODUCT_ICON);
        clickToElement(NppProductPageUI.PRODUCT_ICON);
        return new ProductPageObject();
    }

    public NppUserInfoObject clickPersonalInfoIcon() {
        sleepInSecond(SHORT_TIMEOUT);
        waitForElementVisible(NppUserInfoPageUI.PERSONAL_INFOMATION_ICON);
        clickToElement(NppUserInfoPageUI.PERSONAL_INFOMATION_ICON);
        return new NppUserInfoObject();
    }
}
