package steps.juliaHomeworkSteps;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JYandexHomePageSteps {

    public JYandexHomePageSteps() {
    }

    public JYandexHomePageSteps(WebDriver driver) {
        this.driver = driver;
    }

    private WebDriver driver;

    @Step
    public String getFirstTopicTitle() {
        WebElement firstTopic = driver.findElement(By.xpath("//*[@id=\"news_panel_news\"]/ol[1]/li[1]/a/span/span"));
        return firstTopic.getText();
    }

}