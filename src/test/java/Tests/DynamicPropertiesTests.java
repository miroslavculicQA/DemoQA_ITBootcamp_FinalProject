package Tests;

import Base.BaseTest;
import Pages.DynamicPropertiesPage;
import Pages.HomePage;
import Pages.SidebarPage;
import Pages.TextBoxPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DynamicPropertiesTests extends BaseTest {
    @BeforeMethod
    public void pageSetUp() {
        homePage = new HomePage();
        sidebarPage = new SidebarPage();
        textBoxPage = new TextBoxPage();
        dynamicPropertiesPage = new DynamicPropertiesPage();

        homePage.clickOnCard("Elements");
        clickOn_Elements_DynamicProperties();     // Clicks on an item from Elements menu in sidebar

    }


    @Test(priority = 10)
    public void buttonIsEnabledAfter5Seconds(){
        dynamicPropertiesPage.validateThatButtonIs_DISSABLED(dynamicPropertiesPage.willEnable5SecondsButton);

        wait.until(ExpectedConditions.elementToBeClickable(dynamicPropertiesPage.willEnable5SecondsButton));

        dynamicPropertiesPage.validateThatButtonIs_ENABLED(dynamicPropertiesPage.willEnable5SecondsButton);

    }

    @Test(priority = 20)
    public void buttonIsVisibleAfter5Seconds() {
        elementIsDisplayed(dynamicPropertiesPage.visibleAfter5Seconds);

        wait.until(ExpectedConditions.elementToBeClickable(dynamicPropertiesPage.visibleAfter5Seconds));
        Assert.assertTrue(dynamicPropertiesPage.elementIsDisplayed(dynamicPropertiesPage.visibleAfter5Seconds));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }










}


