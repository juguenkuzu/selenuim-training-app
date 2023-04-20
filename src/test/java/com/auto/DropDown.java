package com.auto;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://trytestingthis.netlify.app/");
		
		
		/*
		WebElement dropdown = driver.findElement(By.id("option"));
		Select selectObject = new Select(dropdown);
		selectObject.selectByIndex(1);
		Thread.sleep(1500);
		selectObject.selectByValue("option 2");
		Thread.sleep(1500);
		selectObject.selectByVisibleText("Option 3");
		*/
		// deselect
		WebElement dropdown = driver.findElement(By.id("owc"));
		Select selectObject = new Select(dropdown);
		selectObject.selectByIndex(1);
		Thread.sleep(1500);
		selectObject.selectByValue("option 2");
		Thread.sleep(1500);
		selectObject.selectByVisibleText("Option 3");
		Thread.sleep(1500);
		selectObject.deselectByVisibleText("Option 3");
		
		/*
		//How to store dropdown options in a list
		WebElement dropdown = driver.findElement(By.id("option"));
		Select selectObject = new Select(dropdown);
		List<WebElement> allAvailableOptions = selectObject.getOptions();
		//OR
		//List<WebElement> allAvailableOptions= driver.findElements(By.id("option"));
				
		for(WebElement option : allAvailableOptions) {
		   System.out.println(option.getText()); 
		   if (option.getText().equalsIgnoreCase("Option 2")) {
			option.click();
			Thread.sleep(2000);
		}
		   }
*/
		
		Thread.sleep(2000);
		//driver.quit();
		System.out.println("Done");
		
	}
}
