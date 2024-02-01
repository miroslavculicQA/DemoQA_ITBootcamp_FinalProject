package Tests;

import Base.BaseTest;
import Pages.ButtonsPage;
import Pages.HomePage;
import Pages.LinksPage;
import Pages.SidebarPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertTrue;

public class LinksTests extends BaseTest {
    @BeforeMethod
    public void pageSetUp() {

        driver.get("https://demoqa.com/elements");

        homePage = new HomePage();
        sidebarPage = new SidebarPage();
        linksPage = new LinksPage();
        clickOnLinksElement();

    }

//    @Test
//    public void homeLinkWillOpenInANewTab() {
//        linksPage.clickOnHomeLink();
//        // TODO ASSERT
//    }
//    public void homedSrTGLinkwillOpenInANewTab() {
//        linksPage.clickOnHomedSrTGLink();
//        // TODO ASSERT
//    }

    // ------------------------------\

    @Test
    public void verifyThatCliCkOn_Created_Link_getsCorrespondingResponse() {
        String actualResponse;
        String createdLinkResponse = excelReader.getStringData("LinksAndResponses", 1, 1);

        linksPage.clickOnCreatedLink();
        actualResponse = linksPage.getLinkResponseText();

        Assert.assertTrue(linksPage.linkResponse.isDisplayed());
        Assert.assertEquals(actualResponse, createdLinkResponse);
    }

    @Test
    public void verifyThatCliCkOn_No_Content_Link_getsCorrespondingResponse() {
        String actualResponse;
        String createdLinkResponse = excelReader.getStringData("LinksAndResponses", 2, 1);

        linksPage.clickOnNoContentLink();
        actualResponse = linksPage.getLinkResponseText();

        Assert.assertTrue(linksPage.linkResponse.isDisplayed());
        Assert.assertEquals(actualResponse, createdLinkResponse);
    }

    @Test
    public void verifyThatCliCkOn_Moved_Link_getsCorrespondingResponse() {
        String actualResponse;
        String createdLinkResponse = excelReader.getStringData("LinksAndResponses", 3, 1);

        linksPage.clickOnMovedLink();
        actualResponse = linksPage.getLinkResponseText();

        Assert.assertTrue(linksPage.linkResponse.isDisplayed());
        Assert.assertEquals(actualResponse, createdLinkResponse);
    }

    @Test
    public void verifyThatCliCkOn_Bad_Request_Link_getsCorrespondingResponse() {
        String actualResponse;
        String createdLinkResponse = excelReader.getStringData("LinksAndResponses", 4, 1);

        linksPage.clickOnBadRequestLink();
        actualResponse = linksPage.getLinkResponseText();

        Assert.assertTrue(linksPage.linkResponse.isDisplayed());
        Assert.assertEquals(actualResponse, createdLinkResponse);
    }

    @Test
    public void verifyThatCliCkOn_Unauthorized_Link_getsCorrespondingResponse() {
        String actualResponse;
        String createdLinkResponse = excelReader.getStringData("LinksAndResponses", 5, 1);

        linksPage.clickOnUnauthorizedLink();
        actualResponse = linksPage.getLinkResponseText();

        Assert.assertTrue(linksPage.linkResponse.isDisplayed());
        Assert.assertEquals(actualResponse, createdLinkResponse);
    }

    @Test
    public void verifyThatCliCkOn_Forbidden_Link_getsCorrespondingResponse() {
        String actualResponse;
        String createdLinkResponse = excelReader.getStringData("LinksAndResponses", 6, 1);

        linksPage.clickOnForbiddenLink();
        actualResponse = linksPage.getLinkResponseText();

        Assert.assertTrue(linksPage.linkResponse.isDisplayed());
        Assert.assertEquals(actualResponse, createdLinkResponse);
    }

    @Test
    public void verifyThatCliCkOn_Not_Found_Link_getsCorrespondingResponse() {
        String actualResponse;
        String createdLinkResponse = excelReader.getStringData("LinksAndResponses", 7, 1);

        linksPage.clickOnNotFoundLink();
        actualResponse = linksPage.getLinkResponseText();

        Assert.assertTrue(linksPage.linkResponse.isDisplayed());
        Assert.assertEquals(actualResponse, createdLinkResponse);
    }


//    @Test
//    public void everyAPIcallLinkSendsCorrectResponse() throws InterruptedException {
//        String actualResponse;
//        String createdLinkResponse = excelReader.getStringData("LinksAndResponses", 1, 1);
//        String noContentResponse = excelReader.getStringData("LinksAndResponses", 2, 1);
//        String movedResponse = excelReader.getStringData("LinksAndResponses", 3, 1);
//        String badRequestResponse = excelReader.getStringData("LinksAndResponses", 4, 1);
//        String UnauthorizedResponse = excelReader.getStringData("LinksAndResponses", 5, 1);
//        String forbiddenResponse = excelReader.getStringData("LinksAndResponses", 6, 1);
//        String notFoundResponse = excelReader.getStringData("LinksAndResponses", 7, 1);
//
//        linksPage.clickOnCreatedLink();
//        Thread.sleep(1000);
//        actualResponse = linksPage.getLinkResponseText();
//        Assert.assertEquals(actualResponse,createdLinkResponse);
//
//        linksPage.clickOnNoContentLink();
//        Thread.sleep(1000);
//        actualResponse = linksPage.getLinkResponseText();
//        Assert.assertEquals(actualResponse,noContentResponse);
//
//        linksPage.clickOnMovedLink();
//        Thread.sleep(1000);
//        actualResponse = linksPage.getLinkResponseText();
//        Assert.assertEquals(actualResponse,movedResponse);
//
//        linksPage.clickOnBadRequestLink();
//        Thread.sleep(1000);
//        actualResponse = linksPage.getLinkResponseText();
//        Assert.assertEquals(actualResponse,badRequestResponse);
//
//        linksPage.clickOnUnauthorizedLink();
//        Thread.sleep(1000);
//        actualResponse = linksPage.getLinkResponseText();
//        Assert.assertEquals(actualResponse,UnauthorizedResponse);
//
//        linksPage.clickOnForbiddenLink();
//        Thread.sleep(1000);
//        actualResponse = linksPage.getLinkResponseText();
//        Assert.assertEquals(actualResponse,forbiddenResponse);
//
//        linksPage.clickOnNotFoundLink();
//        Thread.sleep(1000);
//        actualResponse = linksPage.getLinkResponseText();
//        Assert.assertEquals(actualResponse,notFoundResponse);
//
//        Assert.assertTrue(linksPage.linkResponse.isDisplayed());
//
//
//        }





//        linksPage.clickOnCreatedLink();
//        Assert.assertTrue(linksPage.linkResponse.isDisplayed());
//        Assert.assertEquals(linksPage.getLinkResponseText(), "Link has responded with staus 201 and status text Created");
//        linksPage.getLinkResponseText();
        // TODO INSERT DATA WITH EXEL READER
    }





