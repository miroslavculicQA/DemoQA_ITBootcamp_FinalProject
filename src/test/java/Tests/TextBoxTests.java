package Tests;

import Base.BaseTest;
import Pages.RadioButtonPage;
import Pages.SidebarPage;
import Pages.HomePage;
import Pages.TextBoxPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TextBoxTests extends BaseTest {
    @BeforeMethod
    public void pageSetUp() {
        homePage = new HomePage();
        sidebarPage = new SidebarPage();
        textBoxPage = new TextBoxPage();

        homePage.clickOnCard("Elements");
        clickOn_Elements_TextBox();     // Clicks on an item from Elements menu in sidebar

    }


    @Test
    public void userCanFillTextBoxes_AndSubmitFormWithValidData() {
        for (int i = 1; i <= excelReader.getLastRow("TextBox"); i++) {
            String validFullName = excelReader.getStringData("TextBox", i, 0);
            String validEmail = excelReader.getStringData("TextBox", i, 1);
            String validCurrentAddress = excelReader.getStringData("TextBox", i, 2);
            String validPermanentAddress = excelReader.getStringData("TextBox", i, 3);

            textBoxPage.inputFullName(validFullName);
            textBoxPage.inputEmail(validEmail);
            textBoxPage.inputCurrentAddress(validCurrentAddress);
            textBoxPage.inputPermanentAddress(validPermanentAddress);

            textBoxPage.clickOnSubmitButton();

            Assert.assertEquals(textBoxPage.output.get(0).getText(), "Name:" + validFullName);
            Assert.assertEquals(textBoxPage.output.get(1).getText(), "Email:" + validEmail);
            Assert.assertEquals(textBoxPage.output.get(2).getText(), "Current Address :" + validCurrentAddress);
            Assert.assertEquals(textBoxPage.output.get(3).getText(), "Permananet Address :" + validPermanentAddress);
        }

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }



}
