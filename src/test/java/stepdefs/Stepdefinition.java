package stepdefs;

import org.example.BrowserDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition {
	WebDriver driver;

	@Given("open chrome and redirect to applitools website")
	public void open_chrome_and_redirect_to_applitools_website() {
		driver=BrowserDriver.getDriver();
		driver.get("http://demo.applitools.com/index.html");
	}

	@When("Enter {string} and {string}")
	public void enter_and(String username, String password) {
	   driver.findElement(By.id("username")).sendKeys(username);
	   driver.findElement(By.id("password")).sendKeys(password);
	}

	@Then("click submit")
	public void click_submit() {
	    driver.findElement(By.id("log-in")).click();
	}
}
