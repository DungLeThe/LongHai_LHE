package pageObjects.admin.accountManagement;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageUIs.admin.AdminHomePageUI;

public class ListDistributorPageObject extends BasePage {
	private WebDriver driver;

	public ListDistributorPageObject(WebDriver driver) {
		this.driver = driver;
	}
}
