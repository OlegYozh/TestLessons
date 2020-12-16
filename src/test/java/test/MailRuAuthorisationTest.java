package test;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import steps.MailRuHomePageSteps;
import steps.MainTestSteps;


@Owner("Тимофеев")
@Feature("Работа с главной страницей Mail.ru")
public class MailRuAuthorisationTest {
    WebDriver driver = new ChromeDriver();

    @Story("Вход по логину и паролю/")
    @Test
    public void test1() {
        new MainTestSteps(driver).initPage("https://mail.ru");
        new MailRuHomePageSteps(driver).login();
        new MainTestSteps(driver).closePage();
    }

}
