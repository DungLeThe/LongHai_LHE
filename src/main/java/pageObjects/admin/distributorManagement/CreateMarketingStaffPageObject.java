package pageObjects.admin.distributorManagement;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageObjects.admin.userManagement.CreateAccountMarketingStaffPageObject;
import pageObjects.admin.userManagement.CreateUserManagementPageObject;
import pageUIs.admin.AdminHomePageUI;

import static commons.GlobalConstants.THREE_SECONDS;

public class CreateMarketingStaffPageObject extends BasePage {
	private WebDriver driver;

	public CreateMarketingStaffPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public CreateUserManagementPageObject clickCancelMarketingStaffButton() {
		waitForElementClickable(driver, AdminHomePageUI.CANCEL_MARKETING_STAFF_BUTTON);
		clickToElement(driver, AdminHomePageUI.CANCEL_MARKETING_STAFF_BUTTON);
		return new CreateUserManagementPageObject(driver);
	}

	public boolean isPersonalInformationTextDisplayed() {
		waitForElementVisible(driver, AdminHomePageUI.PERSONAL_INFORMATION_TEXT);
		return isElementDisplay(driver, AdminHomePageUI.PERSONAL_INFORMATION_TEXT);
	}

	public void inputToIdCard(String idCard) {
		waitForElementVisible(driver, AdminHomePageUI.ID_CARD_INPUT_TEXT);
		sendKeyToElement(driver, AdminHomePageUI.ID_CARD_INPUT_TEXT, idCard);
	}

	public void inputToDateOfBirth(String dateOfBirth) {
		waitForElementVisible(driver, AdminHomePageUI.DATE_OF_BIRTH_MARKETING_STAFF_INPUT);
		sendKeyToElement(driver, AdminHomePageUI.DATE_OF_BIRTH_MARKETING_STAFF_INPUT, dateOfBirth);
	}

	public void inputToName(String name) {
		waitForElementVisible(driver, AdminHomePageUI.NAME_MARKETING_STAFF_INPUT);
		sendKeyToElement(driver, AdminHomePageUI.NAME_MARKETING_STAFF_INPUT, name);
	}

	public void inputToPhone(String phone) {
		waitForElementVisible(driver, AdminHomePageUI.PHONE_NUMBER_MARKETING_STAFF_INPUT);
		sendKeyToElement(driver, AdminHomePageUI.PHONE_NUMBER_MARKETING_STAFF_INPUT, phone);
	}

	public void inputToDateRange(String dateRange) {
		waitForElementVisible(driver, AdminHomePageUI.DATE_RANGE_MARKETING_STAFF_INPUT);
		sendKeyToElement(driver, AdminHomePageUI.DATE_RANGE_MARKETING_STAFF_INPUT, dateRange);
	}

	public void inputToIssuedBy(String issuedBy) {
		waitForElementVisible(driver, AdminHomePageUI.ISSUED_BY_MARKETING_STAFF_INPUT);
		sendKeyToElement(driver, AdminHomePageUI.ISSUED_BY_MARKETING_STAFF_INPUT, issuedBy);
	}

	public void inputToAddress(String address) {
		waitForElementVisible(driver, AdminHomePageUI.ADDRESS_MARKETING_STAFF_INPUT);
		sendKeyToElement(driver, AdminHomePageUI.ADDRESS_MARKETING_STAFF_INPUT, address);
	}

	public void inputToTimeIn(String timeIn) {
		scrollToElement(driver, AdminHomePageUI.TIME_IN_MARKETING_STAFF_INPUT);
		waitForElementVisible(driver, AdminHomePageUI.TIME_IN_MARKETING_STAFF_INPUT);
		sendKeyToElement(driver, AdminHomePageUI.TIME_IN_MARKETING_STAFF_INPUT, timeIn);
	}

	public CreateAccountMarketingStaffPageObject clickNextMarketingStaffButton() {
		waitForElementClickable(driver, AdminHomePageUI.NEXT_MARKETING_STAFF_BUTTON);
		clickToElement(driver, AdminHomePageUI.NEXT_MARKETING_STAFF_BUTTON);
		return new CreateAccountMarketingStaffPageObject(driver);
	}

    public String getErrorMessageName() {
		scrollToElement(driver, AdminHomePageUI.ERROR_MESSAGE_EMPTY_MARKETING_STAFF_NAME);
		waitForElementVisible(driver, AdminHomePageUI.ERROR_MESSAGE_EMPTY_MARKETING_STAFF_NAME);
		return getElementText(driver, AdminHomePageUI.ERROR_MESSAGE_EMPTY_MARKETING_STAFF_NAME);
    }

