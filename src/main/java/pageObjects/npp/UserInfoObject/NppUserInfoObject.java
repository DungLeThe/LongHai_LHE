package pageObjects.npp.UserInfoObject;

import commons.BasePage;
import pageUIs.npp.NppUserInfoPageUI;

import static commons.GlobalConstants.SHORT_TIMEOUT;

public class NppUserInfoObject extends BasePage {
    public NppUserInfoObject() {
    }

    public NppUserInfoObject PersonalInformation() {
        waitForElementVisible(NppUserInfoPageUI.PERSONAL_INFOMATION_ICON);
        clickToElement(NppUserInfoPageUI.PERSONAL_INFOMATION_ICON);
        return new NppUserInfoObject();
    }

    public void clickPersonalInfoTab() {
        waitForElementVisible(NppUserInfoPageUI.PERSONAL_INFO_TAB);
        clickToElement(NppUserInfoPageUI.PERSONAL_INFO_TAB);
    }

    public void clickEditPersonalInfoButton() {
        waitForElementVisible(NppUserInfoPageUI.EDIT_PERSONAL_INFO_BUTTON);
        clickToElement(NppUserInfoPageUI.EDIT_PERSONAL_INFO_BUTTON);
    }

    public String getInfoDistributor(String info) {
        waitForElementVisible(NppUserInfoPageUI.INFO_DISTRIBUTOR_TEXT, info);
        return getElementText(NppUserInfoPageUI.INFO_DISTRIBUTOR_TEXT, info);
    }

    public void clickCancelEditPersonalInfoButton() {
        sleepInSecond(SHORT_TIMEOUT);
        waitForElementVisible(NppUserInfoPageUI.CANCEL_EDIT_INFO_BUTTON);
        clickToElement(NppUserInfoPageUI.CANCEL_EDIT_INFO_BUTTON);
    }
}
