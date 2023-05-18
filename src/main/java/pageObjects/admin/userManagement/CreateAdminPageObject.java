package pageObjects.admin.userManagement;

import commons.BasePage;
import pageUIs.admin.AdminHomePageUI;

import static commons.GlobalConstants.SHORT_TIMEOUT;
import static commons.GlobalConstants.THREE_SECONDS;

public class CreateAdminPageObject extends BasePage {

    public CreateAdminPageObject() {
    }

    public CreateUserManagementPageObject clickCancelWarehouseButton() {
        waitForElementClickable(AdminHomePageUI.CANCEL_WAREHOUSE_BUTTON);
        clickToElement(AdminHomePageUI.CANCEL_WAREHOUSE_BUTTON);
        return new CreateUserManagementPageObject();
    }

    public void inputToIdCard(String idCard) {
        waitForElementVisible(AdminHomePageUI.ID_CARD_INPUT_TEXT);
        sendKeyToElement(AdminHomePageUI.ID_CARD_INPUT_TEXT, idCard);
    }

    public void inputToDateOfBirth(String dateOfBirth) {
        waitForElementVisible(AdminHomePageUI.DATE_OF_BIRTH_IN_USER_MANAGEMENT_INPUT);
        sendKeyToElement(AdminHomePageUI.DATE_OF_BIRTH_IN_USER_MANAGEMENT_INPUT, dateOfBirth);
    }

    public void inputToName(String name) {
        waitForElementVisible(AdminHomePageUI.NAME_IN_USER_MANAGEMENT_INPUT);
        sendKeyToElement(AdminHomePageUI.NAME_IN_USER_MANAGEMENT_INPUT, name);
    }

    public void inputToPhone(String phone) {
        waitForElementVisible(AdminHomePageUI.PHONE_NUMBER_IN_USER_MANAGEMENT_INPUT);
        sendKeyToElement(AdminHomePageUI.PHONE_NUMBER_IN_USER_MANAGEMENT_INPUT, phone);
    }

    public void inputToDateRange(String dateRange) {
        waitForElementVisible(AdminHomePageUI.DATE_RANGE_IN_USER_MANAGEMENT_INPUT);
        sendKeyToElement(AdminHomePageUI.DATE_RANGE_IN_USER_MANAGEMENT_INPUT, dateRange);
    }

    public void inputToIssuedBy(String issuedBy) {
        waitForElementVisible(AdminHomePageUI.ISSUED_BY_IN_USER_MANAGEMENT_INPUT);
        sendKeyToElement(AdminHomePageUI.ISSUED_BY_IN_USER_MANAGEMENT_INPUT, issuedBy);
    }

    public void inputToAddress(String address) {
        waitForElementVisible(AdminHomePageUI.ADDRESS_IN_USER_MANAGEMENT_INPUT);
        sendKeyToElement(AdminHomePageUI.ADDRESS_IN_USER_MANAGEMENT_INPUT, address);
    }

    public void inputToTimeIn(String timeIn) {
        scrollToElement(AdminHomePageUI.TIME_IN_IN_USER_MANAGEMENT_INPUT);
        waitForElementVisible(AdminHomePageUI.TIME_IN_IN_USER_MANAGEMENT_INPUT);
        sendKeyToElement(AdminHomePageUI.TIME_IN_IN_USER_MANAGEMENT_INPUT, timeIn);
    }

    public CreateAccountAdminPageObject clickNextWarehouseButton() {
        waitForElementClickable(AdminHomePageUI.NEXT_IN_USER_MANAGEMENT_BUTTON);
        clickToElement(AdminHomePageUI.NEXT_IN_USER_MANAGEMENT_BUTTON);
        return new CreateAccountAdminPageObject();
    }

    public String getErrorMessageName() {
        scrollToElement(AdminHomePageUI.ERROR_MESSAGE_IN_USER_MANAGEMENT_EMPTY_NAME);
        waitForElementVisible(AdminHomePageUI.ERROR_MESSAGE_IN_USER_MANAGEMENT_EMPTY_NAME);
        return getElementText(AdminHomePageUI.ERROR_MESSAGE_IN_USER_MANAGEMENT_EMPTY_NAME);
    }

