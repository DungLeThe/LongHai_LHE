package pageObjects.admin.order;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageUIs.admin.AdminHomePageUI;

public class CreateOrderPageObject extends BasePage {

	public CreateOrderPageObject() {
	}

	public OrderHomePageObject clickCancelButton() {
		waitForElementClickable(AdminHomePageUI.CANCEL_BUTTON);
		clickToElement(AdminHomePageUI.CANCEL_BUTTON);
		return new OrderHomePageObject();
	}

	public void clickChooseStoreButton() {
		waitForElementVisible(AdminHomePageUI.CHOOSE_STORE_BUTTON);
		clickToElement(AdminHomePageUI.CHOOSE_STORE_BUTTON);
	}

	public void clickSelectStore() {
		waitForElementVisible(AdminHomePageUI.STORE_INPUT_VALUE);
		clickToElement(AdminHomePageUI.STORE_INPUT_VALUE);
	}

	public void clickChooseProductButton() {
		waitForElementClickable(AdminHomePageUI.CHOOSE_PRODUCT_IN_STOCK_BUTTON);
		clickToElement(AdminHomePageUI.CHOOSE_PRODUCT_IN_STOCK_BUTTON);
	}

	public void clickChooseProductTextbox() {
		waitForLoadingItemInvisible();
		waitForElementClickable(AdminHomePageUI.CHOOSE_PRODUCT_CHECKBOX);
		clickToElement(AdminHomePageUI.CHOOSE_PRODUCT_CHECKBOX);
	}

	public void clickCancelProductButton() {
		waitForElementClickable(AdminHomePageUI.CANCEL_PRODUCT_BUTTON);
		clickToElement(AdminHomePageUI.CANCEL_PRODUCT_BUTTON);
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

	public void clickAddButton() {
		waitForElementClickable(AdminHomePageUI.ADD_BUTTON);
		clickToElement(AdminHomePageUI.ADD_BUTTON);
	}

	public void clickDistributorInput() {
		waitForElementClickable(AdminHomePageUI.DISTRIBUTOR_INPUT);
		clickToElement(AdminHomePageUI.DISTRIBUTOR_INPUT);
	}

	public void clickSelectDistributor() {
		waitForLoadingItemInvisible();
		waitForElementClickable(AdminHomePageUI.SELECT_DISTRIBUTOR_DROPDOWN);
		clickToElement(AdminHomePageUI.SELECT_DISTRIBUTOR_DROPDOWN);
	}

	public void clickCreateOrderButton() {
		waitForElementClickable(AdminHomePageUI.CREATE_ORDER_BUTTON);
		clickToElement(AdminHomePageUI.CREATE_ORDER_BUTTON);
	}

	public void clickListPageButton() {
		waitForLoadingItemInvisible();
		waitForElementClickable(AdminHomePageUI.LIST_PAGE_BUTTON);
		clickToElement(AdminHomePageUI.LIST_PAGE_BUTTON);
	}

	public OrderDetailPageObject clickViewDetailOrderButton() {
		waitForLoadingIconInvisible();
		waitForElementClickable(AdminHomePageUI.VIEW_DETAIL_ORDER_BUTTON);
		clickToElement(AdminHomePageUI.VIEW_DETAIL_ORDER_BUTTON);
		return new OrderDetailPageObject();
	}
}
