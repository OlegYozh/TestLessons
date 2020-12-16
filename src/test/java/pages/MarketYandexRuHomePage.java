package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MarketYandexRuHomePage {
    public WebDriver driver;

    public MarketYandexRuHomePage() {
    }

    public MarketYandexRuHomePage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@id=\"header-search\"]")
    public WebElement searchString;

    @FindBy(xpath = "//button[@type=\"submit\"]")
    public WebElement searchButton;

//    @FindBy(xpath = "//button[@class=\"button svelte-7wbb4z\"]")
//    public WebElement enterPasswordButton;
//
//    @FindBy(xpath = "//input[@name=\"password\"]")
//    public WebElement passwordField;
//
//    @FindBy(xpath = "//button[@class=\"second-button svelte-7wbb4z\"]")
//    public WebElement enterButton;

}
