package pageObjects.admin.distributorManagement;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageUIs.admin.AdminHomePageUI;

public class DetailUserPageObject extends BasePage {
	private WebDriver driver;

	public DetailUserPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public String getRepresentativeText() {
		waitForElementVisible(driver, AdminHomePageUI.REPRESENTATIVE_TEXT);
		return getElementText(driver, AdminHomePageUI.REPRESENTATIVE_TEXT);
	}

	public String
	getInfoDistributorText(String info) {
		waitForElementVisible(driver, AdminHomePageUI.INFO_DISTRIBUTOR_TEXT, info);
		return getElementText(driver, AdminHomePageUI.INFO_DISTRIBUTOR_TEXT, info);
	}
}
