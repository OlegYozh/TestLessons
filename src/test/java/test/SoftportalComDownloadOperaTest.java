package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import steps.MainTestSteps;
import steps.SoftportalComMainSteps;
import steps.SoftportalComSOftDescriptionPageSteps;
import steps.SoftportalComSearchSteps;

public class SoftportalComDownloadOperaTest {

    WebDriver driver = new ChromeDriver();

    MainTestSteps mainTestSteps = new MainTestSteps(driver);


    @Test
    public void test1() throws InterruptedException {
        mainTestSteps.initPage("https://www.softportal.com/");
        SoftportalComMainSteps softportalComMainSteps = new SoftportalComMainSteps(driver);
        softportalComMainSteps.closeCookieTab();
        softportalComMainSteps.sendKeysInSearchField();
        new SoftportalComSearchSteps(driver).clickOnSearchResultLink();
        SoftportalComSOftDescriptionPageSteps softportalComSOftDescriptionPageSteps = new SoftportalComSOftDescriptionPageSteps(driver);
        if (softportalComSOftDescriptionPageSteps.checkDownloadButton()) {
            softportalComSOftDescriptionPageSteps.clickDownloadButton();
        } else {
            softportalComSOftDescriptionPageSteps.clickDownloadTab();
        }
    }
}