    public String getErrorMessagePhone() {
        scrollToElement(AdminHomePageUI.ERROR_MESSAGE_IN_USER_MANAGEMENT_EMPTY_PHONE);
        waitForElementVisible(AdminHomePageUI.ERROR_MESSAGE_IN_USER_MANAGEMENT_EMPTY_PHONE);
        return getElementText(AdminHomePageUI.ERROR_MESSAGE_IN_USER_MANAGEMENT_EMPTY_PHONE);
    }

    public String getErrorMessageDateOfBirth() {
        scrollToElement(AdminHomePageUI.ERROR_MESSAGE_IN_USER_MANAGEMENT_EMPTY_DATE_OF_BIRTH);
        waitForElementVisible(AdminHomePageUI.ERROR_MESSAGE_IN_USER_MANAGEMENT_EMPTY_DATE_OF_BIRTH);
        return getElementText(AdminHomePageUI.ERROR_MESSAGE_IN_USER_MANAGEMENT_EMPTY_DATE_OF_BIRTH);
    }

    public String getErrorMessageIdCard() {
        scrollToElement(AdminHomePageUI.ERROR_MESSAGE_IN_USER_MANAGEMENT_EMPTY_ID_CARD);
        waitForElementVisible(AdminHomePageUI.ERROR_MESSAGE_IN_USER_MANAGEMENT_EMPTY_ID_CARD);
        return getElementText(AdminHomePageUI.ERROR_MESSAGE_IN_USER_MANAGEMENT_EMPTY_ID_CARD);
    }

    public String getErrorMessageDateRange() {
        scrollToElement(AdminHomePageUI.ERROR_MESSAGE_IN_USER_MANAGEMENT_EMPTY_DATE_RANGE);
        waitForElementVisible(AdminHomePageUI.ERROR_MESSAGE_IN_USER_MANAGEMENT_EMPTY_DATE_RANGE);
        return getElementText(AdminHomePageUI.ERROR_MESSAGE_IN_USER_MANAGEMENT_EMPTY_DATE_RANGE);
    }

    public String getErrorMessageIssuedBy() {
        scrollToElement(AdminHomePageUI.ERROR_MESSAGE_IN_USER_MANAGEMENT_EMPTY_ISSUE_BY);
        waitForElementVisible(AdminHomePageUI.ERROR_MESSAGE_IN_USER_MANAGEMENT_EMPTY_ISSUE_BY);
        return getElementText(AdminHomePageUI.ERROR_MESSAGE_IN_USER_MANAGEMENT_EMPTY_ISSUE_BY);
    }

    public String getErrorMessageAddress() {
        scrollToElement(AdminHomePageUI.ERROR_MESSAGE_IN_USER_MANAGEMENT_EMPTY_SELECT_ADDRESS);
        waitForElementVisible(AdminHomePageUI.ERROR_MESSAGE_IN_USER_MANAGEMENT_EMPTY_SELECT_ADDRESS);
        return getElementText(AdminHomePageUI.ERROR_MESSAGE_IN_USER_MANAGEMENT_EMPTY_SELECT_ADDRESS);
    }

    public String getErrorMessageGender() {
        scrollToElement(AdminHomePageUI.ERROR_MESSAGE_IN_USER_MANAGEMENT_EMPTY_GENDER);
        waitForElementVisible(AdminHomePageUI.ERROR_MESSAGE_IN_USER_MANAGEMENT_EMPTY_GENDER);
        return getElementText(AdminHomePageUI.ERROR_MESSAGE_IN_USER_MANAGEMENT_EMPTY_GENDER);
    }

    public void inputToGender(String gender) {
        scrollToElement(AdminHomePageUI.GENDER_IN_USER_MANAGEMENT_INPUT);
        waitForElementClickable(AdminHomePageUI.GENDER_IN_USER_MANAGEMENT_INPUT);
        sendKeyToElement(AdminHomePageUI.GENDER_IN_USER_MANAGEMENT_INPUT, gender);
    }

    public void clickToValueGender() {
        scrollToElement(AdminHomePageUI.VALUE_GENDER_IN_USER_MANAGEMENT_INPUT);
        sleepInSecond(SHORT_TIMEOUT);
        waitForElementClickable(AdminHomePageUI.VALUE_GENDER_IN_USER_MANAGEMENT_INPUT);
        clickToElement(AdminHomePageUI.VALUE_GENDER_IN_USER_MANAGEMENT_INPUT);
    }

