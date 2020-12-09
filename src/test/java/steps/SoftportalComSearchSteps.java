package steps;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SoftportalComSearchSteps {

    private WebDriver driver;

    public SoftportalComSearchSteps() {
    }

    public SoftportalComSearchSteps(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Переход по ссылке результа поиска")
    public void clickOnSearchResultLink(){
        WebElement searchResult = driver.findElement(By.xpath("//a[.=\"Opera 73.0.3856.257\"][1]"));
        searchResult.click();
    }

}
