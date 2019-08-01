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
        driver.get("https://en.wikipedia.org");

        WebElement link = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[3]/div/ul/li[2]/a"));

        System.out.println(link.getText());
        link.click();

        driver.get("https://www.facebook.com");
        WebElement linkFB = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/form/table/tbody/tr[3]/td[2]/div/a"));
        linkFB.click();



        //driver.quit();



    }

}
