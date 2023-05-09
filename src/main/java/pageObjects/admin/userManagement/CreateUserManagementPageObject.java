package pageObjects.admin.userManagement;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageObjects.admin.distributorManagement.CreateInformationDistributorPageObject;
import pageObjects.admin.distributorManagement.CreateMarketingStaffPageObject;
import pageObjects.admin.product.ProductHomePageObject;
import pageUIs.admin.AdminHomePageUI;

public class CreateUserManagementPageObject extends BasePage {
	private WebDriver driver;

	public CreateUserManagementPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public ProductHomePageObject clickCancelButton() {
		waitForElementClickable(driver, AdminHomePageUI.CANCEL_BUTTON);
		clickToElement(driver, AdminHomePageUI.CANCEL_BUTTON);
		return new ProductHomePageObject(driver);
	}

	public CreateInformationDistributorPageObject clickAddDistributorManagement() {
		waitForElementClickable(driver, AdminHomePageUI.ADD_DISTRIBUTOR_DIV);
		clickToElement(driver, AdminHomePageUI.ADD_DISTRIBUTOR_DIV);
		return new CreateInformationDistributorPageObject(driver);
	}

	public CreateMarketingStaffPageObject clickAddMarketingStaff() {
		waitForElementClickable(driver, AdminHomePageUI.ADD_MARKETING_STAFF_DIV);
		clickToElement(driver, AdminHomePageUI.ADD_MARKETING_STAFF_DIV);
		return new CreateMarketingStaffPageObject(driver);
	}
}
