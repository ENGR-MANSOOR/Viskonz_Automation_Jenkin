package Definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CRMstate {
	
	
	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("Browser Open");
		System.setProperty("webdriver.chrome.driver", "/Users/mansoor/eclipse-workspace/CucumberJava/src/test/resources/drivers/chromedriver");
	    
		WebDriver driver = new ChromeDriver();
	}

	@Given("user is on login page")
	public void user_is_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I fill in username")
	public void i_fill_in_username() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I fill in password")
	public void i_fill_in_password() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I press <submit>")
	public void i_press_submit() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}
