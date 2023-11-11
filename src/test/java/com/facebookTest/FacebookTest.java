package com.facebookTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class FacebookTest {

	
	@Test
	public void titleTest() {
		
		
		//open browser
		//  <groupId>io.github.bonigarcia</groupId>
	    //<artifactId>webdrivermanager</artifactId>
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
				//Parent c= new Child();
				
	
		
		
		//open application
		//c.house();
		driver.get("https://www.facebook.com/");
		
	
		System.out.println("Hello Selenium");
		
	}
	
	
	
	
	
	
}
