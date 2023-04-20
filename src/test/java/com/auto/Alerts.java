package com.auto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//js alert
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		Alert alert1 = driver.switchTo().alert();
		String text = alert1.getText();
		System.out.println(text);
		Thread.sleep(2500);
		alert1.accept();
		if (driver.getPageSource().contains("You successfully clicked an alert")) {
			System.out.println("You successfully clicked an alert");
			System.out.println("===========================================");
		}
		
		
		//js confirm
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Alert alert2 = driver.switchTo().alert();
		String text2 = alert2.getText();
		System.out.println(text2);
		Thread.sleep(2500);
		alert2.dismiss();
		if (driver.getPageSource().contains("You clicked: Cancel")) {
			System.out.println("You clicked: Cancel");
			System.out.println("===========================================");
		}
		
		//js prompt
				driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
				Alert alert3 = driver.switchTo().alert();
				String text3 = alert2.getText();
				System.out.println(text3);
				alert3.sendKeys("automation step by step");
				Thread.sleep(2500);
				alert3.accept();
				if (driver.getPageSource().contains("You entered: automation step by step")) {
					System.out.println("You entered: automation step by step");
					System.out.println("===========================================");
				}
	}

}
