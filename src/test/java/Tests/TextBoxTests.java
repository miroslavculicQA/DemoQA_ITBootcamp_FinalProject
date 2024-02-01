package Tests;

import Base.BaseTest;
import Pages.SidebarPage;
import Pages.HomePage;
import Pages.TextBoxPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TextBoxTests extends BaseTest {

    @BeforeMethod
    public void pageSetUp() {

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        wait = new WebDriverWait(driver, Duration.ofSeconds(3));

        driver.manage().window().maximize();
//        driver.get("https://demoqa.com/");
        driver.get("https://demoqa.com/elements");

        homePage = new HomePage();
        sidebarPage = new SidebarPage();
        textBoxPage = new TextBoxPage();
        sidebarPage.clickOnSideBarItem("Text Box");

        // TODO PREBACI SVE IZ BASE TESTA OVDE

    }

//    @Test
//    public void userCanClickToElementsCard() {
//        homePage.clickOnElementsCard();
//    }

    @Test
    public void userCanClickToElementsItem() {
        sidebarPage.clickOnSideBarItem("Text Box");
    }

    @Test
    public void userCanSubmitFormWithOnlyOneInputFieldFiled() {
        textBoxPage.inputFullName("Miroslav");
        textBoxPage.clickOnSubmitButton();

        // TODO uradi asertaciju
        /*
        String outputText = output.getText();
        String expectedOutputText = "Name:" + fullName + "\nEmail:" + email + "\nCurrent Address :" + currentAddress + "\nPermananet Address :" + permanentAddress;
        Assert.assertEquals(outputText, expectedOutputText);
        */

    }



}
