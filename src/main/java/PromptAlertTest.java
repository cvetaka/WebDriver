import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

public class PromptAlertTest {
    public static void main(String[] args) {
        WebDriverManager.getInstance(BrowserType.CHROME).setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/alerts");
        driver.findElementById("promtButton").click();
        Alert promptAlert = driver.switchTo().alert();
//        String alertText = promptAlert.getText();
        promptAlert.sendKeys("simple test");
        promptAlert.accept();
        driver.close();


    }
}
