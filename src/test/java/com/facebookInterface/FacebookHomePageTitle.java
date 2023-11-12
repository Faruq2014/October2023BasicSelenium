package com.facebookInterface;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * verify face book title
 * open browser
 * get the title from facebook webpage
 * expected title = Facebook - log in or sign up
 * expected==actual
 */
public class FacebookHomePageTitle {
  
	
	@Test
	public void openApplication() {
		//open facebook application
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//verify face book title/actual=expected==pass
		
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		String expectedTitle="Facebook - log in or sign up";
		//assert
		Assert.assertEquals(actualTitle, expectedTitle);
		
		
		
	}
}
