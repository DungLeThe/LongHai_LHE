package pageObjects.npp.product.category;

import commons.BasePage;
import pageUIs.npp.NppCategoryPageUI;
import pageUIs.npp.NppProductPageUI;

import static commons.GlobalConstants.SHORT_TIMEOUT;
import static commons.GlobalConstants.THREE_SECONDS;

public class ProductPageObject extends BasePage {

    public ProductPageObject() {
    }

    public ProductPageObject ViewCategoryButton() {
        waitForElementVisible(NppCategoryPageUI.VIEW_CATEGORY_BUTTON);
        clickToElement(NppCategoryPageUI.VIEW_CATEGORY_BUTTON);
        return new ProductPageObject();
    }

    public void clickViewCategoryButton() {
        waitForElementVisible(NppCategoryPageUI.VIEW_CATEGORY_BUTTON);
        clickToElement(NppCategoryPageUI.VIEW_CATEGORY_BUTTON);
    }

    public void createNewCategory() {
        waitForElementVisible(NppCategoryPageUI.CREATE_NEW_CATEGORY_BUTTON);
        clickToElement(NppCategoryPageUI.CREATE_NEW_CATEGORY_BUTTON);
    }

    public void inputCategoryName() {
        waitForElementVisible(NppCategoryPageUI.INPUT_NEW_CATEGORY_FIELD);
        sendKeyToElement(NppCategoryPageUI.INPUT_NEW_CATEGORY_FIELD, "New Category");
    }

    public void confirmCreateNewCategory() {
        waitForElementClickable(NppCategoryPageUI.CONFIRM_CREATE_NEW_CATEGORY_BUTTON);
        clickToElement(NppCategoryPageUI.CONFIRM_CREATE_NEW_CATEGORY_BUTTON);
    }

    public void deleteCategory() {
        sleepInSecond(THREE_SECONDS);
        waitForElementVisible(NppCategoryPageUI.DELETE_CATEGORY_ICON);
        clickToElement(NppCategoryPageUI.DELETE_CATEGORY_ICON);
    }

    public void clickDeleteCategoryButton() {
        sleepInSecond(SHORT_TIMEOUT);
        waitForElementVisible(NppCategoryPageUI.DELETE_CATEGORY_BUTTON);
        clickToElement(NppCategoryPageUI.DELETE_CATEGORY_BUTTON);
    }

    public void clickViewProductDetail() {
        waitForElementVisible(NppProductPageUI.PRODUCT_IMG);
        clickToElement(NppProductPageUI.PRODUCT_IMG);
    }

    public void clickConfigCategoryButton() {
        sleepInSecond(SHORT_TIMEOUT);
        waitForElementVisible(NppProductPageUI.CONFIG_CATEGORY_BUTTON);
        clickToElement(NppProductPageUI.CONFIG_CATEGORY_BUTTON);
    }

    public void clickCategoryCheckbox() {
        waitForElementVisible(NppProductPageUI.CATEGORY_CHECKBOX);
        clickToElement(NppProductPageUI.CATEGORY_CHECKBOX);
    }

    public String numberOfCheckboxesIsSelected() {
        sleepInSecond(SHORT_TIMEOUT);
        waitForElementVisible(NppProductPageUI.CATEGORY_SELECTED);
        String numberOfCheckboxSelected = getElementText(NppProductPageUI.CATEGORY_SELECTED);
        return numberOfCheckboxSelected;
    }
}