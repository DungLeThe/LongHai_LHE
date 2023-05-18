package pageObjects.warehouse;

import commons.BasePage;
import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pageUIs.warehouse.WareHouseHomePageUI;
import pageUIs.warehouse.WareHouseTransactionSlipPageUI;

import static pageUIs.warehouse.WareHouseTransactionSlipPageUI.REASON_EXPORT;

public class WareHouseHomePageObject extends BasePage {

    public WareHouseHomePageObject() {
    }

    public WareHouseHomePageObject clickTransactionSlipButton() {
        waitForElementVisible(WareHouseHomePageUI.TRANSACTION_NOTE_ICON);
        clickToElement(WareHouseHomePageUI.TRANSACTION_NOTE_ICON);
        return new WareHouseHomePageObject();
    }

    public void clickExportNote() {
        waitForElementVisible(WareHouseTransactionSlipPageUI.EXPORT_NOTE_ICON);
        clickToElement(WareHouseTransactionSlipPageUI.EXPORT_NOTE_ICON);
    }

    public void clickViewExportNoteDetail() {
        waitForLoadingItemInvisible();
        waitForElementVisible(WareHouseTransactionSlipPageUI.EXPORT_NOTE_DETAIL_ICON);
        clickToElement(WareHouseTransactionSlipPageUI.EXPORT_NOTE_DETAIL_ICON);
    }

    public void clickExport() {
        waitForElementVisible(WareHouseTransactionSlipPageUI.EXPORT_BUTTON);
        clickToElement(WareHouseTransactionSlipPageUI.EXPORT_BUTTON);
    }

    public void clickConfirmExport() {
        waitForElementVisible(WareHouseTransactionSlipPageUI.CONFIRM_POPUP_EXPORT_BUTTON);
        clickToElement(WareHouseTransactionSlipPageUI.CONFIRM_POPUP_EXPORT_BUTTON);
    }

    public void clickCancel() {
        waitForElementVisible(WareHouseTransactionSlipPageUI.CANCEL_EXPORT_BUTTON);
        clickToElement(WareHouseTransactionSlipPageUI.CANCEL_EXPORT_BUTTON);
    }

    public void clickConfirmCancel() {
        waitForElementVisible(WareHouseTransactionSlipPageUI.CONFIRM_POPUP_CANCEL_BUTTON);
        clickToElement(WareHouseTransactionSlipPageUI.CONFIRM_POPUP_CANCEL_BUTTON);
    }

    public boolean isCancelledButtonDisplayed() {
        waitForLoadingIconInvisible();
        waitForElementVisible(WareHouseTransactionSlipPageUI.CANCEL_STATUS_BUTTON);
        return isElementDisplay(WareHouseTransactionSlipPageUI.CANCEL_STATUS_BUTTON);
    }

    public boolean isApprovedButtonDisplayed() {
        waitForElementVisible(WareHouseTransactionSlipPageUI.APPROVED_STATUS_BUTTON);
        return isElementDisplay(WareHouseTransactionSlipPageUI.APPROVED_STATUS_BUTTON);
    }

    public void inputDeliverName() {
        waitForLoadingIconInvisible();
        waitForElementVisible(WareHouseTransactionSlipPageUI.DELIVER_NAME);
        sendKeyToElement(WareHouseTransactionSlipPageUI.DELIVER_NAME, "Nguyen Van A");
    }

    public void inputDriverPlate() {
        waitForLoadingIconInvisible();
        waitForElementVisible(WareHouseTransactionSlipPageUI.DRIVER_PLATE);
        sendKeyToElement(WareHouseTransactionSlipPageUI.DRIVER_PLATE, "29D1-37462");
    }

    public void chooseReasonToExport() {
        waitForLoadingIconInvisible();
        waitForElementVisible(REASON_EXPORT);
        sendKeyToElement(REASON_EXPORT, "Nhà phân phối tạo đơn");
        WebElement enter = DriverManager.getDriver().findElement(By.xpath(REASON_EXPORT));
        enter.sendKeys(Keys.ENTER);
    }
}
