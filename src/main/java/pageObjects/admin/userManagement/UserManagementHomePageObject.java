package pageObjects.admin.userManagement;

import commons.BasePage;
import pageObjects.admin.distributorManagement.DetailUserPageObject;
import pageUIs.admin.AdminHomePageUI;

public class UserManagementHomePageObject extends BasePage {

    public UserManagementHomePageObject() {
    }

    public CreateUserManagementPageObject clickAddUserManagementButton() {
        waitForElementClickable(AdminHomePageUI.ADD_NEW_USER_MANAGEMENT_BUTTON);
        clickToElement(AdminHomePageUI.ADD_NEW_USER_MANAGEMENT_BUTTON);
        return new CreateUserManagementPageObject();
    }

    public boolean representativeDisplayed(String representative) {
        waitForElementVisible(AdminHomePageUI.REPRESENTATIVE, representative);
        return isElementDisplay(AdminHomePageUI.REPRESENTATIVE, representative);
    }

    public void clickViewDetailAllDistributor() {
        waitForElementClickable(AdminHomePageUI.VIEW_DETAIL_ALL_DISTRIBUTOR_DIV);
        clickToElement(AdminHomePageUI.VIEW_DETAIL_ALL_DISTRIBUTOR_DIV);
    }

    public DetailUserPageObject clickViewDetailNewDistributor() {
        waitForLoadingItemInvisible();
        waitForElementClickable(AdminHomePageUI.VIEW_DETAIL_NEW_DISTRIBUTOR);
        clickToElement(AdminHomePageUI.VIEW_DETAIL_NEW_DISTRIBUTOR);
        return new DetailUserPageObject();
    }

    public void clickViewDetailAllAccountant() {
        waitForElementClickable(AdminHomePageUI.VIEW_DETAIL_ALL_ACCOUNTANT_DIV);
        clickToElement(AdminHomePageUI.VIEW_DETAIL_ALL_ACCOUNTANT_DIV);
    }

    public DetailUserPageObject clickViewDetailNewAccountant() {
        waitForLoadingIconInvisible();
        waitForElementClickable(AdminHomePageUI.VIEW_DETAIL_NEW_ACCOUNTANT);
        clickToElement(AdminHomePageUI.VIEW_DETAIL_NEW_ACCOUNTANT);
        return new DetailUserPageObject();
    }

    public void clickViewDetailAllAdmin() {
        waitForElementClickable(AdminHomePageUI.VIEW_DETAIL_ALL_ADMIN_DIV);
        clickToElement(AdminHomePageUI.VIEW_DETAIL_ALL_ADMIN_DIV);
    }

    public DetailUserPageObject clickViewDetailNewAdmin() {
        waitForLoadingIconInvisible();
        waitForElementClickable(AdminHomePageUI.VIEW_DETAIL_NEW_ADMIN);
        clickToElement(AdminHomePageUI.VIEW_DETAIL_NEW_ADMIN);
        return new DetailUserPageObject();
    }

    public void clickViewDetailAllMarketingStaff() {
        waitForElementClickable(AdminHomePageUI.VIEW_DETAIL_ALL_MARKETING_STAFF_DIV);
        clickToElement(AdminHomePageUI.VIEW_DETAIL_ALL_MARKETING_STAFF_DIV);
    }

    public DetailUserPageObject clickViewDetailNewMarketingStaff() {
        waitForLoadingIconInvisible();
        waitForElementClickable(AdminHomePageUI.VIEW_DETAIL_NEW_MARKETING_STAFF);
        clickToElement(AdminHomePageUI.VIEW_DETAIL_NEW_MARKETING_STAFF);
        return new DetailUserPageObject();
    }

    public void clickViewDetailAllWarehouse() {
        waitForElementClickable(AdminHomePageUI.VIEW_DETAIL_ALL_WAREHOUSE_DIV);
        clickToElement(AdminHomePageUI.VIEW_DETAIL_ALL_WAREHOUSE_DIV);
    }

    public DetailUserPageObject clickViewDetailNewWarehouse() {
        waitForLoadingIconInvisible();
        waitForElementClickable(AdminHomePageUI.VIEW_DETAIL_NEW_WAREHOUSE);
        clickToElement(AdminHomePageUI.VIEW_DETAIL_NEW_WAREHOUSE);
        return new DetailUserPageObject();
    }
}
