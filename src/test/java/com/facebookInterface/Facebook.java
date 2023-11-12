package com.facebookInterface;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Facebook implements WebDriver{

	@Override
	public void get(String url) {
		// this method open application
		
	}

	@Override
	public String getCurrentUrl() {
		// this method return url from the web page
		return null;
	}

	@Override
	public String getTitle() {
		// this method return title from the web page
		return null;
	}

	@Override
	public List<WebElement> findElements(By by) {
		// this method to find/return list of elements/locators
		return null;
	}

	@Override
	public WebElement findElement(By by) {
		// this method to find/return single element
		return null;
	}

	@Override
	public String getPageSource() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void close() {
		// this method close current tab/window
		
	}

	@Override
	public void quit() {
		// this method kill browser
		
	}

	@Override
	public Set<String> getWindowHandles() {
		// to handle multiple windows
		return null;
	}

	@Override
	public String getWindowHandle() {
		// to handle multiple windows
		return null;
	}

	@Override
	public TargetLocator switchTo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Navigation navigate() {
		// open application with lots features
		return null;
	}

	@Override
	public Options manage() {
		// this is method from child interface
		  //maximize window
		  //time out
		return null;
	}

}