	public String getErrorMessagePhone() {
		scrollToElement(driver, AdminHomePageUI.ERROR_MESSAGE_MARKETING_STAFF_EMPTY_PHONE);
		waitForElementVisible(driver, AdminHomePageUI.ERROR_MESSAGE_MARKETING_STAFF_EMPTY_PHONE);
		return getElementText(driver, AdminHomePageUI.ERROR_MESSAGE_MARKETING_STAFF_EMPTY_PHONE);
	}

	public String getErrorMessageDateOfBirth() {
		scrollToElement(driver, AdminHomePageUI.ERROR_MESSAGE_MARKETING_STAFF_EMPTY_DATE_OF_BIRTH);
		waitForElementVisible(driver, AdminHomePageUI.ERROR_MESSAGE_MARKETING_STAFF_EMPTY_DATE_OF_BIRTH);
		return getElementText(driver, AdminHomePageUI.ERROR_MESSAGE_MARKETING_STAFF_EMPTY_DATE_OF_BIRTH);
	}

	public String getErrorMessageIdCard() {
		scrollToElement(driver, AdminHomePageUI.ERROR_MESSAGE_MARKETING_STAFF_EMPTY_ID_CARD);
		waitForElementVisible(driver, AdminHomePageUI.ERROR_MESSAGE_MARKETING_STAFF_EMPTY_ID_CARD);
		return getElementText(driver, AdminHomePageUI.ERROR_MESSAGE_MARKETING_STAFF_EMPTY_ID_CARD);
	}

	public String getErrorMessageDateRange() {
		scrollToElement(driver, AdminHomePageUI.ERROR_MESSAGE_MARKETING_STAFF_EMPTY_DATE_RANGE);
		waitForElementVisible(driver, AdminHomePageUI.ERROR_MESSAGE_MARKETING_STAFF_EMPTY_DATE_RANGE);
		return getElementText(driver, AdminHomePageUI.ERROR_MESSAGE_MARKETING_STAFF_EMPTY_DATE_RANGE);
	}

	public String getErrorMessageIssuedBy() {
		scrollToElement(driver, AdminHomePageUI.ERROR_MESSAGE_MARKETING_STAFF_EMPTY_ISSUE_BY);
		waitForElementVisible(driver, AdminHomePageUI.ERROR_MESSAGE_MARKETING_STAFF_EMPTY_ISSUE_BY);
		return getElementText(driver, AdminHomePageUI.ERROR_MESSAGE_MARKETING_STAFF_EMPTY_ISSUE_BY);
	}

	public String getErrorMessageAddress() {
		scrollToElement(driver, AdminHomePageUI.ERROR_MESSAGE_MARKETING_STAFF_EMPTY_SELECT_ADDRESS);
		waitForElementVisible(driver, AdminHomePageUI.ERROR_MESSAGE_MARKETING_STAFF_EMPTY_SELECT_ADDRESS);
		return getElementText(driver, AdminHomePageUI.ERROR_MESSAGE_MARKETING_STAFF_EMPTY_SELECT_ADDRESS);
	}

	public String getErrorMessageGender() {
		scrollToElement(driver, AdminHomePageUI.ERROR_MESSAGE_MARKETING_STAFF_EMPTY_GENDER);
		waitForElementVisible(driver, AdminHomePageUI.ERROR_MESSAGE_MARKETING_STAFF_EMPTY_GENDER);
		return getElementText(driver, AdminHomePageUI.ERROR_MESSAGE_MARKETING_STAFF_EMPTY_GENDER);
	}

	public void inputToGender(String gender) {
		scrollToElement(driver, AdminHomePageUI.GENDER_MARKETING_STAFF_INPUT);
		waitForElementClickable(driver, AdminHomePageUI.GENDER_MARKETING_STAFF_INPUT);
		sendKeyToElement(driver, AdminHomePageUI.GENDER_MARKETING_STAFF_INPUT, gender);
	}

	public void clickToValueGender() {
		scrollToElement(driver, AdminHomePageUI.VALUE_GENDER_MARKETING_STAFF_INPUT);
		waitForElementClickable(driver, AdminHomePageUI.VALUE_GENDER_MARKETING_STAFF_INPUT);
		clickToElement(driver, AdminHomePageUI.VALUE_GENDER_MARKETING_STAFF_INPUT);
	}

	public String getErrorMessageMaritalStatus() {
		scrollToElement(driver, AdminHomePageUI.ERROR_MESSAGE_MARKETING_STAFF_EMPTY_MARITAL_STATUS);
		waitForElementVisible(driver, AdminHomePageUI.ERROR_MESSAGE_MARKETING_STAFF_EMPTY_MARITAL_STATUS);
		return getElementText(driver, AdminHomePageUI.ERROR_MESSAGE_MARKETING_STAFF_EMPTY_MARITAL_STATUS);
	}

