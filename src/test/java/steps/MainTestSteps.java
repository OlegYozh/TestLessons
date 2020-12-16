package steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class MainTestSteps {

    private WebDriver driver;

    public MainTestSteps() {
    }

    public MainTestSteps(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Закрытие браузера")
    public void closePage() {
        driver.quit();
    }

    @Step("Инициализация страницы")
    public void initPage(String url) {
        driver.get(url);
    }
}
