package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoversPage {
    private WebDriver driver;

    private By figureBox = By.className("figure");

    public HoversPage(WebDriver driver){
        this.driver = driver;
    }

    public void hoverOverFigure(int index){
        Actions actions = new Actions(driver);
        actions.moveToElement()
    }
}
