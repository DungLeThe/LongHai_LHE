package pageObjects.admin.accountManagement;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageUIs.admin.AdminHomePageUI;

public class AccountManagementPageObject extends BasePage {
	private WebDriver driver;

	public AccountManagementPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public boolean representativeDisplayed(String representative) {
		waitForElementVisible(driver, AdminHomePageUI.REPRESENTATIVE, representative);
		return isElementDisplay(driver, AdminHomePageUI.REPRESENTATIVE, representative);
	}
}
