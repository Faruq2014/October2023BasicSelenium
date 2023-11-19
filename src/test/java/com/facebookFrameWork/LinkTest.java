package com.facebookFrameWork;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LinkTest extends BaseTest{
	
	@Test(priority=0)
	public void signUpLinkTest() {
		driver.findElement(By.xpath("//a[text()='Sign Up']")).click();
		String expectedTitle="Sign Up for Facebook | Facebook";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		
	}
	
	@Test(priority=1)
	public void logInLinkTest() {
		driver.findElement(By.xpath("//a[text()='Log In']")).click();
		String expectedTitle="Log into Facebook";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		
	}

}
