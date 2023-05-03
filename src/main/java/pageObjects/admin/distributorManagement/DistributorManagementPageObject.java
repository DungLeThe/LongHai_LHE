package pageObjects.admin.distributorManagement;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageUIs.admin.AdminHomePageUI;

public class DistributorManagementPageObject extends BasePage {
	private WebDriver driver;

	public DistributorManagementPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public CreateInformationPageObject clickAddMemberButton() {
		waitForElementClickable(driver, AdminHomePageUI.ADD_MEMBER_BUTTON);
		clickToElement(driver, AdminHomePageUI.ADD_MEMBER_BUTTON);
		return new CreateInformationPageObject(driver);
	}

	public boolean isDistributorManagementTextDisplayed() {
		waitForElementVisible(driver, AdminHomePageUI.DISTRIBUTOR_MANAGEMENT_TEXT);
		return isElementDisplay(driver, AdminHomePageUI.DISTRIBUTOR_MANAGEMENT_TEXT);
	}
}
