package com.facebookLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReferencialLocators {
	
	WebDriver driver;
	
	@BeforeMethod
	public void openApp() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofNanos(10));
	}
	
	@Test
	public void loginTest() {
		//using Id
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("jj@jmail.com");
		//driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("lllkj");
		
		//using name
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("jj@jmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("lllkj");
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
	
	@AfterMethod
	public void closeApp() {
		//driver.quit();
	}
	
	

}
