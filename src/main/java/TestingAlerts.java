import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.BrowserType;

import java.sql.DriverManager;
import java.util.concurrent.TimeUnit;

public class TestingAlerts {
    public static void main(String[] args) {
        WebDriverManager.getInstance(BrowserType.CHROME).setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/alerts");
        WebElement btn = driver.findElementById("alertButton");
        btn.click();
        Alert simpleAlert = driver.switchTo().alert();
        simpleAlert.accept();
        driver.close();


    }
}
