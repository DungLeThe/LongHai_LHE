package pageObjects.admin.distributorManagement;

import commons.BasePage;
import pageUIs.admin.AdminHomePageUI;

public class DistributorManagementPageObject extends BasePage {
    public DistributorManagementPageObject() {

    }

    public CreateInformationDistributorPageObject clickAddMemberButton() {
        waitForElementClickable(AdminHomePageUI.ADD_MEMBER_BUTTON);
        clickToElement(AdminHomePageUI.ADD_MEMBER_BUTTON);
        return new CreateInformationDistributorPageObject();
    }

    public DetailDistributorPageObject clickViewDetailDistributorButton() {
        waitForElementClickable(AdminHomePageUI.VIEW_DETAIL_DISTRIBUTOR_BUTTON);
        clickToElement(AdminHomePageUI.VIEW_DETAIL_DISTRIBUTOR_BUTTON);
        return new DetailDistributorPageObject();
    }

    public boolean isDistributorManagementTextDisplayed() {
        waitForElementVisible(AdminHomePageUI.DISTRIBUTOR_MANAGEMENT_TEXT);
        return isElementDisplay(AdminHomePageUI.DISTRIBUTOR_MANAGEMENT_TEXT);
    }
}
