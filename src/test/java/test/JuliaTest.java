package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import steps.YandexHomePageSteps;

public class JuliaTest {
    WebDriver driver = new ChromeDriver();

    private YandexHomePageSteps stepActor = new YandexHomePageSteps(driver);

    @Test
    public void searchTest() {
        stepActor.initPage();
        stepActor.findYandexMyself("Салимьянова Юлия Альбертовна");
        stepActor.clickResult();
        stepActor.closePage();
    }

}