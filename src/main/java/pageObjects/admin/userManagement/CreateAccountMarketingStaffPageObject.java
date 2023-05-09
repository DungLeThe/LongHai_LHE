package pageObjects.admin.userManagement;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageObjects.admin.distributorManagement.CreateInformationDistributorPageObject;
import pageUIs.admin.AdminHomePageUI;

public class CreateAccountMarketingStaffPageObject extends BasePage {
	private WebDriver driver;

	public CreateAccountMarketingStaffPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public CreateInformationDistributorPageObject clickBackButton() {
		waitForElementClickable(driver, AdminHomePageUI.BACK_BUTTON);
		clickToElement(driver, AdminHomePageUI.BACK_BUTTON);
		return new CreateInformationDistributorPageObject(driver);
	}

	public boolean isAccountMarketingStaffTextDisplayed() {
		waitForElementVisible(driver, AdminHomePageUI.ACCOUNT_MARKETING_STAFF_TEXT);
		return isElementDisplay(driver, AdminHomePageUI.ACCOUNT_MARKETING_STAFF_TEXT);
	}

    public void inputToAccountDistributor(String accountDistributor) {
		waitForElementVisible(driver, AdminHomePageUI.ACCOUNT_DISTRIBUTOR_INPUT_TEXT);
		sendKeyToElement(driver, AdminHomePageUI.ACCOUNT_DISTRIBUTOR_INPUT_TEXT, accountDistributor);
    }

	public void inputToPassWordDistributor(String passwordDistributor) {
		waitForElementVisible(driver, AdminHomePageUI.PASSWORD_DISTRIBUTOR_INPUT_TEXT);
		sendKeyToElement(driver, AdminHomePageUI.PASSWORD_DISTRIBUTOR_INPUT_TEXT, passwordDistributor);
	}

	public void inputToEmailDistributor(String emailDistributor) {
		waitForElementVisible(driver, AdminHomePageUI.EMAIL_DISTRIBUTOR_INPUT_TEXT);
		sendKeyToElement(driver, AdminHomePageUI.EMAIL_DISTRIBUTOR_INPUT_TEXT, emailDistributor);
	}

	public void clickCreateButton() {
		waitForElementClickable(driver, AdminHomePageUI.CREATE_BUTTON);
		clickToElement(driver, AdminHomePageUI.CREATE_BUTTON);
	}

	public void closeModalErrorButton() {
		waitForElementClickable(driver, AdminHomePageUI.CLOSE_MODAL_BUTTON);
		clickToElement(driver, AdminHomePageUI.CLOSE_MODAL_BUTTON);
	}

	public UserManagementHomePageObject clickToUserManagementHomePageButton() {
		waitForLoadingIconInvisible(driver);
		clickToElement(driver, AdminHomePageUI.BACK_TO_MANAGEMENT_HOME_PAGE_BUTTON);
		return new UserManagementHomePageObject(driver);
	}

	public boolean isModalErrorDisplayed() {
		waitForElementVisible(driver, AdminHomePageUI.MODAL_ERROR);
		return isElementDisplay(driver, AdminHomePageUI.MODAL_ERROR);
	}

	public String getErrorMessageAccountDistributor() {
		waitForElementVisible(driver, AdminHomePageUI.ERROR_MESSAGE_ACCOUNT);
		return getElementText(driver, AdminHomePageUI.ERROR_MESSAGE_ACCOUNT);
	}

	public String getErrorMessagePassWordDistributor() {
		waitForElementVisible(driver, AdminHomePageUI.ERROR_MESSAGE_PASSWORD);
		return getElementText(driver, AdminHomePageUI.ERROR_MESSAGE_PASSWORD);
	}

	public String getErrorMessageEmailDistributor() {
		waitForElementVisible(driver, AdminHomePageUI.ERROR_MESSAGE_EMAIL);
		return getElementText(driver, AdminHomePageUI.ERROR_MESSAGE_EMAIL);
	}

	public void inputToAccountMarketingStaff(String account) {
		waitForElementVisible(driver, AdminHomePageUI.ACCOUNT_MARKETING_STAFF_INPUT_TEXT);
		sendKeyToElement(driver, AdminHomePageUI.ACCOUNT_MARKETING_STAFF_INPUT_TEXT, account);
	}

	public void inputToPassWordMarketingStaff(String password) {
		waitForElementVisible(driver, AdminHomePageUI.PASSWORD_MARKETING_STAFF_INPUT_TEXT);
		sendKeyToElement(driver, AdminHomePageUI.PASSWORD_MARKETING_STAFF_INPUT_TEXT, password);
	}

	public void inputToEmailMarketingStaff(String email) {
		waitForElementVisible(driver, AdminHomePageUI.EMAIL_MARKETING_STAFF_INPUT_TEXT);
		sendKeyToElement(driver, AdminHomePageUI.EMAIL_MARKETING_STAFF_INPUT_TEXT, email);
	}

	public void clickCreateMarketingStaffButton() {
		waitForElementClickable(driver, AdminHomePageUI.CREATE_MARKETING_STAFF_BUTTON);
		clickToElement(driver, AdminHomePageUI.CREATE_MARKETING_STAFF_BUTTON);
	}

	public String getErrorMessageAccountMarketingStaff() {
		waitForElementVisible(driver, AdminHomePageUI.ERROR_MESSAGE_ACCOUNT);
		return getElementText(driver, AdminHomePageUI.ERROR_MESSAGE_ACCOUNT);
	}

	public String getErrorMessagePassWordMarketingStaff() {
		waitForElementVisible(driver, AdminHomePageUI.ERROR_MESSAGE_PASSWORD);
		return getElementText(driver, AdminHomePageUI.ERROR_MESSAGE_PASSWORD);
	}

	public String getErrorMessageEmailMarketingStaff() {
		waitForElementVisible(driver, AdminHomePageUI.ERROR_MESSAGE_EMAIL);
		return getElementText(driver, AdminHomePageUI.ERROR_MESSAGE_EMAIL);
	}
}
