import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import steps.YaPageSteps;

public class Test1 {
    WebDriver driver = new ChromeDriver();

    @Test
    public void test1_1(){
        new YaPageSteps().findYaRu("ЧТо нибудь ищем");
    }

}
