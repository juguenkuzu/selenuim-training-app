package com.auto;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageLoadingDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		//options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		//options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		 WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver(options);
			driver.get("https://google.com");
			//Thread.sleep(2500);
			driver.close();
			
			
			
			
		 
	}

}
