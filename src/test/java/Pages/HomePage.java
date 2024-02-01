package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseTest {

    public HomePage() {
        PageFactory.initElements(driver, this);
    }


    // TODO IZMENI LOKATOR ZA ELEMENTS KARTICU

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[3]/h5")
    public WebElement elementsCard;


    // -----------------------------
    public void clickOnElementsCard() {
        elementsCard.click();
    }


}
