package pageObjects.admin.product;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageUIs.admin.AdminHomePageUI;

public class ProductHomePageObject extends BasePage {
	private WebDriver driver;

	public ProductHomePageObject(WebDriver driver) {
		this.driver = driver;
	}

	public boolean isProductWareHouseTextDisplayed() {
		waitForElementVisible(driver, AdminHomePageUI.PRODUCT_WAREHOUSE_TEXT);
		return isElementDisplay(driver, AdminHomePageUI.PRODUCT_WAREHOUSE_TEXT);
	}

		public CreateProductPageObject clickAddNewProductButton() {
		waitForElementClickable(driver, AdminHomePageUI.ADD_NEW_PRODUCT_BUTTON);
		clickToElement(driver, AdminHomePageUI.ADD_NEW_PRODUCT_BUTTON);
		return new CreateProductPageObject(driver);
	}

	public boolean productNameDisplayed(String productName) {
		waitForElementVisible(driver, AdminHomePageUI.PRODUCT_NAME, productName);
		return isElementDisplay(driver, AdminHomePageUI.PRODUCT_NAME, productName);
	}
}
