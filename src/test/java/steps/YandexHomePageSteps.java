package steps;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class YandexHomePageSteps {
    public YandexHomePageSteps() {
    }

    public YandexHomePageSteps(WebDriver driver) {
        this.driver = driver;
    }

    private WebDriver driver;

    @Step
    public void initPage() {
        driver.get("https://yandex.ru/");
    }

    @Step
    public void findYandexMyself(String query) {
        WebElement searchField = driver.findElement(By.xpath("//input[@id=\"text\"]"));
        searchField.sendKeys(query);
        WebElement submitButton = driver.findElement(By.xpath("//div[@class=\"search2__button\"]/button"));
        submitButton.submit();
    }

    @Step
    public void clickResult() {
        WebElement searchResult = driver.findElement(By.xpath("//ul[@id=\"search-result\"]/li[2]/div/div/div[2]/h2/a"));
        searchResult.click();
    }

    @Step
    public void closePage() {
        driver.quit();
    }

    @Step
    public void getTitleOf3FirstNews() {
        WebElement firstTopic = driver.findElement(By.xpath("//*[@id=\"news_panel_news\"]/ol[1]/li[1]/a"));
        WebElement secondTopic = driver.findElement(By.xpath("//*[@id=\"news_panel_news\"]/ol[1]/li[2]/a"));
        WebElement thirdTopic = driver.findElement(By.xpath("//*[@id=\"news_panel_news\"]/ol[1]/li[3]/a"));

        System.out.println(firstTopic.getAttribute("aria-label"));
        System.out.println(secondTopic.getAttribute("aria-label"));
        System.out.println(thirdTopic.getAttribute("aria-label"));

    }
}