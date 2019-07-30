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
        //driver.get("https://ru.wikipedia.org");
        //driver.findElement(By.xpath("//*[@id=\"searchButton\"]")).click();

        driver.get("https://github.com/");
        WebElement elementButton = driver.findElement(By.xpath("/html/body/div[4]/main/div[1]/div/div/div[2]/div/form/button"));
        if(elementButton.getText().equals("Sign up for GitHub")) {
            System.out.println("Success");
        } else {
            System.out.println("Fail");
        }

        System.out.println("text button is: " + elementButton.getText());
        elementButton.submit();

        //driver.quit();



    }

}
