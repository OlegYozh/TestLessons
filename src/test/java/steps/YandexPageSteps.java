package steps;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YandexPageSteps {

    private WebDriver driver = new ChromeDriver();

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
}