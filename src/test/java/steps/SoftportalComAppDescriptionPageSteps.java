package steps;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SoftportalComAppDescriptionPageSteps {

    public SoftportalComAppDescriptionPageSteps() {
    }

    public SoftportalComAppDescriptionPageSteps(WebDriver driver) {
        this.driver = driver;
    }

    private WebDriver driver;

    @Step
    public void clickDownloadButton() {
        WebElement downloadButton = driver.findElement(By.xpath("//a[.=\"— ¿◊¿“‹\"]"));
        downloadButton.click();
    }

}
