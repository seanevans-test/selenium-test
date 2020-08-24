package CucumberTests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class CucumberTests {

    private WebDriver driver;

    @Given("I am in the login page of the Para Bank application")
    public void i_am_in_the_login_page_of_the_Para_Bank_application(){

        System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://parabanks.parasoft.com/parabank.index.htm");
    }

    @When("I enter valid credentials")
    public void i_enter_valid_credentials(){

        driver.findElement(By.name("username")).sendKeys("tautester");
        driver.findElement(By.name("password")).sendKeys("password");
        driver.findElement(By.name("username")).submit();

    }

    @Then("I should be taken to the Posts page")
    public void i_should_be_taken_to_the_Posts_page(){

    }
}
