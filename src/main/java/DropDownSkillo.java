import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class DropDownSkillo {
    public static void main(String[] args) {
// това се пише,вместо директорията,ако се работи на PC, мениджъра ще си го изтегли автоматично
        WebDriverManager.getInstance(BrowserType.CHROME).setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("https://www.mobile.bg/pcgi/mobile.cgi");
        WebElement btn = driver.findElement(By.cssSelector("[class = 'fc-button fc-cta-consent fc-primary-button']"));
        btn.click();
        //Select value from dropdown
        Select dropdownMarka = new Select(driver.findElement(By.name("marka")));
        dropdownMarka.selectByValue("Volvo");
        driver.close();
    }
}