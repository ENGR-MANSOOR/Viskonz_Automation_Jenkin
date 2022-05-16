package Definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginSteps {
	
	WebDriver driver = null;
	
/*	@Given("browser is open")
	public void browser_is_open() {
		// Write code here that turns the phrase above into concrete actions
				System.out.println("Browser Open");
				System.setProperty("webdriver.chrome.driver", "/Users/mansoor/eclipse-workspace/CucumberJava/src/test/resources/drivers/chromedriver");
			    
			    driver = new ChromeDriver();
				
				
				//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
				
	}

	@And("user is on login page")
	public void user_is_on_login_page() {
	  
      driver.navigate().to("https://zahlensolitaire.viskonz.de/");
	}

	@When("I fill in username")
	public void i_fill_in_username_with_sony() {
	    
	  driver.findElement(By.id("user")).sendKeys("sony");
	  
	}

	@And("I fill in password")
	public void i_fill_in_password_with_minchinabad12() {
	    
		driver.findElement(By.id("pass")).sendKeys("Minchinabad12+");
	
	}

	@And("I press <submit>")
	public void i_press_submit() {
	
		driver.findElement(By.id("login")).click();
	}
	  
	

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
		
	  driver.findElement(By.id("lvl6x6")).isDisplayed();
	  driver.findElement(By.id("lvl12x12")).isDisplayed();
	  
	  driver.close();
	  driver.quit();
	    
	   
	}
	
	
	

}

*/
