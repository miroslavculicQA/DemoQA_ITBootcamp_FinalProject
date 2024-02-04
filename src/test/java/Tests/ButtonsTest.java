package Tests;

import Base.BaseTest;
import Pages.ButtonsPage;
import Pages.HomePage;
import Pages.SidebarPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ButtonsTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp() {
        homePage = new HomePage();
        sidebarPage = new SidebarPage();
        buttonsPage = new ButtonsPage();

        homePage.clickOnCard("Elements");
        clickOn_Elements_Buttons();     // Clicks on an item from Elements menu in sidebar
    }

    @Test
    public void userCanClickOnAllButtons() throws InterruptedException {
        Thread.sleep(2000);

        action_doubleClick(buttonsPage.doubleClickMeButton);
        Assert.assertTrue(buttonsPage.doubleClickMessage.isDisplayed());

        action_rightClick(buttonsPage.rightClickMeButton);
        Assert.assertTrue(buttonsPage.rightClickMessge.isDisplayed());

        buttonsPage.clickOnClickMeButton();
        Assert.assertTrue((buttonsPage.dynamicClickMessage.isDisplayed()));

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
