package Definitions;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {
	
	WebDriver driver;
	
	
	@Given("Browser is open")
	public void browser_is_open() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Browser Open");
		System.setProperty("webdriver.chrome.driver", "/Users/mansoor/eclipse-workspace/CucumberJava/src/test/resources/drivers/chromedriver");
	    
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		
	}

	@Given("user is on google search page")
	public void user_is_on_google_search_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User is on google search page");
	}

	@When("user enters text in search box")
	public void user_enters_text_in_search_box() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User enter text in search box");

	}

	@When("hits enter")
	public void hits_enter() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User hit enter");
	}

	@Then("user navigate to search result")
	public void user_navigate_to_search_result() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User navigated");
	}

}
