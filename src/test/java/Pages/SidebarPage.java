package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SidebarPage extends BaseTest {

    public SidebarPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "text")
    public List<WebElement> elementsMenuItems;

    // -----------------------------

    // Click on an Item from Sidebar
    public void clickOnSideBarItem(String itemName) {
        for (int i = 0; i < elementsMenuItems.size(); i++) {
            if (elementsMenuItems.get(i).getText().equalsIgnoreCase(itemName)) {
                elementsMenuItems.get(i).click();
                break;
            }
        }
    }


}
