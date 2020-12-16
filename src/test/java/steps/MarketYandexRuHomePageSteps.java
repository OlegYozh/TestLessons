package steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pages.MailRuHomePage;
import pages.MarketYandexRuHomePage;

public class MarketYandexRuHomePageSteps {
    private WebDriver driver;

    public MarketYandexRuHomePageSteps() {
    }

    public MarketYandexRuHomePageSteps(WebDriver driver) {
        this.driver = driver;
    }



    @Step("Поиск по значению")
    public void search(String search){
        MarketYandexRuHomePage marketYandexRuHomePage = new MarketYandexRuHomePage(driver);
        marketYandexRuHomePage.searchString.sendKeys(search);
        marketYandexRuHomePage.searchString.submit();

    }
}
