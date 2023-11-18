package com.facebookLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DirectLocators {
	WebDriver driver;
	
	@BeforeMethod
	public void openApplication() {
		//how we open browser
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	    //open application
	driver.get("https://www.facebook.com/");
	//maximize
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	}
	
	
	@Test(priority=0)
	public void loginTest() {
		// id
		//driver.findElement(By.id("email")).sendKeys("jj@jmail.com");
		//driver.findElement(By.id("email")).sendKeys("jj@jmail.com");
		//name
		driver.findElement(By.name("email")).sendKeys("jj@jmail.com");
		//class--compaund locator
		//driver.findElement(By.className("inputtext _55r1 _6luy _9npi")).sendKeys("iiii");
	    driver.findElement(By.id("pass")).sendKeys("ghhgjhg");
	    driver.findElement(By.name("login")).click();
	
	}
	 @Test
	 public void linkTest() {
		 driver.findElement(By.linkText("Sign Up")).click();
	 }
	
	 @Test
	 public void partialLinkTest() {
		 driver.findElement(By.partialLinkText("Contact Uploading")).click();
		 
	 }	 
	 
	@AfterMethod
	public void closeApplication() {
	//driver.quit();	
	}
	
	


}
