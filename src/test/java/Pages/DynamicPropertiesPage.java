package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DynamicPropertiesPage extends BaseTest {
    public DynamicPropertiesPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "enableAfter")
    public WebElement willEnable5SecondsButton;
//    @FindBy(id = "colorChange")
//    public WebElement colorChangeButton;
    @FindBy(id = "visibleAfter")
    public WebElement visibleAfter5Seconds;
    @FindBy(css = ".mt-4.text-danger.btn btn-primarymt-4.text-danger btn.btn-primary")
    public WebElement colorChangeButton;

    // ------------------------------------








}
