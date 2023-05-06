package pageObjects.npp;
import commons.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.npp.order.OrderHomePageObject;
import pageUIs.admin.AdminHomePageUI;
import pageUIs.npp.NppHomePageUI;
import pageUIs.npp.NppLoginPageUI;

import static commons.BasePageUI.LOADING_ITEM;

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
        waitForElementVisible(driver, NppHomePageUI.ORDER_BUTTON);
        clickToElement(driver, NppHomePageUI.ORDER_BUTTON);
        return new OrderHomePageObject(driver);
    }


    public void waitForOrderButtonInvisible(WebDriver driver) {
        WebDriverWait explicitWait = new WebDriverWait(driver, 5);
        explicitWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(NppHomePageUI.ORDER_BUTTON)));
    }
}
