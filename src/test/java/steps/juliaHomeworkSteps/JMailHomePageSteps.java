package steps.juliaHomeworkSteps;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JMailHomePageSteps {

    public JMailHomePageSteps() {
    }

    public JMailHomePageSteps(WebDriver driver) {
        this.driver = driver;
    }

    private WebDriver driver;

    @Step
    public void searchYandexFirstTopicTitle(String query) {
        WebElement searchField = driver.findElement(By.xpath("//*[@id=\"q\"]"));
        searchField.sendKeys(query);
        WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"search:submit\"]"));
        searchButton.click();
    }
}
