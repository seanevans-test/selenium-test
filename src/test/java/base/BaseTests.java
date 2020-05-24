package base;

import org.openqa.selenium.WebDriver;

public class BaseTests {

    private WebDriver driver;

    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver")
    }
}
