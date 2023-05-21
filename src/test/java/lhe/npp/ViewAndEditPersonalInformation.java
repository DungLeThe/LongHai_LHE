package lhe.npp;

import commons.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.npp.NppHomePageObject;
import pageObjects.npp.NppLoginPageObject;
import pageObjects.npp.UserInfoObject.NppUserInfoObject;
import pageUIs.npp.NppUserInfoPageUI;
import reportConfig.ExtentTestManager;

import java.lang.reflect.Method;

import static commons.GlobalConstants.NPP_LOGIN;

public class ViewAndEditPersonalInformation extends BaseTest {
    private String browserName;
    private NppLoginPageObject loginPage;
    private NppHomePageObject homePage;
    private NppUserInfoObject infoPage;
    private String fullName = "NPP Test";
    private String idNumber = "222233445566";
    private String dateOfBirth = "2000-01-10";
    private String phoneNumber = "0981122322";
    private String address = "DV, Cau Giay, Ha Noi";


    @BeforeClass
    public void beforeClass() {
        browserName = "chrome";
        loginPage = new NppLoginPageObject(NPP_LOGIN);
        homePage = new NppHomePageObject();
        infoPage = new NppUserInfoObject();

        homePage = loginPage.goToNppHomePage();
    }

    public void goToNppHomePage() {
        homePage.openPageUrl(NPP_LOGIN);
        homePage.dragToLeft();
    }

    @Test
    public void TC_01_EditInfoThenSave(Method method) {
        ExtentTestManager.startTest(method.getName(), "Edit Info");
        goToNppHomePage();
        infoPage = homePage.clickPersonalInfoIcon();
        infoPage.clickPersonalInfoTab();
        infoPage.clickEditPersonalInfoButton();
        infoPage.clearValueInElementByDeleteKey(NppUserInfoPageUI.FULLNAME_FIELD);
        infoPage.clearValueInElementByDeleteKey(NppUserInfoPageUI.ID_NUMBER_FIELD);
        infoPage.clearValueInElementByDeleteKey(NppUserInfoPageUI.DOB_FIELD);
        infoPage.clearValueInElementByDeleteKey(NppUserInfoPageUI.PHONE_NUMBER_FIELD);
        infoPage.clearValueInElementByDeleteKey(NppUserInfoPageUI.ADDRESS_FIELD);
        infoPage.sendKeyToElement(NppUserInfoPageUI.FULLNAME_FIELD, fullName);
        infoPage.sendKeyToElement(NppUserInfoPageUI.ID_NUMBER_FIELD, idNumber);
        infoPage.sendKeyToElement(NppUserInfoPageUI.DOB_FIELD, dateOfBirth);
        infoPage.sendKeyToElement(NppUserInfoPageUI.PHONE_NUMBER_FIELD, phoneNumber);
        infoPage.sendKeyToElement(NppUserInfoPageUI.ADDRESS_FIELD, address);
        infoPage.clickToElement(NppUserInfoPageUI.SAVE_INFO_BUTTON);
        Assert.assertEquals(infoPage.getInfoDistributor("Họ và tên "), fullName);
        Assert.assertEquals(infoPage.getInfoDistributor("CMT/CCCD "), idNumber);
//        Assert.assertEquals(infoPage.getInfoDistributor("Ngày sinh "), dateOfBirth);
        Assert.assertEquals(infoPage.getInfoDistributor("Số điện thoại "), phoneNumber);
        Assert.assertEquals(infoPage.getInfoDistributor("Địa chỉ "), address);
    }

    @Test
    public void TC_02_CancelEditInfo(Method method) {
        ExtentTestManager.startTest(method.getName(), "Cancel Edit Info");
        goToNppHomePage();
        infoPage = homePage.clickPersonalInfoIcon();
        infoPage.clickPersonalInfoTab();
        infoPage.clickEditPersonalInfoButton();
        infoPage.clickCancelEditPersonalInfoButton();
    }
}