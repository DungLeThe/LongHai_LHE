package pageObjects.npp.order;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageUIs.npp.NppHomePageUI;

public class OrderHomePageObject extends BasePage {
    private WebDriver driver;

    public OrderHomePageObject(WebDriver driver) {
        this.driver = driver;
    }

    public CreateOrderPageObject CreateOrderButton() {
        waitForElementVisible(driver, NppHomePageUI.CREATE_ORDER_BUTTON);
        clickToElement(driver, NppHomePageUI.CREATE_ORDER_BUTTON);
        return new CreateOrderPageObject(driver);
    }

}
