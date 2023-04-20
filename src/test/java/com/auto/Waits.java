package com.auto;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waits {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Automation step by step"+ Keys.ENTER);
		
		// explicit wait
		WebDriverWait  wait = new WebDriverWait(driver,20);
		
	WebElement mylink=	wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Automation Step by Step: NEVER STOP LEARNING")));
		mylink.click();
		
				//fluent wait
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(10))	
		
				.ignoring(NoSuchElementException.class);
		fluentWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"pageid-3146\"]/div/div[2]/div/table/tbody/tr/th[1]/div[1]/h3")));
		
		         /* .withTimeout(Duration.ofSeconds(10)) 
		          .pollingEvery(Duration.ofSeconds(1)) 
		          .ignoring(NoSuchElementException.class);

		fluentWait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
		*/
		driver.close();
		
	}
}
