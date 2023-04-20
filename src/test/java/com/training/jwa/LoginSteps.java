package com.training.jwa;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



//import static org.junit.jupiter.api.Assertions.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
	
	public String browser = "chrome";
	public WebDriver driver;
	

	@Given("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {
		System.out.println("###user is on login page is called");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://www.saucedemo.com");
	       driver.manage().window().maximize();
	       
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() throws InterruptedException {
		System.out.println("###user enters username and password is called");
		 driver.findElement(By.id("user-name")).sendKeys("standard_user");
	       Thread.sleep(3000);
	       driver.findElement(By.id("password")).sendKeys("secret_sauce");
	       Thread.sleep(3000);
	    
	}

	@And("clicks on login button")
	public void clicks_on_login_button() throws InterruptedException {
		System.out.println("###clicks on login button is called");
		   driver.findElement(By.id("login-button")).click();
	      // Thread.sleep(3000);
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws InterruptedException {
		System.out.println("###user is navigated to the home page is called");
		assertEquals(true, driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).isDisplayed());
		//add-to-cart-sauce-labs-backpack
		//login-button
		Thread.sleep(1000);
		
		driver.close();
		driver.quit();
		//add-to-cart-sauce-labs-backpack
	}
	
}
