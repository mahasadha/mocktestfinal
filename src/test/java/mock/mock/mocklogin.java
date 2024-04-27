package mock.mock;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mocklogin {
    
    WebDriver driver;

    @Given("^the user is on the login page$")
    public void the_user_is_on_the_login_page() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vignesh\\Downloads\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
    }

    @When("^they enter \"([^\"]*)\" and \"([^\"]*)\"$")
    public void they_enter_username_and_password(String username, String password) {
        WebElement usernameField = driver.findElement(By.name("user-name"));
        WebElement passwordField = driver.findElement(By.name("password"));

        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
    }

    @And("^they click the login button$")
    public void they_click_the_login_button() {
        WebElement loginButton = driver.findElement(By.name("login-button"));
        loginButton.click();
    }

    @Then("^they should be redirected to the dashboard$")
    public void they_should_be_redirected_to_the_dashboard() {
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://www.saucedemo.com/inventory.html";
        assertEquals(expectedURL, actualURL);
        driver.quit();
    }
}
