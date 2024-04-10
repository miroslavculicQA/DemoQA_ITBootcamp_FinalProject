package Tests;

import Base.BaseTest;
import Pages.ButtonsPage;
import Pages.HomePage;
import Pages.SidebarPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ButtonsTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp() {
        homePage = new HomePage();
        sidebarPage = new SidebarPage();
        buttonsPage = new ButtonsPage();

        homePage.clickOnCard("Elements");
        clickOn_Elements_Buttons();     // Clicks on item from Elements menu in sidebar
    }

    @Test (priority = 10)
    public void userCanClickOnDoubleClickButton() {
        wait.until(ExpectedConditions.elementToBeClickable(buttonsPage.doubleClickMeButton));
        action_doubleClick(buttonsPage.doubleClickMeButton);
        Assert.assertTrue(buttonsPage.doubleClickMessage.isDisplayed());
        Assert.assertEquals(buttonsPage.doubleClickMessageExpectedText, buttonsPage.doubleClickMessageText());
    }

    @Test (priority = 20)
    public void userCanClickOnRightClickButton() {
        wait.until(ExpectedConditions.elementToBeClickable(buttonsPage.rightClickMeButton));
        action_rightClick(buttonsPage.rightClickMeButton);
        Assert.assertTrue(buttonsPage.rightClickMessge.isDisplayed());
        Assert.assertEquals(buttonsPage.rightClickMessageExpectedText, buttonsPage.rightClickMessageText());
    }

    @Test (priority = 30)
    public void userCanClickOnClickMeButton() {
        wait.until(ExpectedConditions.elementToBeClickable(buttonsPage.clickMeButton));
        buttonsPage.clickOnClickMeButton();
        Assert.assertTrue(buttonsPage.dynamicClickMessage.isDisplayed());
        Assert.assertEquals(buttonsPage.clickMessageExpectedText, buttonsPage.clickMessageText());
    }





}
