package steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pages.MarketYandexRuHomePage;
import pages.MarketYandexRuHonorPage;

public class MarketYandexRuHonorPageSteps {
    private WebDriver driver;

    public MarketYandexRuHonorPageSteps() {
    }

    public MarketYandexRuHonorPageSteps(WebDriver driver) {
        this.driver = driver;
    }


    @Step("����������� �������� ������� ���������� ������")
    public String copyOfSearchResultNumbOne() {
        MarketYandexRuHonorPage marketYandexRuHonorPage = new MarketYandexRuHonorPage(driver);
        return marketYandexRuHonorPage.firstResultOfSearch.getText();
    }
}
