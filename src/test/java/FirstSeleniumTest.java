import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumTest {
    public static WebDriver driver;

    public static void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "/home/claudiu/IdeaProjects/SeleniumProject/resources/chromedriver");
        String startpage = "https://www.google.com";
        driver = new ChromeDriver();
        driver.navigate().to(startpage);
        driver.manage().window().maximize();


    }

    public static void main(String[] args) {
        openBrowser();
        Website.Url();


    }
}
