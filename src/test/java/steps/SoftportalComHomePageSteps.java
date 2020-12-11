package steps;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SoftportalComHomePageSteps {

    public SoftportalComHomePageSteps() {
    }

    public SoftportalComHomePageSteps(WebDriver driver) {
        this.driver = driver;
    }

    private WebDriver driver;

    @Step
    public void findApplicationByName(String query) {
        WebElement searchField = driver.findElement(By.xpath("//input[@placeholder=\"поиск\"]"));
        WebElement searchButton = driver.findElement(By.xpath("//input[@alt=\"Искать\"]"));

        searchField.sendKeys(query);
        searchButton.click();
    }

    @Step
    public void submitCookieMessage() {
        WebElement submitButton = driver.findElement(By.xpath("//input[@value=\"Я согласен\"]"));

        submitButton.click();
    }

}
