package pageObjects.npp;
import commons.BasePage;
import commons.GlobalConstants;
import org.openqa.selenium.WebDriver;
import pageObjects.npp.order.OrderHomePageObject;
import pageUIs.npp.NppHomePageUI;
import pageUIs.npp.NppLoginPageUI;

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
}
