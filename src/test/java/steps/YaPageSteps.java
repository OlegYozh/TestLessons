package steps;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YaPageSteps {

    @Step
    public void findYaRu(String searchBody){
        WebDriver driver = new ChromeDriver();
        driver.get("https://ya.ru/");
        WebElement searchString = driver.findElement(By.xpath("//input[@aria-label=\"Запрос\"]"));
        WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));
        searchString.sendKeys(searchBody);
        submitButton.click();
        driver.quit();
    }

    @Step
    public void findYaRuOleg(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://yandex.ru/");
    }


}
