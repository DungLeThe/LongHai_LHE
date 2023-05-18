package pageObjects.admin.order;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageUIs.admin.AdminHomePageUI;

public class OrderDetailPageObject extends BasePage {

	public OrderDetailPageObject() {
	}

	public void clickCancelButton() {
		waitForLoadingIconInvisible();
		waitForElementClickable(AdminHomePageUI.CANCEL_ORDER_MODAL_SUCCESS_BUTTON);
		clickToElement(AdminHomePageUI.CANCEL_ORDER_MODAL_SUCCESS_BUTTON);
	}

	public boolean isProcessingButtonDisplayed() {
		waitForElementVisible(AdminHomePageUI.PROCESSING_BUTTON);
		return isElementDisplay(AdminHomePageUI.PROCESSING_BUTTON);
	}

	public void clickApproveOrderButton() {
		waitForLoadingIconInvisible();
		waitForElementClickable(AdminHomePageUI.APPROVE_BUTTON);
		clickToElement(AdminHomePageUI.APPROVE_BUTTON);
	}

	public void clickRefuseOrderButton() {
		waitForElementClickable(AdminHomePageUI.REFUSE_ORDER_BUTTON);
		clickToElement(AdminHomePageUI.REFUSE_ORDER_BUTTON);
	}

	public void inputNoteText(String noteText) {
		waitForElementClickable(AdminHomePageUI.NOTE_TEXT_AREA);
		sendKeyToElement(AdminHomePageUI.NOTE_TEXT_AREA, noteText);
	}

	public void clickConfirmButton() {
		waitForElementClickable(AdminHomePageUI.CONFIRM_BUTTON);
		clickToElement(AdminHomePageUI.CONFIRM_BUTTON);
	}

	public boolean isFailureButtonDisplayed() {
		waitForElementVisible(AdminHomePageUI.FAILURE_BUTTON);
		return isElementDisplay(AdminHomePageUI.FAILURE_BUTTON);
	}

	public String getDistributorText() {
		waitForElementVisible(AdminHomePageUI.DISTRIBUTOR_TEXT);
		return getElementText(AdminHomePageUI.DISTRIBUTOR_TEXT);
	}

	public String getEnterNoteText() {
		waitForElementVisible(AdminHomePageUI.ENTER_NOTE_TEXT);
		return getElementText(AdminHomePageUI.ENTER_NOTE_TEXT);
	}

	public String getStoreText() {
		waitForElementVisible(AdminHomePageUI.STORE_TEXT);
		return getElementText(AdminHomePageUI.STORE_TEXT);
	}

	public String getProductNameText() {
		waitForElementVisible(AdminHomePageUI.PRODUCT_NAME_TEXT);
		return getElementText(AdminHomePageUI.PRODUCT_NAME_TEXT);
	}

    public void clickAddProductButton() {
		waitForLoadingIconInvisible();
		waitForElementClickable(AdminHomePageUI.ADD_PRODUCT_IN_EDIT_ORDER_BUTTON);
		clickToElement(AdminHomePageUI.ADD_PRODUCT_IN_EDIT_ORDER_BUTTON);
    }

	public void dragAndDropIcon() {
		waitForLoadingItemInvisible();
		waitForElementClickable(AdminHomePageUI.HELP_DESK_ICON);
		dragAndDrop( AdminHomePageUI.HELP_DESK_ICON, AdminHomePageUI.SELECT_ALL_TEXT);
	}

	public void clickCancelHelpdesk() {
		waitForElementClickable(AdminHomePageUI.CANCEL_HELP_DESK);
		clickToElement(AdminHomePageUI.CANCEL_HELP_DESK);
	}

	public void clickChooseProductTextbox() {
		waitForLoadingItemInvisible();
		waitForElementClickable(AdminHomePageUI.CHOOSE_PRODUCT_CHECKBOX);
		clickToElement(AdminHomePageUI.CHOOSE_PRODUCT_CHECKBOX);
	}

	public void clickAddButton() {
		waitForElementClickable(AdminHomePageUI.ADD_BUTTON);
		clickToElement(AdminHomePageUI.ADD_BUTTON);
	}

	public void clickChooseProductAddNewTextbox() {
		waitForLoadingItemInvisible();
		waitForElementClickable(AdminHomePageUI.CHOOSE_PRODUCT_ADD_NEW_CHECKBOX);
		clickToElement(AdminHomePageUI.CHOOSE_PRODUCT_ADD_NEW_CHECKBOX);
	}

	public void clickUpdateOrderButton() {
		waitForLoadingIconInvisible();
		waitForElementClickable(AdminHomePageUI.UPDATE_ORDER_BUTTON);
		clickToElement(AdminHomePageUI.UPDATE_ORDER_BUTTON);
	}
}
