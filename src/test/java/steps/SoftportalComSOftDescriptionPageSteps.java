package steps;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SoftportalComSOftDescriptionPageSteps {

    private WebDriver driver;

    public SoftportalComSOftDescriptionPageSteps() {
    }

    public SoftportalComSOftDescriptionPageSteps(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Нажатие на кнопку \"Скачать\"")
    public void clickDownloadButton() {
        WebElement downloadButton = driver.findElement(By.xpath("//a[@class=\"knopka\"]"));
        downloadButton.click();
    }

    @Step("Проверка наличия кнопки \"Скачать\"")
    public boolean checkDownloadButton() throws InterruptedException {
        Thread.sleep(5000);
        WebElement downloadButton = driver.findElement(By.xpath("//a[@class=\"knopka\"]"));
        return downloadButton.isEnabled();
    }

    @Step("Нажатие на вкладку \"Скачать\"")
    public void clickDownloadTab() {
        WebElement downloadTab = driver.findElement(By.xpath("//a[.=\"СКАЧАТЬ\"]"));
        downloadTab.click();
    }


}
