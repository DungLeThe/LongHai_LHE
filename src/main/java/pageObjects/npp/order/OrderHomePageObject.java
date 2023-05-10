package pageObjects.npp.order;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageUIs.npp.NppOrderPageUI;

public class OrderHomePageObject extends BasePage {
    private WebDriver driver;

    public OrderHomePageObject(WebDriver driver) {
        this.driver = driver;
    }

    public CreateOrderPageObject createOrderButton() {
        waitForElementVisible(driver, NppOrderPageUI.CREATE_ORDER_BUTTON);
        clickToElement(driver, NppOrderPageUI.CREATE_ORDER_BUTTON);
        return new CreateOrderPageObject(driver);
    }
}
