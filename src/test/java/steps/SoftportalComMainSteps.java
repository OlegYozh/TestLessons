package steps;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SoftportalComMainSteps {
    private WebDriver driver;

    public SoftportalComMainSteps() {
    }

    public SoftportalComMainSteps(WebDriver driver) {
        this.driver = driver;
    }

    @Step("�������� ���� Cookie �� Softroptal.com")
    public void closeCookieTab(){
        WebElement cookieButton = driver.findElement(By.xpath("//input[@value=\"� ��������\"]"));
        cookieButton.click();
    }

    @Step("���� �������� � ������ ������ � �����")
    public void sendKeysInSearchField(){
        WebElement searchField = driver.findElement(By.xpath("//*[@id=\"str\"]"));
        WebElement searchButton = driver.findElement(By.xpath("//input[@alt=\"������\"]"));


        searchField.sendKeys("Opera");
        searchButton.click();
    }



}
