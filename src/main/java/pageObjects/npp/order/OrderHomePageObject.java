package pageObjects.npp.order;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageUIs.npp.NppHomePageUI;

public class OrderHomePageObject extends BasePage {
    private WebDriver driver;

    public OrderHomePageObject(WebDriver driver) {
        this.driver = driver;
    }
    public CreateOrderPageObject createOrderButton() {
        waitForElementVisible(driver, NppHomePageUI.CREATE_ORDER_BUTTON);
        clickToElement(driver, NppHomePageUI.CREATE_ORDER_BUTTON);
        return new CreateOrderPageObject(driver);
    }

    public void clickInProgressTab() {
        waitForElementVisible(driver, NppHomePageUI.IN_PROGRESS_TAB);
        clickToElement(driver, NppHomePageUI.IN_PROGRESS_TAB);
    }

    public void clickViewOrderDetailsButton() {
        waitForElementVisible(driver, NppHomePageUI.VIEW_ORDER_DETAILS_BUTTON);
        clickToElement(driver, NppHomePageUI.VIEW_ORDER_DETAILS_BUTTON);
    }

    public void clickConfirmReceivedButton() {
        waitForElementVisible(driver, NppHomePageUI.CONFIRM_RECEIVED_BUTTON);
    }
}
