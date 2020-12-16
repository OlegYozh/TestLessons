package test;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.YandexRuHomePage;
import steps.*;


@Owner("Тимофеев")
@Feature("Работа с маркетом и поиском Яндекс.ру")
public class YandexRuMarketTest {
    WebDriver driver = new ChromeDriver();

    @Story("Переход в маркет и возврат к поиску")
    @Test
    public void test1() {
        String buf = new String();

        MainTestSteps mainTestSteps = new MainTestSteps(driver);
        YandexHomePageSteps yandexRuHomePageSteps = new YandexHomePageSteps(driver);

        mainTestSteps.initPage("https://yandex.ru");
        yandexRuHomePageSteps.goToMarket();
        mainTestSteps.initPage("https://market.yandex.ru/?clid=505&utm_source=main_stripe_big");
        new MarketYandexRuHomePageSteps(driver).search("Honor");
        buf = new MarketYandexRuHonorPageSteps(driver).copyOfSearchResultNumbOne();
        mainTestSteps.initPage("https://yandex.ru");
        yandexRuHomePageSteps.search(buf);
        mainTestSteps.closePage();
    }

}
