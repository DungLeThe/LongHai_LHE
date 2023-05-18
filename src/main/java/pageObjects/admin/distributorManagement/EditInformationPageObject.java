package pageObjects.admin.distributorManagement;

import commons.BasePage;
import pageUIs.admin.AdminHomePageUI;

public class EditInformationPageObject extends BasePage {

    public EditInformationPageObject() {

    }

    public void inputToIdCard(String idCard) {
        waitForElementVisible(AdminHomePageUI.ID_CARD_INPUT_TEXT);
        sendKeyToElement(AdminHomePageUI.ID_CARD_INPUT_TEXT, idCard);
    }

    public void inputToTaxCode(String taxCode) {
        waitForElementVisible(AdminHomePageUI.TAX_CODE_INPUT_TEXT);
        sendKeyToElement(AdminHomePageUI.TAX_CODE_INPUT_TEXT, taxCode);
    }

    public void clickToSelectAddress() {
        waitForElementClickable(AdminHomePageUI.SELECT_ADDRESS_INPUT);
        clickToElement(AdminHomePageUI.SELECT_ADDRESS_INPUT);
    }

    public void clickToSelectCity() {
        waitForElementClickable(AdminHomePageUI.SELECT_CITY);
        clickToElement(AdminHomePageUI.SELECT_CITY);
    }

    public void clickToSelectDistrict() {
        waitForElementClickable(AdminHomePageUI.SELECT_DISTRICT);
        clickToElement(AdminHomePageUI.SELECT_DISTRICT);
    }

    public void inputToWarehouseArea(String idCard) {
        waitForElementVisible(AdminHomePageUI.WAREHOUSE_AREA_INPUT_TEXT);
        sendKeyToElement(AdminHomePageUI.WAREHOUSE_AREA_INPUT_TEXT, idCard);
    }

    public void inputToLabor(String idCard) {
        waitForElementVisible(AdminHomePageUI.LABOR_INPUT_TEXT);
        sendKeyToElement(AdminHomePageUI.LABOR_INPUT_TEXT, idCard);
    }

    public ConfirmEditInformationPageObject clickSaveButton() {
        waitForElementVisible(AdminHomePageUI.SAVE_DISTRIBUTOR_BUTTON);
        clickToElement(AdminHomePageUI.SAVE_DISTRIBUTOR_BUTTON);
        return new ConfirmEditInformationPageObject();
    }

    public void inputAvatarImage(String avatarImage) {
        uploadImage(AdminHomePageUI.AVATAR_IMAGE, avatarImage);
    }
}
