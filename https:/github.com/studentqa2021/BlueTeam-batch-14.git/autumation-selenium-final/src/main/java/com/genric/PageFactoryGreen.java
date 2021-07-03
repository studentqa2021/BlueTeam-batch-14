package com.genric;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageFactoryGreen {
public static void main(String[] args) {
	
}
	 public void pageFactoryCodding(){
		 System.setProperty("webdriver.chrome.driver","/Applications/chromedriver");
		 WebDriver driver = new ChromeDriver();
		 driver.navigate().to("https://automationpractice.com/php");
		 
		 
		
	 }
	
}
