package pageObjects.admin.distributorManagement;

import commons.BasePage;
import pageUIs.admin.AdminHomePageUI;

import static commons.GlobalConstants.SHORT_TIMEOUT;

public class DetailDistributorPageObject extends BasePage {

    public DetailDistributorPageObject() {

    }

    public EditInformationPageObject clickEditDistributorButton() {
        waitForElementClickable(AdminHomePageUI.EDIT_DISTRIBUTOR_BUTTON);
        clickToElement(AdminHomePageUI.EDIT_DISTRIBUTOR_BUTTON);
        return new EditInformationPageObject();
    }

    public void clickStaffTab() {
        waitForElementClickable(AdminHomePageUI.STAFF_TAB_IN_DISTRIBUTOR_DETAIL);
        clickToElement(AdminHomePageUI.STAFF_TAB_IN_DISTRIBUTOR_DETAIL);
    }

    public void clickAddNewStaffButton() {
        waitForLoadingIconInvisible();
        waitForElementClickable(AdminHomePageUI.ADD_NEW_STAFF_BUTTON);
        clickToElement(AdminHomePageUI.ADD_NEW_STAFF_BUTTON);
    }

    public void inputSearchStaff(String name) {
        sleepInSecond(SHORT_TIMEOUT);
        waitForElementClickable(AdminHomePageUI.SEARCH_STAFF_INPUT);
        sendKeyToElement(AdminHomePageUI.SEARCH_STAFF_INPUT, name);
        waitForLoadingItemInvisible();
    }

    public void clickSelectStaffCheckbox(String name) {
        waitForLoadingItemInvisible();
        scrollToElement(AdminHomePageUI.SELECT_STAFF_CHECKBOX, name);
        waitForElementClickable(AdminHomePageUI.SELECT_STAFF_CHECKBOX, name);
        clickToElement(AdminHomePageUI.SELECT_STAFF_CHECKBOX, name);
    }

    public void clickAddStaffButtonInModal() {
        waitForElementClickable(AdminHomePageUI.ADD_STAFF_BUTTON_IN_MODAL);
        clickToElement(AdminHomePageUI.ADD_STAFF_BUTTON_IN_MODAL);
    }

    public void clickCloseModalButton() {
        waitForLoadingIconInvisible();
        waitForElementClickable(AdminHomePageUI.CLOSE_MODAL_BUTTON);
        clickToElement(AdminHomePageUI.CLOSE_MODAL_BUTTON);
    }

    public void dragAndDropIcon() {
        waitForElementClickable(AdminHomePageUI.HELP_DESK_ICON);
        dragAndDrop(AdminHomePageUI.HELP_DESK_ICON, AdminHomePageUI.BELL_ICON);
    }
}
