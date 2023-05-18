package pageObjects.admin.userManagement;

import commons.BasePage;
import pageObjects.admin.distributorManagement.CreateInformationDistributorPageObject;
import pageObjects.admin.product.ProductHomePageObject;
import pageUIs.admin.AdminHomePageUI;

public class CreateUserManagementPageObject extends BasePage {

    public CreateUserManagementPageObject() {
    }

    public ProductHomePageObject clickCancelButton() {
        waitForElementClickable(AdminHomePageUI.CANCEL_BUTTON);
        clickToElement(AdminHomePageUI.CANCEL_BUTTON);
        return new ProductHomePageObject();
    }

    public CreateInformationDistributorPageObject clickAddDistributorManagement() {
        waitForElementClickable(AdminHomePageUI.ADD_DISTRIBUTOR_DIV);
        clickToElement(AdminHomePageUI.ADD_DISTRIBUTOR_DIV);
        return new CreateInformationDistributorPageObject();
    }

    public CreateMarketingStaffPageObject clickAddMarketingStaff() {
        waitForElementClickable(AdminHomePageUI.ADD_MARKETING_STAFF_DIV);
        clickToElement(AdminHomePageUI.ADD_MARKETING_STAFF_DIV);
        return new CreateMarketingStaffPageObject();
    }

    public CreateAccountantPageObject clickAddAccountant() {
        waitForElementClickable(AdminHomePageUI.ADD_ACCOUNTANT_DIV);
        clickToElement(AdminHomePageUI.ADD_ACCOUNTANT_DIV);
        return new CreateAccountantPageObject();
    }

    public CreateWarehousePageObject clickAddWarehouse() {
        waitForElementClickable(AdminHomePageUI.ADD_WAREHOUSE_DIV);
        clickToElement(AdminHomePageUI.ADD_WAREHOUSE_DIV);
        return new CreateWarehousePageObject();
    }

    public CreateAdminPageObject clickAddAdmin() {
        waitForElementClickable(AdminHomePageUI.ADD_ADMIN_DIV);
        clickToElement(AdminHomePageUI.ADD_ADMIN_DIV);
        return new CreateAdminPageObject();
    }
}
