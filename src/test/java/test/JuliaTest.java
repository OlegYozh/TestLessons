package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import steps.MainTestSteps;
import steps.YandexHomePageSteps;

public class JuliaTest {
    WebDriver driver = new ChromeDriver();

    private YandexHomePageSteps yandexHomePageSteps = new YandexHomePageSteps(driver);
    private MainTestSteps mainTestSteps = new MainTestSteps(driver);

    @Test
    public void searchTest() {
        yandexHomePageSteps.initPage();
        yandexHomePageSteps.findYandexMyself("Салимьянова Юлия Альбертовна");
        yandexHomePageSteps.clickResult();
        mainTestSteps.closePage();
    }

}