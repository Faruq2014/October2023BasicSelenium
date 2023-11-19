package com.facebookLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReferencialDynamicLocators {
	
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
		driver.findElement(By.xpath("//*[starts-with(@id,'em')]")).sendKeys("jj@jmail.com");
		driver.findElement(By.xpath("//input[starts-with(@name,'pa')]")).clear();
		driver.findElement(By.xpath("//input[starts-with(@name,'pa')]")).sendKeys("lkjll");
		driver.findElement(By.xpath("//button[starts-with(@id,'u_0_5_')]")).click();
		//driver.findElement(By.xpath("//button[@id='u_0_5_gZ']")).click();
	}
	
	@AfterMethod
	public void closeApp() {
		//driver.quit();
	}
	
	

}
