package pageObjects.admin;

import commons.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pageObjects.admin.distributorManagement.DistributorManagementPageObject;
import pageObjects.admin.product.ProductHomePageObject;
import pageUIs.admin.AdminHomePageUI;

public class AdminHomePageObject extends BasePage {
	private WebDriver driver;

	public AdminHomePageObject(WebDriver driver) {
		this.driver = driver;
	}

	@Step("Verify 'Product Text' is displayed")
	public boolean isProductTextDisplayed() {
		waitForElementVisible(driver, AdminHomePageUI.PRODUCT_TEXT);
		return isElementDisplay(driver, AdminHomePageUI.PRODUCT_TEXT);
	}

	public void clickButtonDragToTheRight() {
		waitForElementClickable(driver, AdminHomePageUI.DRAG_BUTTON);
		clickToElement(driver, AdminHomePageUI.DRAG_BUTTON);
	}

	public DistributorManagementPageObject clickDistributorManagementButton() {
		waitForElementClickable(driver, AdminHomePageUI.DISTRIBUTOR_MANAGEMENT);
		clickToElement(driver, AdminHomePageUI.DISTRIBUTOR_MANAGEMENT);
		return new DistributorManagementPageObject(driver);
	}

	public ProductHomePageObject clickProductButton() {
		waitForElementClickable(driver, AdminHomePageUI.PRODUCT_BUTTON);
		clickToElement(driver, AdminHomePageUI.PRODUCT_BUTTON);
		return new ProductHomePageObject(driver);
	}
}
