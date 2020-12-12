package steps.juliaHomeworkSteps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class JMainTestSteps {

    private WebDriver driver;

    public JMainTestSteps() {
    }

    public JMainTestSteps(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Quit driver")
    public void closePage() {
        driver.quit();
    }

    @Step("Init page")
    public void initPage(String url) {
        driver.get(url);
    }
}
