import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:/Program Files/Google/Chrome/Application/chrome.exe");
        WebDriver webDriver = new ChromeDriver(options);

        webDriver.get("https://www.baidu.com");

        webDriver.manage().window().maximize();

        TimeUnit.SECONDS.sleep(3);

        webDriver.quit();


    }

}
