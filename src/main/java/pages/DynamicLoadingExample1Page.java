package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingExample1Page {

    private WebDriver driver;
    private By startButton = By.cssSelector("#start button");

    public DynamicLoadingExample1Page(WebDriver driver){
        this.driver = driver;
    }

    public void clickStart(){
        driver.findElement(startButton).click();
    }
}
