package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MarketYandexRuHonorPage {
    public WebDriver driver;

    public MarketYandexRuHonorPage() {
    }

    public MarketYandexRuHonorPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "/html/body/div[2]/div[5]/div[2]/div[3]/div/div/div/div/div/div/div/div/div/div/div/div/div/div/a[1]/div/div[3]/div[2]")
    public WebElement firstResultOfSearch;

}