    public String getErrorMessageMaritalStatus() {
        scrollToElement(AdminHomePageUI.ERROR_MESSAGE_IN_USER_MANAGEMENT_EMPTY_MARITAL_STATUS);
        waitForElementVisible(AdminHomePageUI.ERROR_MESSAGE_IN_USER_MANAGEMENT_EMPTY_MARITAL_STATUS);
        return getElementText(AdminHomePageUI.ERROR_MESSAGE_IN_USER_MANAGEMENT_EMPTY_MARITAL_STATUS);
    }

    public void inputToMaritalStatus(String maritalStatus) {
        scrollToElement(AdminHomePageUI.MARITAL_STATUS_IN_USER_MANAGEMENT_INPUT);
        waitForElementClickable(AdminHomePageUI.MARITAL_STATUS_IN_USER_MANAGEMENT_INPUT);
        sendKeyToElement(AdminHomePageUI.MARITAL_STATUS_IN_USER_MANAGEMENT_INPUT, maritalStatus);
    }

    public void clickToValueMaritalStatus() {
        scrollToElement(AdminHomePageUI.VALUE_MARITAL_STATUS_IN_USER_MANAGEMENT_INPUT);
        sleepInSecond(SHORT_TIMEOUT);
        waitForElementClickable(AdminHomePageUI.VALUE_MARITAL_STATUS_IN_USER_MANAGEMENT_INPUT);
        clickToElement(AdminHomePageUI.VALUE_MARITAL_STATUS_IN_USER_MANAGEMENT_INPUT);
    }

    public void inputToPosition(String position) {
        scrollToElement(AdminHomePageUI.POSITION_IN_USER_MANAGEMENT_INPUT);
        waitForElementClickable(AdminHomePageUI.POSITION_IN_USER_MANAGEMENT_INPUT);
        sendKeyToElement(AdminHomePageUI.POSITION_IN_USER_MANAGEMENT_INPUT, position);
    }

    public void clickToValuePosition() {
        scrollToElement(AdminHomePageUI.VALUE_POSITION_IN_USER_MANAGEMENT_INPUT);
        sleepInSecond(THREE_SECONDS);
        waitForElementClickable(AdminHomePageUI.VALUE_POSITION_IN_USER_MANAGEMENT_INPUT);
        clickToElement(AdminHomePageUI.VALUE_POSITION_IN_USER_MANAGEMENT_INPUT);
    }

    public void inputToNationality(String nationality) {
        scrollToElement(AdminHomePageUI.NATIONALITY_IN_USER_MANAGEMENT_INPUT);
        waitForElementClickable(AdminHomePageUI.NATIONALITY_IN_USER_MANAGEMENT_INPUT);
        sendKeyToElement(AdminHomePageUI.NATIONALITY_IN_USER_MANAGEMENT_INPUT, nationality);
    }

    public void clickToValueNationality() {
        scrollToElement(AdminHomePageUI.VALUE_NATIONALITY_ACCOUNTANT_INPUT);
        sleepInSecond(SHORT_TIMEOUT);
        waitForElementClickable(AdminHomePageUI.VALUE_NATIONALITY_ACCOUNTANT_INPUT);
        clickToElement(AdminHomePageUI.VALUE_NATIONALITY_ACCOUNTANT_INPUT);
    }

    public void inputToNation(String nation) {
        scrollToElement(AdminHomePageUI.NATION_IN_USER_MANAGEMENT_INPUT);
        waitForElementClickable(AdminHomePageUI.NATION_IN_USER_MANAGEMENT_INPUT);
        sendKeyToElement(AdminHomePageUI.NATION_IN_USER_MANAGEMENT_INPUT, nation);
    }

    public void clickToValueNation() {
        scrollToElement(AdminHomePageUI.VALUE_NATION_ACCOUNTANT_INPUT);
        sleepInSecond(SHORT_TIMEOUT);
        waitForElementClickable(AdminHomePageUI.VALUE_NATION_ACCOUNTANT_INPUT);
        clickToElement(AdminHomePageUI.VALUE_NATION_ACCOUNTANT_INPUT);
    }
}
