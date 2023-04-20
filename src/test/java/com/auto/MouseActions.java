package com.auto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseActions {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");	
		WebElement boxA=driver.findElement(By.xpath("//*[@id=\"sortable\"]/li[1]"));
		WebElement boxD=driver.findElement(By.xpath("//*[@id=\"sortable\"]/li[4]"));
		
		Actions actions= new Actions(driver);
		actions.moveToElement(boxA);
		actions.clickAndHold();
		actions.moveToElement(boxD);
		actions.release().perform();
		
		//right click
		actions.contextClick(boxD);
		actions.build().perform();
		
		//doubleclick
		actions.doubleClick(boxA);
		Thread.sleep(1500);
		
		//drag and drop
		driver.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");
		WebElement elt1=driver.findElement(By.id("draggable"));
		WebElement elt2=driver.findElement(By.id("droppable"));
		Actions actions2= new Actions(driver);
		actions2.dragAndDrop(elt1, elt2);
		actions2.build().perform();
		
		Thread.sleep(2500);
		//driver.quit();
		System.out.println("Done");
		
	}

}
