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

    // --------------------------------------

    // Expected message text for Buttons Page
    public String doubleClickMessageExpectedText = "You have done a double click";
    public String rightClickMessageExpectedText = "You have done a right click";
    public String clickMessageExpectedText = "You have done a dynamic click";


    // Get displayed text after click
    public String doubleClickMessageText() {
        return doubleClickMessage.getText();
    }
    public String rightClickMessageText() {
        return rightClickMessge.getText();
    }
    public String clickMessageText() {
        return dynamicClickMessage.getText();
    }


    public void clickOnClickMeButton() {
        clickMeButton.click();
    }











}
