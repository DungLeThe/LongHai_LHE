package pageObjects.admin.order;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageUIs.admin.AdminHomePageUI;

public class OrderDetailPageObject extends BasePage {
	private WebDriver driver;

	public OrderDetailPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public boolean isOrderSuccessTextDisplayed() {
		waitForElementVisible(driver, AdminHomePageUI.ORDER_SUCCESS_TEXT);
		return isElementDisplay(driver, AdminHomePageUI.ORDER_SUCCESS_TEXT);
	}

	public void clickCancelButton() {
		waitForElementClickable(driver, AdminHomePageUI.CANCEL_ORDER_MODAL_SUCCESS_BUTTON);
		clickToElement(driver, AdminHomePageUI.CANCEL_ORDER_MODAL_SUCCESS_BUTTON);
	}

	public boolean isProcessingButtonDisplayed() {
		waitForElementVisible(driver, AdminHomePageUI.PROCESSING_BUTTON);
		return isElementDisplay(driver, AdminHomePageUI.PROCESSING_BUTTON);
	}

	public void clickApproveOrderButton() {
		waitForLoadingIconInvisible(driver);
		waitForElementClickable(driver, AdminHomePageUI.APPROVE_BUTTON);
		clickToElement(driver, AdminHomePageUI.APPROVE_BUTTON);
	}

	public void clickRefuseOrderButton() {
		waitForElementClickable(driver, AdminHomePageUI.REFUSE_ORDER_BUTTON);
		clickToElement(driver, AdminHomePageUI.REFUSE_ORDER_BUTTON);
	}

	public void inputNoteText(String noteText) {
		waitForElementClickable(driver, AdminHomePageUI.NOTE_TEXT_AREA);
		sendKeyToElement(driver, AdminHomePageUI.NOTE_TEXT_AREA, noteText);
	}

	public void clickConfirmButton() {
		waitForElementClickable(driver, AdminHomePageUI.CONFIRM_BUTTON);
		clickToElement(driver, AdminHomePageUI.CONFIRM_BUTTON);
	}

	public boolean isFailureButtonDisplayed() {
		waitForElementVisible(driver, AdminHomePageUI.FAILURE_BUTTON);
		return isElementDisplay(driver, AdminHomePageUI.FAILURE_BUTTON);
	}
}