	public void inputToMaritalStatus(String maritalStatus) {
		scrollToElement(driver, AdminHomePageUI.MARITAL_STATUS_MARKETING_STAFF_INPUT);
		waitForElementClickable(driver, AdminHomePageUI.MARITAL_STATUS_MARKETING_STAFF_INPUT);
		sendKeyToElement(driver, AdminHomePageUI.MARITAL_STATUS_MARKETING_STAFF_INPUT, maritalStatus);
	}

	public void clickToValueMaritalStatus() {
		scrollToElement(driver, AdminHomePageUI.VALUE_MARITAL_STATUS_MARKETING_STAFF_INPUT);
		waitForElementClickable(driver, AdminHomePageUI.VALUE_MARITAL_STATUS_MARKETING_STAFF_INPUT);
		clickToElement(driver, AdminHomePageUI.VALUE_MARITAL_STATUS_MARKETING_STAFF_INPUT);
	}

	public void inputToPosition(String position) {
		scrollToElement(driver, AdminHomePageUI.POSITION_MARKETING_STAFF_INPUT);
		waitForElementClickable(driver, AdminHomePageUI.POSITION_MARKETING_STAFF_INPUT);
		sendKeyToElement(driver, AdminHomePageUI.POSITION_MARKETING_STAFF_INPUT, position);
	}

	public void clickToValuePosition() {
		scrollToElement(driver, AdminHomePageUI.VALUE_POSITION_MARKETING_STAFF_INPUT);
		waitForElementClickable(driver, AdminHomePageUI.VALUE_POSITION_MARKETING_STAFF_INPUT);
		clickToElement(driver, AdminHomePageUI.VALUE_POSITION_MARKETING_STAFF_INPUT);
	}

	public void inputToNationality(String nationality) {
		scrollToElement(driver, AdminHomePageUI.NATIONALITY_MARKETING_STAFF_INPUT);
		waitForElementClickable(driver, AdminHomePageUI.NATIONALITY_MARKETING_STAFF_INPUT);
		sendKeyToElement(driver, AdminHomePageUI.NATIONALITY_MARKETING_STAFF_INPUT, nationality);
	}

	public void clickToValueNationality() {
		scrollToElement(driver, AdminHomePageUI.VALUE_NATIONALITY_MARKETING_STAFF_INPUT);
		waitForElementClickable(driver, AdminHomePageUI.VALUE_NATIONALITY_MARKETING_STAFF_INPUT);
		clickToElement(driver, AdminHomePageUI.VALUE_NATIONALITY_MARKETING_STAFF_INPUT);
	}

	public void inputToNation(String nation) {
		scrollToElement(driver, AdminHomePageUI.NATION_MARKETING_STAFF_INPUT);
		waitForElementClickable(driver, AdminHomePageUI.NATION_MARKETING_STAFF_INPUT);
		sendKeyToElement(driver, AdminHomePageUI.NATION_MARKETING_STAFF_INPUT, nation);
	}

	public void clickToValueNation() {
		scrollToElement(driver, AdminHomePageUI.VALUE_NATION_MARKETING_STAFF_INPUT);
		waitForElementClickable(driver, AdminHomePageUI.VALUE_NATION_MARKETING_STAFF_INPUT);
		clickToElement(driver, AdminHomePageUI.VALUE_NATION_MARKETING_STAFF_INPUT);
	}

	public void inputToRegion(String region) {
		scrollToElement(driver, AdminHomePageUI.REGION_MARKETING_STAFF_INPUT);
		waitForElementClickable(driver, AdminHomePageUI.REGION_MARKETING_STAFF_INPUT);
		sendKeyToElement(driver, AdminHomePageUI.REGION_MARKETING_STAFF_INPUT, region);
	}

	public void clickToValueRegion() {
		scrollToElement(driver, AdminHomePageUI.VALUE_REGION_MARKETING_STAFF_INPUT);
		waitForElementClickable(driver, AdminHomePageUI.VALUE_REGION_MARKETING_STAFF_INPUT);
		clickToElement(driver, AdminHomePageUI.VALUE_REGION_MARKETING_STAFF_INPUT);
	}

	public void inputToArea(String area) {
		scrollToElement(driver, AdminHomePageUI.AREA_MARKETING_STAFF_INPUT);
		waitForElementClickable(driver, AdminHomePageUI.AREA_MARKETING_STAFF_INPUT);
		sendKeyToElement(driver, AdminHomePageUI.AREA_MARKETING_STAFF_INPUT, area);
	}

	public void clickToValueArea() {
		scrollToElement(driver, AdminHomePageUI.VALUE_AREA_MARKETING_STAFF_INPUT);
		sleepInSecond(THREE_SECONDS);
		waitForElementClickable(driver, AdminHomePageUI.VALUE_AREA_MARKETING_STAFF_INPUT);
		clickToElement(driver, AdminHomePageUI.VALUE_AREA_MARKETING_STAFF_INPUT);
	}
}
