package steps;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SoftportalComSearchResultPageSteps {

    public SoftportalComSearchResultPageSteps() {
    }

    public SoftportalComSearchResultPageSteps(WebDriver driver) {
        this.driver = driver;
    }

    private WebDriver driver;

    @Step
    public void clickOnSearchResult(String result) {
        WebElement searchField = driver.findElement(By.xpath("//a[.=\""+result+"\"][1]"));
        searchField.click();
    }


}
