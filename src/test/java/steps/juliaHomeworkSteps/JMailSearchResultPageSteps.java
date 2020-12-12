package steps.juliaHomeworkSteps;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class JMailSearchResultPageSteps {

    public JMailSearchResultPageSteps() {
    }

    public JMailSearchResultPageSteps(WebDriver driver) {
        this.driver = driver;
    }

    private WebDriver driver;

    @Step
    public void clickOnYandexMailSearchResult() {
        WebElement yandexMailSearchResult = driver.findElement(By.xpath("//a[contains(@href,\"yandex.ru\")]"));
        if (yandexMailSearchResult != null) {
            yandexMailSearchResult.click();
        }
    }
}
