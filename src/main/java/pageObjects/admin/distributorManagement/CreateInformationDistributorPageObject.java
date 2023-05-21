package pageObjects.admin.distributorManagement;

import commons.BasePage;
import pageUIs.admin.AdminHomePageUI;

public class CreateInformationDistributorPageObject extends BasePage {

    public CreateInformationDistributorPageObject() {
    }

    public DistributorManagementPageObject clickCancelButton() {
        waitForLoadingItemInvisible();
        waitForElementClickable(AdminHomePageUI.CANCEL_BUTTON);
        clickToElement(AdminHomePageUI.CANCEL_BUTTON);
        return new DistributorManagementPageObject();
    }

    public boolean isPersonalInformationTextDisplayed() {
        waitForElementVisible(AdminHomePageUI.PERSONAL_INFORMATION_TEXT);
        return isElementDisplay(AdminHomePageUI.PERSONAL_INFORMATION_TEXT);
    }

    public void inputToIdCard(String idCard) {
        waitForElementVisible(AdminHomePageUI.ID_CARD_INPUT_TEXT);
        sendKeyToElement(AdminHomePageUI.ID_CARD_INPUT_TEXT, idCard);
    }

    public CreateAccountDistributorPageObject clickNextButton() {
        waitForElementClickable(AdminHomePageUI.NEXT_BUTTON);
        clickToElement(AdminHomePageUI.NEXT_BUTTON);
        return new CreateAccountDistributorPageObject();
    }

    public String getErrorMessageInvalidRepresentative() {
        waitForElementVisible(AdminHomePageUI.ERROR_MESSAGE_INVALID_REPRESENTATIVE);
        return getElementText(AdminHomePageUI.ERROR_MESSAGE_INVALID_REPRESENTATIVE);
    }

    public String getErrorMessageInvalidPhone() {
        waitForElementVisible(AdminHomePageUI.ERROR_MESSAGE_INVALID_PHONE);
        return getElementText(AdminHomePageUI.ERROR_MESSAGE_INVALID_PHONE);
    }

    public String getErrorInvalidMessageIdCard() {
        waitForElementVisible(AdminHomePageUI.ERROR_MESSAGE_INVALID_ID_CARD);
        return getElementText(AdminHomePageUI.ERROR_MESSAGE_INVALID_ID_CARD);
    }

    public void clickToLabor() {
        waitForElementClickable(AdminHomePageUI.LABOR_INPUT);
        clickToElement(AdminHomePageUI.LABOR_INPUT);
    }

    public String getErrorMessageRepresentative() {
        waitForElementVisible(AdminHomePageUI.ERROR_MESSAGE_EMPTY_REPRESENTATIVE);
        return getElementText(AdminHomePageUI.ERROR_MESSAGE_EMPTY_REPRESENTATIVE);
    }

    public String getErrorMessagePhone() {
        waitForElementVisible(AdminHomePageUI.ERROR_MESSAGE_EMPTY_PHONE);
        return getElementText(AdminHomePageUI.ERROR_MESSAGE_EMPTY_PHONE);
    }

    public String getErrorMessageTaxCode() {
        waitForElementVisible(AdminHomePageUI.ERROR_MESSAGE_EMPTY_TAX_CODE);
        return getElementText(AdminHomePageUI.ERROR_MESSAGE_EMPTY_TAX_CODE);
    }

    public String getErrorMessageIdCard() {
        waitForElementVisible(AdminHomePageUI.ERROR_MESSAGE_EMPTY_ID_CARD);
        return getElementText(AdminHomePageUI.ERROR_MESSAGE_EMPTY_ID_CARD);
    }

    public String getErrorMessageDateRange() {
        waitForElementVisible(AdminHomePageUI.ERROR_MESSAGE_EMPTY_DATE_RANGE);
        return getElementText(AdminHomePageUI.ERROR_MESSAGE_EMPTY_DATE_RANGE);
    }

