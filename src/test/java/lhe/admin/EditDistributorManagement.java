package lhe.admin;

import commons.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.admin.AdminHomePageObject;
import pageObjects.admin.AdminLoginPageObject;
import pageObjects.admin.distributorManagement.ConfirmEditInformationPageObject;
import pageObjects.admin.distributorManagement.DetailDistributorPageObject;
import pageObjects.admin.distributorManagement.DistributorManagementPageObject;
import pageObjects.admin.distributorManagement.EditInformationPageObject;
import reportConfig.ExtentTestManager;

import java.lang.reflect.Method;

import static commons.BasePage.getRandomInt;
import static commons.BasePage.getRandomString;
import static commons.GlobalConstants.ADMIN_LOGIN;
import static commons.GlobalConstants.PROJECT_PATH;
import static org.testng.Assert.assertTrue;

public class EditDistributorManagement extends BaseTest {

    private String representative, phone, taxCode, idCard, idCardInvalid, dateRange, issuedBy, enterAddress, warehouseArea,
            labor, timeIn, distributionRoomCode, marketRoomCode, avatarImage;
    private String browserName;

    private AdminLoginPageObject loginPage;
    private AdminHomePageObject homePage;
    private DistributorManagementPageObject distributorPage;
    private EditInformationPageObject editInformationPage;
    private DetailDistributorPageObject detailDistributorPage;
    private ConfirmEditInformationPageObject confirmEditInformationPage;

    @BeforeClass
    public void beforeClass() {
        browserName = "chrome";
        loginPage = new AdminLoginPageObject(ADMIN_LOGIN);
        homePage = loginPage.goToAdminHomePage();

        avatarImage = PROJECT_PATH + "\\uploadFiles\\AvatarImage.jpg";
        representative = "LHETest" + getRandomString();
        phone = "09876" + getRandomInt();
        taxCode = "01234" + getRandomInt();
        idCard = "0123456" + getRandomInt();
        idCardInvalid = "0987654321987654321";
        dateRange = "01/01/2011";
        issuedBy = "Ha Noi";
        enterAddress = "Cau Giay, Ha Noi";
        warehouseArea = "1000";
        labor = "20";
        timeIn = "20/04/2020";
        distributionRoomCode = "AD1";
        marketRoomCode = "AD1";
    }

    public void goToHomPage() {
        homePage.openPageUrl(ADMIN_LOGIN);
        homePage.clickButtonDragToTheLeft();
    }

    @Test
    public void TC_01_Edit_Data_Success(Method method) {
        ExtentTestManager.startTest(method.getName(), "Edit Distributor Management Success");
        goToHomPage();
        distributorPage = homePage.clickDistributorManagementButton();
        detailDistributorPage = distributorPage.clickViewDetailDistributorButton();
        editInformationPage = detailDistributorPage.clickEditDistributorButton();

        editInformationPage.inputAvatarImage(avatarImage);
        editInformationPage.inputByPlaceholder("Nơi cấp", issuedBy);
        editInformationPage.inputByPlaceholder("Người đại diện", representative);
        editInformationPage.inputByPlaceholder("Số điện thoại", phone);

        editInformationPage.inputToTaxCode(taxCode);
        editInformationPage.inputToIdCard(idCard);
        editInformationPage.inputByPlaceholder("Ngày cấp", dateRange);
        editInformationPage.clickToSelectAddress();
        editInformationPage.clickToSelectCity();
        editInformationPage.clickToSelectDistrict();

        editInformationPage.scrollToBottomPage();
        editInformationPage.inputByPlaceholder("Địa chỉ cụ thể", enterAddress);

        editInformationPage.inputByPlaceholder("Mã chiện - Phòng thị trường tạo", marketRoomCode);
        editInformationPage.inputByPlaceholder("Mã NPP - Phòng kế toán tạo", distributionRoomCode);
        editInformationPage.inputByPlaceholder("Thời gian vào", timeIn);
        editInformationPage.inputByPlaceholder("Diện tích kho", warehouseArea);
        editInformationPage.inputToWarehouseArea(warehouseArea);
        editInformationPage.inputToLabor(labor);
        confirmEditInformationPage = editInformationPage.clickSaveButton();
        assertTrue(confirmEditInformationPage.isConfirmSuccessTextDisplayed());
    }
}
