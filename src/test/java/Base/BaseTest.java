package Base;


import Pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
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
    public RadioButtonPage radioButtonPage;
    // WebTables
    public ButtonsPage buttonsPage;
    public LinksPage linksPage;
    //Brokend Links - Images
    // Uplaod and Download
    public DynamicPropertiesPage dynamicPropertiesPage;


    @BeforeClass
    public void setUp() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        excelReader = new ExcelReader("TestData.xlsx");

        driver.get("https://demoqa.com/");
    }


    public void clickOn_Elements_Buttons() {
        sidebarPage.clickOnSideBarItem("Buttons");
    }
    public void clickOn_Elements_Links() {
        sidebarPage.clickOnSideBarItem("Links");
    }
    public void clickOn_Elements_RadioButton() {
        sidebarPage.clickOnSideBarItem("Radio Button");
    }
    public void clickOn_Elements_TextBox() {
        sidebarPage.clickOnSideBarItem("Text Box");
    }

    public void clickOn_Elements_DynamicProperties() {
        scrollDown("250");
        sidebarPage.clickOnSideBarItem("Dynamic properties");
    }


    // JS Executor for scrolling down
    public void scrollDown(String scrollParam) {
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0," + scrollParam + ")");
    }

    // JS Executor for scrolling to WebElement
    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    // Action for double-click on a Web Element
    public void action_doubleClick(WebElement element) {
        Actions action = new Actions(driver);
        action.doubleClick(element).perform();
    }

    // Action for right-click on a Web Element
    public void action_rightClick(WebElement element) {
        Actions action = new Actions(driver);
        action.contextClick(element).perform();
    }

    // Click on radio button with JS
    public void clickOnRadioButtonWithJS(WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);
    }

    // Validates if button is DISABLED
    public void validateThatButtonIs_DISSABLED(WebElement button) {
        Assert.assertSame(false, button.isEnabled());

    }

    // Validates if button is ENABLED
    public void validateThatButtonIs_ENABLED(WebElement button) {
        Assert.assertSame(true, button.isEnabled());
    }


    // Check if Web element is displayed
    public boolean elementIsDisplayed(WebElement element) {
        boolean isDisplayed = false;
        try {
            isDisplayed = element.isDisplayed();
        } catch (Exception e) {
            System.out.println(e);
        }
        return isDisplayed;
    }

}
