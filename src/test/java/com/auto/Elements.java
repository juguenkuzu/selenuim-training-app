package com.auto;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.support.locators;


public class Elements {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		
		WebElement searchBox=driver.findElement(By.name("q"));
		searchBox.sendKeys("ABCD",Keys.ENTER);
		
		driver.get("https://trytestingthis.netlify.app");
		List<WebElement> options = driver.findElements(By.name("Optionwithcheck[]"));
		  
		  for(WebElement element : options) {
		   System.out.println(element.getText());
		  }
		  driver.findElement(By.cssSelector("#fname")).sendKeys("Yorlein");
		  
		  
		/*
		 * driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 * WebElement loginButton = driver.findElement(By.id("btnLogin")); WebElement
		 * passwordTextBox = driver.findElement(RelativeLocator.with(By.tagName("input")).above( loginButton));
		 */
				//
		 Thread.sleep(3000);
		 driver.close();
		 

	}

}
