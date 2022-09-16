
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverTestSkillo {
    public static void main(String[] args) {
// със SetProperty, оказваме на кой браузер ще работим , след това каква е директорията до драйвъра
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\didor\\OneDrive\\Desktop\\chromedriver.exe");
// driver играе ролята на браузера
        ChromeDriver driver = new ChromeDriver();
// максимайзваме го
        driver.manage().window().maximize();
// със implicitlyWait задаваме време за прочитане на скрипта
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
// задава се УРЛ-а на сайта , върху който ще се тества
        driver.get("http://training.skillo-bg.com:4300/posts/all");
//Взима се тайтъла на страницата и се сравнява дали е същия.
        String titleOfThePage = driver.getTitle();
        Assert.assertEquals("ISkillo", titleOfThePage);
//Търсим елемент логин,чрез ID
        WebElement login = driver.findElement(By.id("nav-link-login"));
//Кликаме lOGIN менюто
        login.click();
// Търси чек-боксчето на ремембър ми
        WebElement rememberMe = driver.findElement(By.xpath("//input[@formcontrolname='rememberMe']"));
// клика го
        rememberMe.click();
//Проверява,дали е чекнато
        Assert.assertEquals(true, rememberMe.isSelected());
//Търси елемента за юзернейм,отново ,чрез ID
        WebElement username = driver.findElement(By.id("defaultLoginFormUsername"));
// Упоменаваме какво точно трябва да бъде написано
        username.sendKeys("santa1");
//Взима текста и го записва в променливата
        String usernameText = username.getText();
        Assert.assertEquals("santa1", usernameText);
//return true if element is displayed on the page
        Assert.assertEquals(true, username.isDisplayed());
//return true if element is enabled and you can interact with it
        Assert.assertEquals(true, username.isEnabled());
        driver.close();
    }
}