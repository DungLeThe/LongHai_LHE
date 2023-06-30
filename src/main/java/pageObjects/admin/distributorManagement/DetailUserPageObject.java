package pageObjects.admin.distributorManagement;

import commons.BasePage;
import pageUIs.admin.AdminHomePageUI;

import static commons.GlobalConstants.THREE_SECONDS;

public class DetailUserPageObject extends BasePage {

    public DetailUserPageObject() {
    }

    public String getUserNameText() {
        sleepInSecond(THREE_SECONDS);
        waitForElementVisible(AdminHomePageUI.USER_NAME_TEXT);
        return getElementText(AdminHomePageUI.USER_NAME_TEXT);
    }

    public String
    getInfoDistributorText(String info) {
        waitForElementVisible(AdminHomePageUI.INFO_DISTRIBUTOR_TEXT, info);
        return getElementText(AdminHomePageUI.INFO_DISTRIBUTOR_TEXT, info);
    }
}
