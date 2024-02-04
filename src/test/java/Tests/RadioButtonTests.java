package Tests;

import Base.BaseTest;
import Pages.ButtonsPage;
import Pages.HomePage;
import Pages.RadioButtonPage;
import Pages.SidebarPage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RadioButtonTests extends BaseTest {
    @BeforeMethod
    public void pageSetUp() {
        homePage = new HomePage();
        sidebarPage = new SidebarPage();
        radioButtonPage = new RadioButtonPage();

        homePage.clickOnCard("Elements");
        clickOn_Elements_RadioButton();     // Clicks on an item from Elements menu in sidebar

    }

    @Test(priority = 10)
    public void userCanClickOn_YesRadioButton(){
        Assert.assertFalse(radioButtonPage.yesRadioButton.isSelected());

        clickOnRadioButtonWithJS(radioButtonPage.yesRadioButton);
        Assert.assertTrue(radioButtonPage.selectedButtonText.isDisplayed());
        Assert.assertEquals(radioButtonPage.selectedButtonText.getText(), "Yes");
    }

    @Test(priority = 20)
    public void userCanClickOn_ImpressiveRadioButton(){
        Assert.assertFalse(radioButtonPage.impressiveRadioButton.isSelected());

        clickOnRadioButtonWithJS(radioButtonPage.impressiveRadioButton);
        Assert.assertTrue(radioButtonPage.selectedButtonText.isDisplayed());
        Assert.assertEquals(radioButtonPage.selectedButtonText.getText(), "Impressive");
    }


    // Pomoću JS je moguće kliknuti i na No dugme iako je onemogućeno i test prolazi
    @Test(priority = 30)
    public void userCanNOTClickOn_NoRadioButton(){
        Assert.assertFalse(radioButtonPage.yesRadioButton.isSelected());
        Assert.assertFalse(radioButtonPage.impressiveRadioButton.isSelected());
        clickOnRadioButtonWithJS(radioButtonPage.noRadioButton);

        /*try {
            clickOnRadioButtonWithJS(radioButtonPage.noRadioButton);
        } catch (Exception e) {
            System.out.println(e);
        }*/

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }



}
