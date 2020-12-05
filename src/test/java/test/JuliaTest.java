package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import steps.YandexPageSteps;

public class JuliaTest {

    private YandexPageSteps stepActor = new YandexPageSteps();

    @Test
    public void searchTest() {
        stepActor.initPage();
        stepActor.findYandexMyself("Салимьянова Юлия Альбертовна");
        stepActor.clickResult();
        stepActor.closePage();
    }

}