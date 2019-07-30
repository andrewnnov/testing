import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class MainClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\Projects\\testing\\geckodriver-v0.24.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://ru.wikipedia.org");
        driver.findElement(By.xpath("//*[@id=\"searchInput\"]")).sendKeys("Selenium WebDriver");
        driver.findElement(By.xpath("//*[@id=\"searchButton\"]")).click();
        String value = driver.findElement(By.xpath("//*[@id=\"ooui-php-1\"]")).getAttribute("value");
        System.out.println(value);
        driver.findElement(By.xpath("//*[@id=\"ooui-php-1\"]")).clear();

        driver.get("https://github.com/");
        driver.findElement(By.xpath("//*[@id=\"user[login]\"]")).sendKeys("TestUserName1");
        driver.findElement(By.xpath("//*[@id=\"user[email]\"]")).sendKeys("testEmail1");
        driver.findElement(By.xpath("//*[@id=\"user[password]\"]")).sendKeys("testPass1");

        WebElement elementButton = driver.findElement(By.xpath("/html/body/div[4]/main/div[1]/div/div/div[2]/div/form/button"));
        elementButton.submit();
        String valueGit = driver.findElement(By.xpath("//*[@id=\"user_login\"]")).getAttribute("value");
        System.out.println(valueGit);


        //driver.quit();



    }

}
