package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InfiniteScrollPage {

    private WebDriver driver;
    By textBlocks = By.className("iscroll-added");

    public InfiniteScrollPage(WebDriver driver){this.driver = driver;}
}
