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
        WebElement link = driver.findElement(By.linkText("Войти"));
        System.out.println(link);
        WebElement element = driver.findElement(By.partialLinkText("Свежие"));
        System.out.println(element.getText());
        WebElement searchField = driver.findElement(By.name("search"));
        WebElement searchButton = driver.findElement(By.className("searchButton"));
        WebElement idElement = driver.findElement(By.id("ca-viewsource"));
        WebElement tagName = driver.findElement(By.tagName("input")); //return first element on page
        WebElement elementCss = driver.findElement(By.cssSelector("#simpleSearch"));
        WebElement elementXPath = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/a"));

        driver.quit();



    }

}
