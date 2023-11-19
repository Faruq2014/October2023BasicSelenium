package com.facebookLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReferencialTextLocators {
	
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
	public void linkTest() {
		driver.findElement(By.xpath("//a[text()='Sign Up']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[text()='Messenger']")).click();
	}
	
	@AfterMethod
	public void closeApp() {
		//driver.quit();
	}
	
	

}
