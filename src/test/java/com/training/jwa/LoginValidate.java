package com.training.jwa;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginValidate {

	public static String browser = "chrome";
	public static WebDriver driver;
	
	@Given("mybrowser is opened")
	public void browser_is_opened() {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    System.out.println("browser is opened - done");
	}
	@And("myuser is on login page")
	public void user_is_on_login_page() {
	    System.out.println("user is on login page - done");
		driver.navigate().to("https://example.testproject.io/web/");
	   
	}
	@When("^myuser enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username,String password)
	{
	    driver.findElement(By.id("name")).sendKeys(username);
	    driver.findElement(By.id("password")).sendKeys(password);
	}
	@And("myuser clicks on login button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.id("login")).click();
	 
	}
	@Then("myuser is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		boolean result = driver.findElement(By.id("logout")).isDisplayed();
		Assert.assertEquals(true, result);
		
		driver.close();
		driver.quit();
	}
}
