package pageObjects.npp.order;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageUIs.npp.NppCategoryPageUI;
import pageUIs.npp.NppHomePageUI;

public class OrderHomePageObject extends BasePage {
    private WebDriver driver;

    public OrderHomePageObject(WebDriver driver) {
        this.driver = driver;
    }
    public CreateOrderPageObject createOrderButton() {
        waitForElementVisible(driver, NppCategoryPageUI.VIEW_PRODUCT_BUTTON);
        clickToElement(driver, NppCategoryPageUI.VIEW_PRODUCT_BUTTON);
        return new CreateOrderPageObject(driver);
    }

}
