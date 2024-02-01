package Tests;

import Base.BaseTest;
import Pages.CheckBoxPage;
import Pages.HomePage;
import Pages.SidebarPage;
import Pages.TextBoxPage;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class CheckBoxTests extends BaseTest {

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
        checkBoxPage = new CheckBoxPage();
        sidebarPage.clickOnSideBarItem("Check Box");
        checkBoxPage.clickOnExpandAllButton();

    }

    @Test
    public void clickTest() {

        checkBoxPage.clickOnParentDirectories();

    }



}
