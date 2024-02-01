package Base;


import Pages.*;
import Tests.CheckBoxTests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;

public class BaseTest {
    public static WebDriver driver;
    public WebDriverWait wait;
    public ExcelReader excelReader;

    public HomePage homePage;
    public SidebarPage sidebarPage;
    public TextBoxPage textBoxPage;
    public CheckBoxPage checkBoxPage;
    public ButtonsPage buttonsPage;
    public LinksPage linksPage;


    @BeforeClass
    public void setUp() throws IOException {
        WebDriverManager.chromedriver().setup();
        excelReader = new ExcelReader("TestData.xlsx");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        wait = new WebDriverWait(driver, Duration.ofSeconds(3));

    }
    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void clickOnButtonsElement() {
        sidebarPage.clickOnSideBarItem("Buttons");
    }
    public void clickOnLinksElement() {
        sidebarPage.clickOnSideBarItem("Links");
    }

}
