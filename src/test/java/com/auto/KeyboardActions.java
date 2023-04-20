package com.auto;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardActions {

	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		
		/*
		// send keys
		driver.findElement(By.name("q")).sendKeys("Selenium" + Keys.ENTER);
		
		//Key down
		Actions actionProvider = new Actions(driver);
		Action keydown = actionProvider.keyDown(Keys.CONTROL).sendKeys("a").build();
		keydown.perform();
		
		*/
		// How to release pressed keys 	: keyUp()
		Actions action = new Actions(driver);
		WebElement search = driver.findElement(By.name("q"));
		action.keyDown(Keys.SHIFT).sendKeys(search,"selenium")
		.keyUp(Keys.SHIFT).sendKeys(" selenium").perform();
		//How to clear the text: clear()
		
		Thread.sleep(2500);
		search.clear();
		Thread.sleep(2000);
		driver.close();
		
	

	}

}
