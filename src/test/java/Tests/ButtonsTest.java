package Tests;

import Base.BaseTest;
import Pages.ButtonsPage;
import Pages.HomePage;
import Pages.SidebarPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ButtonsTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp() {


//        driver.get("https://demoqa.com/");
        driver.get("https://demoqa.com/elements");

        homePage = new HomePage();
        sidebarPage = new SidebarPage();
        buttonsPage = new ButtonsPage();

        clickOnButtonsElement();
    }

    @Test
    public void userCanClickOnAllButtons() throws InterruptedException {
        buttonsPage.clickOnDoubleClickMeButton();
        Assert.assertTrue(buttonsPage.doubleClickMessage.isDisplayed());
        buttonsPage.clickOnRightClickMeButton();
        Assert.assertTrue(buttonsPage.rightClickMessge.isDisplayed());
        buttonsPage.clickOnClickMeButton();
        Assert.assertTrue((buttonsPage.dynamicClickMessage.isDisplayed()));
    }

//    @Test
//    public void userCanRightClickOnRightClickMeButton() {
//        buttonsPage.clickOnRightClickMeButton();
//        Assert.assertTrue(buttonsPage.rightClickMessge.isDisplayed());
//    }
//    @Test
//    public void userCanClickOnClickMeButton() {
//
//    }

}
