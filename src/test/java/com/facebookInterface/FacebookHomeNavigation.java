package com.facebookInterface;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class FacebookHomeNavigation {
	WebDriver driver; //instance 
	
  
	@BeforeMethod
	public void openApplication() {
		WebDriverManager.edgedriver().setup();
		driver= new EdgeDriver();
		//driver.get("https://www.facebook.com/");
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		/*difference between get() and navigation()
		 * get method comes with page load time but navigation method does not
		 * navigation method has forward, backword, refresh.
		 */
		
		
	}
	
	
	@Test
	public void testUrl() throws InterruptedException {
		//verify face book url/actual=expected==pass
		String actualUrl=driver.getCurrentUrl();
		System.out.println(actualUrl);
		String expectedUrl="https://www.facebook.com/";
		Assert.assertEquals(expectedUrl, actualUrl);
		driver.findElement(By.linkText("Marketplace")).click();
		Thread.sleep(10);// static sleep//not recomanded 
		driver.navigate().back();
		Thread.sleep(10);
		driver.navigate().forward();
		driver.navigate().refresh();
	}
	
		
		
		
		@AfterMethod
		public void closeApplication() {
			driver.quit();
			
		}
		
		
}




