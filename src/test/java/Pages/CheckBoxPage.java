package Pages;

import Base.BaseTest;
import Tests.CheckBoxTests;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CheckBoxPage extends BaseTest {
    public CheckBoxPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".rct-collapse.rct-collapse-btn")
    public WebElement expandButton;
    @FindBy(css = ".rct-option.rct-option-expand-all")
    public WebElement expandAllButton;
    @FindBy(className = "rct-title")
    public List<WebElement> treeNode;
    @FindBy(css = ".rct-node.rct-node-parent.rct-node-expanded")
    public List<WebElement> treeParentDirectories;


    @FindBy(id = "result")
    public WebElement result;

    // ------------------------------

    public void expandButtonClick() {
        expandButton.click();
    }
    public void clickOnExpandAllButton() {
        expandAllButton.click();
    }

    public void clickOnParentDirectories() {

        for (int i = 0; i < treeParentDirectories.size(); i++) {
            treeParentDirectories.get(i).click();
            break;
        }
    }


//    public void clickOnCheckBoxItem() {
//        for (int i = 0; i <= treeNode.size(); i++) {
//            treeNode.get(i).click();
//        }
//    }



}
