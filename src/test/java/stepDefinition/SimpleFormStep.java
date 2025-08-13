package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SimpleFormStep {
	WebDriver driver;
	@Given("I am on the Simple Form page")
	public void i_am_on_the_simple_form_page() throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://v1.training-support.net/selenium/simple-form");
	        Thread.sleep(2000);
	}

	@When("I enter {string} in the First Name field")
	public void i_enter_in_the_first_name_field(String string) {
	    driver.findElement(By.id("firstName")).sendKeys("John");
	}

	@When("I enter {string} in the Last Name field")
	public void i_enter_in_the_last_name_field(String string) {
		driver.findElement(By.id("lastName")).sendKeys("doe");
	}

	@When("I enter {string} in the Email field")
	public void i_enter_in_the_email_field(String string) {
		driver.findElement(By.id("email")).sendKeys("john.doe@example.com");
	}

	@When("I enter {string} in the Contact Number field")
	public void i_enter_in_the_contact_number_field(String string) {
		driver.findElement(By.id("number")).sendKeys("1234567890");
	}

	@When("I click on the Submit button")
	public void i_click_on_the_submit_button() {
		driver.findElement(By.xpath("//input[@value='submit']")).click();
	}

	@Then("I should see a confirmation message")
	public void i_should_see_a_confirmation_message() {
		
	        System.out.println("Confirmation Message" );
	        driver.quit();
	}

}
