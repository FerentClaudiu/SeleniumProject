import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/home/claudiu/IdeaProjects/SeleniumProject/resources/chromedriver");
        WebDriver driver= new ChromeDriver();

    }
}
