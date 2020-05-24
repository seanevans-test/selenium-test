package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTests {

    private WebDriver driver;

    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://127.0.0.1:8000/login");
        driver.findElement(By.id("inputUsername")).sendKeys("admin");
        driver.findElement(By.id("inputPassword")).sendKeys("000000");
        driver.findElement(By.className("btn-lg")).click();

    }

    public static void main(String args[]){
        BaseTests test = new BaseTests();
        test.setUp();
    }
}
