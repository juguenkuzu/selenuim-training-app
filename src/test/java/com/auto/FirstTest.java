package com.auto;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariDriver.WindowType;

import io.github.bonigarcia.wdm.WebDriverManager;


public class FirstTest {
	
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
			// To use specific version of browser
			// WebDriverManager.chromedriver().driverVersion("92.0").setup();
			
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		
		else {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			
		}
		
		
	}
	
	@Test
	public void searchGoogle() throws InterruptedException, IOException {
		driver.get("http://www.google.com");
		 /*
		String originalWindow = driver.getWindowHandle();
		driver.get("https://automationstepbystep.com");
	       driver.manage().window().maximize();
	       Thread.sleep(3000);	      
	   
	      System.out.println(driver.getCurrentUrl());
	      System.out.println(driver.getTitle());
	      
	      //Forward | Back | Refresh
	      driver.navigate().back();
	      Thread.sleep(2000);
	      driver.navigate().forward();
	      Thread.sleep(2000);
	      driver.navigate().refresh();
	      //Switching windows
	      driver.switchTo().window(originalWindow);
	      
	    
		//Switching Frame
	       driver.navigate().to("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
	       driver.switchTo().frame("packageFrame");
	       Thread.sleep(2000);
	       driver.findElement(By.linkText("Alert")).click();
	      // able to click everywere in the webpage
	       driver.switchTo().defaultContent();
	      
		//Get width & height
		int width = driver.manage().window().getSize().getWidth();
		int height = driver.manage().window().getSize().getHeight();
		   System.out.println(width);
		      System.out.println(height);
		     // Set window size
		      driver.manage().window().setSize(new Dimension(800, 600));
		      
		     //  Window management - Position : Access x and y dimensions individually
		      int x = driver.manage().window().getPosition().getX();
		      int y = driver.manage().window().getPosition().getY();
		      
		      
		      System.out.println("X " + x);
		      System.out.println("Y "+y );
		      driver.manage().window().setPosition(new Point(0, 0));
 
		// Window management

		// maximize window
		driver.manage().window().maximize();
		  Thread.sleep(3000);
	
		
		// fullscreen
		driver.manage().window().fullscreen();
		 
		
		//Take screenshot		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("./image.png"));
	  
	      //Take element screenshot
	      WebElement element = driver.findElement(By.cssSelector(".lnXdpd"));
	      File scrFile1 = element.getScreenshotAs(OutputType.FILE);
	      FileUtils.copyFile(scrFile1, new File("./image1.png")); 
	       */
		//create JavascriptExecutor interface object by Type casting
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement button =driver.findElement(By.name("btnI"));
		js.executeScript("arguments[0].click();", button);

	
		js.executeScript("console.log('hello cathy')");
	    Thread.sleep(3000);
	    //  driver.close();
	}

}
