package pageObjects.admin.distributorManagement;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageUIs.admin.AdminHomePageUI;

public class DetailDistributorPageObject extends BasePage {
	private WebDriver driver;

	public DetailDistributorPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public EditInformationPageObject clickEditDistributorButton() {
		waitForElementClickable(driver, AdminHomePageUI.EDIT_DISTRIBUTOR_BUTTON);
		clickToElement(driver, AdminHomePageUI.EDIT_DISTRIBUTOR_BUTTON);
		return new EditInformationPageObject(driver);
	}
}
