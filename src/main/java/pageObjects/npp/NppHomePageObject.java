package pageObjects.npp;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageObjects.npp.order.OrderHomePageObject;
import pageObjects.npp.product.category.ProductPageObject;
import pageUIs.npp.NppHomePageUI;
import pageUIs.npp.NppLoginPageUI;
import pageUIs.npp.NppProductPageUI;

import static commons.GlobalConstants.SHORT_TIMEOUT;


public class NppHomePageObject extends BasePage {
    private WebDriver driver;

    public NppHomePageObject(WebDriver driver) {
        this.driver = driver;
    }

    public void dragToLeft() {
        waitForElementVisible(driver, NppLoginPageUI.PROFIT_TEXT);
        clickAndHold(driver, NppLoginPageUI.PROFIT_TEXT);
    }

    public OrderHomePageObject clickOrderButton() {
        sleepInSecond(SHORT_TIMEOUT);
        waitForElementVisible(driver, NppHomePageUI.ORDER_BUTTON);
        clickToElement(driver, NppHomePageUI.ORDER_BUTTON);
        return new OrderHomePageObject(driver);
    }

    public ProductPageObject clickProductButton() {
        sleepInSecond(SHORT_TIMEOUT);
        waitForElementVisible(driver, NppProductPageUI.PRODUCT_ICON);
        clickToElement(driver, NppProductPageUI.PRODUCT_ICON);
        return new ProductPageObject(driver);
    }
}
