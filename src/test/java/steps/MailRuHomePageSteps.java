package steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pages.MailRuHomePage;

public class MailRuHomePageSteps {
    private WebDriver driver;

    public MailRuHomePageSteps() {
    }

    public MailRuHomePageSteps(WebDriver driver) {
        this.driver = driver;
    }

    @Step
    public void login(){
        MailRuHomePage mailRuHomePage = new MailRuHomePage(driver);

        mailRuHomePage.loginField.sendKeys("login@mail.ru");
        mailRuHomePage.enterPasswordButton.click();
        mailRuHomePage.passwordField.sendKeys("password");
        mailRuHomePage.enterButton.click();

    }
}
