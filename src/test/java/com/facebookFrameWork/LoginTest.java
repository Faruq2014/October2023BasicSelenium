package com.facebookFrameWork;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
	
	
	@Test(priority=0)
	public void validLoginTest() {
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("jj@jmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("lllkj");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		String expectedTitle="Facebook - log in or sign up";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		
	}
	
	@Test(priority=1)
	public void inValidLoginTest() {
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("jj@jmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("ll44");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		String expectedTitle="Facebook - log in or sign up";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		
	}

}
