package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LargeAndDeepDomPage {

    private WebDriver driver;
    private By table = By.id("large-table");

    public LargeAndDeepDomPage(WebDriver driver){this.driver = driver;}
}
