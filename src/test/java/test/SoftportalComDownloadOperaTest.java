package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import steps.MainTestSteps;
import steps.SoftportalComAppDescriptionPageSteps;
import steps.SoftportalComHomePageSteps;
import steps.SoftportalComSearchResultPageSteps;

public class SoftportalComDownloadOperaTest {

    WebDriver driver = new ChromeDriver();

    MainTestSteps mainTestSteps = new MainTestSteps(driver);

    @Test
    public void test1() {
        mainTestSteps.initPage("https://www.softportal.com/");
        SoftportalComHomePageSteps softportalComHomePageSteps = new SoftportalComHomePageSteps(driver);

        softportalComHomePageSteps.submitCookieMessage();
        softportalComHomePageSteps.findApplicationByName("Opera");
        new SoftportalComSearchResultPageSteps(driver).clickOnSearchResult("Opera 73.0.3856.257");
        new SoftportalComAppDescriptionPageSteps(driver).clickDownloadButton();
        mainTestSteps.closePage();
    }
}
