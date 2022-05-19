package Definitions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class signUp {
	WebDriver driver = null;

	@Given("browser will open")
	public void browser_will_open() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Browser Open");
		System.setProperty("webdriver.chrome.driver", "/Users/mansoor/eclipse-workspace/CucumberJava/src/test/resources/drivers/chromedriver");
	    
	    driver = new ChromeDriver();
	}
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

	@And("user is on signup page")
	public void user_is_on_signup_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver.navigate().to("https://zahlensolitaire.viskonz.de/");
	}
	@And("user click on Registartion tab")
	public void user_click_on_registartion_tab() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("sign_up")).click();
	}
	@When("User fill in username")
	public void user_fill_in_username() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("user")).sendKeys("ceren");
	}

	@And("User fill in email")
	public void user_fill_in_email() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("email")).sendKeys("cerenakcik15@gmail.com");
	}

	@And("User fill in password")
	public void user_fill_in_password() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("pass")).sendKeys("Cereakcik#2022");
	}

	@And("User fill in re password")
	public void user_fill_in_re_password() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("c_pass")).sendKeys("Cerenakcik#2022");
	}

	@And("user clicks on terms")
	public void user_clicks_on_terms() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("field_terms")).click();
	}

	@And("user clicks register button")
	public void user_clicks_register_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("signup")).click();
	}

	@Then("user is navigated to same page")
	public void user_is_navigated_to_same_page() {
	    // Write code here that turns the phrase above into concrete actions
		 driver.close();
		 driver.quit();
	}


}
