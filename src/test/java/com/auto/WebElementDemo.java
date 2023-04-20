package com.auto;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		
		/*
		// get active element
		driver.findElement(By.name("q")).sendKeys("Selenium");
		String attr = driver.switchTo().activeElement().getAttribute("title");
		System.out.println(attr);
		
		
		//get tagname,text, css etc....
	WebElement searchbox= driver.findElement(By.name("q"));
	System.out.println("Tagname :  " + searchbox.getTagName());
	System.out.println("Text :  " +searchbox.getText());
	System.out.println("Font :  " +searchbox.getCssValue("font"));
		*/
		//How to check element is Enabled | is Selected: isEnabled() isSelected()
		
		driver.get("https://the-internet.herokuapp.com//checkboxes");
			
		WebElement checkbox= driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]"));
		
		
		System.out.println(" isSelected :  " +	checkbox.isSelected());		
		System.out.println(	" isEnabled : "  + checkbox.isEnabled());
		Thread.sleep(2500);
		driver.close();
		
		

	}

}
