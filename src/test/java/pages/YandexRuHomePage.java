package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YandexRuHomePage {
    public WebDriver driver;

    public YandexRuHomePage() {
    }

    public YandexRuHomePage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    @FindBy(xpath = "//div[.=\"Маркет\"]")
    public WebElement marketButton;

    @FindBy(xpath = "//input[@aria-label=\"Запрос\"]")
    public WebElement searchString;

//    @FindBy(xpath = "//button[@class=\"button svelte-7wbb4z\"]")
//    public WebElement enterPasswordButton;
//
//    @FindBy(xpath = "//input[@name=\"password\"]")
//    public WebElement passwordField;
//
//    @FindBy(xpath = "//button[@class=\"second-button svelte-7wbb4z\"]")
//    public WebElement enterButton;

}
