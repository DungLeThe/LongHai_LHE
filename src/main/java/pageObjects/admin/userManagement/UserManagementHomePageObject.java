package pageObjects.admin.userManagement;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageObjects.admin.product.CreateProductPageObject;
import pageUIs.admin.AdminHomePageUI;

public class UserManagementHomePageObject extends BasePage {
	private WebDriver driver;

	public UserManagementHomePageObject(WebDriver driver) {
		this.driver = driver;
	}

		public CreateUserManagementPageObject clickAddUserManagementButton() {
		waitForElementClickable(driver, AdminHomePageUI.ADD_NEW_USER_MANAGEMENT_BUTTON);
		clickToElement(driver, AdminHomePageUI.ADD_NEW_USER_MANAGEMENT_BUTTON);
		return new CreateUserManagementPageObject(driver);
	}

	public boolean representativeDisplayed(String representative) {
		waitForElementVisible(driver, AdminHomePageUI.REPRESENTATIVE, representative);
		return isElementDisplay(driver, AdminHomePageUI.REPRESENTATIVE, representative);
	}
}
