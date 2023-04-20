package com.training;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class SelenuimAmazonSerach 
{
    public static void main( String[] args )
    {
    	
    	String driverPath = "C:/Users/jugue/OneDrive/Documents/REVATURE/ANTONY Mohammad TRAINING/chromedriver.exe";
    	//or
    	//String driverPath = "C:\\Users\\jugue\\OneDrive\\Documents\\REVATURE\\ANTONY Mohammad TRAINING\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driverPath);
       ChromeDriver driver =new ChromeDriver();
       driver.get("http://www.amazon.in");
       driver.manage().window().maximize();
       
       driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("oneplus");
       
       driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
       try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       driver.close();
       
       
       
    }
}
