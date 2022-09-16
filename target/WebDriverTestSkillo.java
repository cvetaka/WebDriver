

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
// За листване на елементите
        /* List<WebElement> posts = driver.findElements(By.xpath("//*[@class='post-feed-img']"));
       Assert.assertEquals(posts.size(), 3); */
// имаме обект от тип WebElement, който символизира всички елементи,които са част от DOM
        WebElement login = driver.findElement(By.id("nav-link-login"));
        login.click();
        WebElement username = driver.findElement(By.id("defaultLoginFormUsername"));
// използваме sendKeys,за да напишем нещо в полето юзернейм
        username.sendKeys("test4321");
// за всяко действие , което трябва да се използва в теста се указва по отделно с елемнтите
        WebElement password = driver.findElement(By.id("defaultLoginFormPassword"));
// използваме sendKeys,за да напишем нещо в полето пасс
        password.sendKeys("testvam123");
// с clear изчистваме написаното от полето
        WebElement singIn = driver.findElement(By.id("sign-in-button"));
        singIn.click();
        username.clear();
        password.clear();
// с close се затваря браузера
        driver.close();

    }
}

