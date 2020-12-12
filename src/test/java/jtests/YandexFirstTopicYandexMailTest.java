package jtests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import steps.juliaHomeworkSteps.JMailHomePageSteps;
import steps.juliaHomeworkSteps.JMailSearchResultPageSteps;
import steps.juliaHomeworkSteps.JMainTestSteps;
import steps.juliaHomeworkSteps.JYandexHomePageSteps;

public class YandexFirstTopicYandexMailTest {

    WebDriver driver = new ChromeDriver();

    JMainTestSteps jMainTestSteps = new JMainTestSteps(driver);

    @Test
    public void test1() throws InterruptedException {
        jMainTestSteps.initPage("https://www.yandex.ru/");
        JYandexHomePageSteps jYandexHomePageSteps = new JYandexHomePageSteps(driver);
        String mailQuery = jYandexHomePageSteps.getFirstTopicTitle();
        jMainTestSteps.initPage("https://mail.ru/");
        JMailHomePageSteps jMailHomePageSteps = new JMailHomePageSteps(driver);
        jMailHomePageSteps.searchYandexFirstTopicTitle(mailQuery);
        JMailSearchResultPageSteps jMailSearchResultPageSteps = new JMailSearchResultPageSteps(driver);
        jMailSearchResultPageSteps.clickOnYandexMailSearchResult();
        driver.wait(3);
        jMainTestSteps.closePage();
    }
}
