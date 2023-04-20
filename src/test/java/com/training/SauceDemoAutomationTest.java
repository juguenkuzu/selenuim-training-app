package com.training;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SauceDemoAutomationTest {

	String browserName="chrome";
	WebDriver driver;
	@BeforeEach
	public void setup() {
		if(browserName.equals("edge")) {
			
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else if(browserName.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		
		else {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			
		}
		
		
	}
	
	@Test
	public void LoginTest() throws InterruptedException {	
		driver.get("https://www.saucedemo.com");
	       driver.manage().window().maximize();
	       
	       driver.findElement(By.id("user-name")).sendKeys("standard_user");
	       Thread.sleep(3000);
	       driver.findElement(By.id("password")).sendKeys("secret_sauce");
	       Thread.sleep(3000);
	       driver.findElement(By.id("login-button")).click();
	       Thread.sleep(3000);
	driver.close();
	
	
	}
	
	
}
