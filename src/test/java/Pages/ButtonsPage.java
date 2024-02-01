package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ButtonsPage extends BaseTest {

    public ButtonsPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "doubleClickBtn")
    public WebElement doubleClickMeButton;
    @FindBy(id = "rightClickBtn")
    public WebElement rightClickMeButton;
    @FindBy(xpath = "//*[text()='Click Me']")
    public WebElement clickMeButton;


    @FindBy(id = "doubleClickMessage")
    public WebElement doubleClickMessage;
    @FindBy(id = "rightClickMessage")
    public WebElement rightClickMessge;
    @FindBy(id = "dynamicClickMessage")
    public WebElement dynamicClickMessage;



    // -----------------------
    public void clickOnDoubleClickMeButton() {
        Actions action = new Actions(driver);
        action.doubleClick(doubleClickMeButton).perform();
    }
    public void clickOnRightClickMeButton() {
        Actions action = new Actions(driver);
        action.contextClick(rightClickMeButton).perform();
    }
    public void clickOnClickMeButton() {
        clickMeButton.click();
    }






}
