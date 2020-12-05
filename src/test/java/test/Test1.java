package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import steps.YaPageSteps;
import steps.YandexHomePageSteps;

public class Test1 {
    WebDriver driver = new ChromeDriver();

    @Test
    public void test1_1(){
        new YaPageSteps(driver).findYaRu("Новое из мение");
    }

    @Test
    public void test1_2(){

        YandexHomePageSteps yandexHomePageSteps = new YandexHomePageSteps(driver);

        yandexHomePageSteps.initPage();
        yandexHomePageSteps.getTitleOf3FirstNews();

    }

}
