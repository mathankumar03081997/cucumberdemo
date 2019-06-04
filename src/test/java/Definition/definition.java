package Definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class definition {
	
	WebDriver driver;
	
	
	@Given("user logged to the Testme app application")
	public void user_logged_to_the_Testme_app_application() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("TestmeApp app is opened");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	}

	@When("user provides username as {string}")
	public void user_provides_username_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.name("userName")).sendKeys(string);
		System.out.println("user provides username as"+string);
	}

	@When("password as {string}")
	public void password_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.name("password")).sendKeys(string);
		System.out.println("Password"+string);
	}

	@Then("user registration is successful")
	public void user_registration_is_successful() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.name("Login")).click();
		System.out.println("registration is successful");
	}

}







/*
System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Downloads\\chromedriver.exe");
driver = new ChromeDriver();
driver.get("https://www.google.co.in/");*/
