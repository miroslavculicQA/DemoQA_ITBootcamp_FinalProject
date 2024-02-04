package Tests;

import Base.BaseTest;
import Pages.HomePage;
import Pages.LinksPage;
import Pages.SidebarPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.testng.Assert.assertTrue;

public class LinksTests extends BaseTest {
    @BeforeMethod
    public void pageSetUp() {
        homePage = new HomePage();
        sidebarPage = new SidebarPage();
        linksPage = new LinksPage();

        homePage.clickOnCard("Elements");
        clickOn_Elements_Links();       // Clicks on an item from Elements menu in sidebar
    }

    // TODO     Kod testova pronaći način da umesto Thread.sleep sačekam lokator koji se menja nakon klika na link
    @Test(priority = 10)
    public void clickOn_Home_Link_willOpenInANewTab() {
        linksPage.clickOnHomeLink();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/");
        driver.close();
        driver.switchTo().window(tabs.getFirst());
    }
    @Test(priority = 20)
    public void clickOn_Home_Dynamic_Link_willOpenInANewTab() {
        linksPage.clickOnHomeDynamicLink();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/");
        driver.close();
        driver.switchTo().window(tabs.getFirst());
    }
    @Test(priority = 30)
    public void cliCkOn_Created_Link_getsCorrespondingResponse() throws InterruptedException {
        String actualResponse;
        String createdLinkResponse = excelReader.getStringData("LinksAndResponses", 1, 1);

        linksPage.clickOnCreatedLink();
        Thread.sleep(500);
        actualResponse = linksPage.getLinkResponseText();

        Assert.assertTrue(linksPage.linkResponse.isDisplayed());
        Assert.assertEquals(actualResponse, createdLinkResponse);
    }

    @Test(priority = 40)
    public void cliCkOn_No_Content_Link_getsCorrespondingResponse() throws InterruptedException {
        String actualResponse;
        String createdLinkResponse = excelReader.getStringData("LinksAndResponses", 2, 1);

        linksPage.clickOnNoContentLink();
        Thread.sleep(500);
        actualResponse = linksPage.getLinkResponseText();

        Assert.assertTrue(linksPage.linkResponse.isDisplayed());
        Assert.assertEquals(actualResponse, createdLinkResponse);
    }

    @Test(priority = 50)
    public void cliCkOn_Moved_Link_getsCorrespondingResponse() throws InterruptedException {
        String actualResponse;
        String createdLinkResponse = excelReader.getStringData("LinksAndResponses", 3, 1);

        linksPage.clickOnMovedLink();
        Thread.sleep(500);
        actualResponse = linksPage.getLinkResponseText();

        Assert.assertTrue(linksPage.linkResponse.isDisplayed());
        Assert.assertEquals(actualResponse, createdLinkResponse);
    }

    @Test(priority = 60)
    public void cliCkOn_Bad_Request_Link_getsCorrespondingResponse() throws InterruptedException {
        String actualResponse;
        String createdLinkResponse = excelReader.getStringData("LinksAndResponses", 4, 1);

        linksPage.clickOnBadRequestLink();
        Thread.sleep(500);
        actualResponse = linksPage.getLinkResponseText();

        Assert.assertTrue(linksPage.linkResponse.isDisplayed());
        Assert.assertEquals(actualResponse, createdLinkResponse);
    }

    @Test(priority = 70)
    public void cliCkOn_Unauthorized_Link_getsCorrespondingResponse() throws InterruptedException {
        String actualResponse;
        String createdLinkResponse = excelReader.getStringData("LinksAndResponses", 5, 1);

        linksPage.clickOnUnauthorizedLink();
        Thread.sleep(500);
        actualResponse = linksPage.getLinkResponseText();

        Assert.assertTrue(linksPage.linkResponse.isDisplayed());
        Assert.assertEquals(actualResponse, createdLinkResponse);
    }

    @Test(priority = 80)
    public void cliCkOn_Forbidden_Link_getsCorrespondingResponse() throws InterruptedException {
        String actualResponse;
        String createdLinkResponse = excelReader.getStringData("LinksAndResponses", 6, 1);

        linksPage.clickOnForbiddenLink();
        Thread.sleep(500);
        actualResponse = linksPage.getLinkResponseText();

        Assert.assertTrue(linksPage.linkResponse.isDisplayed());
        Assert.assertEquals(actualResponse, createdLinkResponse);
    }

    @Test(priority = 90)
    public void cliCkOn_Not_Found_Link_getsCorrespondingResponse() throws InterruptedException {
        String actualResponse;
        String createdLinkResponse = excelReader.getStringData("LinksAndResponses", 7, 1);

        linksPage.clickOnNotFoundLink();
        Thread.sleep(500);
        actualResponse = linksPage.getLinkResponseText();

        Assert.assertTrue(linksPage.linkResponse.isDisplayed());
        Assert.assertEquals(actualResponse, createdLinkResponse);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}