    public String getErrorMessageIssuedBy() {
        waitForElementVisible(AdminHomePageUI.ERROR_MESSAGE_EMPTY_ISSUE_BY);
        return getElementText(AdminHomePageUI.ERROR_MESSAGE_EMPTY_ISSUE_BY);
    }

    public String getErrorMessageSelectAddress() {
        waitForElementVisible(AdminHomePageUI.ERROR_MESSAGE_EMPTY_SELECT_ADDRESS);
        return getElementText(AdminHomePageUI.ERROR_MESSAGE_EMPTY_SELECT_ADDRESS);
    }

    public String getErrorMessageAddress() {
        waitForElementVisible(AdminHomePageUI.ERROR_MESSAGE_EMPTY_ADDRESS);
        return getElementText(AdminHomePageUI.ERROR_MESSAGE_EMPTY_ADDRESS);
    }

    public String getErrorMessageWarehouseArea() {
        waitForElementVisible(AdminHomePageUI.ERROR_MESSAGE_EMPTY_WAREHOUSE_AREA);
        return getElementText(AdminHomePageUI.ERROR_MESSAGE_EMPTY_WAREHOUSE_AREA);
    }

    public String getErrorMessageLabor() {
        waitForElementVisible(AdminHomePageUI.ERROR_MESSAGE_EMPTY_LABOR);
        return getElementText(AdminHomePageUI.ERROR_MESSAGE_EMPTY_LABOR);
    }

    public String getErrorMessageTimeIn() {
        waitForElementVisible(AdminHomePageUI.ERROR_MESSAGE_EMPTY_TIME_IN);
        return getElementText(AdminHomePageUI.ERROR_MESSAGE_EMPTY_TIME_IN);
    }

    public void inputToTaxCode(String taxCode) {
        waitForElementVisible(AdminHomePageUI.TAX_CODE_INPUT_TEXT);
        sendKeyToElement(AdminHomePageUI.TAX_CODE_INPUT_TEXT, taxCode);
    }

    public void clickToSelectAddress() {
        waitForLoadingItemInvisible();
        waitForElementClickable(AdminHomePageUI.SELECT_ADDRESS_INPUT);
        clickToElement(AdminHomePageUI.SELECT_ADDRESS_INPUT);
    }

    public void clickToSelectCity() {
        waitForLoadingItemInvisible();
        waitForElementClickable(AdminHomePageUI.SELECT_CITY);
        clickToElement(AdminHomePageUI.SELECT_CITY);
    }

    public void clickToSelectDistrict() {
        waitForLoadingItemInvisible();
        waitForElementClickable(AdminHomePageUI.SELECT_DISTRICT);
        clickToElement(AdminHomePageUI.SELECT_DISTRICT);
    }

    public void clickToSelectWard() {
        waitForLoadingItemInvisible();
        waitForElementClickable(AdminHomePageUI.SELECT_WARD);
        clickToElement(AdminHomePageUI.SELECT_WARD);
    }

    public void inputToWarehouseArea(String warehouseArea) {
        waitForElementVisible(AdminHomePageUI.WAREHOUSE_AREA_INPUT_TEXT);
        sendKeyToElement(AdminHomePageUI.WAREHOUSE_AREA_INPUT_TEXT, warehouseArea);
    }

    public void inputToLabor(String labor) {
        waitForElementVisible(AdminHomePageUI.LABOR_INPUT_TEXT);
        sendKeyToElement(AdminHomePageUI.LABOR_INPUT_TEXT, labor);
    }

    public void clickToInputRegion() {
        waitForElementVisible(AdminHomePageUI.REGION_INPUT_TEXT);
        clickToElement(AdminHomePageUI.REGION_INPUT_TEXT);
        waitForElementClickable(AdminHomePageUI.REGION_VALUE);
    }

    public void clickToInputArea() {
        waitForElementVisible(AdminHomePageUI.AREA_INPUT_TEXT);
        clickToElement(AdminHomePageUI.AREA_INPUT_TEXT);
    }
}
