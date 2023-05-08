package pageObjects.npp.product.category;
import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageObjects.npp.order.CreateOrderPageObject;
import pageUIs.npp.NppCategoryPageUI;
import pageUIs.npp.NppHomePageUI;

public class ProductPageObject extends BasePage{
    private WebDriver driver;
    public ProductPageObject(WebDriver driver) {
        this.driver = driver;
    }
    public ProductPageObject ViewCategoryButton() {
        waitForElementVisible(driver, NppCategoryPageUI.VIEW_CATEGORY_BUTTON);
        clickToElement(driver, NppCategoryPageUI.VIEW_CATEGORY_BUTTON);
        return new ProductPageObject(driver);
    }
}
