package com.sel.methods;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Scrolling  {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.trustpilot.com/review/janbasktraining.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,5000)");
		Thread.sleep(3000);
		
		  js.executeScript("window.scrollBy(0,100)"); 
		  Thread.sleep(3000);
		  js.executeScript("window.scrollTo(5000,1000)"); 
		  Thread.sleep(3000);
		  js.executeScript("window.scrollTo(1000,0)"); 
		
		 
		
	
		
		

	}

}
