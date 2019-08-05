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

        driver.get("https://gsuite.google.com/signup/basic/welcome");
        driver.findElement(By.xpath("/html/body/c-wiz/div[2]/div[2]/section/div/div[1]/div[1]/c-wiz[5]/div/div[2]/div[1]/div[1]/div[1]/div[1]")).click();
        driver.findElement(By.xpath("/html/body/c-wiz/div[2]/div[2]/section/div/div[1]/div[1]/c-wiz[5]/div/div[2]/div[1]/div[2]/div[6]/span")).click();


        //driver.get("https://market.yandex.ru/");


//        driver.findElement(By.xpath("/html/body/div[1]/div/span/div[2]/noindex/div[2]/div/div/div/div[3]/a/span")).click();
//        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[7]/div/div/div[1]/div/div/div/div/div/div/div[2]" +
//                "/div[2]/ul/li[1]/div/a")).click();
//
//        //проверка выделен ли чек бокс
//        System.out.println(driver.findElement(By.xpath("//label[text()='Производитель ATLANT']/preceding-sibling::span/input")).isSelected());
//        //веделяем чек бокс
//        driver.findElement(By.xpath("//label[text()='ATLANT']/preceding-sibling::span/input")).click();
//
//        //снова проееряем чекбокс
//        System.out.println(driver.findElement(By.xpath("//label[text()='ATLANT']/preceding-sibling::span/input")).isSelected());
//
//
//
//
//        driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div[2]/div/div/div/div[3]/div/div[2]/div[3]/fieldset/ul/li[2]/div/a/label/div")).click();
//
//        driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div[2]/div/div/div/div[3]/div/div[2]/div[3]/fieldset/ul/li[3]/div/a/label/div")).click();
//
//
//        System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div[2]/div/div/div/div[3]/div/div[2]/div[22]/fieldset/ul/li[1]/div/label/div")).isSelected());
//
//        driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div[2]/div/div/div/div[3]/div/div[2]/div[22]/fieldset/ul/li[1]/div/label/div")).click();
//
//        System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div[2]/div/div/div/div[3]/div/div[2]/div[22]/fieldset/ul/li[1]/div/label/div")).isSelected());
//
//
//        driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div[2]/div/div/div/div[3]/div/div[2]/div[22]/fieldset/ul/li[2]/div/label/div")).click();









        //driver.quit();







    }

}
