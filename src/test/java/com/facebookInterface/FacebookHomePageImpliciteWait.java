package com.facebookInterface;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * verify face book url
 * open browser
 * get the url from facebook webpage
 * expected url = https://www.facebook.com/
 * expected==actual
 */

public class FacebookHomePageImpliciteWait {
	WebDriver driver; //instance 
	
  
	@BeforeMethod
	public void openApplication() {
		WebDriverManager.edgedriver().setup();
		 driver= new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//inner method calling concept
		
		//webDriver-->Manage-->timeouts has the methods
        //implicitlyWait
      
		//method para meter calling  concept==another method calling
		//Duration.ofSeconds(10)
		
		
	}
	
	
	@Test
	public void testUrl() {
		//verify face book url/actual=expected==pass
		String actualUrl=driver.getCurrentUrl();
		System.out.println(actualUrl);
		String expectedUrl="https://www.facebook.com/";
		Assert.assertEquals(expectedUrl, actualUrl);
	}
	
	
		@Test
		public void testUrlOne() {
			//verify face book url/actual=expected==pass
			String actualUrl=driver.getCurrentUrl();
			System.out.println(actualUrl);
			String expectedUrl="https://www.facebook.com/";
			Assert.assertEquals(expectedUrl, actualUrl);
		}
		
		@Test
		public void testUrlTwo() {
			//verify face book url/actual=expected==pass
			String actualUrl=driver.getCurrentUrl();
			System.out.println(actualUrl);
			String expectedUrl="https://www.facebook.com/";
			Assert.assertEquals(expectedUrl, actualUrl);
		}
		
		@AfterMethod
		public void closeApplication() {
			driver.quit();
			
		}
		
		
}




